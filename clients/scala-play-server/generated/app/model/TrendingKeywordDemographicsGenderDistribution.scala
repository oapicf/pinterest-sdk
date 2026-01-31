package model

import play.api.libs.json._

/**
  * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TrendingKeywordDemographicsGenderDistribution(
  genderDistribution: Option[TrendingKeywordDemographicsGenderDistribution.GenderDistribution.Value]
  additionalProperties: Map[String, Double]
)

object TrendingKeywordDemographicsGenderDistribution {
  implicit lazy val trendingKeywordDemographicsGenderDistributionJsonFormat: Format[TrendingKeywordDemographicsGenderDistribution] = {
    val realJsonFormat = Json.format[TrendingKeywordDemographicsGenderDistribution]
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
      Writes { trendingKeywordDemographicsGenderDistribution =>
        val jsObj = realJsonFormat.writes(trendingKeywordDemographicsGenderDistribution)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object GenderDistribution extends Enumeration {
    val Male = Value("male")
    val Female = Value("female")
    val Unspecified = Value("unspecified")

    type GenderDistribution = Value
    implicit lazy val GenderDistributionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

