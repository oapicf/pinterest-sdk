package model

import play.api.libs.json._

/**
  * This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
  * @param AGE_BUCKET Age bucket identifier.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AgeBucketMultipliers(
  AGE_BUCKET: Option[TargetingSpecAgeBucket]
  additionalProperties: Map[String, Double]
)

object AgeBucketMultipliers {
  implicit lazy val ageBucketMultipliersJsonFormat: Format[AgeBucketMultipliers] = {
    val realJsonFormat = Json.format[AgeBucketMultipliers]
    val declaredPropNames = Set("AGE_BUCKET")
    
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
      Writes { ageBucketMultipliers =>
        val jsObj = realJsonFormat.writes(ageBucketMultipliers)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

