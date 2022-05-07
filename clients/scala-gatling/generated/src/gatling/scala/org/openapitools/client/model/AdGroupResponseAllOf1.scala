
package org.openapitools.client.model


case class AdGroupResponseAllOf1 (
    /* Campaign ID of the ad group. */
    _campaignId: Option[String],
    _billableEvent: Option[ActionType],
    /* Ad group ID. */
    _id: Option[String],
    /* Always \"adgroup\". */
    _type: Option[String],
    /* Advertiser ID. */
    _adAccountId: Option[String],
    /* Ad group creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Ad group last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer]
)
object AdGroupResponseAllOf1 {
    def toStringBody(var_campaignId: Object, var_billableEvent: Object, var_id: Object, var_type: Object, var_adAccountId: Object, var_createdTime: Object, var_updatedTime: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"billableEvent":$var_billableEvent,"id":$var_id,"type":$var_type,"adAccountId":$var_adAccountId,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
