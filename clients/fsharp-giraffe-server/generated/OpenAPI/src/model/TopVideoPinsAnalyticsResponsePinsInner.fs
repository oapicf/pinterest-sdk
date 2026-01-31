namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopVideoPinsAnalyticsResponsePinsInner =

  //#region TopVideoPinsAnalyticsResponsePinsInner


  type TopVideoPinsAnalyticsResponse_pins_inner = {
    DataStatus : IDictionary<string, DataStatus>;
    Metrics : IDictionary<string, decimal>;
    PinId : string;
  }
  //#endregion
