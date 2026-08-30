namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IntegrationLogsInvalidLogResponseRejectedLogsItems =

  //#region IntegrationLogsInvalidLogResponseRejectedLogsItems

  [<CLIMutable>]
  type IntegrationLogsInvalidLogResponseRejectedLogsItems = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "log_index")>]
    LogIndex : int;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
