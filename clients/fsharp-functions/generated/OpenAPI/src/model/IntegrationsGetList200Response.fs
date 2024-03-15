namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.string option

module IntegrationsGetList200Response =

  //#region IntegrationsGetList200Response

  [<CLIMutable>]
  type IntegrationsGetList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : IntegrationRecord[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
