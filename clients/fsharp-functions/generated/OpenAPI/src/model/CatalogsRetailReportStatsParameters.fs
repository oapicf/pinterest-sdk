namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsRetailReportStatsParametersReport

module CatalogsRetailReportStatsParameters =

  //#region CatalogsRetailReportStatsParameters

  [<CLIMutable>]
  type CatalogsRetailReportStatsParameters = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "report")>]
    Report : CatalogsRetailReportStatsParametersReport;
  }

  //#endregion
