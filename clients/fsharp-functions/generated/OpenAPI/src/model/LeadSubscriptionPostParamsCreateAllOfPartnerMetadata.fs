namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadSubscriptionPostParamsCreateAllOfPartnerMetadata =

  //#region LeadSubscriptionPostParamsCreateAllOfPartnerMetadata

  [<CLIMutable>]
  type LeadSubscriptionPostParamsCreateAllOfPartnerMetadata = {
    [<JsonProperty(PropertyName = "subscriber_key")>]
    SubscriberKey : string;
  }

  //#endregion
