import java.util.Date;

public class ContentItem {

    private int contentId;
    private Date publicationDate;
    private String status;

    public ContentItem(int contentId, Date publicationDate, String status) {
        this.contentId = contentId;
        this.publicationDate = publicationDate;
        this.status = status;
    }

}
