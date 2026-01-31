
package org.openapitools.client.model


case class AudienceCreateRequest (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Audience name. */
    _name: String,
    _rule: AudienceRule,
    /* <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. */
    _audienceType: AudienceType,
    /* Audience description. */
    _description: Option[String]
)
object AudienceCreateRequest {
    def toStringBody(var_adAccountId: Object, var_name: Object, var_rule: Object, var_audienceType: Object, var_description: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"name":$var_name,"rule":$var_rule,"audienceType":$var_audienceType,"description":$var_description
        | }
        """.stripMargin
}
