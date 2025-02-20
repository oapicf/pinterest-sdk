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
 * Video ID-based media source
 * @param sourceType 
 * @param mediaId 
 * @param coverImageUrl Cover image url.
 * @param coverImageContentType Content type for cover image Base64.
 * @param coverImageData Cover image Base64.
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 */
object PinMediaSourceVideoIDs : BaseTable<PinMediaSourceVideoID>("PinMediaSourceVideoID") {
    val sourceType = text("source_type").transform({ PinMediaSourceVideoID.SourceType.valueOf(it) }, { it.value })
    val mediaId = text("media_id")
    val coverImageUrl = text("cover_image_url") /* null */ /* Cover image url. */
    val coverImageContentType = text("cover_image_content_type").transform({ PinMediaSourceVideoID.CoverImageContentType.valueOf(it ?: "image/jpeg") }, { it.value }) /* null */ /* Content type for cover image Base64. */

    val coverImageData = text("cover_image_data") /* null */ /* Cover image Base64. */
    val isStandard = boolean("is_standard") /* null */ /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */

    /**
     * Create an entity of type PinMediaSourceVideoID from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = PinMediaSourceVideoID(
        sourceType = row[sourceType] ?: PinMediaSourceVideoID.SourceType.valueOf("") /* kotlin.String */,
        mediaId = row[mediaId] ?: "" /* kotlin.String */,
        coverImageUrl = row[coverImageUrl]  /* kotlin.String? */ /* Cover image url. */,
        coverImageContentType = row[coverImageContentType]  /* kotlin.String? */ /* Content type for cover image Base64. */,
        coverImageData = row[coverImageData]  /* kotlin.String? */ /* Cover image Base64. */,
        isStandard = row[isStandard] ?: true /* kotlin.Boolean? */ /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    )

    /**
    * Assign all the columns from the entity of type PinMediaSourceVideoID to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = PinMediaSourceVideoID()
    * database.update(PinMediaSourceVideoIDs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: PinMediaSourceVideoID) {
        this.apply {
            set(PinMediaSourceVideoIDs.sourceType, entity.sourceType)
            set(PinMediaSourceVideoIDs.mediaId, entity.mediaId)
            set(PinMediaSourceVideoIDs.coverImageUrl, entity.coverImageUrl)
            set(PinMediaSourceVideoIDs.coverImageContentType, entity.coverImageContentType)
            set(PinMediaSourceVideoIDs.coverImageData, entity.coverImageData)
            set(PinMediaSourceVideoIDs.isStandard, entity.isStandard)
        }
    }

}


