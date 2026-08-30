package model

import play.api.libs.json._

/**
  * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendsGenderDistribution(
  genderDistribution: Option[TrendsGender]
  additionalProperties: Map[String, Double]
)

object TrendsGenderDistribution {
  implicit lazy val trendsGenderDistributionJsonFormat: Format[TrendsGenderDistribution] = {
    val realJsonFormat = Json.format[TrendsGenderDistribution]
    val declaredPropNames = Set("genderDistribution")
    
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
      Writes { trendsGenderDistribution =>
        val jsObj = realJsonFormat.writes(trendsGenderDistribution)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

