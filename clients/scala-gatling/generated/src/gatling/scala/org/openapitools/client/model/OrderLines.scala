
package org.openapitools.client.model


case class OrderLines (
    /* Order line ID. */
    _id: Option[String],
    /* Always \"orderline\". */
    _type: Option[String],
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Purchase order ID. */
    _purchaseOrderId: Option[String],
    /* Start time. Unix timestamp. */
    _startTime: Option[Number],
    /* End time. Unix timestamp. */
    _endTime: Option[Number],
    /* Order line budget in micro currency. */
    _budget: Option[Number],
    /* Order line paid budget in micro currency. */
    _paidBudget: Option[Number],
    /* Order line status. */
    _status: Option[OrderLineStatus],
    /* Order line name. */
    _name: Option[String],
    /* Order line paid type. */
    _paidType: Option[OrderLinePaidType]
)
object OrderLines {
    def toStringBody(var_id: Object, var_type: Object, var_adAccountId: Object, var_purchaseOrderId: Object, var_startTime: Object, var_endTime: Object, var_budget: Object, var_paidBudget: Object, var_status: Object, var_name: Object, var_paidType: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"adAccountId":$var_adAccountId,"purchaseOrderId":$var_purchaseOrderId,"startTime":$var_startTime,"endTime":$var_endTime,"budget":$var_budget,"paidBudget":$var_paidBudget,"status":$var_status,"name":$var_name,"paidType":$var_paidType
        | }
        """.stripMargin
}
