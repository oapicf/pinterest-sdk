/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._

case class CatalogsReportStats (
                  reportType:  Option[CatalogsReportStatsReportTypeEnum.CatalogsReportStatsReportTypeEnum],
            /* ID of the catalog entity. */
                  catalogId: Option[String],
            /* The event code that a diagnostics aggregated number references */
                  code: Option[Int],
            /* A human-friendly label for the event code (e.g, 'SPAM') */
                  codeLabel: Option[String],
            /* Title message describing the diagnostic issue */
                  message: Option[String],
            /* Number of occurrences of the issue */
                  occurrences: Option[Int],
                  severity:  Option[CatalogsReportStatsSeverityEnum.CatalogsReportStatsSeverityEnum],
            /* Indicates if issue makes items ineligible for ads distribution */
                  ineligibleForAds: Option[Boolean],
            /* Indicates if issue makes items ineligible for organic distribution */
                  ineligibleForOrganic: Option[Boolean]
)

object CatalogsReportStats {
implicit val format: Format[CatalogsReportStats] = Json.format
}

object CatalogsReportStatsReportTypeEnum extends Enumeration {
  val   FEED_INGESTION_ISSUES, DISTRIBUTION_ISSUES = Value
  type CatalogsReportStatsReportTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CatalogsReportStatsReportTypeEnum.type])
}
object CatalogsReportStatsSeverityEnum extends Enumeration {
  val   WARN, ERROR = Value
  type CatalogsReportStatsSeverityEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CatalogsReportStatsSeverityEnum.type])
}
