package api

import model.CatalogsCreateReportResponse
import model.CatalogsReport
import model.CatalogsReportParameters
import model.CatalogsReportStatsParameters
import model.Error
import model.ReportsStats200Response

/**
  * Provides a default implementation for [[CatalogReportsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
  override def reportsStats(parameters: CatalogsReportStatsParameters, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): ReportsStats200Response = {
    // TODO: Implement better logic

    ReportsStats200Response(None, List.empty[CatalogsReportStats])
  }
}
