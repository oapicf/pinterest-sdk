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
 * 
 * @param id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
 * @param relatedTermCount Total number of related terms returned
 * @param relatedTermsList The id of the advertiser.
 */
object RelatedTermss : BaseTable<RelatedTerms>("RelatedTerms") {
    val id = text("id") /* null */ /* First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" */
    val relatedTermCount = int("related_term_count") /* null */ /* Total number of related terms returned */

    /**
     * Create an entity of type RelatedTerms from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RelatedTerms(
        id = row[id]  /* kotlin.String? */ /* First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" */,
        relatedTermCount = row[relatedTermCount]  /* kotlin.Int? */ /* Total number of related terms returned */,
        relatedTermsList = emptyList() /* kotlin.Array<RelatedTermsRelatedTermsListInner>? */ /* The id of the advertiser. */
    )

    /**
    * Assign all the columns from the entity of type RelatedTerms to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RelatedTerms()
    * database.update(RelatedTermss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RelatedTerms) {
        this.apply {
            set(RelatedTermss.id, entity.id)
            set(RelatedTermss.relatedTermCount, entity.relatedTermCount)
        }
    }

}


object RelatedTermsRelatedTermsRelatedTermsListInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("RelatedTermsRelatedTermsRelatedTermsListInner") {
    val relatedTerms = long("relatedTerms")
    val relatedTermsRelatedTermsListInner = long("relatedTermsRelatedTermsListInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[relatedTerms] ?: 0, row[relatedTermsRelatedTermsListInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(RelatedTermsRelatedTermsRelatedTermsListInner.relatedTerms, entity.first)
            set(RelatedTermsRelatedTermsRelatedTermsListInner.relatedTermsRelatedTermsListInner, entity.second)
        }
    }

}

