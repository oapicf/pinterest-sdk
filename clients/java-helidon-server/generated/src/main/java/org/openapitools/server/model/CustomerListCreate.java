package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CustomerListRecordRow;
import org.openapitools.server.model.UserListType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class CustomerListCreate   {

    private Boolean isNca;
    private UserListType listType;
    private String name;
    private String records;
    private List<@Valid CustomerListRecordRow> recordsV2 = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CustomerListCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerListCreate.
     *
     * @param isNca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
     * @param listType Type of customer list (e.g., EMAIL, IDFA, MAID).
     * @param name Customer list name.
     * @param records Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @param recordsV2 Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
     */
    public CustomerListCreate(
        Boolean isNca, 
        UserListType listType, 
        String name, 
        String records, 
        List<@Valid CustomerListRecordRow> recordsV2
    ) {
        this.isNca = isNca;
        this.listType = listType;
        this.name = name;
        this.records = records;
        this.recordsV2 = recordsV2;
    }



    /**
     * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
     * @return isNca
     */
    public Boolean getIsNca() {
        return isNca;
    }

    public void setIsNca(Boolean isNca) {
        this.isNca = isNca;
    }

    /**
     * Type of customer list (e.g., EMAIL, IDFA, MAID).
     * @return listType
     */
    public UserListType getListType() {
        return listType;
    }

    public void setListType(UserListType listType) {
        this.listType = listType;
    }

    /**
     * Customer list name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        sb.append("class CustomerListCreate {\n");
        
        sb.append("    isNca: ").append(toIndentedString(isNca)).append("\n");
        sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

