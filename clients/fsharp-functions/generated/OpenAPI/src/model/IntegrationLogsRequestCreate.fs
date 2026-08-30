namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IntegrationLog

module IntegrationLogsRequestCreate =

  //#region IntegrationLogsRequestCreate

  [<CLIMutable>]
  type IntegrationLogsRequestCreate = {
    [<JsonProperty(PropertyName = "logs")>]
    Logs : IntegrationLog[];
  }

  //#endregion
