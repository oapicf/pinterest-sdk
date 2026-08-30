package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CustomerListRecordRow;
import org.openapitools.server.model.UserListOperationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
public class CustomerListUpdateWithRequiredBody   {

    private UserListOperationType operationType;
    private String records;
    private List<@Valid CustomerListRecordRow> recordsV2 = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CustomerListUpdateWithRequiredBody() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerListUpdateWithRequiredBody.
     *
     * @param operationType Customer list update operation type (add or remove). Only valid in update request body.
     * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @param recordsV2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
     */
    public CustomerListUpdateWithRequiredBody(
        UserListOperationType operationType, 
        String records, 
        List<@Valid CustomerListRecordRow> recordsV2
    ) {
        this.operationType = operationType;
        this.records = records;
        this.recordsV2 = recordsV2;
    }



    /**
     * Customer list update operation type (add or remove). Only valid in update request body.
     * @return operationType
     */
    public UserListOperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(UserListOperationType operationType) {
        this.operationType = operationType;
    }

    /**
     * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @return records
     */
    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    /**
     * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
     * @return recordsV2
     */
    public List<@Valid CustomerListRecordRow> getRecordsV2() {
        return recordsV2;
    }

    public void setRecordsV2(List<@Valid CustomerListRecordRow> recordsV2) {
        this.recordsV2 = recordsV2;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerListUpdateWithRequiredBody {\n");
        
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    recordsV2: ").append(toIndentedString(recordsV2)).append("\n");
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

