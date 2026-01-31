namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Audience
open OpenAPI.Model.string option

module AudiencesList200Response =

  //#region AudiencesList200Response

  [<CLIMutable>]
  type AudiencesList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Audience[];
  }

  //#endregion
