namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SharedAudienceAccount
open OpenAPI.Model.string option

module AdAccountsAudiencesSharedAccountsList200Response =

  //#region AdAccountsAudiencesSharedAccountsList200Response

  [<CLIMutable>]
  type AdAccountsAudiencesSharedAccountsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : SharedAudienceAccount[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
