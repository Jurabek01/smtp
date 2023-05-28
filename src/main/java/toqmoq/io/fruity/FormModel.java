package toqmoq.io.fruity;

import lombok.Data;

@Data
public class FormModel {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String comment;

    public String toString(){
        String text = "";
        if (name!=null) text += "Ismi: " + name + "\n";
        if (surname!=null) text += "Familyasi: " + surname + "\n";
        if (email!=null) text += "Pochta: " + email + "\n";
        if (phone!=null) text += "Telefon: " + phone + "\n";
        if (comment!=null) text += "Izoh: " + comment + "\n";
        return text;
    }
}
