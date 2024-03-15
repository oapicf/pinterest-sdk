namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrderLine

module OrderLineError =

  //#region OrderLineError

  [<CLIMutable>]
  type OrderLineError = {
    [<JsonProperty(PropertyName = "data")>]
    Data : OrderLine;
    [<JsonProperty(PropertyName = "error_messages")>]
    ErrorMessages : string[];
  }

  //#endregion
