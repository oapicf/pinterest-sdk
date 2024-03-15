namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GetMMMReportResponseData

module GetMMMReportResponse =

  //#region GetMMMReportResponse

  [<CLIMutable>]
  type GetMMMReportResponse = {
    [<JsonProperty(PropertyName = "code")>]
    Code : decimal;
    [<JsonProperty(PropertyName = "data")>]
    Data : GetMMMReportResponseData;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
  }

  //#endregion
