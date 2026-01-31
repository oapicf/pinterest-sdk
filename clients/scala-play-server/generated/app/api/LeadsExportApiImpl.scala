package api

import model.Error
import model.LeadsExportCreateRequest
import model.LeadsExportCreateResponse
import model.LeadsExportResponseData

/**
  * Provides a default implementation for [[LeadsExportApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class LeadsExportApiImpl extends LeadsExportApi {
  /**
    * @inheritdoc
    */
  override def leadsExportCreate(adAccountId: String, leadsExportCreateRequest: LeadsExportCreateRequest): LeadsExportCreateResponse = {
    // TODO: Implement better logic

    LeadsExportCreateResponse(None)
  }

  /**
    * @inheritdoc
    */
  override def leadsExportGet(adAccountId: String, leadsExportId: String): LeadsExportResponseData = {
    // TODO: Implement better logic

    LeadsExportResponseData(None, None)
  }
}
