namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelReportParametersReport

module CatalogsRetailReportParameters =

  //#region CatalogsRetailReportParameters

  [<CLIMutable>]
  type CatalogsRetailReportParameters = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "report")>]
    Report : CatalogsHotelReportParametersReport;
  }

  //#endregion
