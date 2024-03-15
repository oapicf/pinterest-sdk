namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopPinsAnalyticsResponsePinsInner =

  //#region TopPinsAnalyticsResponsePinsInner


  type TopPinsAnalyticsResponse_pins_inner = {
    Metrics : IDictionary<string, decimal>;
    DataStatus : IDictionary<string, DataStatus>;
    PinId : string;
  }
  //#endregion
