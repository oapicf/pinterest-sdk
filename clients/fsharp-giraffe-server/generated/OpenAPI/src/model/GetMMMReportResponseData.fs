namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module GetMMMReportResponseData =

  //#region GetMMMReportResponseData

  //#region enums
  type ReportStatusEnum = DOESNOTEXISTEnum of string  |  FINISHEDEnum of string  |  INPROGRESSEnum of string  |  EXPIREDEnum of string  |  FAILEDEnum of string  |  CANCELLEDEnum of string  
  //#endregion

  type GetMMMReportResponseData = {
    ReportStatus : ReportStatusEnum;
    Url : string option;
    Size : decimal option;
  }
  //#endregion
