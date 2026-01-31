
package org.openapitools.client.model


case class IntegrationRequestPatch (
    _additionalId1: Option[String],
    _connectedAdvertiserId: Option[String],
    _connectedLbaId: Option[String],
    _connectedMerchantId: Option[String],
    _connectedTagId: Option[String],
    _partnerAccessToken: Option[String],
    _partnerAccessTokenExpiry: Option[Number],
    _partnerMetadata: Option[String],
    _partnerPrimaryEmail: Option[String],
    _partnerRefreshToken: Option[String],
    _partnerRefreshTokenExpiry: Option[Number],
    _scopes: Option[String]
)
object IntegrationRequestPatch {
    def toStringBody(var_additionalId1: Object, var_connectedAdvertiserId: Object, var_connectedLbaId: Object, var_connectedMerchantId: Object, var_connectedTagId: Object, var_partnerAccessToken: Object, var_partnerAccessTokenExpiry: Object, var_partnerMetadata: Object, var_partnerPrimaryEmail: Object, var_partnerRefreshToken: Object, var_partnerRefreshTokenExpiry: Object, var_scopes: Object) =
        s"""
        | {
        | "additionalId1":$var_additionalId1,"connectedAdvertiserId":$var_connectedAdvertiserId,"connectedLbaId":$var_connectedLbaId,"connectedMerchantId":$var_connectedMerchantId,"connectedTagId":$var_connectedTagId,"partnerAccessToken":$var_partnerAccessToken,"partnerAccessTokenExpiry":$var_partnerAccessTokenExpiry,"partnerMetadata":$var_partnerMetadata,"partnerPrimaryEmail":$var_partnerPrimaryEmail,"partnerRefreshToken":$var_partnerRefreshToken,"partnerRefreshTokenExpiry":$var_partnerRefreshTokenExpiry,"scopes":$var_scopes
        | }
        """.stripMargin
}
