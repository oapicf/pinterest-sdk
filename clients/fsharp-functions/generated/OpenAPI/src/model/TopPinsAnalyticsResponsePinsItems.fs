namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopPinsAnalyticsResponsePinsItems =

  //#region TopPinsAnalyticsResponsePinsItems

  [<CLIMutable>]
  type TopPinsAnalyticsResponsePinsItems = {
    [<JsonProperty(PropertyName = "data_status")>]
    DataStatus : IDictionary<string, DataStatus>;
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : IDictionary<string, decimal>;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
  }

  //#endregion
