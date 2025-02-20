/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Integration metadata
 * @param id 
 * @param externalBusinessId 
 * @param connectedMerchantId 
 * @param connectedUserId 
 * @param connectedAdvertiserId 
 * @param connectedLbaId 
 * @param connectedTagId 
 * @param partnerAccessTokenExpiry 
 * @param partnerRefreshTokenExpiry 
 * @param scopes 
 * @param createdTimestamp 
 * @param updatedTimestamp 
 * @param additionalId1 
 * @param partnerMetadata 
 */
object IntegrationMetadatas : BaseTable<IntegrationMetadata>("IntegrationMetadata") {
    val id = text("id") /* null */
    val externalBusinessId = text("external_business_id") /* null */
    val connectedMerchantId = text("connected_merchant_id") /* null */
    val connectedUserId = text("connected_user_id") /* null */
    val connectedAdvertiserId = text("connected_advertiser_id") /* null */
    val connectedLbaId = text("connected_lba_id") /* null */
    val connectedTagId = text("connected_tag_id") /* null */
    val partnerAccessTokenExpiry = decimal("partner_access_token_expiry") /* null */
    val partnerRefreshTokenExpiry = decimal("partner_refresh_token_expiry") /* null */
    val scopes = text("scopes") /* null */
    val createdTimestamp = decimal("created_timestamp") /* null */
    val updatedTimestamp = decimal("updated_timestamp") /* null */
    val additionalId1 = text("additional_id_1") /* null */
    val partnerMetadata = text("partner_metadata") /* null */

    /**
     * Create an entity of type IntegrationMetadata from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = IntegrationMetadata(
        id = row[id]  /* kotlin.String? */,
        externalBusinessId = row[externalBusinessId]  /* kotlin.String? */,
        connectedMerchantId = row[connectedMerchantId]  /* kotlin.String? */,
        connectedUserId = row[connectedUserId]  /* kotlin.String? */,
        connectedAdvertiserId = row[connectedAdvertiserId]  /* kotlin.String? */,
        connectedLbaId = row[connectedLbaId]  /* kotlin.String? */,
        connectedTagId = row[connectedTagId]  /* kotlin.String? */,
        partnerAccessTokenExpiry = row[partnerAccessTokenExpiry]  /* java.math.BigDecimal? */,
        partnerRefreshTokenExpiry = row[partnerRefreshTokenExpiry]  /* java.math.BigDecimal? */,
        scopes = row[scopes]  /* kotlin.String? */,
        createdTimestamp = row[createdTimestamp]  /* java.math.BigDecimal? */,
        updatedTimestamp = row[updatedTimestamp]  /* java.math.BigDecimal? */,
        additionalId1 = row[additionalId1]  /* kotlin.String? */,
        partnerMetadata = row[partnerMetadata]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type IntegrationMetadata to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = IntegrationMetadata()
    * database.update(IntegrationMetadatas, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: IntegrationMetadata) {
        this.apply {
            set(IntegrationMetadatas.id, entity.id)
            set(IntegrationMetadatas.externalBusinessId, entity.externalBusinessId)
            set(IntegrationMetadatas.connectedMerchantId, entity.connectedMerchantId)
            set(IntegrationMetadatas.connectedUserId, entity.connectedUserId)
            set(IntegrationMetadatas.connectedAdvertiserId, entity.connectedAdvertiserId)
            set(IntegrationMetadatas.connectedLbaId, entity.connectedLbaId)
            set(IntegrationMetadatas.connectedTagId, entity.connectedTagId)
            set(IntegrationMetadatas.partnerAccessTokenExpiry, entity.partnerAccessTokenExpiry)
            set(IntegrationMetadatas.partnerRefreshTokenExpiry, entity.partnerRefreshTokenExpiry)
            set(IntegrationMetadatas.scopes, entity.scopes)
            set(IntegrationMetadatas.createdTimestamp, entity.createdTimestamp)
            set(IntegrationMetadatas.updatedTimestamp, entity.updatedTimestamp)
            set(IntegrationMetadatas.additionalId1, entity.additionalId1)
            set(IntegrationMetadatas.partnerMetadata, entity.partnerMetadata)
        }
    }

}


