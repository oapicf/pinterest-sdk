package model

import play.api.libs.json._

/**
  * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdCommonQuizPinData(
  questions: Option[List[QuizPinQuestion]],
  results: Option[List[QuizPinResult]]
  additionalProperties: 
)

object AdCommonQuizPinData {
  implicit lazy val adCommonQuizPinDataJsonFormat: Format[AdCommonQuizPinData] = {
    val realJsonFormat = Json.format[AdCommonQuizPinData]
    val declaredPropNames = Set("questions", "results")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { adCommonQuizPinData =>
        val jsObj = realJsonFormat.writes(adCommonQuizPinData)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

