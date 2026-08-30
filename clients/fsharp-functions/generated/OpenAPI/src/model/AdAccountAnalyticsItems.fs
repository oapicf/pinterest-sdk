namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdAccountAnalyticsItems =

  //#region AdAccountAnalyticsItems

  [<CLIMutable>]
  type AdAccountAnalyticsItems = {
    [<JsonProperty(PropertyName = "AD_ACCOUNT_ID")>]
    AD_ACCOUNT_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
