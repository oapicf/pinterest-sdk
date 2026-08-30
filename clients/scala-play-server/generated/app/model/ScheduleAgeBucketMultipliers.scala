package model

import play.api.libs.json._

/**
  * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ScheduleAgeBucketMultipliers(
  AGE_BUCKET: Option[ScheduleAgeBucketMultipliers.AGEBUCKET.Value]
  additionalProperties: Map[String, Double]
)

object ScheduleAgeBucketMultipliers {
  implicit lazy val scheduleAgeBucketMultipliersJsonFormat: Format[ScheduleAgeBucketMultipliers] = {
    val realJsonFormat = Json.format[ScheduleAgeBucketMultipliers]
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
      Writes { scheduleAgeBucketMultipliers =>
        val jsObj = realJsonFormat.writes(scheduleAgeBucketMultipliers)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object AGEBUCKET extends Enumeration {
    val _1824 = Value("18-24")
    val _2534 = Value("25-34")
    val _3544 = Value("35-44")
    val _4549 = Value("45-49")
    val _5054 = Value("50-54")
    val _5564 = Value("55-64")
    val _65 = Value("65+")

    type AGEBUCKET = Value
    implicit lazy val AGEBUCKETJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

