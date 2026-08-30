
package org.openapitools.client.model


case class CustomerSegment (
    /* The ID of the ad account that this customer segment belongs to. */
    _adAccountId: Option[String],
    /* Audience IDs included in the customer segment. */
    _audienceIds: List[String],
    /* Customer segment created time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Customer segment ID. */
    _id: Option[String],
    /* Customer segment name. */
    _name: String,
    /* Indicates whether the customer segment is active or deleted. */
    _status: Option[TargetingTemplateStatus],
    /* Customer segment updated time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer]
)
object CustomerSegment {
    def toStringBody(var_adAccountId: Object, var_audienceIds: Object, var_createdTime: Object, var_id: Object, var_name: Object, var_status: Object, var_updatedTime: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"audienceIds":$var_audienceIds,"createdTime":$var_createdTime,"id":$var_id,"name":$var_name,"status":$var_status,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
