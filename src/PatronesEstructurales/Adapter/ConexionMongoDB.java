package PatronesEstructurales.Adapter;

public class ConexionMongoDB implements IConexionNoSql{
    
    public void conexion(){
        System.out.println("Conexion con MongoDB");
    }

    public String executeSentence(){
        return "Consulta MongoDB";
    }
}
