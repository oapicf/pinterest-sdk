namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsReportFeedIngestionStats =

  //#region CatalogsReportFeedIngestionStats

  [<CLIMutable>]
  type CatalogsReportFeedIngestionStats = {
    [<JsonProperty(PropertyName = "report_type")>]
    ReportType : string;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "code_label")>]
    CodeLabel : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "occurrences")>]
    Occurrences : int;
    [<JsonProperty(PropertyName = "severity")>]
    Severity : string;
  }

  //#endregion
