namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdvancedAuctionOperationError =

  //#region AdvancedAuctionOperationError

  [<CLIMutable>]
  type AdvancedAuctionOperationError = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
