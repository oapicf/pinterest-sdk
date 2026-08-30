namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdGroupsAnalyticsMetrics =

  //#region AdGroupsAnalyticsMetrics

  [<CLIMutable>]
  type AdGroupsAnalyticsMetrics = {
    [<JsonProperty(PropertyName = "AD_GROUP_ID")>]
    AD_GROUP_ID : string;
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
  }

  //#endregion
