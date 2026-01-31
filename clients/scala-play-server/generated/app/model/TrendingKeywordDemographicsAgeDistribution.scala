package model

import play.api.libs.json._

/**
  * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TrendingKeywordDemographicsAgeDistribution(
  ageDistribution: Option[TrendingKeywordDemographicsAgeDistribution.AgeDistribution.Value]
  additionalProperties: Map[String, Double]
)

object TrendingKeywordDemographicsAgeDistribution {
  implicit lazy val trendingKeywordDemographicsAgeDistributionJsonFormat: Format[TrendingKeywordDemographicsAgeDistribution] = {
    val realJsonFormat = Json.format[TrendingKeywordDemographicsAgeDistribution]
    val declaredPropNames = Set("ageDistribution")
    
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
      Writes { trendingKeywordDemographicsAgeDistribution =>
        val jsObj = realJsonFormat.writes(trendingKeywordDemographicsAgeDistribution)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object AgeDistribution extends Enumeration {
    val _1824 = Value("18-24")
    val _2534 = Value("25-34")
    val _3544 = Value("35-44")
    val _4549 = Value("45-49")
    val _5054 = Value("50-54")
    val _5564 = Value("55-64")
    val _65 = Value("65+")

    type AgeDistribution = Value
    implicit lazy val AgeDistributionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

