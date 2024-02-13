package com.table.rova.stock.Interface;
import java.util.List;

public interface CRUD<T> {
    public List<T> getListCrud();

    public String creatCrud(T type);

    public String deleteCrud(Long id);

    public T findByIdCrud(Long id);

    public String updateCrud( Long id ,T type);
}
