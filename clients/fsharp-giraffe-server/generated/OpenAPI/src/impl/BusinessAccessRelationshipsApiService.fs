namespace OpenAPI
open OpenAPI.Model.BrandAccount
open OpenAPI.Model.BrandAccountCreate
open OpenAPI.Model.BrandAccountUpdate
open OpenAPI.Model.BusinessMembershipMember
open OpenAPI.Model.DeleteBusinessMembership200Response
open OpenAPI.Model.DeleteBusinessMembershipBody
open OpenAPI.Model.DeleteBusinessPartners
open OpenAPI.Model.DeleteBusinessPartnersDelete
open OpenAPI.Model.GetBusinessEmployers200Response
open OpenAPI.Model.MemberBusinessRole
open OpenAPI.Model.PartnerType
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SystemUserUpdateWithRequiredBody
open OpenAPI.Model.UpdateBusinessMembershipsResponse
open BusinessAccessRelationshipsApiHandlerParams
open BusinessAccessRelationshipsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BusinessAccessRelationshipsApiServiceImplementation =

    //#region Service implementation
    type BusinessAccessRelationshipsApiServiceImpl() =
      interface IBusinessAccessRelationshipsApiService with

        member this.BrandAccountsCreate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BrandAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> BrandAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsCreateDefaultStatusCode { content = content }

        member this.BrandAccountsUpdate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BrandAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode404 { content = content }
          else if true then
            let content = "The request could not be processed because of a conflict in the current state of the resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode409 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BrandAccountsUpdateDefaultStatusCode { content = content }

        member this.DeleteBusinessMembership ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> DeleteBusinessMembership200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessMembershipStatusCode200 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessMembershipDefaultStatusCode { content = content }

        member this.DeleteBusinessPartners ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> DeleteBusinessPartners // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersStatusCode200 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersStatusCode404 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteBusinessPartnersDefaultStatusCode { content = content }

        member this.GetBusinessEmployers ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> GetBusinessEmployers200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessEmployersDefaultStatusCode { content = content }

        member this.GetBusinessMembers ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> GetBusinessEmployers200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessMembersDefaultStatusCode { content = content }

        member this.GetBusinessPartners ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> GetBusinessEmployers200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetBusinessPartnersDefaultStatusCode { content = content }

        member this.SystemUserUpdate ctx args =
          if true then
            let content = "The request has succeeded." 
            SystemUserUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SystemUserUpdateDefaultStatusCode { content = content }

        member this.UpdateBusinessMemberships ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UpdateBusinessMembershipsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessMembershipsDefaultStatusCode { content = content }

      //#endregion

    let BusinessAccessRelationshipsApiService = BusinessAccessRelationshipsApiServiceImpl() :> IBusinessAccessRelationshipsApiService