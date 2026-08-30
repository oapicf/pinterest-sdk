package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * User selection of conversion health criteria for a single feature
 */
public class ConversionHealthSelectionItem   {

    private Object conversionType;
    private Object criteria;
    private Object ingestionSource;
    private Object status = null;

    /**
     * Default constructor.
     */
    public ConversionHealthSelectionItem() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionHealthSelectionItem.
     *
     * @param conversionType Status for conversion types
     * @param criteria Status for criteria
     * @param ingestionSource Status for ingestion sources
     * @param status Overall status for this selection item
     */
    public ConversionHealthSelectionItem(
        Object conversionType, 
        Object criteria, 
        Object ingestionSource, 
        Object status
    ) {
        this.conversionType = conversionType;
        this.criteria = criteria;
        this.ingestionSource = ingestionSource;
        this.status = status;
    }



    /**
     * Status for conversion types
     * @return conversionType
     */
    public Object getConversionType() {
        return conversionType;
    }

    public void setConversionType(Object conversionType) {
        this.conversionType = conversionType;
    }

    /**
     * Status for criteria
     * @return criteria
     */
    public Object getCriteria() {
        return criteria;
    }

    public void setCriteria(Object criteria) {
        this.criteria = criteria;
    }

    /**
     * Status for ingestion sources
     * @return ingestionSource
     */
    public Object getIngestionSource() {
        return ingestionSource;
    }

    public void setIngestionSource(Object ingestionSource) {
        this.ingestionSource = ingestionSource;
    }

    /**
     * Overall status for this selection item
     * @return status
     */
    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionHealthSelectionItem {\n");
        
        sb.append("    conversionType: ").append(toIndentedString(conversionType)).append("\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
        sb.append("    ingestionSource: ").append(toIndentedString(ingestionSource)).append("\n");
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

