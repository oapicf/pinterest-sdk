namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.LeadFormArrayResponse
open OpenAPI.Model.LeadFormCreateRequest
open OpenAPI.Model.LeadFormResponse
open OpenAPI.Model.LeadFormTestRequest
open OpenAPI.Model.LeadFormTestResponse
open OpenAPI.Model.LeadFormUpdateRequest
open OpenAPI.Model.LeadFormsList200Response
open LeadFormsApiHandlerParams
open LeadFormsApiServiceInterface
open System.Collections.Generic
open System

module LeadFormsApiServiceImplementation =

    //#region Service implementation
    type LeadFormsApiServiceImpl() =
      interface ILeadFormsApiService with

        member this.LeadFormGet () =
          if true then
            let content = "Success" :> obj :?> LeadFormResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormGetStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account lead forms parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormGetStatusCode400 { content = content }
          else if true then
            let content = "The lead form ID for the given ad account ID does not exist." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormGetStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormGetDefaultStatusCode { content = content }

        member this.LeadFormTestCreate (parameters:LeadFormTestCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> LeadFormTestResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormTestCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormTestCreateStatusCode400 { content = content }
          else if true then
            let content = "Lead not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormTestCreateStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormTestCreateDefaultStatusCode { content = content }

        member this.LeadFormsCreate (parameters:LeadFormsCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> LeadFormArrayResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account lead forms parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsCreateDefaultStatusCode { content = content }

        member this.LeadFormsList () =
          if true then
            let content = "Success" :> obj :?> LeadFormsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account lead forms parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsListDefaultStatusCode { content = content }

        member this.LeadFormsUpdate (parameters:LeadFormsUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> LeadFormArrayResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account lead forms parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsUpdateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormsUpdateDefaultStatusCode { content = content }

      //#endregion

    let LeadFormsApiService = LeadFormsApiServiceImpl() :> ILeadFormsApiService