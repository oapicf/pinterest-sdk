
package org.openapitools.client.model


case class AdAccountsAudienceUpdate (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    _audienceType: Option[AudienceType],
    /* Audience description. */
    _description: Option[String],
    /* Audience name. */
    _name: Option[String],
    /* Audience operation type (update or remove). Only valid in update request body. */
    _operationType: Option[AudienceUpdateOperationType],
    _rule: Option[AdAccountsAudienceRule]
)
object AdAccountsAudienceUpdate {
    def toStringBody(var_adAccountId: Object, var_audienceType: Object, var_description: Object, var_name: Object, var_operationType: Object, var_rule: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"audienceType":$var_audienceType,"description":$var_description,"name":$var_name,"operationType":$var_operationType,"rule":$var_rule
        | }
        """.stripMargin
}
