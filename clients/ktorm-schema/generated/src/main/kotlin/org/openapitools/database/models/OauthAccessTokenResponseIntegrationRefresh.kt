/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
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
 * A successful OAuth access token response for the refresh token flow, with an added refresh token.
 * @param accessToken 
 * @param tokenType 
 * @param expiresIn 
 * @param scope 
 * @param refreshToken 
 * @param refreshTokenExpiresIn 
 * @param responseType 
 */
object OauthAccessTokenResponseIntegrationRefreshs : BaseTable<OauthAccessTokenResponseIntegrationRefresh>("OauthAccessTokenResponseIntegrationRefresh") {
    val accessToken = text("access_token")
    val tokenType = text("token_type")
    val expiresIn = int("expires_in")
    val scope = text("scope")
    val refreshToken = text("refresh_token")
    val refreshTokenExpiresIn = int("refresh_token_expires_in")
    val responseType = text("response_type").transform({ OauthAccessTokenResponseIntegrationRefresh.ResponseType.valueOf(it ?: "authorization_code") }, { it.value }) /* null */


    /**
     * Create an entity of type OauthAccessTokenResponseIntegrationRefresh from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OauthAccessTokenResponseIntegrationRefresh(
        accessToken = row[accessToken] ?: "" /* kotlin.String */,
        tokenType = row[tokenType] ?: "" /* kotlin.String */,
        expiresIn = row[expiresIn] ?: 0 /* kotlin.Int */,
        scope = row[scope] ?: "" /* kotlin.String */,
        refreshToken = row[refreshToken] ?: "" /* kotlin.String */,
        refreshTokenExpiresIn = row[refreshTokenExpiresIn] ?: 0 /* kotlin.Int */,
        responseType = row[responseType]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type OauthAccessTokenResponseIntegrationRefresh to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OauthAccessTokenResponseIntegrationRefresh()
    * database.update(OauthAccessTokenResponseIntegrationRefreshs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OauthAccessTokenResponseIntegrationRefresh) {
        this.apply {
            set(OauthAccessTokenResponseIntegrationRefreshs.accessToken, entity.accessToken)
            set(OauthAccessTokenResponseIntegrationRefreshs.tokenType, entity.tokenType)
            set(OauthAccessTokenResponseIntegrationRefreshs.expiresIn, entity.expiresIn)
            set(OauthAccessTokenResponseIntegrationRefreshs.scope, entity.scope)
            set(OauthAccessTokenResponseIntegrationRefreshs.refreshToken, entity.refreshToken)
            set(OauthAccessTokenResponseIntegrationRefreshs.refreshTokenExpiresIn, entity.refreshTokenExpiresIn)
            set(OauthAccessTokenResponseIntegrationRefreshs.responseType, entity.responseType)
        }
    }

}

