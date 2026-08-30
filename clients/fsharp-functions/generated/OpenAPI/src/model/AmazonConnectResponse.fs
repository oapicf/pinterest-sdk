namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AmazonConnectResponse =

  //#region AmazonConnectResponse

  [<CLIMutable>]
  type AmazonConnectResponse = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
