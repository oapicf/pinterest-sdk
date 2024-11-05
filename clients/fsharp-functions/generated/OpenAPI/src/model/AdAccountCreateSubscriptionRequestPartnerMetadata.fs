namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdAccountCreateSubscriptionRequestPartnerMetadata =

  //#region AdAccountCreateSubscriptionRequestPartnerMetadata

  [<CLIMutable>]
  type AdAccountCreateSubscriptionRequestPartnerMetadata = {
    [<JsonProperty(PropertyName = "subscriber_key")>]
    SubscriberKey : string;
  }

  //#endregion
