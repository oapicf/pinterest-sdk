
package org.openapitools.client.model


case class DeletePartnersRequest (
    _partnerIds: List[String],
    _partnerType: Option[String]
)
object DeletePartnersRequest {
    def toStringBody(var_partnerIds: Object, var_partnerType: Object) =
        s"""
        | {
        | "partnerIds":$var_partnerIds,"partnerType":$var_partnerType
        | }
        """.stripMargin
}
