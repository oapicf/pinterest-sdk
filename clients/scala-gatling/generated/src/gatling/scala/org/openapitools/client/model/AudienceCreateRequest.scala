
package org.openapitools.client.model


case class AudienceCreateRequest (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Audience name. */
    _name: String,
    _rule: AudienceRule,
    /* Audience description. */
    _description: Option[String],
    _audienceType: AudienceCreateRequest1AudienceType
)
object AudienceCreateRequest {
    def toStringBody(var_adAccountId: Object, var_name: Object, var_rule: Object, var_description: Object, var_audienceType: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"name":$var_name,"rule":$var_rule,"description":$var_description,"audienceType":$var_audienceType
        | }
        """.stripMargin
}
