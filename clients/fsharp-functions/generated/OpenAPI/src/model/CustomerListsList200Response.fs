namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CustomerList
open OpenAPI.Model.string option

module CustomerListsList200Response =

  //#region CustomerListsList200Response

  [<CLIMutable>]
  type CustomerListsList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : CustomerList[];
  }

  //#endregion
