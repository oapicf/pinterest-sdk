namespace OpenAPI

open OpenAPI.Model.AuthRespondInvitesBody
open OpenAPI.Model.CancelInvitesBody
open OpenAPI.Model.CreateAssetAccessRequestBody
open OpenAPI.Model.CreateAssetAccessRequestResponse
open OpenAPI.Model.CreateAssetInvitesRequest
open OpenAPI.Model.CreateInvitesResultsResponseArray
open OpenAPI.Model.CreateMembershipOrPartnershipInvitesBody
open OpenAPI.Model.DeleteInvitesResultsResponseArray
open OpenAPI.Model.Error
open OpenAPI.Model.GetInvites200Response
open OpenAPI.Model.InviteType
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

    type AssetAccessRequestsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AssetAccessRequestsCreateResult = AssetAccessRequestsCreateStatusCode200 of AssetAccessRequestsCreateStatusCode200Response|AssetAccessRequestsCreateDefaultStatusCode of AssetAccessRequestsCreateDefaultStatusCodeResponse

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
    type CancelInvitesOrRequestsBodyParams = CancelInvitesBody
    //#endregion


    type CancelInvitesOrRequestsStatusCode200Response = {
      content:DeleteInvitesResultsResponseArray;
      
    }

    type CancelInvitesOrRequestsDefaultStatusCodeResponse = {
      content:Error;
      
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

    type CreateAssetInvitesDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CreateAssetInvitesResult = CreateAssetInvitesStatusCode200 of CreateAssetInvitesStatusCode200Response|CreateAssetInvitesDefaultStatusCode of CreateAssetInvitesDefaultStatusCodeResponse

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

    type CreateMembershipOrPartnershipInvitesDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CreateMembershipOrPartnershipInvitesResult = CreateMembershipOrPartnershipInvitesStatusCode200 of CreateMembershipOrPartnershipInvitesStatusCode200Response|CreateMembershipOrPartnershipInvitesDefaultStatusCode of CreateMembershipOrPartnershipInvitesDefaultStatusCodeResponse

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


      inviteStatus : string[] option;


      inviteType : InviteType option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type GetInvitesStatusCode200Response = {
      content:GetInvites200Response;
      
    }

    type GetInvitesDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type GetInvitesResult = GetInvitesStatusCode200 of GetInvitesStatusCode200Response|GetInvitesDefaultStatusCode of GetInvitesDefaultStatusCodeResponse

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

    type RespondBusinessAccessInvitesDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type RespondBusinessAccessInvitesResult = RespondBusinessAccessInvitesStatusCode200 of RespondBusinessAccessInvitesStatusCode200Response|RespondBusinessAccessInvitesDefaultStatusCode of RespondBusinessAccessInvitesDefaultStatusCodeResponse

    type RespondBusinessAccessInvitesArgs = {
      bodyParams:RespondBusinessAccessInvitesBodyParams
    }
