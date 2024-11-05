
package org.openapitools.client.model


case class DeletePartnersResponse (
    /* List of partners whose business partnership have been terminated. */
    _deletedPartners: Option[List[String]]
)
object DeletePartnersResponse {
    def toStringBody(var_deletedPartners: Object) =
        s"""
        | {
        | "deletedPartners":$var_deletedPartners
        | }
        """.stripMargin
}
