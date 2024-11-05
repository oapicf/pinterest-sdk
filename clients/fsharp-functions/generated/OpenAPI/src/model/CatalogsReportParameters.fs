namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelReportParameters
open OpenAPI.Model.CatalogsHotelReportParametersReport
open OpenAPI.Model.CatalogsRetailReportParameters
open OpenAPI.Model.CatalogsType

module CatalogsReportParameters =

  //#region CatalogsReportParameters

  [<CLIMutable>]
  type CatalogsReportParameters = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "report")>]
    Report : CatalogsHotelReportParametersReport;
  }

  //#endregion
