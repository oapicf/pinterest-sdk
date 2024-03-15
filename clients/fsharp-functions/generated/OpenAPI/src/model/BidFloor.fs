namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidFloor =

  //#region BidFloor

  [<CLIMutable>]
  type BidFloor = {
    [<JsonProperty(PropertyName = "bid_floors")>]
    BidFloors : int[];
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
