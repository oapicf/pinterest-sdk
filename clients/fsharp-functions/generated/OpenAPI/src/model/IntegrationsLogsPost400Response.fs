namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DetailedError
open OpenAPI.Model.Error

module IntegrationsLogsPost400Response =

  //#region IntegrationsLogsPost400Response

  [<CLIMutable>]
  type IntegrationsLogsPost400Response = {
    [<JsonProperty(PropertyName = "code")>]
    Code : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "details")>]
    Details : obj;
  }

  //#endregion
