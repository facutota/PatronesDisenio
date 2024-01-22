package PatronesEstructurales.Adapter;

public class ConexionMySql implements IConexionSql{
    
    public void conexion(){
        System.out.println("Conexion con MYSQL");
    }

    public String runQuery(){
        return "Consulta MYSQL";
    }
}
