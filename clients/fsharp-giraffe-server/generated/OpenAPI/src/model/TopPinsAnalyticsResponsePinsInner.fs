namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopPinsAnalyticsResponsePinsInner =

  //#region TopPinsAnalyticsResponsePinsInner


  type TopPinsAnalyticsResponse_pins_inner = {
    DataStatus : IDictionary<string, DataStatus>;
    Metrics : IDictionary<string, decimal>;
    PinId : string;
  }
  //#endregion
