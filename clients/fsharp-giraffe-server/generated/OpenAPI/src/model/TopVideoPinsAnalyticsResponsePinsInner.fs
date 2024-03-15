namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopVideoPinsAnalyticsResponsePinsInner =

  //#region TopVideoPinsAnalyticsResponsePinsInner


  type TopVideoPinsAnalyticsResponse_pins_inner = {
    Metrics : IDictionary<string, decimal>;
    DataStatus : IDictionary<string, DataStatus>;
    PinId : string;
  }
  //#endregion
