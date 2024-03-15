
package org.openapitools.client.model


case class AudienceCommon (
    /* Ad account ID. */
    _adAccountId: Option[String],
    /* Audience name. */
    _name: Option[String],
    _rule: Option[AudienceRule]
)
object AudienceCommon {
    def toStringBody(var_adAccountId: Object, var_name: Object, var_rule: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"name":$var_name,"rule":$var_rule
        | }
        """.stripMargin
}
