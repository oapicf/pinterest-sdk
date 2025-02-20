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

case class CatalogsReportDistributionIssueFilter (
                  reportType:  Option[CatalogsReportDistributionIssueFilterReportTypeEnum.CatalogsReportDistributionIssueFilterReportTypeEnum],
            /* Unique identifier of a catalog. If not given, oldest catalog will be used */
                  catalogId: Option[String]
)

object CatalogsReportDistributionIssueFilter {
implicit val format: Format[CatalogsReportDistributionIssueFilter] = Json.format
}

object CatalogsReportDistributionIssueFilterReportTypeEnum extends Enumeration {
  val   DISTRIBUTION_ISSUES = Value
  type CatalogsReportDistributionIssueFilterReportTypeEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[CatalogsReportDistributionIssueFilterReportTypeEnum.type])
}
