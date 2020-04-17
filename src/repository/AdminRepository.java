package repository;

import DataSource.DAO;
import model.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminRepository implements AdminRepositoryInterface {


    @Override
    public void create(Admin admin) {

        String sql = "INSERT INTO 'Admin'('id','email','password','role') VALUES(?,?,?,?)";
        try (
                Connection conn = DAO.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, admin.getId());
                pstmt.setString(2, admin.getEmail());
                pstmt.setString(3, admin.getPassword());
                pstmt.setString(4, admin.getRole());

                pstmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void remove(int id) {
        String sql = "delete from 'Admin' where id="+id+"";
        try (
                Connection conn = DAO.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql))
        {
                pstmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public Admin getOne(int id) {
        return null;
    }

    @Override
    public List<Admin> getAll() {
        List<Admin> adminList = new ArrayList<>();

        String sql = "SELECT * FROM Admin";
        try (Connection conn = DAO.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            while (rs.next()) {
                adminList.add(new Admin((rs.getInt("id")),rs.getString("email"),rs.getString("password"),rs.getString("role")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return adminList;
    }
}
