namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadFormTest =

  //#region LeadFormTest

  [<CLIMutable>]
  type LeadFormTest = {
    [<JsonProperty(PropertyName = "subscription_id")>]
    SubscriptionId : string;
  }

  //#endregion
