public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logType, String Errormessage) {
        if(logType==DEBUG){
            System.out.println("DEBUG: "+Errormessage);
        }
        else
        super.log(logType, Errormessage);
    }
}
