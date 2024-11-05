namespace OpenAPI
open BusinessAccessRelationshipsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BusinessAccessRelationshipsApiServiceInterface =

    //#region Service interface
    type IBusinessAccessRelationshipsApiService =
      abstract member DeleteBusinessMembership : DeleteBusinessMembershipBodyParams -> DeleteBusinessMembershipResult
      abstract member DeleteBusinessPartners : DeleteBusinessPartnersBodyParams -> DeleteBusinessPartnersResult
      abstract member GetBusinessEmployers : unit -> GetBusinessEmployersResult
      abstract member GetBusinessMembers : unit -> GetBusinessMembersResult
      abstract member GetBusinessPartners : unit -> GetBusinessPartnersResult
      abstract member UpdateBusinessMemberships : UpdateBusinessMembershipsBodyParams -> UpdateBusinessMembershipsResult
    //#endregion