package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BoardMedia   {

    private String imageCoverUrl;
    private List<String> pinThumbnailUrls = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BoardMedia() {
    // JSON-B / Jackson
    }

    /**
     * Create BoardMedia.
     *
     * @param imageCoverUrl Board cover image
     * @param pinThumbnailUrls Board pin thumbnail urls.
     */
    public BoardMedia(
        String imageCoverUrl, 
        List<String> pinThumbnailUrls
    ) {
        this.imageCoverUrl = imageCoverUrl;
        this.pinThumbnailUrls = pinThumbnailUrls;
    }



    /**
     * Board cover image
     * @return imageCoverUrl
     */
    public String getImageCoverUrl() {
        return imageCoverUrl;
    }

    public void setImageCoverUrl(String imageCoverUrl) {
        this.imageCoverUrl = imageCoverUrl;
    }

    /**
     * Board pin thumbnail urls.
     * @return pinThumbnailUrls
     */
    public List<String> getPinThumbnailUrls() {
        return pinThumbnailUrls;
    }

    public void setPinThumbnailUrls(List<String> pinThumbnailUrls) {
        this.pinThumbnailUrls = pinThumbnailUrls;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoardMedia {\n");
        
        sb.append("    imageCoverUrl: ").append(toIndentedString(imageCoverUrl)).append("\n");
        sb.append("    pinThumbnailUrls: ").append(toIndentedString(pinThumbnailUrls)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

