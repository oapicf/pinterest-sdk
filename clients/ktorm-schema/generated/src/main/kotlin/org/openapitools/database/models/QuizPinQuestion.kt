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
 * A specific quiz inquiry.
 * @param questionId 
 * @param questionText 
 * @param options 
 */
object QuizPinQuestions : BaseTable<QuizPinQuestion>("QuizPinQuestion") {
    val questionId = decimal("question_id") /* null */
    val questionText = text("question_text") /* null */

    /**
     * Create an entity of type QuizPinQuestion from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = QuizPinQuestion(
        questionId = row[questionId]  /* java.math.BigDecimal? */,
        questionText = row[questionText]  /* kotlin.String? */,
        options = emptyList() /* kotlin.Array<QuizPinOption>? */
    )

    /**
    * Assign all the columns from the entity of type QuizPinQuestion to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = QuizPinQuestion()
    * database.update(QuizPinQuestions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: QuizPinQuestion) {
        this.apply {
            set(QuizPinQuestions.questionId, entity.questionId)
            set(QuizPinQuestions.questionText, entity.questionText)
        }
    }

}


object QuizPinQuestionQuizPinOption : BaseTable<Pair<kotlin.Long, kotlin.Long>>("QuizPinQuestionQuizPinOption") {
    val quizPinQuestion = long("quizPinQuestion")
    val quizPinOption = long("quizPinOption")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[quizPinQuestion] ?: 0, row[quizPinOption] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(QuizPinQuestionQuizPinOption.quizPinQuestion, entity.first)
            set(QuizPinQuestionQuizPinOption.quizPinOption, entity.second)
        }
    }

}

