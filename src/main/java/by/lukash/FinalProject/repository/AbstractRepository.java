package by.lukash.FinalProject.repository;

import by.lukash.FinalProject.bean.Entity;
import by.lukash.FinalProject.bean.Product;
import by.lukash.FinalProject.interfaces.RepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T extends Entity> implements RepositoryInterface {

    private List<T> entity = new ArrayList<T>();

    @Override
    public void add(Entity entity) {
        int listSize = this.entity.size();
        entity.setId(listSize);
        this.entity.add((T) entity);
    }

    public abstract void add(Product product);

    @Override
    public Entity getById(Integer id) {
        return entity.get(id);
    }
    @Override
    public void printAll() {
        for (Entity entity : entity) {
            System.out.println(entity);
        }
    }
}