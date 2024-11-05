namespace OpenAPI
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
open OpenAPI.Model.UpdateMemberBusinessRoleBody
open OpenAPI.Model.UpdateMemberResultsResponseArray
open BusinessAccessRelationshipsApiHandlerParams
open BusinessAccessRelationshipsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BusinessAccessRelationshipsApiServiceImplementation =

    //#region Service implementation
    type BusinessAccessRelationshipsApiServiceImpl() =
      interface IBusinessAccessRelationshipsApiService with

        member this.DeleteBusinessMembership ctx args =
          if true then
            let content = "Success" :> obj :?> DeletedMembersResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessMembershipStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessMembershipDefaultStatusCode { content = content }

        member this.DeleteBusinessPartners ctx args =
          if true then
            let content = "Success" :> obj :?> DeletePartnersResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersStatusCode200 { content = content }
          else if true then
            let content = "A supplied partner id doesn&#39;t exist" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersDefaultStatusCode { content = content }

        member this.GetBusinessEmployers ctx args =
          if true then
            let content = "Success" :> obj :?> GetBusinessEmployers200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersDefaultStatusCode { content = content }

        member this.GetBusinessMembers ctx args =
          if true then
            let content = "Success" :> obj :?> GetBusinessMembers200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersDefaultStatusCode { content = content }

        member this.GetBusinessPartners ctx args =
          if true then
            let content = "Success" :> obj :?> GetBusinessPartners200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersDefaultStatusCode { content = content }

        member this.UpdateBusinessMemberships ctx args =
          if true then
            let content = "response" :> obj :?> UpdateMemberResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsDefaultStatusCode { content = content }

      //#endregion

    let BusinessAccessRelationshipsApiService = BusinessAccessRelationshipsApiServiceImpl() :> IBusinessAccessRelationshipsApiService