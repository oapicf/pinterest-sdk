
package org.openapitools.client.model


case class OrderLines (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Order line budget in micro currency. */
    _budget: Option[Number],
    /* End time. Unix timestamp. */
    _endTime: Option[Number],
    /* Order line ID. */
    _id: Option[String],
    /* Order line name. */
    _name: Option[String],
    /* Order line paid budget in micro currency. */
    _paidBudget: Option[Number],
    /* Order line paid type. */
    _paidType: Option[OrderLinePaidType],
    /* Purchase order ID. */
    _purchaseOrderId: Option[String],
    /* Start time. Unix timestamp. */
    _startTime: Option[Number],
    /* Order line status. */
    _status: Option[OrderLineStatus],
    /* Always \"orderline\". */
    _type: Option[String]
)
object OrderLines {
    def toStringBody(var_adAccountId: Object, var_budget: Object, var_endTime: Object, var_id: Object, var_name: Object, var_paidBudget: Object, var_paidType: Object, var_purchaseOrderId: Object, var_startTime: Object, var_status: Object, var_type: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"budget":$var_budget,"endTime":$var_endTime,"id":$var_id,"name":$var_name,"paidBudget":$var_paidBudget,"paidType":$var_paidType,"purchaseOrderId":$var_purchaseOrderId,"startTime":$var_startTime,"status":$var_status,"type":$var_type
        | }
        """.stripMargin
}
