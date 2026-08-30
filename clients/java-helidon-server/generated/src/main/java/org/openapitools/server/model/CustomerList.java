package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.CustomerListStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomerList   {

    private String adAccountId;
    private BigDecimal createdTime;
    private Object exceptions;
    private String id;
    private Boolean isNca;
    private String name;
    private BigDecimal numBatches;
    private BigDecimal numRemovedUserRecords;
    private BigDecimal numUploadedUserRecords;
    private CustomerListStatus status;
    private String type;
    private BigDecimal updatedTime;

    /**
     * Default constructor.
     */
    public CustomerList() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomerList.
     *
     * @param adAccountId Associated ad account ID.
     * @param createdTime Creation time. Unix timestamp in seconds.
     * @param exceptions Customer list errors.
     * @param id Customer list ID.
     * @param isNca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
     * @param name Customer list name.
     * @param numBatches Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
     * @param numRemovedUserRecords Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
     * @param numUploadedUserRecords Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
     * @param status Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
     * @param type Always &#x60;customerlist&#x60;.
     * @param updatedTime Last update time. Unix timestamp in seconds.
     */
    public CustomerList(
        String adAccountId, 
        BigDecimal createdTime, 
        Object exceptions, 
        String id, 
        Boolean isNca, 
        String name, 
        BigDecimal numBatches, 
        BigDecimal numRemovedUserRecords, 
        BigDecimal numUploadedUserRecords, 
        CustomerListStatus status, 
        String type, 
        BigDecimal updatedTime
    ) {
        this.adAccountId = adAccountId;
        this.createdTime = createdTime;
        this.exceptions = exceptions;
        this.id = id;
        this.isNca = isNca;
        this.name = name;
        this.numBatches = numBatches;
        this.numRemovedUserRecords = numRemovedUserRecords;
        this.numUploadedUserRecords = numUploadedUserRecords;
        this.status = status;
        this.type = type;
        this.updatedTime = updatedTime;
    }



    /**
     * Associated ad account ID.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Creation time. Unix timestamp in seconds.
     * @return createdTime
     */
    public BigDecimal getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(BigDecimal createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Customer list errors.
     * @return exceptions
     */
    public Object getExceptions() {
        return exceptions;
    }

    public void setExceptions(Object exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * Customer list ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
     * @return numBatches
     */
    public BigDecimal getNumBatches() {
        return numBatches;
    }

    public void setNumBatches(BigDecimal numBatches) {
        this.numBatches = numBatches;
    }

    /**
     * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
     * @return numRemovedUserRecords
     */
    public BigDecimal getNumRemovedUserRecords() {
        return numRemovedUserRecords;
    }

    public void setNumRemovedUserRecords(BigDecimal numRemovedUserRecords) {
        this.numRemovedUserRecords = numRemovedUserRecords;
    }

    /**
     * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
     * @return numUploadedUserRecords
     */
    public BigDecimal getNumUploadedUserRecords() {
        return numUploadedUserRecords;
    }

    public void setNumUploadedUserRecords(BigDecimal numUploadedUserRecords) {
        this.numUploadedUserRecords = numUploadedUserRecords;
    }

    /**
     * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
     * @return status
     */
    public CustomerListStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerListStatus status) {
        this.status = status;
    }

    /**
     * Always `customerlist`.
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Last update time. Unix timestamp in seconds.
     * @return updatedTime
     */
    public BigDecimal getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(BigDecimal updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerList {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isNca: ").append(toIndentedString(isNca)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numBatches: ").append(toIndentedString(numBatches)).append("\n");
        sb.append("    numRemovedUserRecords: ").append(toIndentedString(numRemovedUserRecords)).append("\n");
        sb.append("    numUploadedUserRecords: ").append(toIndentedString(numUploadedUserRecords)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

