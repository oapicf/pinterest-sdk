package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrderLinePaidType;
import org.openapitools.server.model.OrderLineStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrderLine   {

    private String adAccountId;
    private BigDecimal budget;
    private List<String> campaignIds = new ArrayList<>();
    private BigDecimal endTime;
    private String id;
    private String name;
    private BigDecimal paidBudget;
    private OrderLinePaidType paidType;
    private String purchaseOrderId;
    private BigDecimal startTime;
    private OrderLineStatus status;
    private String type;

    /**
     * Default constructor.
     */
    public OrderLine() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderLine.
     *
     * @param adAccountId Ad account ID.
     * @param budget Order line budget in micro currency.
     * @param campaignIds Associated List of campaign IDs.
     * @param endTime End time. Unix timestamp.
     * @param id Order line ID.
     * @param name Order line name.
     * @param paidBudget Order line paid budget in micro currency.
     * @param paidType Order line paid type.
     * @param purchaseOrderId Purchase order ID.
     * @param startTime Start time. Unix timestamp.
     * @param status Order line status.
     * @param type Always \&quot;orderline\&quot;.
     */
    public OrderLine(
        String adAccountId, 
        BigDecimal budget, 
        List<String> campaignIds, 
        BigDecimal endTime, 
        String id, 
        String name, 
        BigDecimal paidBudget, 
        OrderLinePaidType paidType, 
        String purchaseOrderId, 
        BigDecimal startTime, 
        OrderLineStatus status, 
        String type
    ) {
        this.adAccountId = adAccountId;
        this.budget = budget;
        this.campaignIds = campaignIds;
        this.endTime = endTime;
        this.id = id;
        this.name = name;
        this.paidBudget = paidBudget;
        this.paidType = paidType;
        this.purchaseOrderId = purchaseOrderId;
        this.startTime = startTime;
        this.status = status;
        this.type = type;
    }



    /**
     * Ad account ID.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    /**
     * Order line budget in micro currency.
     * @return budget
     */
    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    /**
     * Associated List of campaign IDs.
     * @return campaignIds
     */
    public List<String> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<String> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * End time. Unix timestamp.
     * @return endTime
     */
    public BigDecimal getEndTime() {
        return endTime;
    }

    public void setEndTime(BigDecimal endTime) {
        this.endTime = endTime;
    }

    /**
     * Order line ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Order line name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Order line paid budget in micro currency.
     * @return paidBudget
     */
    public BigDecimal getPaidBudget() {
        return paidBudget;
    }

    public void setPaidBudget(BigDecimal paidBudget) {
        this.paidBudget = paidBudget;
    }

    /**
     * Order line paid type.
     * @return paidType
     */
    public OrderLinePaidType getPaidType() {
        return paidType;
    }

    public void setPaidType(OrderLinePaidType paidType) {
        this.paidType = paidType;
    }

    /**
     * Purchase order ID.
     * @return purchaseOrderId
     */
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    /**
     * Start time. Unix timestamp.
     * @return startTime
     */
    public BigDecimal getStartTime() {
        return startTime;
    }

    public void setStartTime(BigDecimal startTime) {
        this.startTime = startTime;
    }

    /**
     * Order line status.
     * @return status
     */
    public OrderLineStatus getStatus() {
        return status;
    }

    public void setStatus(OrderLineStatus status) {
        this.status = status;
    }

    /**
     * Always \"orderline\".
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLine {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
        sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paidBudget: ").append(toIndentedString(paidBudget)).append("\n");
        sb.append("    paidType: ").append(toIndentedString(paidType)).append("\n");
        sb.append("    purchaseOrderId: ").append(toIndentedString(purchaseOrderId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

