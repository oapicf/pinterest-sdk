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
open System.Collections.Generic
open System

module BusinessAccessRelationshipsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type BrandAccountsCreatePathParams = {
      businessHierarchyId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BrandAccountsCreateBodyParams = BrandAccountsCreateRequest
    //#endregion


    type BrandAccountsCreateStatusCode200Response = {
      content:BrandAccountsCreate200Response;
      
    }

    type BrandAccountsCreateStatusCode400Response = {
      content:Error;
      
    }

    type BrandAccountsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BrandAccountsCreateResult = BrandAccountsCreateStatusCode200 of BrandAccountsCreateStatusCode200Response|BrandAccountsCreateStatusCode400 of BrandAccountsCreateStatusCode400Response|BrandAccountsCreateDefaultStatusCode of BrandAccountsCreateDefaultStatusCodeResponse

    type BrandAccountsCreateArgs = {
      pathParams:BrandAccountsCreatePathParams;
      bodyParams:BrandAccountsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BrandAccountsUpdatePathParams = {
      businessHierarchyId : string ;
    //#endregion
      brandAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BrandAccountsUpdateBodyParams = BrandAccountsUpdateRequest
    //#endregion


    type BrandAccountsUpdateStatusCode200Response = {
      content:BrandAccountsCreate200Response;
      
    }

    type BrandAccountsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type BrandAccountsUpdateStatusCode401Response = {
      content:Error;
      
    }

    type BrandAccountsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type BrandAccountsUpdateStatusCode404Response = {
      content:Error;
      
    }

    type BrandAccountsUpdateStatusCode409Response = {
      content:Error;
      
    }

    type BrandAccountsUpdateStatusCode429Response = {
      content:Error;
      
    }

    type BrandAccountsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BrandAccountsUpdateResult = BrandAccountsUpdateStatusCode200 of BrandAccountsUpdateStatusCode200Response|BrandAccountsUpdateStatusCode400 of BrandAccountsUpdateStatusCode400Response|BrandAccountsUpdateStatusCode401 of BrandAccountsUpdateStatusCode401Response|BrandAccountsUpdateStatusCode403 of BrandAccountsUpdateStatusCode403Response|BrandAccountsUpdateStatusCode404 of BrandAccountsUpdateStatusCode404Response|BrandAccountsUpdateStatusCode409 of BrandAccountsUpdateStatusCode409Response|BrandAccountsUpdateStatusCode429 of BrandAccountsUpdateStatusCode429Response|BrandAccountsUpdateDefaultStatusCode of BrandAccountsUpdateDefaultStatusCodeResponse

    type BrandAccountsUpdateArgs = {
      pathParams:BrandAccountsUpdatePathParams;
      bodyParams:BrandAccountsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteBusinessMembershipPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteBusinessMembershipBodyParams = MembersToDeleteBody
    //#endregion


    type DeleteBusinessMembershipStatusCode200Response = {
      content:DeletedMembersResponse;
      
    }

    type DeleteBusinessMembershipDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type DeleteBusinessMembershipResult = DeleteBusinessMembershipStatusCode200 of DeleteBusinessMembershipStatusCode200Response|DeleteBusinessMembershipDefaultStatusCode of DeleteBusinessMembershipDefaultStatusCodeResponse

    type DeleteBusinessMembershipArgs = {
      pathParams:DeleteBusinessMembershipPathParams;
      bodyParams:DeleteBusinessMembershipBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteBusinessPartnersPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteBusinessPartnersBodyParams = DeletePartnersRequest
    //#endregion


    type DeleteBusinessPartnersStatusCode200Response = {
      content:DeletePartnersResponse;
      
    }

    type DeleteBusinessPartnersStatusCode404Response = {
      content:Error;
      
    }

    type DeleteBusinessPartnersDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type DeleteBusinessPartnersResult = DeleteBusinessPartnersStatusCode200 of DeleteBusinessPartnersStatusCode200Response|DeleteBusinessPartnersStatusCode404 of DeleteBusinessPartnersStatusCode404Response|DeleteBusinessPartnersDefaultStatusCode of DeleteBusinessPartnersDefaultStatusCodeResponse

    type DeleteBusinessPartnersArgs = {
      pathParams:DeleteBusinessPartnersPathParams;
      bodyParams:DeleteBusinessPartnersBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetBusinessEmployersQueryParams = {
      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type GetBusinessEmployersStatusCode200Response = {
      content:GetBusinessEmployers200Response;
      
    }

    type GetBusinessEmployersDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type GetBusinessEmployersResult = GetBusinessEmployersStatusCode200 of GetBusinessEmployersStatusCode200Response|GetBusinessEmployersDefaultStatusCode of GetBusinessEmployersDefaultStatusCodeResponse

    type GetBusinessEmployersArgs = {
      queryParams:Result<GetBusinessEmployersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBusinessMembersPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetBusinessMembersQueryParams = {
      fetchSystemUsers : bool option;


      assetsSummary : bool option;


      businessRoles : MemberBusinessRole[] option;


      memberIds : string option;


      startIndex : int option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type GetBusinessMembersStatusCode200Response = {
      content:GetBusinessMembers200Response;
      
    }

    type GetBusinessMembersDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type GetBusinessMembersResult = GetBusinessMembersStatusCode200 of GetBusinessMembersStatusCode200Response|GetBusinessMembersDefaultStatusCode of GetBusinessMembersDefaultStatusCodeResponse

    type GetBusinessMembersArgs = {
      pathParams:GetBusinessMembersPathParams;
      queryParams:Result<GetBusinessMembersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBusinessPartnersPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetBusinessPartnersQueryParams = {
      assetsSummary : bool option;


      partnerType : PartnerType option;


      partnerIds : string option;


      startIndex : int option;


      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type GetBusinessPartnersStatusCode200Response = {
      content:GetBusinessPartners200Response;
      
    }

    type GetBusinessPartnersDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type GetBusinessPartnersResult = GetBusinessPartnersStatusCode200 of GetBusinessPartnersStatusCode200Response|GetBusinessPartnersDefaultStatusCode of GetBusinessPartnersDefaultStatusCodeResponse

    type GetBusinessPartnersArgs = {
      pathParams:GetBusinessPartnersPathParams;
      queryParams:Result<GetBusinessPartnersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SystemUserUpdatePathParams = {
      businessId : string ;
    //#endregion
      systemUserId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SystemUserUpdateBodyParams = SystemUserUpdateRequest
    //#endregion


    type SystemUserUpdateStatusCode200Response = {
      content:string;
      
    }

    type SystemUserUpdateStatusCode400Response = {
      content:Error;
      
    }

    type SystemUserUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SystemUserUpdateResult = SystemUserUpdateStatusCode200 of SystemUserUpdateStatusCode200Response|SystemUserUpdateStatusCode400 of SystemUserUpdateStatusCode400Response|SystemUserUpdateDefaultStatusCode of SystemUserUpdateDefaultStatusCodeResponse

    type SystemUserUpdateArgs = {
      pathParams:SystemUserUpdatePathParams;
      bodyParams:SystemUserUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateBusinessMembershipsPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateBusinessMembershipsBodyParams = UpdateMemberBusinessRoleBody[]
    //#endregion


    type UpdateBusinessMembershipsStatusCode200Response = {
      content:UpdateMemberResultsResponseArray;
      
    }

    type UpdateBusinessMembershipsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UpdateBusinessMembershipsResult = UpdateBusinessMembershipsStatusCode200 of UpdateBusinessMembershipsStatusCode200Response|UpdateBusinessMembershipsDefaultStatusCode of UpdateBusinessMembershipsDefaultStatusCodeResponse

    type UpdateBusinessMembershipsArgs = {
      pathParams:UpdateBusinessMembershipsPathParams;
      bodyParams:UpdateBusinessMembershipsBodyParams
    }
