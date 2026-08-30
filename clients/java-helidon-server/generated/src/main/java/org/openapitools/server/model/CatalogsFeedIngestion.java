package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.CatalogsFeedProcessingStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsFeedIngestion   {

    private OffsetDateTime createdAt;
    private String feedId;
    private String id;
    private CatalogsFeedProcessingStatus status;

    /**
     * Default constructor.
     */
    public CatalogsFeedIngestion() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedIngestion.
     *
     * @param createdAt Timestamp of the feed ingestion.
     * @param feedId Catalog Feed id pertaining to the feed ingestion.
     * @param id Unique identifier of a feed ingestion.
     * @param status Status of the feed ingestion.
     */
    public CatalogsFeedIngestion(
        OffsetDateTime createdAt, 
        String feedId, 
        String id, 
        CatalogsFeedProcessingStatus status
    ) {
        this.createdAt = createdAt;
        this.feedId = feedId;
        this.id = id;
        this.status = status;
    }



    /**
     * Timestamp of the feed ingestion.
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Catalog Feed id pertaining to the feed ingestion.
     * @return feedId
     */
    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    /**
     * Unique identifier of a feed ingestion.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Status of the feed ingestion.
     * @return status
     */
    public CatalogsFeedProcessingStatus getStatus() {
        return status;
    }

    public void setStatus(CatalogsFeedProcessingStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedIngestion {\n");
        
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

