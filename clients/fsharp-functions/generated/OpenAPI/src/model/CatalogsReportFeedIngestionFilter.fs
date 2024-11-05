namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsReportFeedIngestionFilter =

  //#region CatalogsReportFeedIngestionFilter

  [<CLIMutable>]
  type CatalogsReportFeedIngestionFilter = {
    [<JsonProperty(PropertyName = "report_type")>]
    ReportType : string;
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "processing_result_id")>]
    ProcessingResultId : string;
  }

  //#endregion
