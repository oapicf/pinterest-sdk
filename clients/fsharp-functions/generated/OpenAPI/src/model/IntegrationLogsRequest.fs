namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IntegrationLog

module IntegrationLogsRequest =

  //#region IntegrationLogsRequest

  [<CLIMutable>]
  type IntegrationLogsRequest = {
    [<JsonProperty(PropertyName = "logs")>]
    Logs : IntegrationLog[];
  }

  //#endregion
