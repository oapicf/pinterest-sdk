namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IntegrationLogsInvalidLogResponseRejectedLogsItems

module IntegrationLogsInvalidLogResponse =

  //#region IntegrationLogsInvalidLogResponse

  [<CLIMutable>]
  type IntegrationLogsInvalidLogResponse = {
    [<JsonProperty(PropertyName = "rejected_logs")>]
    RejectedLogs : IntegrationLogsInvalidLogResponseRejectedLogsItems[];
  }

  //#endregion
