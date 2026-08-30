namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module TopPinsAnalyticsResponsePinsItems =

  //#region TopPinsAnalyticsResponsePinsItems


  type TopPinsAnalyticsResponsePinsItems = {
    DataStatus : IDictionary<string, DataStatus>;
    Metrics : IDictionary<string, decimal>;
    PinId : string;
  }
  //#endregion
