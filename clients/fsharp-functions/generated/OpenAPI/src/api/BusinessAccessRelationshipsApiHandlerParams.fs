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
    type BrandAccountsCreateBodyParams = BrandAccountCreate
    //#endregion


    type BrandAccountsCreateStatusCode200Response = {
      content:BrandAccount;
      
    }

    type BrandAccountsCreateStatusCode201Response = {
      content:BrandAccount;
      
    }

    type BrandAccountsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BrandAccountsCreateResult = BrandAccountsCreateStatusCode200 of BrandAccountsCreateStatusCode200Response|BrandAccountsCreateStatusCode201 of BrandAccountsCreateStatusCode201Response|BrandAccountsCreateStatusCode400 of BrandAccountsCreateStatusCode400Response|BrandAccountsCreateStatusCode401 of BrandAccountsCreateStatusCode401Response|BrandAccountsCreateStatusCode403 of BrandAccountsCreateStatusCode403Response|BrandAccountsCreateStatusCode404 of BrandAccountsCreateStatusCode404Response|BrandAccountsCreateStatusCode429 of BrandAccountsCreateStatusCode429Response|BrandAccountsCreateDefaultStatusCode of BrandAccountsCreateDefaultStatusCodeResponse

    type BrandAccountsCreateArgs = {
      pathParams:BrandAccountsCreatePathParams;
      bodyParams:BrandAccountsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BrandAccountsUpdatePathParams = {
      brandAccountId : string ;
    //#endregion
      businessHierarchyId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BrandAccountsUpdateBodyParams = BrandAccountUpdate
    //#endregion


    type BrandAccountsUpdateStatusCode200Response = {
      content:BrandAccount;
      
    }

    type BrandAccountsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsUpdateStatusCode409Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BrandAccountsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
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
    type DeleteBusinessMembershipBodyParams = DeleteBusinessMembershipBody
    //#endregion


    type DeleteBusinessMembershipStatusCode200Response = {
      content:DeleteBusinessMembership200Response;
      
    }

    type DeleteBusinessMembershipDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
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
    type DeleteBusinessPartnersBodyParams = DeleteBusinessPartnersDelete
    //#endregion


    type DeleteBusinessPartnersStatusCode200Response = {
      content:DeleteBusinessPartners;
      
    }

    type DeleteBusinessPartnersStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type DeleteBusinessPartnersDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type DeleteBusinessPartnersResult = DeleteBusinessPartnersStatusCode200 of DeleteBusinessPartnersStatusCode200Response|DeleteBusinessPartnersStatusCode404 of DeleteBusinessPartnersStatusCode404Response|DeleteBusinessPartnersDefaultStatusCode of DeleteBusinessPartnersDefaultStatusCodeResponse

    type DeleteBusinessPartnersArgs = {
      pathParams:DeleteBusinessPartnersPathParams;
      bodyParams:DeleteBusinessPartnersBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetBusinessEmployersQueryParams = {
      assetsSummary : bool option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type GetBusinessEmployersStatusCode200Response = {
      content:GetBusinessEmployers200Response;
      
    }

    type GetBusinessEmployersStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessEmployersStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessEmployersStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessEmployersStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessEmployersStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessEmployersDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type GetBusinessEmployersResult = GetBusinessEmployersStatusCode200 of GetBusinessEmployersStatusCode200Response|GetBusinessEmployersStatusCode400 of GetBusinessEmployersStatusCode400Response|GetBusinessEmployersStatusCode401 of GetBusinessEmployersStatusCode401Response|GetBusinessEmployersStatusCode403 of GetBusinessEmployersStatusCode403Response|GetBusinessEmployersStatusCode404 of GetBusinessEmployersStatusCode404Response|GetBusinessEmployersStatusCode429 of GetBusinessEmployersStatusCode429Response|GetBusinessEmployersDefaultStatusCode of GetBusinessEmployersDefaultStatusCodeResponse

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
      content:GetBusinessEmployers200Response;
      
    }

    type GetBusinessMembersStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessMembersStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessMembersStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessMembersStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessMembersStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessMembersDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type GetBusinessMembersResult = GetBusinessMembersStatusCode200 of GetBusinessMembersStatusCode200Response|GetBusinessMembersStatusCode400 of GetBusinessMembersStatusCode400Response|GetBusinessMembersStatusCode401 of GetBusinessMembersStatusCode401Response|GetBusinessMembersStatusCode403 of GetBusinessMembersStatusCode403Response|GetBusinessMembersStatusCode404 of GetBusinessMembersStatusCode404Response|GetBusinessMembersStatusCode429 of GetBusinessMembersStatusCode429Response|GetBusinessMembersDefaultStatusCode of GetBusinessMembersDefaultStatusCodeResponse

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


      sortAscending : bool option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type GetBusinessPartnersStatusCode200Response = {
      content:GetBusinessEmployers200Response;
      
    }

    type GetBusinessPartnersStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessPartnersStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessPartnersStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessPartnersStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessPartnersStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type GetBusinessPartnersDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type GetBusinessPartnersResult = GetBusinessPartnersStatusCode200 of GetBusinessPartnersStatusCode200Response|GetBusinessPartnersStatusCode400 of GetBusinessPartnersStatusCode400Response|GetBusinessPartnersStatusCode401 of GetBusinessPartnersStatusCode401Response|GetBusinessPartnersStatusCode403 of GetBusinessPartnersStatusCode403Response|GetBusinessPartnersStatusCode404 of GetBusinessPartnersStatusCode404Response|GetBusinessPartnersStatusCode429 of GetBusinessPartnersStatusCode429Response|GetBusinessPartnersDefaultStatusCode of GetBusinessPartnersDefaultStatusCodeResponse

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
    type SystemUserUpdateBodyParams = SystemUserUpdateWithRequiredBody
    //#endregion


    type SystemUserUpdateStatusCode200Response = {
      content:string;
      
    }

    type SystemUserUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SystemUserUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SystemUserUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SystemUserUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SystemUserUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SystemUserUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SystemUserUpdateResult = SystemUserUpdateStatusCode200 of SystemUserUpdateStatusCode200Response|SystemUserUpdateStatusCode400 of SystemUserUpdateStatusCode400Response|SystemUserUpdateStatusCode401 of SystemUserUpdateStatusCode401Response|SystemUserUpdateStatusCode403 of SystemUserUpdateStatusCode403Response|SystemUserUpdateStatusCode404 of SystemUserUpdateStatusCode404Response|SystemUserUpdateStatusCode429 of SystemUserUpdateStatusCode429Response|SystemUserUpdateDefaultStatusCode of SystemUserUpdateDefaultStatusCodeResponse

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
    type UpdateBusinessMembershipsBodyParams = BusinessMembershipMember[]
    //#endregion


    type UpdateBusinessMembershipsStatusCode200Response = {
      content:UpdateBusinessMembershipsResponse;
      
    }

    type UpdateBusinessMembershipsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessMembershipsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessMembershipsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessMembershipsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessMembershipsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessMembershipsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UpdateBusinessMembershipsResult = UpdateBusinessMembershipsStatusCode200 of UpdateBusinessMembershipsStatusCode200Response|UpdateBusinessMembershipsStatusCode400 of UpdateBusinessMembershipsStatusCode400Response|UpdateBusinessMembershipsStatusCode401 of UpdateBusinessMembershipsStatusCode401Response|UpdateBusinessMembershipsStatusCode403 of UpdateBusinessMembershipsStatusCode403Response|UpdateBusinessMembershipsStatusCode404 of UpdateBusinessMembershipsStatusCode404Response|UpdateBusinessMembershipsStatusCode429 of UpdateBusinessMembershipsStatusCode429Response|UpdateBusinessMembershipsDefaultStatusCode of UpdateBusinessMembershipsDefaultStatusCodeResponse

    type UpdateBusinessMembershipsArgs = {
      pathParams:UpdateBusinessMembershipsPathParams;
      bodyParams:UpdateBusinessMembershipsBodyParams
    }
