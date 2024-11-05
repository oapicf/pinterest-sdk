namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsReportDistributionStats =

  //#region CatalogsReportDistributionStats

  [<CLIMutable>]
  type CatalogsReportDistributionStats = {
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
    [<JsonProperty(PropertyName = "ineligible_for_ads")>]
    IneligibleForAds : bool;
    [<JsonProperty(PropertyName = "ineligible_for_organic")>]
    IneligibleForOrganic : bool;
  }

  //#endregion
