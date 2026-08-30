namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdsAnalytics =

  //#region AdsAnalytics

  [<CLIMutable>]
  type AdsAnalytics = {
    [<JsonProperty(PropertyName = "AD_ID")>]
    AD_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
