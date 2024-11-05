namespace OpenAPI
open OpenAPI.Model.AdAccountsAudiencesSharedAccountsList200Response
open OpenAPI.Model.AudienceAccountType
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.BusinessSharedAudience
open OpenAPI.Model.BusinessSharedAudienceResponse
open OpenAPI.Model.Error
open OpenAPI.Model.SharedAudience
open OpenAPI.Model.SharedAudienceResponse
open AudienceSharingApiHandlerParams
open AudienceSharingApiServiceInterface
open System.Collections.Generic
open System

module AudienceSharingApiServiceImplementation =

    //#region Service implementation
    type AudienceSharingApiServiceImpl() =
      interface IAudienceSharingApiService with

        member this.AdAccountsAudiencesSharedAccountsList () =
          if true then
            let content = "Success" :> obj :?> AdAccountsAudiencesSharedAccountsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account audiences shared accounts parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode400 { content = content }
          else if true then
            let content = "Shared accounts not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListDefaultStatusCode { content = content }

        member this.BusinessAccountAudiencesSharedAccountsList () =
          if true then
            let content = "Success" :> obj :?> AdAccountsAudiencesSharedAccountsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid business audiences shared accounts parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode400 { content = content }
          else if true then
            let content = "Shared accounts not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListDefaultStatusCode { content = content }

        member this.SharedAudiencesForBusinessList () =
          if true then
            let content = "Success" :> obj :?> AudiencesList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListDefaultStatusCode { content = content }

        member this.UpdateAdAccountToAdAccountSharedAudience (parameters:UpdateAdAccountToAdAccountSharedAudienceBodyParams) =
          if true then
            let content = "Success" :> obj :?> SharedAudienceResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account id." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCode { content = content }

        member this.UpdateAdAccountToBusinessSharedAudience (parameters:UpdateAdAccountToBusinessSharedAudienceBodyParams) =
          if true then
            let content = "Success" :> obj :?> BusinessSharedAudienceResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account id." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceDefaultStatusCode { content = content }

        member this.UpdateBusinessToAdAccountSharedAudience (parameters:UpdateBusinessToAdAccountSharedAudienceBodyParams) =
          if true then
            let content = "Success" :> obj :?> SharedAudienceResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceDefaultStatusCode { content = content }

        member this.UpdateBusinessToBusinessSharedAudience (parameters:UpdateBusinessToBusinessSharedAudienceBodyParams) =
          if true then
            let content = "Success" :> obj :?> BusinessSharedAudienceResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceDefaultStatusCode { content = content }

      //#endregion

    let AudienceSharingApiService = AudienceSharingApiServiceImpl() :> IAudienceSharingApiService