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
 * Creation fields
 * @param name Internal name of the lead form.
 * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
 * @param completionMessage A message for people who complete the form to let them know what happens next.
 * @param status 
 * @param disclosureLanguage Additional disclosure language to be included in the lead form.
 * @param questions List of questions to be displayed on the lead form.
 */
object LeadFormCommons : BaseTable<LeadFormCommon>("LeadFormCommon") {
    val name = text("name") /* null */ /* Internal name of the lead form. */
    val privacyPolicyLink = text("privacy_policy_link") /* null */ /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
    val hasAcceptedTerms = boolean("has_accepted_terms") /* null */ /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. */
    val completionMessage = text("completion_message") /* null */ /* A message for people who complete the form to let them know what happens next. */
    val status = long("status") /* null */
    val disclosureLanguage = text("disclosure_language") /* null */ /* Additional disclosure language to be included in the lead form. */

    /**
     * Create an entity of type LeadFormCommon from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = LeadFormCommon(
        name = row[name]  /* kotlin.String? */ /* Internal name of the lead form. */,
        privacyPolicyLink = row[privacyPolicyLink]  /* kotlin.String? */ /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */,
        hasAcceptedTerms = row[hasAcceptedTerms]  /* kotlin.Boolean? */ /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. */,
        completionMessage = row[completionMessage]  /* kotlin.String? */ /* A message for people who complete the form to let them know what happens next. */,
        status = LeadFormStatuss.createEntity(row, withReferences) /* LeadFormStatus? */,
        disclosureLanguage = row[disclosureLanguage]  /* kotlin.String? */ /* Additional disclosure language to be included in the lead form. */,
        questions = emptyList() /* kotlin.Array<LeadFormQuestion>? */ /* List of questions to be displayed on the lead form. */
    )

    /**
    * Assign all the columns from the entity of type LeadFormCommon to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = LeadFormCommon()
    * database.update(LeadFormCommons, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: LeadFormCommon) {
        this.apply {
            set(LeadFormCommons.name, entity.name)
            set(LeadFormCommons.privacyPolicyLink, entity.privacyPolicyLink)
            set(LeadFormCommons.hasAcceptedTerms, entity.hasAcceptedTerms)
            set(LeadFormCommons.completionMessage, entity.completionMessage)
            set(LeadFormCommons.status, entity.status)
            set(LeadFormCommons.disclosureLanguage, entity.disclosureLanguage)
        }
    }

}


object LeadFormCommonLeadFormQuestion : BaseTable<Pair<kotlin.Long, kotlin.Long>>("LeadFormCommonLeadFormQuestion") {
    val leadFormCommon = long("leadFormCommon")
    val leadFormQuestion = long("leadFormQuestion")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[leadFormCommon] ?: 0, row[leadFormQuestion] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(LeadFormCommonLeadFormQuestion.leadFormCommon, entity.first)
            set(LeadFormCommonLeadFormQuestion.leadFormQuestion, entity.second)
        }
    }

}
