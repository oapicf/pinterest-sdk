namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountGetSubscriptionResponse
open OpenAPI.Model.string option

module AdAccountsSubscriptionsGetList200Response =

  //#region AdAccountsSubscriptionsGetList200Response

  [<CLIMutable>]
  type AdAccountsSubscriptionsGetList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdAccountGetSubscriptionResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
