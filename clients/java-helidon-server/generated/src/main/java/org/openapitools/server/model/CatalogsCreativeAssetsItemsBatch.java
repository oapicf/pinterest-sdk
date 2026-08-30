package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BatchOperationStatus;
import org.openapitools.server.model.CreativeAssetsProcessingRecord;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object describing the catalogs creative assets items batch
 */
public class CatalogsCreativeAssetsItemsBatch   {

    private String batchId;

    /**
    * Gets or Sets catalogType
    */
    public enum CatalogTypeEnum {
        CREATIVE_ASSETS("CREATIVE_ASSETS");

        private String value;

        CatalogTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static CatalogTypeEnum fromValue(String text) {
            for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private CatalogTypeEnum catalogType;
    private OffsetDateTime completedTime;
    private OffsetDateTime createdTime;
    private List<@Valid CreativeAssetsProcessingRecord> items = new ArrayList<>();
    private BatchOperationStatus status;

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsItemsBatch() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsItemsBatch.
     *
     * @param batchId Id of the catalogs items batch
     * @param catalogType catalogType
     * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss
     * @param items Array with the catalogs items processing records part of the catalogs items batch
     * @param status status
     */
    public CatalogsCreativeAssetsItemsBatch(
        String batchId, 
        CatalogTypeEnum catalogType, 
        OffsetDateTime completedTime, 
        OffsetDateTime createdTime, 
        List<@Valid CreativeAssetsProcessingRecord> items, 
        BatchOperationStatus status
    ) {
        this.batchId = batchId;
        this.catalogType = catalogType;
        this.completedTime = completedTime;
        this.createdTime = createdTime;
        this.items = items;
        this.status = status;
    }



    /**
     * Id of the catalogs items batch
     * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * Get catalogType
     * @return catalogType
     */
    public CatalogTypeEnum getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
     * @return completedTime
     */
    public OffsetDateTime getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(OffsetDateTime completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Array with the catalogs items processing records part of the catalogs items batch
     * @return items
     */
    public List<@Valid CreativeAssetsProcessingRecord> getItems() {
        return items;
    }

    public void setItems(List<@Valid CreativeAssetsProcessingRecord> items) {
        this.items = items;
    }

    /**
     * Get status
     * @return status
     */
    public BatchOperationStatus getStatus() {
        return status;
    }

    public void setStatus(BatchOperationStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreativeAssetsItemsBatch {\n");
        
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

