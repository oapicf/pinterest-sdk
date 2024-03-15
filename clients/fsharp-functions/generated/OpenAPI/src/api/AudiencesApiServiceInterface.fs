namespace OpenAPI
open AudiencesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AudiencesApiServiceInterface =

    //#region Service interface
    type IAudiencesApiService =
      abstract member AudiencesCreate : AudiencesCreateBodyParams -> AudiencesCreateResult
      abstract member AudiencesCreateCustom : AudiencesCreateCustomBodyParams -> AudiencesCreateCustomResult
      abstract member AudiencesGet : unit -> AudiencesGetResult
      abstract member AudiencesList : unit -> AudiencesListResult
      abstract member AudiencesUpdate : AudiencesUpdateBodyParams -> AudiencesUpdateResult
    //#endregion