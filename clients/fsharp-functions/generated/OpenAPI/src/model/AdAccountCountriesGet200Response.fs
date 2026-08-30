namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountsCountry

module AdAccountCountriesGet200Response =

  //#region AdAccountCountriesGet200Response

  [<CLIMutable>]
  type AdAccountCountriesGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdAccountsCountry[];
  }

  //#endregion
