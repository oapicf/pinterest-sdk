namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module AdsCreditRedeem =

  //#region AdsCreditRedeem

  [<CLIMutable>]
  type AdsCreditRedeem = {
    [<JsonProperty(PropertyName = "errorCode")>]
    ErrorCode : int option;
    [<JsonProperty(PropertyName = "errorMessage")>]
    ErrorMessage : string option;
    [<JsonProperty(PropertyName = "success")>]
    Success : bool;
  }

  //#endregion
