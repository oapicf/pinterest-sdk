namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdCommonTrackingUrls =

  //#region AdCommonTrackingUrls

  [<CLIMutable>]
  type AdCommonTrackingUrls = {
    [<JsonProperty(PropertyName = "impression")>]
    Impression : string[];
    [<JsonProperty(PropertyName = "click")>]
    Click : string[];
    [<JsonProperty(PropertyName = "engagement")>]
    Engagement : string[];
    [<JsonProperty(PropertyName = "buyable_button")>]
    BuyableButton : string[];
    [<JsonProperty(PropertyName = "audience_verification")>]
    AudienceVerification : string[];
  }

  //#endregion
