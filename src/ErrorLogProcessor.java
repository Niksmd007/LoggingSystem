public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logType, String Errormessage) {
        if(logType==ERROR){
            System.out.println("ERROR :"+Errormessage);
        }
        else
        super.log(logType, Errormessage);
    }
}
