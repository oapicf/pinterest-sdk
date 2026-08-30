
package org.openapitools.client.model


case class AdAccountsAudienceCreate (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    _audienceType: Option[AudienceType],
    /* Audience description. */
    _description: Option[String],
    /* Audience name. */
    _name: Option[String],
    _rule: Option[AdAccountsAudienceRule]
)
object AdAccountsAudienceCreate {
    def toStringBody(var_adAccountId: Object, var_audienceType: Object, var_description: Object, var_name: Object, var_rule: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"audienceType":$var_audienceType,"description":$var_description,"name":$var_name,"rule":$var_rule
        | }
        """.stripMargin
}
