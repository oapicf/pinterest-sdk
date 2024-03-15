namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GetMMMReportResponseData

module GetMMMReportResponse =

  //#region GetMMMReportResponse


  type GetMMMReportResponse = {
    Code : decimal;
    Data : GetMMMReportResponseData;
    Message : string;
    Status : string;
  }
  //#endregion
