
package org.openapitools.client.model


case class IntegrationMetadata (
    _id: Option[String],
    _externalBusinessId: Option[String],
    _connectedMerchantId: Option[String],
    _connectedUserId: Option[String],
    _connectedAdvertiserId: Option[String],
    _connectedLbaId: Option[String],
    _connectedTagId: Option[String],
    _partnerAccessTokenExpiry: Option[Number],
    _partnerRefreshTokenExpiry: Option[Number],
    _scopes: Option[String],
    _createdTimestamp: Option[Number],
    _updatedTimestamp: Option[Number],
    _additionalId1: Option[String],
    _partnerMetadata: Option[String]
)
object IntegrationMetadata {
    def toStringBody(var_id: Object, var_externalBusinessId: Object, var_connectedMerchantId: Object, var_connectedUserId: Object, var_connectedAdvertiserId: Object, var_connectedLbaId: Object, var_connectedTagId: Object, var_partnerAccessTokenExpiry: Object, var_partnerRefreshTokenExpiry: Object, var_scopes: Object, var_createdTimestamp: Object, var_updatedTimestamp: Object, var_additionalId1: Object, var_partnerMetadata: Object) =
        s"""
        | {
        | "id":$var_id,"externalBusinessId":$var_externalBusinessId,"connectedMerchantId":$var_connectedMerchantId,"connectedUserId":$var_connectedUserId,"connectedAdvertiserId":$var_connectedAdvertiserId,"connectedLbaId":$var_connectedLbaId,"connectedTagId":$var_connectedTagId,"partnerAccessTokenExpiry":$var_partnerAccessTokenExpiry,"partnerRefreshTokenExpiry":$var_partnerRefreshTokenExpiry,"scopes":$var_scopes,"createdTimestamp":$var_createdTimestamp,"updatedTimestamp":$var_updatedTimestamp,"additionalId1":$var_additionalId1,"partnerMetadata":$var_partnerMetadata
        | }
        """.stripMargin
}
