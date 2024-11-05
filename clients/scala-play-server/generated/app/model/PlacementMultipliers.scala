package model

import play.api.libs.json._

/**
  * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PlacementMultipliers(
  PLACEMENT: Option[PlacementMultipliers.PLACEMENT.Value]
  additionalProperties: Map[String, Double]
)

object PlacementMultipliers {
  implicit lazy val placementMultipliersJsonFormat: Format[PlacementMultipliers] = {
    val realJsonFormat = Json.format[PlacementMultipliers]
    val declaredPropNames = Set("PLACEMENT")
    
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
      Writes { placementMultipliers =>
        val jsObj = realJsonFormat.writes(placementMultipliers)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object PLACEMENT extends Enumeration {
    val SEARCH = Value("SEARCH")
    val BROWSE = Value("BROWSE")

    type PLACEMENT = Value
    implicit lazy val PLACEMENTJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

