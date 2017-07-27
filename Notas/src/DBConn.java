
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class DBConn {
//    private String host;
//    private String db;
//    private String port;
//    private String user;
//    private String pass;
//    private Connection con;
//    
//    public DBConn() {
//        cargarDriver();
//
//    }
//    
//    private void cargarDriver() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//    }
//    
//    public Connection conectar() throws SQLException {
//        this.host = "localhost";
//        this.port = "3306";
//        this.db = "mysql";
//        this.user = "root";
//        this.pass = "";
//        
//        return this.con = DriverManager.getConnection(getUrl());
//    }
//    
//    public Connection conectar(String host, String port,
//            String db, String user, String pass) throws SQLException {
//        
//        this.host = host;
//        this.port = port;
//        this.db = db;
//        this.user = user;
//        this.pass = pass;
//        
//        return this.con = DriverManager.getConnection(getUrl());
//    }
//    
//    
//    // TODO: Modificar el metodo para poder ser static
//    public Connection getConnection() throws SQLException {
//        return conectar();
//    }
//    
//    public void desconectar() throws SQLException {
//        if(con != null) {
//            con.close();
//        }
//    }
//    
//    private String getUrl() {
//        String url;
//        
//        return url = "jdbc:mysql://" + host + "/" +
//            db + "?user=" + user + "&password=" + pass;
//    }
//
//    public String getHost() {
//        return host;
//    }
//
//    public void setHost(String host) {
//        this.host = host;
//    }
//
//    public String getDb() {
//        return db;
//    }
//
//    public void setDb(String db) {
//        this.db = db;
//    }
//
//    public String getPort() {
//        return port;
//    }
//
//    public void setPort(String port) {
//        this.port = port;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//    }

}
