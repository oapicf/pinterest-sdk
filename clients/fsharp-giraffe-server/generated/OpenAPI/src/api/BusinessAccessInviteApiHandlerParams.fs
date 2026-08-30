namespace OpenAPI

open OpenAPI.Model.AuthRespondInvitesBody
open OpenAPI.Model.CancelInvitesRequest
open OpenAPI.Model.CancelInvitesResponse
open OpenAPI.Model.CreateAssetAccessRequestBody
open OpenAPI.Model.CreateAssetAccessRequestResponse
open OpenAPI.Model.CreateAssetInvitesRequest
open OpenAPI.Model.CreateInvitesResultsResponseArray
open OpenAPI.Model.CreateMembershipOrPartnershipInvitesBody
open OpenAPI.Model.GetInvites200Response
open OpenAPI.Model.InviteFilterStatus
open OpenAPI.Model.InviteType
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.RespondToInvitesResponseArray
open OpenAPI.Model.UpdateInvitesResultsResponseArray
open System.Collections.Generic
open System

module BusinessAccessInviteApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AssetAccessRequestsCreatePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AssetAccessRequestsCreateBodyParams = CreateAssetAccessRequestBody
    //#endregion


    type AssetAccessRequestsCreateStatusCode200Response = {
      content:CreateAssetAccessRequestResponse;
      
    }

    type AssetAccessRequestsCreateStatusCode201Response = {
      content:CreateAssetAccessRequestResponse;
      
    }

    type AssetAccessRequestsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AssetAccessRequestsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AssetAccessRequestsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AssetAccessRequestsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AssetAccessRequestsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AssetAccessRequestsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AssetAccessRequestsCreateResult = AssetAccessRequestsCreateStatusCode200 of AssetAccessRequestsCreateStatusCode200Response|AssetAccessRequestsCreateStatusCode201 of AssetAccessRequestsCreateStatusCode201Response|AssetAccessRequestsCreateStatusCode400 of AssetAccessRequestsCreateStatusCode400Response|AssetAccessRequestsCreateStatusCode401 of AssetAccessRequestsCreateStatusCode401Response|AssetAccessRequestsCreateStatusCode403 of AssetAccessRequestsCreateStatusCode403Response|AssetAccessRequestsCreateStatusCode404 of AssetAccessRequestsCreateStatusCode404Response|AssetAccessRequestsCreateStatusCode429 of AssetAccessRequestsCreateStatusCode429Response|AssetAccessRequestsCreateDefaultStatusCode of AssetAccessRequestsCreateDefaultStatusCodeResponse

    type AssetAccessRequestsCreateArgs = {
      pathParams:AssetAccessRequestsCreatePathParams;
      bodyParams:AssetAccessRequestsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CancelInvitesOrRequestsPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CancelInvitesOrRequestsBodyParams = CancelInvitesRequest
    //#endregion


    type CancelInvitesOrRequestsStatusCode200Response = {
      content:CancelInvitesResponse;
      
    }

    type CancelInvitesOrRequestsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CancelInvitesOrRequestsResult = CancelInvitesOrRequestsStatusCode200 of CancelInvitesOrRequestsStatusCode200Response|CancelInvitesOrRequestsDefaultStatusCode of CancelInvitesOrRequestsDefaultStatusCodeResponse

    type CancelInvitesOrRequestsArgs = {
      pathParams:CancelInvitesOrRequestsPathParams;
      bodyParams:CancelInvitesOrRequestsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateAssetInvitesPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateAssetInvitesBodyParams = CreateAssetInvitesRequest
    //#endregion


    type CreateAssetInvitesStatusCode200Response = {
      content:UpdateInvitesResultsResponseArray;
      
    }

    type CreateAssetInvitesStatusCode201Response = {
      content:UpdateInvitesResultsResponseArray;
      
    }

    type CreateAssetInvitesStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CreateAssetInvitesStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CreateAssetInvitesStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CreateAssetInvitesStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CreateAssetInvitesStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CreateAssetInvitesDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CreateAssetInvitesResult = CreateAssetInvitesStatusCode200 of CreateAssetInvitesStatusCode200Response|CreateAssetInvitesStatusCode201 of CreateAssetInvitesStatusCode201Response|CreateAssetInvitesStatusCode400 of CreateAssetInvitesStatusCode400Response|CreateAssetInvitesStatusCode401 of CreateAssetInvitesStatusCode401Response|CreateAssetInvitesStatusCode403 of CreateAssetInvitesStatusCode403Response|CreateAssetInvitesStatusCode404 of CreateAssetInvitesStatusCode404Response|CreateAssetInvitesStatusCode429 of CreateAssetInvitesStatusCode429Response|CreateAssetInvitesDefaultStatusCode of CreateAssetInvitesDefaultStatusCodeResponse

    type CreateAssetInvitesArgs = {
      pathParams:CreateAssetInvitesPathParams;
      bodyParams:CreateAssetInvitesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateMembershipOrPartnershipInvitesPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateMembershipOrPartnershipInvitesBodyParams = CreateMembershipOrPartnershipInvitesBody
    //#endregion


    type CreateMembershipOrPartnershipInvitesStatusCode200Response = {
      content:CreateInvitesResultsResponseArray;
      
    }

    type CreateMembershipOrPartnershipInvitesStatusCode201Response = {
      content:CreateInvitesResultsResponseArray;
      
    }

    type CreateMembershipOrPartnershipInvitesStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CreateMembershipOrPartnershipInvitesStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CreateMembershipOrPartnershipInvitesStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CreateMembershipOrPartnershipInvitesStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CreateMembershipOrPartnershipInvitesStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CreateMembershipOrPartnershipInvitesDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CreateMembershipOrPartnershipInvitesResult = CreateMembershipOrPartnershipInvitesStatusCode200 of CreateMembershipOrPartnershipInvitesStatusCode200Response|CreateMembershipOrPartnershipInvitesStatusCode201 of CreateMembershipOrPartnershipInvitesStatusCode201Response|CreateMembershipOrPartnershipInvitesStatusCode400 of CreateMembershipOrPartnershipInvitesStatusCode400Response|CreateMembershipOrPartnershipInvitesStatusCode401 of CreateMembershipOrPartnershipInvitesStatusCode401Response|CreateMembershipOrPartnershipInvitesStatusCode403 of CreateMembershipOrPartnershipInvitesStatusCode403Response|CreateMembershipOrPartnershipInvitesStatusCode404 of CreateMembershipOrPartnershipInvitesStatusCode404Response|CreateMembershipOrPartnershipInvitesStatusCode429 of CreateMembershipOrPartnershipInvitesStatusCode429Response|CreateMembershipOrPartnershipInvitesDefaultStatusCode of CreateMembershipOrPartnershipInvitesDefaultStatusCodeResponse

    type CreateMembershipOrPartnershipInvitesArgs = {
      pathParams:CreateMembershipOrPartnershipInvitesPathParams;
      bodyParams:CreateMembershipOrPartnershipInvitesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetInvitesPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetInvitesQueryParams = {
      isMember : bool option;


      inviteStatus : InviteFilterStatus[] option;


      inviteType : InviteType option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type GetInvitesStatusCode200Response = {
      content:GetInvites200Response;
      
    }

    type GetInvitesStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type GetInvitesStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type GetInvitesStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type GetInvitesStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type GetInvitesStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type GetInvitesDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type GetInvitesResult = GetInvitesStatusCode200 of GetInvitesStatusCode200Response|GetInvitesStatusCode400 of GetInvitesStatusCode400Response|GetInvitesStatusCode401 of GetInvitesStatusCode401Response|GetInvitesStatusCode403 of GetInvitesStatusCode403Response|GetInvitesStatusCode404 of GetInvitesStatusCode404Response|GetInvitesStatusCode429 of GetInvitesStatusCode429Response|GetInvitesDefaultStatusCode of GetInvitesDefaultStatusCodeResponse

    type GetInvitesArgs = {
      pathParams:GetInvitesPathParams;
      queryParams:Result<GetInvitesQueryParams,string>;
    }

    //#region Body parameters
    [<CLIMutable>]
    type RespondBusinessAccessInvitesBodyParams = AuthRespondInvitesBody
    //#endregion


    type RespondBusinessAccessInvitesStatusCode200Response = {
      content:RespondToInvitesResponseArray;
      
    }

    type RespondBusinessAccessInvitesStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type RespondBusinessAccessInvitesStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type RespondBusinessAccessInvitesStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type RespondBusinessAccessInvitesStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type RespondBusinessAccessInvitesStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type RespondBusinessAccessInvitesDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type RespondBusinessAccessInvitesResult = RespondBusinessAccessInvitesStatusCode200 of RespondBusinessAccessInvitesStatusCode200Response|RespondBusinessAccessInvitesStatusCode400 of RespondBusinessAccessInvitesStatusCode400Response|RespondBusinessAccessInvitesStatusCode401 of RespondBusinessAccessInvitesStatusCode401Response|RespondBusinessAccessInvitesStatusCode403 of RespondBusinessAccessInvitesStatusCode403Response|RespondBusinessAccessInvitesStatusCode404 of RespondBusinessAccessInvitesStatusCode404Response|RespondBusinessAccessInvitesStatusCode429 of RespondBusinessAccessInvitesStatusCode429Response|RespondBusinessAccessInvitesDefaultStatusCode of RespondBusinessAccessInvitesDefaultStatusCodeResponse

    type RespondBusinessAccessInvitesArgs = {
      bodyParams:RespondBusinessAccessInvitesBodyParams
    }
