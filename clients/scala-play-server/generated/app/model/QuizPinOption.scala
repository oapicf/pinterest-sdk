package model

import play.api.libs.json._

/**
  * This field contains multiple options to a quiz question.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class QuizPinOption(
  id: Option[BigDecimal],
  text: Option[String]
)

object QuizPinOption {
  implicit lazy val quizPinOptionJsonFormat: Format[QuizPinOption] = Json.format[QuizPinOption]
}

