namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IntegrationLogClientError =

  //#region IntegrationLogClientError

  [<CLIMutable>]
  type IntegrationLogClientError = {
    [<JsonProperty(PropertyName = "cause")>]
    Cause : string;
    [<JsonProperty(PropertyName = "column_number")>]
    ColumnNumber : int;
    [<JsonProperty(PropertyName = "file_name")>]
    FileName : string;
    [<JsonProperty(PropertyName = "line_number")>]
    LineNumber : int;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "message_detail")>]
    MessageDetail : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "number")>]
    Number : int;
    [<JsonProperty(PropertyName = "stack_trace")>]
    StackTrace : string;
  }

  //#endregion
