
package org.openapitools.client.model


case class DeletePartnerAssetAccessBodyAccessesInner (
    /* Unique identifier of a business partner to update asset access to. */
    _partnerId: String,
    /* Unique identifier of the business asset. */
    _assetId: String,
    /* If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. */
    _partnerType: Option[String]
)
object DeletePartnerAssetAccessBodyAccessesInner {
    def toStringBody(var_partnerId: Object, var_assetId: Object, var_partnerType: Object) =
        s"""
        | {
        | "partnerId":$var_partnerId,"assetId":$var_assetId,"partnerType":$var_partnerType
        | }
        """.stripMargin
}
