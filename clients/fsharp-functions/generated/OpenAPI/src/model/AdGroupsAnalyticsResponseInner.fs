namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module AdGroupsAnalyticsResponseInner =

  //#region AdGroupsAnalyticsResponseInner

  [<CLIMutable>]
  type AdGroupsAnalyticsResponseInner = {
    [<JsonProperty(PropertyName = "AD_GROUP_ID")>]
    AD_GROUP_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
