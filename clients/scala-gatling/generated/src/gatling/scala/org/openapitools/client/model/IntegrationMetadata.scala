
package org.openapitools.client.model


case class IntegrationMetadata (
    _additionalId1: Option[String],
    _connectedAdvertiserId: Option[String],
    _connectedLbaId: Option[String],
    _connectedMerchantId: Option[String],
    _connectedTagId: Option[String],
    _connectedUserId: Option[String],
    _createdTimestamp: Option[Number],
    _externalBusinessId: Option[String],
    _id: Option[String],
    _partnerAccessTokenExpiry: Option[Number],
    _partnerMetadata: Option[String],
    _partnerRefreshTokenExpiry: Option[Number],
    _scopes: Option[String],
    _updatedTimestamp: Option[Number]
)
object IntegrationMetadata {
    def toStringBody(var_additionalId1: Object, var_connectedAdvertiserId: Object, var_connectedLbaId: Object, var_connectedMerchantId: Object, var_connectedTagId: Object, var_connectedUserId: Object, var_createdTimestamp: Object, var_externalBusinessId: Object, var_id: Object, var_partnerAccessTokenExpiry: Object, var_partnerMetadata: Object, var_partnerRefreshTokenExpiry: Object, var_scopes: Object, var_updatedTimestamp: Object) =
        s"""
        | {
        | "additionalId1":$var_additionalId1,"connectedAdvertiserId":$var_connectedAdvertiserId,"connectedLbaId":$var_connectedLbaId,"connectedMerchantId":$var_connectedMerchantId,"connectedTagId":$var_connectedTagId,"connectedUserId":$var_connectedUserId,"createdTimestamp":$var_createdTimestamp,"externalBusinessId":$var_externalBusinessId,"id":$var_id,"partnerAccessTokenExpiry":$var_partnerAccessTokenExpiry,"partnerMetadata":$var_partnerMetadata,"partnerRefreshTokenExpiry":$var_partnerRefreshTokenExpiry,"scopes":$var_scopes,"updatedTimestamp":$var_updatedTimestamp
        | }
        """.stripMargin
}
