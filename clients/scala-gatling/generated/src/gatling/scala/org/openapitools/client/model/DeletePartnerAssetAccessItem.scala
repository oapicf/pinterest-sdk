
package org.openapitools.client.model


case class DeletePartnerAssetAccessItem (
    /* Unique identifier of the business asset. */
    _assetId: String,
    /* Unique identifier of a business partner to update asset access to. */
    _partnerId: String,
    /* If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. */
    _partnerType: Option[String]
)
object DeletePartnerAssetAccessItem {
    def toStringBody(var_assetId: Object, var_partnerId: Object, var_partnerType: Object) =
        s"""
        | {
        | "assetId":$var_assetId,"partnerId":$var_partnerId,"partnerType":$var_partnerType
        | }
        """.stripMargin
}
