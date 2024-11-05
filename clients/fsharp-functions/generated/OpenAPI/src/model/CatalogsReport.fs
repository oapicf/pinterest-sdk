namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsReport =

  //#region CatalogsReport

  [<CLIMutable>]
  type CatalogsReport = {
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string option;
    [<JsonProperty(PropertyName = "size")>]
    Size : decimal option;
  }

  //#endregion
