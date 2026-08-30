package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DynamicTitlesProcessCSVError   {

    private String errorType;
    private Integer rowNumber;

    /**
     * Default constructor.
     */
    public DynamicTitlesProcessCSVError() {
    // JSON-B / Jackson
    }

    /**
     * Create DynamicTitlesProcessCSVError.
     *
     * @param errorType The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
     * @param rowNumber The row number with a validation error. -1 indicates a file-level error.
     */
    public DynamicTitlesProcessCSVError(
        String errorType, 
        Integer rowNumber
    ) {
        this.errorType = errorType;
        this.rowNumber = rowNumber;
    }



    /**
     * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
     * @return errorType
     */
    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * The row number with a validation error. -1 indicates a file-level error.
     * @return rowNumber
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicTitlesProcessCSVError {\n");
        
        sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
        sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
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

