namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserWebsiteSummary
open OpenAPI.Model.string option

module UserWebsitesGet200Response =

  //#region UserWebsitesGet200Response

  [<CLIMutable>]
  type UserWebsitesGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UserWebsiteSummary[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
