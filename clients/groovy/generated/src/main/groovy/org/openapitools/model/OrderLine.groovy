package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderLinePaidType;
import org.openapitools.model.OrderLineStatus;

@Canonical
class OrderLine {
    /* Ad account ID. */
    String adAccountId
    /* Order line budget in micro currency. */
    BigDecimal budget
    /* Associated List of campaign IDs. */
    List<String> campaignIds = new ArrayList<>()
    /* End time. Unix timestamp. */
    BigDecimal endTime
    /* Order line ID. */
    String id
    /* Order line name. */
    String name
    /* Order line paid budget in micro currency. */
    BigDecimal paidBudget
    /* Order line paid type. */
    OrderLinePaidType paidType
    /* Purchase order ID. */
    String purchaseOrderId
    /* Start time. Unix timestamp. */
    BigDecimal startTime
    /* Order line status. */
    OrderLineStatus status
    /* Always \"orderline\". */
    String type
}
