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
 * Schema used for creating the integration metadata.
 * @param externalBusinessId External business ID for the integration.
 * @param connectedMerchantId 
 * @param connectedAdvertiserId 
 * @param connectedLbaId 
 * @param connectedTagId 
 * @param partnerAccessToken 
 * @param partnerRefreshToken 
 * @param partnerPrimaryEmail 
 * @param partnerAccessTokenExpiry 
 * @param partnerRefreshTokenExpiry 
 * @param scopes 
 * @param additionalId1 
 * @param partnerMetadata 
 */
object IntegrationRequests : BaseTable<IntegrationRequest>("IntegrationRequest") {
    val externalBusinessId = text("external_business_id") /* null */ /* External business ID for the integration. */
    val connectedMerchantId = text("connected_merchant_id") /* null */
    val connectedAdvertiserId = text("connected_advertiser_id") /* null */
    val connectedLbaId = text("connected_lba_id") /* null */
    val connectedTagId = text("connected_tag_id") /* null */
    val partnerAccessToken = text("partner_access_token") /* null */
    val partnerRefreshToken = text("partner_refresh_token") /* null */
    val partnerPrimaryEmail = text("partner_primary_email") /* null */
    val partnerAccessTokenExpiry = int("partner_access_token_expiry") /* null */
    val partnerRefreshTokenExpiry = int("partner_refresh_token_expiry") /* null */
    val scopes = text("scopes") /* null */
    val additionalId1 = text("additional_id_1") /* null */
    val partnerMetadata = text("partner_metadata") /* null */

    /**
     * Create an entity of type IntegrationRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = IntegrationRequest(
        externalBusinessId = row[externalBusinessId]  /* kotlin.String? */ /* External business ID for the integration. */,
        connectedMerchantId = row[connectedMerchantId]  /* kotlin.String? */,
        connectedAdvertiserId = row[connectedAdvertiserId]  /* kotlin.String? */,
        connectedLbaId = row[connectedLbaId]  /* kotlin.String? */,
        connectedTagId = row[connectedTagId]  /* kotlin.String? */,
        partnerAccessToken = row[partnerAccessToken]  /* kotlin.String? */,
        partnerRefreshToken = row[partnerRefreshToken]  /* kotlin.String? */,
        partnerPrimaryEmail = row[partnerPrimaryEmail]  /* kotlin.String? */,
        partnerAccessTokenExpiry = row[partnerAccessTokenExpiry]  /* kotlin.Int? */,
        partnerRefreshTokenExpiry = row[partnerRefreshTokenExpiry]  /* kotlin.Int? */,
        scopes = row[scopes]  /* kotlin.String? */,
        additionalId1 = row[additionalId1]  /* kotlin.String? */,
        partnerMetadata = row[partnerMetadata]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type IntegrationRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = IntegrationRequest()
    * database.update(IntegrationRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: IntegrationRequest) {
        this.apply {
            set(IntegrationRequests.externalBusinessId, entity.externalBusinessId)
            set(IntegrationRequests.connectedMerchantId, entity.connectedMerchantId)
            set(IntegrationRequests.connectedAdvertiserId, entity.connectedAdvertiserId)
            set(IntegrationRequests.connectedLbaId, entity.connectedLbaId)
            set(IntegrationRequests.connectedTagId, entity.connectedTagId)
            set(IntegrationRequests.partnerAccessToken, entity.partnerAccessToken)
            set(IntegrationRequests.partnerRefreshToken, entity.partnerRefreshToken)
            set(IntegrationRequests.partnerPrimaryEmail, entity.partnerPrimaryEmail)
            set(IntegrationRequests.partnerAccessTokenExpiry, entity.partnerAccessTokenExpiry)
            set(IntegrationRequests.partnerRefreshTokenExpiry, entity.partnerRefreshTokenExpiry)
            set(IntegrationRequests.scopes, entity.scopes)
            set(IntegrationRequests.additionalId1, entity.additionalId1)
            set(IntegrationRequests.partnerMetadata, entity.partnerMetadata)
        }
    }

}


