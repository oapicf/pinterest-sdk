
package org.openapitools.client.model


case class LeadFormQuestion (
    _questionType: Option[LeadFormQuestionType],
    _customQuestionFieldType: Option[LeadFormQuestionFieldType],
    /* Question label for a custom question. */
    _customQuestionLabel: Option[String],
    /* Question options for a custom question. */
    _customQuestionOptions: Option[List[String]]
)
object LeadFormQuestion {
    def toStringBody(var_questionType: Object, var_customQuestionFieldType: Object, var_customQuestionLabel: Object, var_customQuestionOptions: Object) =
        s"""
        | {
        | "questionType":$var_questionType,"customQuestionFieldType":$var_customQuestionFieldType,"customQuestionLabel":$var_customQuestionLabel,"customQuestionOptions":$var_customQuestionOptions
        | }
        """.stripMargin
}
