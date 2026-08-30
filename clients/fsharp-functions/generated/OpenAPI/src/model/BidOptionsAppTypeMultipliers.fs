namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidOptionsAppTypeMultipliers =

  //#region BidOptionsAppTypeMultipliers

  [<CLIMutable>]
  type BidOptionsAppTypeMultipliers = {
    [<JsonProperty(PropertyName = "android_mobile")>]
    AndroidMobile : decimal;
    [<JsonProperty(PropertyName = "android_tablet")>]
    AndroidTablet : decimal;
    [<JsonProperty(PropertyName = "ipad")>]
    Ipad : decimal;
    [<JsonProperty(PropertyName = "iphone")>]
    Iphone : decimal;
    [<JsonProperty(PropertyName = "web")>]
    Web : decimal;
    [<JsonProperty(PropertyName = "web_mobile")>]
    WebMobile : decimal;
  }

  //#endregion
