namespace OpenAPI
open AudiencesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AudiencesApiServiceInterface =

    //#region Service interface
    type IAudiencesApiService =
      abstract member AudiencesCreate:HttpContext -> AudiencesCreateArgs->AudiencesCreateResult
      abstract member AudiencesCreateCustom:HttpContext -> AudiencesCreateCustomArgs->AudiencesCreateCustomResult
      abstract member AudiencesGet:HttpContext -> AudiencesGetArgs->AudiencesGetResult
      abstract member AudiencesList:HttpContext -> AudiencesListArgs->AudiencesListResult
      abstract member AudiencesUpdate:HttpContext -> AudiencesUpdateArgs->AudiencesUpdateResult
    //#endregion