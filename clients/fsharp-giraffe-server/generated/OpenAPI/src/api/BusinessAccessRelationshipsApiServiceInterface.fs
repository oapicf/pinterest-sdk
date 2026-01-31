namespace OpenAPI
open BusinessAccessRelationshipsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BusinessAccessRelationshipsApiServiceInterface =

    //#region Service interface
    type IBusinessAccessRelationshipsApiService =
      abstract member BrandAccountsCreate:HttpContext -> BrandAccountsCreateArgs->BrandAccountsCreateResult
      abstract member BrandAccountsUpdate:HttpContext -> BrandAccountsUpdateArgs->BrandAccountsUpdateResult
      abstract member DeleteBusinessMembership:HttpContext -> DeleteBusinessMembershipArgs->DeleteBusinessMembershipResult
      abstract member DeleteBusinessPartners:HttpContext -> DeleteBusinessPartnersArgs->DeleteBusinessPartnersResult
      abstract member GetBusinessEmployers:HttpContext -> GetBusinessEmployersArgs->GetBusinessEmployersResult
      abstract member GetBusinessMembers:HttpContext -> GetBusinessMembersArgs->GetBusinessMembersResult
      abstract member GetBusinessPartners:HttpContext -> GetBusinessPartnersArgs->GetBusinessPartnersResult
      abstract member SystemUserUpdate:HttpContext -> SystemUserUpdateArgs->SystemUserUpdateResult
      abstract member UpdateBusinessMemberships:HttpContext -> UpdateBusinessMembershipsArgs->UpdateBusinessMembershipsResult
    //#endregion