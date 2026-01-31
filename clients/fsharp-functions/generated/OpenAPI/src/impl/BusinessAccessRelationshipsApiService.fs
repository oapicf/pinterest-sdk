namespace OpenAPI
open OpenAPI.Model.BrandAccountsCreate200Response
open OpenAPI.Model.BrandAccountsCreateRequest
open OpenAPI.Model.BrandAccountsUpdateRequest
open OpenAPI.Model.DeletePartnersRequest
open OpenAPI.Model.DeletePartnersResponse
open OpenAPI.Model.DeletedMembersResponse
open OpenAPI.Model.Error
open OpenAPI.Model.GetBusinessEmployers200Response
open OpenAPI.Model.GetBusinessMembers200Response
open OpenAPI.Model.GetBusinessPartners200Response
open OpenAPI.Model.MemberBusinessRole
open OpenAPI.Model.MembersToDeleteBody
open OpenAPI.Model.PartnerType
open OpenAPI.Model.SystemUserUpdateRequest
open OpenAPI.Model.UpdateMemberBusinessRoleBody
open OpenAPI.Model.UpdateMemberResultsResponseArray
open BusinessAccessRelationshipsApiHandlerParams
open BusinessAccessRelationshipsApiServiceInterface
open System.Collections.Generic
open System

module BusinessAccessRelationshipsApiServiceImplementation =

    //#region Service implementation
    type BusinessAccessRelationshipsApiServiceImpl() =
      interface IBusinessAccessRelationshipsApiService with

        member this.BrandAccountsCreate (parameters:BrandAccountsCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> BrandAccountsCreate200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateDefaultStatusCode { content = content }

        member this.BrandAccountsUpdate (parameters:BrandAccountsUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> BrandAccountsCreate200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Not authenticated to update Brand Account" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to update Brand Account" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode403 { content = content }
          else if true then
            let content = "Brand account not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode404 { content = content }
          else if true then
            let content = "This account is not a brand account." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode409 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode429 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateDefaultStatusCode { content = content }

        member this.DeleteBusinessMembership (parameters:DeleteBusinessMembershipBodyParams) =
          if true then
            let content = "Success" :> obj :?> DeletedMembersResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessMembershipStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessMembershipDefaultStatusCode { content = content }

        member this.DeleteBusinessPartners (parameters:DeleteBusinessPartnersBodyParams) =
          if true then
            let content = "Success" :> obj :?> DeletePartnersResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersStatusCode200 { content = content }
          else if true then
            let content = "A supplied partner id doesn&#39;t exist" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersDefaultStatusCode { content = content }

        member this.GetBusinessEmployers () =
          if true then
            let content = "Success" :> obj :?> GetBusinessEmployers200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersDefaultStatusCode { content = content }

        member this.GetBusinessMembers () =
          if true then
            let content = "Success" :> obj :?> GetBusinessMembers200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersDefaultStatusCode { content = content }

        member this.GetBusinessPartners () =
          if true then
            let content = "Success" :> obj :?> GetBusinessPartners200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersDefaultStatusCode { content = content }

        member this.SystemUserUpdate (parameters:SystemUserUpdateBodyParams) =
          if true then
            let content = "System user updated successfully." 
            SystemUserUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateDefaultStatusCode { content = content }

        member this.UpdateBusinessMemberships (parameters:UpdateBusinessMembershipsBodyParams) =
          if true then
            let content = "response" :> obj :?> UpdateMemberResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsDefaultStatusCode { content = content }

      //#endregion

    let BusinessAccessRelationshipsApiService = BusinessAccessRelationshipsApiServiceImpl() :> IBusinessAccessRelationshipsApiService