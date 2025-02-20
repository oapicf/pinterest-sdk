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
 * @param questionType 
 * @param customQuestionFieldType 
 * @param customQuestionLabel Question label for a custom question.
 * @param customQuestionOptions Question options for a custom question.
 */
object LeadFormQuestions : BaseTable<LeadFormQuestion>("LeadFormQuestion") {
    val questionType = long("question_type") /* null */
    val customQuestionFieldType = long("custom_question_field_type") /* null */
    val customQuestionLabel = text("custom_question_label") /* null */ /* Question label for a custom question. */

    /**
     * Create an entity of type LeadFormQuestion from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = LeadFormQuestion(
        questionType = LeadFormQuestionTypes.createEntity(row, withReferences) /* LeadFormQuestionType? */,
        customQuestionFieldType = LeadFormQuestionFieldTypes.createEntity(row, withReferences) /* LeadFormQuestionFieldType? */,
        customQuestionLabel = row[customQuestionLabel]  /* kotlin.String? */ /* Question label for a custom question. */,
        customQuestionOptions = emptyList() /* kotlin.Array<kotlin.String>? */ /* Question options for a custom question. */
    )

    /**
    * Assign all the columns from the entity of type LeadFormQuestion to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = LeadFormQuestion()
    * database.update(LeadFormQuestions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: LeadFormQuestion) {
        this.apply {
            set(LeadFormQuestions.questionType, entity.questionType)
            set(LeadFormQuestions.customQuestionFieldType, entity.customQuestionFieldType)
            set(LeadFormQuestions.customQuestionLabel, entity.customQuestionLabel)
        }
    }

}


object LeadFormQuestionCustomQuestionOptions : BaseTable<Pair<kotlin.Long, kotlin.String>>("LeadFormQuestionCustomQuestionOptions") {
    val leadFormQuestion = long("leadFormQuestion")
    val customQuestionOptions = text("customQuestionOptions")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[leadFormQuestion] ?: 0, row[customQuestionOptions] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(LeadFormQuestionCustomQuestionOptions.leadFormQuestion, entity.first)
            set(LeadFormQuestionCustomQuestionOptions.customQuestionOptions, entity.second)
        }
    }

}

