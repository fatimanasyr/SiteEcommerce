package repository;

import model.Admin;

import java.util.List;

public interface AdminRepositoryInterface {
    public void create(Admin admin);
    public void remove(int id);
    public void update(Admin admin);
    public Admin getOne(int id);
    public List<Admin> getAll();
}
