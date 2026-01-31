namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IntegrationLogsInvalidLogResponseRejectedLogsInner =

  //#region IntegrationLogsInvalidLogResponseRejectedLogsInner

  [<CLIMutable>]
  type IntegrationLogsInvalidLogResponseRejectedLogsInner = {
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
