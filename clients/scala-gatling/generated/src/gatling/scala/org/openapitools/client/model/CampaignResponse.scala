
package org.openapitools.client.model


case class CampaignResponse (
    /* Campaign ID. */
    _id: String,
    /* Campaign's Advertiser ID. */
    _adAccountId: String,
    /* Campaign name. */
    _name: Option[String],
    _status: Option[EntityStatus],
    /* Campaign total spending cap. */
    _lifetimeSpendCap: Option[Integer],
    /* Campaign daily spending cap. */
    _dailySpendCap: Option[Integer],
    /* Order line ID that appears on the invoice. */
    _orderLineId: Option[String],
    _trackingUrls: Option[TrackingUrls],
    /* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    _startTime: Option[Integer],
    /* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    _endTime: Option[Integer],
    _objectiveType: Option[ObjectiveType],
    /* Campaign creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* UTC timestamp. Last update time. */
    _updatedTime: Option[Integer],
    /* Always \"campaign\". */
    _type: Option[String]
)
object CampaignResponse {
    def toStringBody(var_id: Object, var_adAccountId: Object, var_name: Object, var_status: Object, var_lifetimeSpendCap: Object, var_dailySpendCap: Object, var_orderLineId: Object, var_trackingUrls: Object, var_startTime: Object, var_endTime: Object, var_objectiveType: Object, var_createdTime: Object, var_updatedTime: Object, var_type: Object) =
        s"""
        | {
        | "id":$var_id,"adAccountId":$var_adAccountId,"name":$var_name,"status":$var_status,"lifetimeSpendCap":$var_lifetimeSpendCap,"dailySpendCap":$var_dailySpendCap,"orderLineId":$var_orderLineId,"trackingUrls":$var_trackingUrls,"startTime":$var_startTime,"endTime":$var_endTime,"objectiveType":$var_objectiveType,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime,"type":$var_type
        | }
        """.stripMargin
}
