package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScheduleUpdateRequest.
  * @param entityType Entity type
  * @param id Schedule ID.
  * @param endTimestamp Schedule end time. Unix timestamp in seconds.
  * @param startTimestamp Schedule start time. Unix timestamp in seconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ScheduleUpdateRequest(
  entityId: Option[String],
  entityType: Option[String],
  id: String,
  deltaValue: Option[ScheduleCommonDeltaValue],
  endTimestamp: Option[Int],
  name: Option[String],
  scheduleAction: Option[ScheduleAction],
  scheduleStatus: Option[ScheduleStatus],
  scheduleType: Option[ScheduleType],
  startTimestamp: Option[Int]
  additionalProperties: 
)

object ScheduleUpdateRequest {
  implicit lazy val scheduleUpdateRequestJsonFormat: Format[ScheduleUpdateRequest] = {
    val realJsonFormat = Json.format[ScheduleUpdateRequest]
    val declaredPropNames = Set("entityId", "entityType", "id", "deltaValue", "endTimestamp", "name", "scheduleAction", "scheduleStatus", "scheduleType", "startTimestamp")
    
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
      Writes { scheduleUpdateRequest =>
        val jsObj = realJsonFormat.writes(scheduleUpdateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

