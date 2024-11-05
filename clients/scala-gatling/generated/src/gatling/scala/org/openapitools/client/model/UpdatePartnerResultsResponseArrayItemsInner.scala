
package org.openapitools.client.model


case class UpdatePartnerResultsResponseArrayItemsInner (
    _exception: Option[BusinessAccessError],
    _memberOrPartnerId: Option[String]
)
object UpdatePartnerResultsResponseArrayItemsInner {
    def toStringBody(var_exception: Object, var_memberOrPartnerId: Object) =
        s"""
        | {
        | "exception":$var_exception,"memberOrPartnerId":$var_memberOrPartnerId
        | }
        """.stripMargin
}
