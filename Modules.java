import java.sql.Date;

public class Modules extends ContentItem {
    private int idNumber;
    private String title;
    private String version;
    private int duration;
    private Date dateOfPublication;
    private String linkToVideo;
    private String description;

    public Modules(int contentId, Date publicationDate, String status, int idNumber, String title, String version,
            int duration, Date datOfPublication, String linkToVideo, String description) {
        super(contentId, publicationDate, status);
        this.idNumber = idNumber;
        this.title = title;
        this.version = version;
        this.duration = duration;
        this.dateOfPublication = datOfPublication;
        this.linkToVideo = linkToVideo;
        this.description = description;

    }

}
