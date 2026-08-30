
package org.openapitools.client.model


case class DeleteBusinessPartners (
    _deletedPartners: Option[List[String]]
)
object DeleteBusinessPartners {
    def toStringBody(var_deletedPartners: Object) =
        s"""
        | {
        | "deletedPartners":$var_deletedPartners
        | }
        """.stripMargin
}
