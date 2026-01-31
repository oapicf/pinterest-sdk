package api

import model.CatalogsCreateReportResponse
import model.CatalogsReport
import model.CatalogsReportParameters
import model.Error
import model.ReportsStats200Response
import model.ReportsStatsParametersParameter

/**
  * Provides a default implementation for [[CatalogReportsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class CatalogReportsApiImpl extends CatalogReportsApi {
  /**
    * @inheritdoc
    */
  override def reportsCreate(catalogsReportParameters: CatalogsReportParameters, adAccountId: Option[String]): CatalogsCreateReportResponse = {
    // TODO: Implement better logic

    CatalogsCreateReportResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def reportsGet(token: String, adAccountId: Option[String]): CatalogsReport = {
    // TODO: Implement better logic

    CatalogsReport(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def reportsStats(parameters: ReportsStatsParametersParameter, adAccountId: Option[String], pageSize: Option[Int], bookmark: Option[String]): ReportsStats200Response = {
    // TODO: Implement better logic

    ReportsStats200Response(None, List.empty[CatalogsReportStats])
  }
}
