
package org.openapitools.client.model


case class AudienceCreateCustomRequest (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Audience name. */
    _name: String,
    _rule: AudienceRule,
    _sharingType: AudienceSharingType,
    _dataParty: AudienceDataParty,
    _category: Option[String]
)
object AudienceCreateCustomRequest {
    def toStringBody(var_adAccountId: Object, var_name: Object, var_rule: Object, var_sharingType: Object, var_dataParty: Object, var_category: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"name":$var_name,"rule":$var_rule,"sharingType":$var_sharingType,"dataParty":$var_dataParty,"category":$var_category
        | }
        """.stripMargin
}
