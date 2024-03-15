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
    /* Order line ID. */
    String id
    /* Always \"orderline\". */
    String type
    /* Ad account ID. */
    String adAccountId
    /* Purchase order ID. */
    String purchaseOrderId
    /* Start time. Unix timestamp. */
    BigDecimal startTime
    /* End time. Unix timestamp. */
    BigDecimal endTime
    /* Order line budget in micro currency. */
    BigDecimal budget
    /* Order line paid budget in micro currency. */
    BigDecimal paidBudget
    /* Order line status. */
    OrderLineStatus status
    /* Order line name. */
    String name
    /* Order line paid type. */
    OrderLinePaidType paidType
    /* Associated List of campaign IDs. */
    List<String> campaignIds = new ArrayList<>()
}
