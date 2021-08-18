package com.company;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBMeneger {
    private Connection connection;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car?"+
                    "useUnicode=true&serverTimezone=UTC ","root","");
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<Cars> getAllCars(){
        ArrayList<Cars> cars = new ArrayList<>();
        try{
            PreparedStatement st = connection
                    .prepareStatement("SELECT * FROM cars");

            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                double volume = rs.getDouble("volume");
                cars.add(new Cars(id,name,price,volume));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cars;
    }
    public void addCar(Cars car) {
        try {
            PreparedStatement st = connection
                    .prepareStatement(
                            "INSERT INTO cars(id,name,price,volume) values (NULL,?,?,?");
            st.setString(1, car.getName());
            st.setInt(2, car.getPrice());
            st.setDouble(3, car.getVolume());

            st.executeQuery();
        } catch (Exception ignore) {
        }
    }
}
