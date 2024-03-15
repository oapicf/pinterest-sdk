
package org.openapitools.client.model


case class IntegrationRequestPatch (
    _connectedMerchantId: Option[String],
    _connectedAdvertiserId: Option[String],
    _connectedLbaId: Option[String],
    _connectedTagId: Option[String],
    _partnerAccessToken: Option[String],
    _partnerRefreshToken: Option[String],
    _partnerPrimaryEmail: Option[String],
    _partnerAccessTokenExpiry: Option[Number],
    _partnerRefreshTokenExpiry: Option[Number],
    _scopes: Option[String],
    _additionalId1: Option[String],
    _partnerMetadata: Option[String]
)
object IntegrationRequestPatch {
    def toStringBody(var_connectedMerchantId: Object, var_connectedAdvertiserId: Object, var_connectedLbaId: Object, var_connectedTagId: Object, var_partnerAccessToken: Object, var_partnerRefreshToken: Object, var_partnerPrimaryEmail: Object, var_partnerAccessTokenExpiry: Object, var_partnerRefreshTokenExpiry: Object, var_scopes: Object, var_additionalId1: Object, var_partnerMetadata: Object) =
        s"""
        | {
        | "connectedMerchantId":$var_connectedMerchantId,"connectedAdvertiserId":$var_connectedAdvertiserId,"connectedLbaId":$var_connectedLbaId,"connectedTagId":$var_connectedTagId,"partnerAccessToken":$var_partnerAccessToken,"partnerRefreshToken":$var_partnerRefreshToken,"partnerPrimaryEmail":$var_partnerPrimaryEmail,"partnerAccessTokenExpiry":$var_partnerAccessTokenExpiry,"partnerRefreshTokenExpiry":$var_partnerRefreshTokenExpiry,"scopes":$var_scopes,"additionalId1":$var_additionalId1,"partnerMetadata":$var_partnerMetadata
        | }
        """.stripMargin
}
