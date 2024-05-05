public class Contact {

    private String name;
    private String mobilePhone;
    private String email;
    private String date;
    private String comment;
    
    public Contact(){

    }
    public Contact(String name, String mobilePhone, String email, String date, String comment) {
    
                            this.name = name;
                            this.mobilePhone = mobilePhone;
                            this.email = email;
                            this.date = date;
                            this.comment = comment;

                            }
    
    public Contact(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getMobilePhone() {
        return mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate(String date) {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    public String toString() {
        return(this.name+"  "+this.email+"  "+this.mobilePhone+"    "+this.date);

    }
}