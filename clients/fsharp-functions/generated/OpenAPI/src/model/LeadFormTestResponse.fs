namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadFormTestResponse =

  //#region LeadFormTestResponse

  [<CLIMutable>]
  type LeadFormTestResponse = {
    [<JsonProperty(PropertyName = "subscription_id")>]
    SubscriptionId : string;
  }

  //#endregion
