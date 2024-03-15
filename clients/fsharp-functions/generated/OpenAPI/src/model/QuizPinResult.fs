namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module QuizPinResult =

  //#region QuizPinResult

  [<CLIMutable>]
  type QuizPinResult = {
    [<JsonProperty(PropertyName = "organic_pin_id")>]
    OrganicPinId : string;
    [<JsonProperty(PropertyName = "android_deep_link")>]
    AndroidDeepLink : string;
    [<JsonProperty(PropertyName = "ios_deep_link")>]
    IosDeepLink : string;
    [<JsonProperty(PropertyName = "destination_url")>]
    DestinationUrl : string;
    [<JsonProperty(PropertyName = "result_id")>]
    ResultId : decimal;
  }

  //#endregion
