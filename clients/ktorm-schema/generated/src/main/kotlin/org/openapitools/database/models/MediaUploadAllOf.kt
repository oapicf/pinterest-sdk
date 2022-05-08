/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
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
 * 
 * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @param mediaType 
 * @param uploadUrl The URL where you will POST your media file.
 * @param uploadParameters 
 */
object MediaUploadAllOfs : BaseTable<MediaUploadAllOf>("MediaUpload_allOf") {
    val mediaId = text("media_id") /* null */ /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    val mediaType = long("media_type") /* null */
    val uploadUrl = text("upload_url") /* null */ /* The URL where you will POST your media file. */
    val uploadParameters = long("upload_parameters") /* null */

    /**
     * Create an entity of type MediaUploadAllOf from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = MediaUploadAllOf(
        mediaId = row[mediaId]  /* kotlin.String? */ /* Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */,
        mediaType = MediaUploadTypes.createEntity(row, withReferences) /* MediaUploadType? */,
        uploadUrl = row[uploadUrl]  /* kotlin.String? */ /* The URL where you will POST your media file. */,
        uploadParameters = MediaUploadAllOfUploadParameterss.createEntity(row, withReferences) /* MediaUploadAllOfUploadParameters? */
    )

    /**
    * Assign all the columns from the entity of type MediaUploadAllOf to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = MediaUploadAllOf()
    * database.update(MediaUploadAllOfs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: MediaUploadAllOf) {
        this.apply {
            set(MediaUploadAllOfs.mediaId, entity.mediaId)
            set(MediaUploadAllOfs.mediaType, entity.mediaType)
            set(MediaUploadAllOfs.uploadUrl, entity.uploadUrl)
            set(MediaUploadAllOfs.uploadParameters, entity.uploadParameters)
        }
    }

}

