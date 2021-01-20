import java.sql.Date;

public class Webcast extends ContentItem {

    private String title;
    private int duration;
    private Date dateOfPublication;
    private String description;

    public Webcast(int contentId, Date publicationDate, String status, String title, int duration,
            Date dateOfPublication, String description) {
        super(contentId, publicationDate, status);
        this.title = title;
        this.duration = duration;
        this.dateOfPublication = dateOfPublication;
        this.description = description;
    }
}
