namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadSubscription
open OpenAPI.Model.string option

module AdAccountsSubscriptionsGetList200Response =

  //#region AdAccountsSubscriptionsGetList200Response

  [<CLIMutable>]
  type AdAccountsSubscriptionsGetList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : LeadSubscription[];
  }

  //#endregion
