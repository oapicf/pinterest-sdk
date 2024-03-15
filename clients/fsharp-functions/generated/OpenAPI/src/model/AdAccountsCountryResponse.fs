namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountsCountryResponseData

module AdAccountsCountryResponse =

  //#region AdAccountsCountryResponse

  [<CLIMutable>]
  type AdAccountsCountryResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdAccountsCountryResponseData[];
  }

  //#endregion
