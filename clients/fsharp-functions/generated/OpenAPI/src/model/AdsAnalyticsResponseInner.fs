namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module AdsAnalyticsResponseInner =

  //#region AdsAnalyticsResponseInner

  [<CLIMutable>]
  type AdsAnalyticsResponseInner = {
    [<JsonProperty(PropertyName = "AD_ID")>]
    AD_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
