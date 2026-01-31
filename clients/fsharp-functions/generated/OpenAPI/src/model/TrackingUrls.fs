namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TrackingUrls =

  //#region TrackingUrls

  [<CLIMutable>]
  type TrackingUrls = {
    [<JsonProperty(PropertyName = "audience_verification")>]
    AudienceVerification : string[];
    [<JsonProperty(PropertyName = "buyable_button")>]
    BuyableButton : string[];
    [<JsonProperty(PropertyName = "click")>]
    Click : string[];
    [<JsonProperty(PropertyName = "engagement")>]
    Engagement : string[];
    [<JsonProperty(PropertyName = "impression")>]
    Impression : string[];
  }

  //#endregion
