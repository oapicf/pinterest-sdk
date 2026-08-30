package model

import play.api.libs.json._

/**
  * Processing record for an advertiser defined event operation
  * @param exceptions List of exception messages if the operation failed
  * @param name Name of the advertiser defined event
  * @param status Processing status (success or failure)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvertiserDefinedEventProcessingRecord(
  exceptions: Option[List[String]],
  name: String,
  status: String
)

object AdvertiserDefinedEventProcessingRecord {
  implicit lazy val advertiserDefinedEventProcessingRecordJsonFormat: Format[AdvertiserDefinedEventProcessingRecord] = Json.format[AdvertiserDefinedEventProcessingRecord]
}

