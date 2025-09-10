package persistence;

public class PersistenceFacade {
    private Database database;
    private FileStorage fileStorage;

    public PersistenceFacade() {
        this.database = new Database();
        this.fileStorage = new FileStorage();
    }

    public void saveEmployeeData(String data) {
        // Aqui podemos escolher onde salvar
        database.save(data);
        fileStorage.writeToFile(data);
    }
}
