namespace OpenAPI
open LabelsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LabelsApiServiceInterface =

    //#region Service interface
    type ILabelsApiService =
      abstract member LabelsApply : LabelsApplyBodyParams -> LabelsApplyResult
      abstract member LabelsCreate : LabelsCreateBodyParams -> LabelsCreateResult
      abstract member LabelsList : unit -> LabelsListResult
      abstract member LabelsRemove : LabelsRemoveBodyParams -> LabelsRemoveResult
      abstract member LabelsUpdate : LabelsUpdateBodyParams -> LabelsUpdateResult
    //#endregion