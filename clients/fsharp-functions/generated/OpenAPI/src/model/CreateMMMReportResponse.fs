namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateMMMReportResponseData

module CreateMMMReportResponse =

  //#region CreateMMMReportResponse

  [<CLIMutable>]
  type CreateMMMReportResponse = {
    [<JsonProperty(PropertyName = "code")>]
    Code : decimal;
    [<JsonProperty(PropertyName = "data")>]
    Data : CreateMMMReportResponseData;
  }

  //#endregion
