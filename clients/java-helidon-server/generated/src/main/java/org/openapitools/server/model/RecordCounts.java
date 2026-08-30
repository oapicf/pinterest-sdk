package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RecordCounts   {

    private Integer invalid;
    private Integer processed;
    private Integer valid;

    /**
     * Default constructor.
     */
    public RecordCounts() {
    // JSON-B / Jackson
    }

    /**
     * Create RecordCounts.
     *
     * @param invalid Number of invalid records processed
     * @param processed Number of records processed
     * @param valid Number of valid records processed
     */
    public RecordCounts(
        Integer invalid, 
        Integer processed, 
        Integer valid
    ) {
        this.invalid = invalid;
        this.processed = processed;
        this.valid = valid;
    }



    /**
     * Number of invalid records processed
     * @return invalid
     */
    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }

    /**
     * Number of records processed
     * @return processed
     */
    public Integer getProcessed() {
        return processed;
    }

    public void setProcessed(Integer processed) {
        this.processed = processed;
    }

    /**
     * Number of valid records processed
     * @return valid
     */
    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordCounts {\n");
        
        sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
        sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
        sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

