package solidprinciple;


public class SingleResponsibility {
    String db="";
    ErrorLog errorLog = new ErrorLog();
    public void createData(String post){
        try {
            db += post;
        }catch(Exception e){
            errorLog.logError(e.getMessage());
        }
    }
}
class ErrorLog{
    public void logError(String error){
        System.out.println(error);
    }
}
