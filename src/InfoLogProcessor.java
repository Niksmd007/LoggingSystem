public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logType, String Errormessage) {
        if(logType==INFO){
            System.out.println("INFO :"+Errormessage);
        }
        else
        super.log(logType, Errormessage);
    }
}
