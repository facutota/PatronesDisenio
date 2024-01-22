package PatronesEstructurales.Adapter;
//Con esto adaptamos La conexionsql agregando la conexioNoSql
public class AdaptadorDB implements IConexionSql {
    
    private IConexionNoSql noSql;

    public AdaptadorDB(IConexionNoSql noSql){
        this.noSql = noSql;

    }

    public void conexion(){
        this.noSql.conexion();
    }

    public String runQuery(){
       return this.noSql.executeSentence();
    }
}
