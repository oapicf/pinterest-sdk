namespace OpenAPI
open LabelsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module LabelsApiServiceInterface =

    //#region Service interface
    type ILabelsApiService =
      abstract member LabelsCreate : LabelsCreateBodyParams -> LabelsCreateResult
      abstract member LabelsList : unit -> LabelsListResult
      abstract member LabelsUpdate : LabelsUpdateBodyParams -> LabelsUpdateResult
    //#endregion