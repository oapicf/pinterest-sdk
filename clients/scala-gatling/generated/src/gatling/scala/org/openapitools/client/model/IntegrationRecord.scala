
package org.openapitools.client.model


case class IntegrationRecord (
    _additionalId1: Option[String],
    _connectedAdvertiserId: Option[String],
    _connectedLbaId: Option[String],
    _connectedMerchantId: Option[String],
    _connectedTagId: Option[String],
    _connectedUserId: Option[String],
    _createdTime: Option[Integer],
    _externalBusinessId: Option[String],
    /* Integration record ID. */
    _id: String,
    _partnerAccessToken: Option[String],
    _partnerAccessTokenExpiry: Option[Integer],
    _partnerMetadata: Option[String],
    _partnerPrimaryEmail: Option[String],
    _partnerRefreshToken: Option[String],
    _partnerRefreshTokenExpiry: Option[Integer],
    _scopes: Option[String],
    _updatedTime: Option[Integer]
)
object IntegrationRecord {
    def toStringBody(var_additionalId1: Object, var_connectedAdvertiserId: Object, var_connectedLbaId: Object, var_connectedMerchantId: Object, var_connectedTagId: Object, var_connectedUserId: Object, var_createdTime: Object, var_externalBusinessId: Object, var_id: Object, var_partnerAccessToken: Object, var_partnerAccessTokenExpiry: Object, var_partnerMetadata: Object, var_partnerPrimaryEmail: Object, var_partnerRefreshToken: Object, var_partnerRefreshTokenExpiry: Object, var_scopes: Object, var_updatedTime: Object) =
        s"""
        | {
        | "additionalId1":$var_additionalId1,"connectedAdvertiserId":$var_connectedAdvertiserId,"connectedLbaId":$var_connectedLbaId,"connectedMerchantId":$var_connectedMerchantId,"connectedTagId":$var_connectedTagId,"connectedUserId":$var_connectedUserId,"createdTime":$var_createdTime,"externalBusinessId":$var_externalBusinessId,"id":$var_id,"partnerAccessToken":$var_partnerAccessToken,"partnerAccessTokenExpiry":$var_partnerAccessTokenExpiry,"partnerMetadata":$var_partnerMetadata,"partnerPrimaryEmail":$var_partnerPrimaryEmail,"partnerRefreshToken":$var_partnerRefreshToken,"partnerRefreshTokenExpiry":$var_partnerRefreshTokenExpiry,"scopes":$var_scopes,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
