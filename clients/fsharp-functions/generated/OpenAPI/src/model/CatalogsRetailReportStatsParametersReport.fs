namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsReportDistributionIssueFilter
open OpenAPI.Model.CatalogsReportFeedIngestionFilter

module CatalogsRetailReportStatsParametersReport =

  //#region CatalogsRetailReportStatsParametersReport

  [<CLIMutable>]
  type CatalogsRetailReportStatsParametersReport = {
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "processing_result_id")>]
    ProcessingResultId : string;
    [<JsonProperty(PropertyName = "report_type")>]
    ReportType : string;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
