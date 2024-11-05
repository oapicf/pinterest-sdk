namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsReportDistributionStats
open OpenAPI.Model.CatalogsReportFeedIngestionStats

module CatalogsReportStats =

  //#region CatalogsReportStats

  [<CLIMutable>]
  type CatalogsReportStats = {
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
    [<JsonProperty(PropertyName = "ineligible_for_ads")>]
    IneligibleForAds : bool;
    [<JsonProperty(PropertyName = "ineligible_for_organic")>]
    IneligibleForOrganic : bool;
  }

  //#endregion
