package model

import play.api.libs.json._

/**
  * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
  * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
  * @param productGroupId Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailReportAllItemsFilter(
  catalogId: Option[String],
  productGroupId: Option[String],
  reportType: CatalogsRetailReportAllItemsFilter.ReportType.Value
)

object CatalogsRetailReportAllItemsFilter {
  implicit lazy val catalogsRetailReportAllItemsFilterJsonFormat: Format[CatalogsRetailReportAllItemsFilter] = Json.format[CatalogsRetailReportAllItemsFilter]

  // noinspection TypeAnnotation
  object ReportType extends Enumeration {
    val ALLITEMS = Value("ALL_ITEMS")

    type ReportType = Value
    implicit lazy val ReportTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

