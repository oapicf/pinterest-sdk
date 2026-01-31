namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsReportDistributionIssueFilter =

  //#region CatalogsReportDistributionIssueFilter

  [<CLIMutable>]
  type CatalogsReportDistributionIssueFilter = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "report_type")>]
    ReportType : string;
  }

  //#endregion
