namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IntegrationLogsSuccessResponse =

  //#region IntegrationLogsSuccessResponse

  [<CLIMutable>]
  type IntegrationLogsSuccessResponse = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
