namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelReportStatsParametersReport

module CatalogsHotelReportStatsParameters =

  //#region CatalogsHotelReportStatsParameters

  [<CLIMutable>]
  type CatalogsHotelReportStatsParameters = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "report")>]
    Report : CatalogsHotelReportStatsParametersReport;
  }

  //#endregion
