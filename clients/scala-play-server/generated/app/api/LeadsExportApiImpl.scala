package api

import model.Error
import model.LeadsExportResponseData
import model.LeadsExports
import model.LeadsExportsCreate

/**
  * Provides a default implementation for [[LeadsExportApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class LeadsExportApiImpl extends LeadsExportApi {
  /**
    * @inheritdoc
    */
  override def leadsExportCreate(adAccountId: String, leadsExportsCreate: LeadsExportsCreate): LeadsExports = {
    // TODO: Implement better logic

    LeadsExports(None)
  }

  /**
    * @inheritdoc
    */
  override def leadsExportGet(adAccountId: String, leadsExportId: String): LeadsExportResponseData = {
    // TODO: Implement better logic

    LeadsExportResponseData(None, None)
  }
}
