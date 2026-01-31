
package org.openapitools.client.model


case class LeadFormQuestion (
    _customQuestionFieldType: Option[LeadFormQuestionFieldType],
    /* Question label for a custom question. */
    _customQuestionLabel: Option[String],
    /* Question options for a custom question. */
    _customQuestionOptions: Option[List[String]],
    _questionType: Option[LeadFormQuestionType]
)
object LeadFormQuestion {
    def toStringBody(var_customQuestionFieldType: Object, var_customQuestionLabel: Object, var_customQuestionOptions: Object, var_questionType: Object) =
        s"""
        | {
        | "customQuestionFieldType":$var_customQuestionFieldType,"customQuestionLabel":$var_customQuestionLabel,"customQuestionOptions":$var_customQuestionOptions,"questionType":$var_questionType
        | }
        """.stripMargin
}
