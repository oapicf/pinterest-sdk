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
 * 
 * @param term 
 * @param relatedTerms 
 */
object RelatedTermsRelatedTermsListInners : BaseTable<RelatedTermsRelatedTermsListInner>("RelatedTerms_related_terms_list_inner") {
    val term = text("term") /* null */

    /**
     * Create an entity of type RelatedTermsRelatedTermsListInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RelatedTermsRelatedTermsListInner(
        term = row[term]  /* kotlin.String? */,
        relatedTerms = emptyList() /* kotlin.Array<kotlin.String>? */
    )

    /**
    * Assign all the columns from the entity of type RelatedTermsRelatedTermsListInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RelatedTermsRelatedTermsListInner()
    * database.update(RelatedTermsRelatedTermsListInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RelatedTermsRelatedTermsListInner) {
        this.apply {
            set(RelatedTermsRelatedTermsListInners.term, entity.term)
        }
    }

}


object RelatedTermsRelatedTermsListInnerRelatedTerms : BaseTable<Pair<kotlin.Long, kotlin.String>>("RelatedTermsRelatedTermsListInnerRelatedTerms") {
    val relatedTermsRelatedTermsListInner = long("relatedTermsRelatedTermsListInner")
    val relatedTerms = text("relatedTerms")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[relatedTermsRelatedTermsListInner] ?: 0, row[relatedTerms] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(RelatedTermsRelatedTermsListInnerRelatedTerms.relatedTermsRelatedTermsListInner, entity.first)
            set(RelatedTermsRelatedTermsListInnerRelatedTerms.relatedTerms, entity.second)
        }
    }

}
