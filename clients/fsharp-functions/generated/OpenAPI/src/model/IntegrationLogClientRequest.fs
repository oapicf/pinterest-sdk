namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module IntegrationLogClientRequest =

  //#region IntegrationLogClientRequest

  [<CLIMutable>]
  type IntegrationLogClientRequest = {
    [<JsonProperty(PropertyName = "method")>]
    Method : string;
    [<JsonProperty(PropertyName = "host")>]
    Host : string;
    [<JsonProperty(PropertyName = "path")>]
    Path : string;
    [<JsonProperty(PropertyName = "request_headers")>]
    RequestHeaders : IDictionary<string, string>;
    [<JsonProperty(PropertyName = "response_headers")>]
    ResponseHeaders : IDictionary<string, string>;
    [<JsonProperty(PropertyName = "response_status_code")>]
    ResponseStatusCode : int;
  }

  //#endregion
