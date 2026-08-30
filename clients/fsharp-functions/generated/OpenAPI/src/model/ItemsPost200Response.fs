namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemResponse

module ItemsPost200Response =

  //#region ItemsPost200Response

  [<CLIMutable>]
  type ItemsPost200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ItemResponse[];
  }

  //#endregion
