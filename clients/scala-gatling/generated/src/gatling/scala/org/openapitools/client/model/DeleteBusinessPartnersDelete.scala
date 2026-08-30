
package org.openapitools.client.model


case class DeleteBusinessPartnersDelete (
    /* A list of partner ids to be deleted */
    _partnerIds: List[String],
    _partnerType: Option[NullablePartnerType]
)
object DeleteBusinessPartnersDelete {
    def toStringBody(var_partnerIds: Object, var_partnerType: Object) =
        s"""
        | {
        | "partnerIds":$var_partnerIds,"partnerType":$var_partnerType
        | }
        """.stripMargin
}
