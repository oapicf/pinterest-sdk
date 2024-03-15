
package org.openapitools.client.model


case class IntegrationRecord (
    _id: Option[String],
    _externalBusinessId: Option[String],
    _connectedMerchantId: Option[String],
    _connectedUserId: Option[String],
    _connectedAdvertiserId: Option[String],
    _connectedLbaId: Option[String],
    _connectedTagId: Option[String],
    _partnerAccessToken: Option[String],
    _partnerRefreshToken: Option[String],
    _partnerPrimaryEmail: Option[String],
    _partnerAccessTokenExpiry: Option[Integer],
    _partnerRefreshTokenExpiry: Option[Integer],
    _scopes: Option[String],
    _partnerMetadata: Option[String],
    _additionalId1: Option[String],
    _createdTime: Option[Integer],
    _updatedTime: Option[Integer]
)
object IntegrationRecord {
    def toStringBody(var_id: Object, var_externalBusinessId: Object, var_connectedMerchantId: Object, var_connectedUserId: Object, var_connectedAdvertiserId: Object, var_connectedLbaId: Object, var_connectedTagId: Object, var_partnerAccessToken: Object, var_partnerRefreshToken: Object, var_partnerPrimaryEmail: Object, var_partnerAccessTokenExpiry: Object, var_partnerRefreshTokenExpiry: Object, var_scopes: Object, var_partnerMetadata: Object, var_additionalId1: Object, var_createdTime: Object, var_updatedTime: Object) =
        s"""
        | {
        | "id":$var_id,"externalBusinessId":$var_externalBusinessId,"connectedMerchantId":$var_connectedMerchantId,"connectedUserId":$var_connectedUserId,"connectedAdvertiserId":$var_connectedAdvertiserId,"connectedLbaId":$var_connectedLbaId,"connectedTagId":$var_connectedTagId,"partnerAccessToken":$var_partnerAccessToken,"partnerRefreshToken":$var_partnerRefreshToken,"partnerPrimaryEmail":$var_partnerPrimaryEmail,"partnerAccessTokenExpiry":$var_partnerAccessTokenExpiry,"partnerRefreshTokenExpiry":$var_partnerRefreshTokenExpiry,"scopes":$var_scopes,"partnerMetadata":$var_partnerMetadata,"additionalId1":$var_additionalId1,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
