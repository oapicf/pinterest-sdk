namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdGroupTrackingURLs =

  //#region AdGroupTrackingURLs

  [<CLIMutable>]
  type AdGroupTrackingURLs = {
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
