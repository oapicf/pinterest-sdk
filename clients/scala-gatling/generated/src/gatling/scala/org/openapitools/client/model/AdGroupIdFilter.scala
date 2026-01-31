
package org.openapitools.client.model


case class AdGroupIdFilter (
    /* List of ad group ids */
    _adGroupIds: Option[List[String]]
)
object AdGroupIdFilter {
    def toStringBody(var_adGroupIds: Object) =
        s"""
        | {
        | "adGroupIds":$var_adGroupIds
        | }
        """.stripMargin
}
