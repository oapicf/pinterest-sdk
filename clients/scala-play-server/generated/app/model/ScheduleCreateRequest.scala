package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScheduleCreateRequest.
  * @param entityType Entity type
  * @param endTimestamp Schedule end time. Unix timestamp in seconds.
  * @param startTimestamp Schedule start time. Unix timestamp in seconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ScheduleCreateRequest(
  entityId: String,
  entityType: String,
  deltaValue: ScheduleCommonDeltaValue,
  endTimestamp: Int,
  name: String,
  scheduleAction: ScheduleAction,
  scheduleStatus: ScheduleStatus,
  scheduleType: ScheduleType,
  startTimestamp: Int
  additionalProperties: 
)

object ScheduleCreateRequest {
  implicit lazy val scheduleCreateRequestJsonFormat: Format[ScheduleCreateRequest] = {
    val realJsonFormat = Json.format[ScheduleCreateRequest]
    val declaredPropNames = Set("entityId", "entityType", "deltaValue", "endTimestamp", "name", "scheduleAction", "scheduleStatus", "scheduleType", "startTimestamp")
    
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
      Writes { scheduleCreateRequest =>
        val jsObj = realJsonFormat.writes(scheduleCreateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

