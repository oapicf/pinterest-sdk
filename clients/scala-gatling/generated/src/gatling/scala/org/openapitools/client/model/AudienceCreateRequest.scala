
package org.openapitools.client.model


case class AudienceCreateRequest (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Audience name. */
    _name: String,
    _rule: AudienceRule,
    /* Audience description. */
    _description: Option[String],
    /* <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. */
    _audienceType: AudienceType
)
object AudienceCreateRequest {
    def toStringBody(var_adAccountId: Object, var_name: Object, var_rule: Object, var_description: Object, var_audienceType: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"name":$var_name,"rule":$var_rule,"description":$var_description,"audienceType":$var_audienceType
        | }
        """.stripMargin
}
