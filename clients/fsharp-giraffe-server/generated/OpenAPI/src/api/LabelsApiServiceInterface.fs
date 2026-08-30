namespace OpenAPI
open LabelsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module LabelsApiServiceInterface =

    //#region Service interface
    type ILabelsApiService =
      abstract member LabelsApply:HttpContext -> LabelsApplyArgs->LabelsApplyResult
      abstract member LabelsCreate:HttpContext -> LabelsCreateArgs->LabelsCreateResult
      abstract member LabelsList:HttpContext -> LabelsListArgs->LabelsListResult
      abstract member LabelsRemove:HttpContext -> LabelsRemoveArgs->LabelsRemoveResult
      abstract member LabelsUpdate:HttpContext -> LabelsUpdateArgs->LabelsUpdateResult
    //#endregion