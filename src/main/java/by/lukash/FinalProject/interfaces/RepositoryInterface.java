package by.lukash.FinalProject.interfaces;

import by.lukash.FinalProject.bean.Entity;

public interface RepositoryInterface {
    void add (Entity entity);
    Entity getById (Integer id);
    void printAll();
}
