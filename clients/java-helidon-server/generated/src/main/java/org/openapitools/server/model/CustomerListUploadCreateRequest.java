package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.UserListOperationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomerListUploadCreateRequest   {

    private UserListOperationType operation;
    private Integer totalParts;

    /**
     * Default constructor.
     */
    public CustomerListUploadCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerListUploadCreateRequest.
     *
     * @param operation operation
     * @param totalParts Number of parts to upload the file in.
     */
    public CustomerListUploadCreateRequest(
        UserListOperationType operation, 
        Integer totalParts
    ) {
        this.operation = operation;
        this.totalParts = totalParts;
    }



    /**
     * Get operation
     * @return operation
     */
    public UserListOperationType getOperation() {
        return operation;
    }

    public void setOperation(UserListOperationType operation) {
        this.operation = operation;
    }

    /**
     * Number of parts to upload the file in.
     * minimum: 1
     * maximum: 10
     * @return totalParts
     */
    public Integer getTotalParts() {
        return totalParts;
    }

    public void setTotalParts(Integer totalParts) {
        this.totalParts = totalParts;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerListUploadCreateRequest {\n");
        
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    totalParts: ").append(toIndentedString(totalParts)).append("\n");
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

