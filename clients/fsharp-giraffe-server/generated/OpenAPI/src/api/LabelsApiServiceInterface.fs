namespace OpenAPI
open LabelsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LabelsApiServiceInterface =

    //#region Service interface
    type ILabelsApiService =
      abstract member LabelsCreate:HttpContext -> LabelsCreateArgs->LabelsCreateResult
      abstract member LabelsList:HttpContext -> LabelsListArgs->LabelsListResult
      abstract member LabelsUpdate:HttpContext -> LabelsUpdateArgs->LabelsUpdateResult
    //#endregion