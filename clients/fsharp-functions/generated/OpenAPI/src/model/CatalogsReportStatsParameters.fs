namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelReportStatsParameters
open OpenAPI.Model.CatalogsHotelReportStatsParametersReport
open OpenAPI.Model.CatalogsRetailReportStatsParameters

module CatalogsReportStatsParameters =

  //#region CatalogsReportStatsParameters

  [<CLIMutable>]
  type CatalogsReportStatsParameters = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "report")>]
    Report : CatalogsHotelReportStatsParametersReport;
  }

  //#endregion
