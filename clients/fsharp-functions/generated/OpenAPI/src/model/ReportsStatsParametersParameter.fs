namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelReportStatsParameters
open OpenAPI.Model.CatalogsHotelReportStatsParametersReport
open OpenAPI.Model.CatalogsRetailReportStatsParameters
open OpenAPI.Model.CatalogsType

module ReportsStatsParametersParameter =

  //#region ReportsStatsParametersParameter

  [<CLIMutable>]
  type ReportsStatsParametersParameter = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "report")>]
    Report : CatalogsHotelReportStatsParametersReport;
  }

  //#endregion
