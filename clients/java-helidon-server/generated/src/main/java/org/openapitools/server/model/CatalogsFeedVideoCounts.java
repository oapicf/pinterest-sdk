package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */
public class CatalogsFeedVideoCounts   {

    private Integer ingestedVideos;
    private Integer notIngestedVideos;
    private Integer totalVideos;

    /**
     * Default constructor.
     */
    public CatalogsFeedVideoCounts() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedVideoCounts.
     *
     * @param ingestedVideos The number of videos successfully ingested from the feed file.
     * @param notIngestedVideos The number of videos that were not ingested from the feed file.
     * @param totalVideos The number of videos in the feed file.
     */
    public CatalogsFeedVideoCounts(
        Integer ingestedVideos, 
        Integer notIngestedVideos, 
        Integer totalVideos
    ) {
        this.ingestedVideos = ingestedVideos;
        this.notIngestedVideos = notIngestedVideos;
        this.totalVideos = totalVideos;
    }



    /**
     * The number of videos successfully ingested from the feed file.
     * @return ingestedVideos
     */
    public Integer getIngestedVideos() {
        return ingestedVideos;
    }

    public void setIngestedVideos(Integer ingestedVideos) {
        this.ingestedVideos = ingestedVideos;
    }

    /**
     * The number of videos that were not ingested from the feed file.
     * @return notIngestedVideos
     */
    public Integer getNotIngestedVideos() {
        return notIngestedVideos;
    }

    public void setNotIngestedVideos(Integer notIngestedVideos) {
        this.notIngestedVideos = notIngestedVideos;
    }

    /**
     * The number of videos in the feed file.
     * @return totalVideos
     */
    public Integer getTotalVideos() {
        return totalVideos;
    }

    public void setTotalVideos(Integer totalVideos) {
        this.totalVideos = totalVideos;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedVideoCounts {\n");
        
        sb.append("    ingestedVideos: ").append(toIndentedString(ingestedVideos)).append("\n");
        sb.append("    notIngestedVideos: ").append(toIndentedString(notIngestedVideos)).append("\n");
        sb.append("    totalVideos: ").append(toIndentedString(totalVideos)).append("\n");
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

