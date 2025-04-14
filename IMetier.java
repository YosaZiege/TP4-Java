import java.util.List;

public interface IMetier<T> {
    void add(T item);
    List<T> getAll();
    T findById(long id);
    void delete(long id);
}
