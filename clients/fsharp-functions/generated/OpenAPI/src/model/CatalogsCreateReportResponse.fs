namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsCreateReportResponse =

  //#region CatalogsCreateReportResponse

  [<CLIMutable>]
  type CatalogsCreateReportResponse = {
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
  }

  //#endregion
