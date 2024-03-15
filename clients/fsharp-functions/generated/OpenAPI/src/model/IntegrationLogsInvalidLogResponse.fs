namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.IntegrationLogsInvalidLogResponseRejectedLogsInner

module IntegrationLogsInvalidLogResponse =

  //#region IntegrationLogsInvalidLogResponse

  [<CLIMutable>]
  type IntegrationLogsInvalidLogResponse = {
    [<JsonProperty(PropertyName = "rejected_logs")>]
    RejectedLogs : IntegrationLogsInvalidLogResponseRejectedLogsInner[];
  }

  //#endregion
