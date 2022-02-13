package bookMover;

public enum Status {
    BORROWED("Borrowed"),
    AVAILABLE("Available"),
    OVERDUED("Overdued"),
    ARCHIVED("Archived");
    
    private String stat;
    Status(String stat){
        this.stat=stat;
    }
    public String getStat(){
        return stat;
    }
}
