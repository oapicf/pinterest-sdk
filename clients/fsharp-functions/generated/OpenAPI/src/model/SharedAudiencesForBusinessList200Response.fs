namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Audience
open OpenAPI.Model.string option

module SharedAudiencesForBusinessList200Response =

  //#region SharedAudiencesForBusinessList200Response

  [<CLIMutable>]
  type SharedAudiencesForBusinessList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Audience[];
  }

  //#endregion
