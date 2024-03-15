
package org.openapitools.client.model


case class AudienceUpdateRequest (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Audience name. */
    _name: Option[String],
    _rule: Option[AudienceRule],
    /* Audience description. */
    _description: Option[String],
    _operationType: Option[AudienceUpdateOperationType]
)
object AudienceUpdateRequest {
    def toStringBody(var_adAccountId: Object, var_name: Object, var_rule: Object, var_description: Object, var_operationType: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"name":$var_name,"rule":$var_rule,"description":$var_description,"operationType":$var_operationType
        | }
        """.stripMargin
}
