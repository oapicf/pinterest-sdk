namespace OpenAPI
open OpenAPI.Model.Audience
open OpenAPI.Model.AudienceCreateCustomRequest
open OpenAPI.Model.AudienceCreateRequest
open OpenAPI.Model.AudienceUpdateRequest
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.Error
open AudiencesApiHandlerParams
open AudiencesApiServiceInterface
open System.Collections.Generic
open System

module AudiencesApiServiceImplementation =

    //#region Service implementation
    type AudiencesApiServiceImpl() =
      interface IAudiencesApiService with

        member this.AudiencesCreate (parameters:AudiencesCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> Audience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesCreateDefaultStatusCode { content = content }

        member this.AudiencesCreateCustom (parameters:AudiencesCreateCustomBodyParams) =
          if true then
            let content = "Success" :> obj :?> Audience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesCreateCustomStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesCreateCustomDefaultStatusCode { content = content }

        member this.AudiencesGet () =
          if true then
            let content = "Success" :> obj :?> Audience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesGetStatusCode200 { content = content }
          else if true then
            let content = "Audience not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesGetStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesGetDefaultStatusCode { content = content }

        member this.AudiencesList () =
          if true then
            let content = "Success" :> obj :?> AudiencesList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account audience parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesListDefaultStatusCode { content = content }

        member this.AudiencesUpdate (parameters:AudiencesUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> Audience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudiencesUpdateDefaultStatusCode { content = content }

      //#endregion

    let AudiencesApiService = AudiencesApiServiceImpl() :> IAudiencesApiService