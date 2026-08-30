package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.CatalogsFeedIngestionDetails;
import org.openapitools.server.model.CatalogsFeedProcessingStatus;
import org.openapitools.server.model.CatalogsFeedProductCounts;
import org.openapitools.server.model.CatalogsFeedValidationDetails;
import org.openapitools.server.model.CatalogsFeedVideoCounts;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsFeedProcessingResult   {

    private OffsetDateTime createdAt;
    private String id;
    private CatalogsFeedIngestionDetails ingestionDetails;
    private CatalogsFeedProductCounts productCounts;
    private CatalogsFeedProcessingStatus status;
    private OffsetDateTime updatedAt;
    private CatalogsFeedValidationDetails validationDetails;
    private CatalogsFeedVideoCounts videoCounts;

    /**
     * Default constructor.
     */
    public CatalogsFeedProcessingResult() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedProcessingResult.
     *
     * @param createdAt createdAt
     * @param id ID of the feed processing result.
     * @param ingestionDetails ingestionDetails
     * @param productCounts productCounts
     * @param status status
     * @param updatedAt updatedAt
     * @param validationDetails validationDetails
     * @param videoCounts videoCounts
     */
    public CatalogsFeedProcessingResult(
        OffsetDateTime createdAt, 
        String id, 
        CatalogsFeedIngestionDetails ingestionDetails, 
        CatalogsFeedProductCounts productCounts, 
        CatalogsFeedProcessingStatus status, 
        OffsetDateTime updatedAt, 
        CatalogsFeedValidationDetails validationDetails, 
        CatalogsFeedVideoCounts videoCounts
    ) {
        this.createdAt = createdAt;
        this.id = id;
        this.ingestionDetails = ingestionDetails;
        this.productCounts = productCounts;
        this.status = status;
        this.updatedAt = updatedAt;
        this.validationDetails = validationDetails;
        this.videoCounts = videoCounts;
    }



    /**
     * Get createdAt
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * ID of the feed processing result.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get ingestionDetails
     * @return ingestionDetails
     */
    public CatalogsFeedIngestionDetails getIngestionDetails() {
        return ingestionDetails;
    }

    public void setIngestionDetails(CatalogsFeedIngestionDetails ingestionDetails) {
        this.ingestionDetails = ingestionDetails;
    }

    /**
     * Get productCounts
     * @return productCounts
     */
    public CatalogsFeedProductCounts getProductCounts() {
        return productCounts;
    }

    public void setProductCounts(CatalogsFeedProductCounts productCounts) {
        this.productCounts = productCounts;
    }

    /**
     * Get status
     * @return status
     */
    public CatalogsFeedProcessingStatus getStatus() {
        return status;
    }

    public void setStatus(CatalogsFeedProcessingStatus status) {
        this.status = status;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Get validationDetails
     * @return validationDetails
     */
    public CatalogsFeedValidationDetails getValidationDetails() {
        return validationDetails;
    }

    public void setValidationDetails(CatalogsFeedValidationDetails validationDetails) {
        this.validationDetails = validationDetails;
    }

    /**
     * Get videoCounts
     * @return videoCounts
     */
    public CatalogsFeedVideoCounts getVideoCounts() {
        return videoCounts;
    }

    public void setVideoCounts(CatalogsFeedVideoCounts videoCounts) {
        this.videoCounts = videoCounts;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedProcessingResult {\n");
        
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ingestionDetails: ").append(toIndentedString(ingestionDetails)).append("\n");
        sb.append("    productCounts: ").append(toIndentedString(productCounts)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    validationDetails: ").append(toIndentedString(validationDetails)).append("\n");
        sb.append("    videoCounts: ").append(toIndentedString(videoCounts)).append("\n");
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

