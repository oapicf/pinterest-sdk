namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopVideoPinsAnalyticsResponsePinsItems =

  //#region TopVideoPinsAnalyticsResponsePinsItems

  [<CLIMutable>]
  type TopVideoPinsAnalyticsResponsePinsItems = {
    [<JsonProperty(PropertyName = "data_status")>]
    DataStatus : IDictionary<string, DataStatus>;
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : IDictionary<string, decimal>;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
