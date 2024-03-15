namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module AdAccountAnalyticsResponseInner =

  //#region AdAccountAnalyticsResponseInner

  [<CLIMutable>]
  type AdAccountAnalyticsResponseInner = {
    [<JsonProperty(PropertyName = "AD_ACCOUNT_ID")>]
    AD_ACCOUNT_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
