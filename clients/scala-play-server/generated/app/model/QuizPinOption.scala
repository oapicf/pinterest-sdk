package model

import play.api.libs.json._

/**
  * This field contains multiple options to a quiz question.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class QuizPinOption(
  id: Option[BigDecimal],
  text: Option[String]
)

object QuizPinOption {
  implicit lazy val quizPinOptionJsonFormat: Format[QuizPinOption] = Json.format[QuizPinOption]
}

