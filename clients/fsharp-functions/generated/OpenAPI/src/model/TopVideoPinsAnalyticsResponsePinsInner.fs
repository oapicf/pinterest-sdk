namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopVideoPinsAnalyticsResponsePinsInner =

  //#region TopVideoPinsAnalyticsResponsePinsInner

  [<CLIMutable>]
  type TopVideoPinsAnalyticsResponsePinsInner = {
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : IDictionary<string, decimal>;
    [<JsonProperty(PropertyName = "data_status")>]
    DataStatus : IDictionary<string, DataStatus>;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
