namespace OpenAPI

open OpenAPI.Model.BusinessAssetMembersGet200Response
open OpenAPI.Model.BusinessAssetPartnersGet200Response
open OpenAPI.Model.BusinessAssetsGet200Response
open OpenAPI.Model.BusinessMemberAssetsGet200Response
open OpenAPI.Model.BusinessMembersAssetAccessDeleteRequest
open OpenAPI.Model.BusinessPartnerAssetAccessGet200Response
open OpenAPI.Model.CreateAssetGroupBody
open OpenAPI.Model.CreateAssetGroupResponse
open OpenAPI.Model.DeleteAssetGroupBody
open OpenAPI.Model.DeleteAssetGroupResponse
open OpenAPI.Model.DeleteMemberAccessResultsResponseArray
open OpenAPI.Model.DeletePartnerAssetAccessBody
open OpenAPI.Model.DeletePartnerAssetsResultsResponseArray
open OpenAPI.Model.Error
open OpenAPI.Model.PartnerType
open OpenAPI.Model.PermissionsWithOwner
open OpenAPI.Model.UpdateAssetGroupBody
open OpenAPI.Model.UpdateAssetGroupResponse
open OpenAPI.Model.UpdateMemberAssetAccessBody
open OpenAPI.Model.UpdateMemberAssetsResultsResponseArray
open OpenAPI.Model.UpdatePartnerAssetAccessBody
open OpenAPI.Model.UpdatePartnerAssetsResultsResponseArray
open System.Collections.Generic
open System

module BusinessAccessAssetsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AssetGroupCreatePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AssetGroupCreateBodyParams = CreateAssetGroupBody
    //#endregion


    type AssetGroupCreateStatusCode200Response = {
      content:CreateAssetGroupResponse;
      
    }

    type AssetGroupCreateStatusCode400Response = {
      content:Error;
      
    }

    type AssetGroupCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AssetGroupCreateResult = AssetGroupCreateStatusCode200 of AssetGroupCreateStatusCode200Response|AssetGroupCreateStatusCode400 of AssetGroupCreateStatusCode400Response|AssetGroupCreateDefaultStatusCode of AssetGroupCreateDefaultStatusCodeResponse

    type AssetGroupCreateArgs = {
      pathParams:AssetGroupCreatePathParams;
      bodyParams:AssetGroupCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AssetGroupDeletePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AssetGroupDeleteBodyParams = DeleteAssetGroupBody
    //#endregion


    type AssetGroupDeleteStatusCode200Response = {
      content:DeleteAssetGroupResponse;
      
    }

    type AssetGroupDeleteStatusCode400Response = {
      content:Error;
      
    }

    type AssetGroupDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AssetGroupDeleteResult = AssetGroupDeleteStatusCode200 of AssetGroupDeleteStatusCode200Response|AssetGroupDeleteStatusCode400 of AssetGroupDeleteStatusCode400Response|AssetGroupDeleteDefaultStatusCode of AssetGroupDeleteDefaultStatusCodeResponse

    type AssetGroupDeleteArgs = {
      pathParams:AssetGroupDeletePathParams;
      bodyParams:AssetGroupDeleteBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AssetGroupUpdatePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AssetGroupUpdateBodyParams = UpdateAssetGroupBody
    //#endregion


    type AssetGroupUpdateStatusCode200Response = {
      content:UpdateAssetGroupResponse;
      
    }

    type AssetGroupUpdateStatusCode400Response = {
      content:Error;
      
    }

    type AssetGroupUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AssetGroupUpdateResult = AssetGroupUpdateStatusCode200 of AssetGroupUpdateStatusCode200Response|AssetGroupUpdateStatusCode400 of AssetGroupUpdateStatusCode400Response|AssetGroupUpdateDefaultStatusCode of AssetGroupUpdateDefaultStatusCodeResponse

    type AssetGroupUpdateArgs = {
      pathParams:AssetGroupUpdatePathParams;
      bodyParams:AssetGroupUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessAssetMembersGetPathParams = {
      businessId : string ;
    //#endregion
      assetId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BusinessAssetMembersGetQueryParams = {
      bookmark : string option;


      pageSize : int option;


      startIndex : int option;

    }
    //#endregion


    type BusinessAssetMembersGetStatusCode200Response = {
      content:BusinessAssetMembersGet200Response;
      
    }

    type BusinessAssetMembersGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessAssetMembersGetResult = BusinessAssetMembersGetStatusCode200 of BusinessAssetMembersGetStatusCode200Response|BusinessAssetMembersGetDefaultStatusCode of BusinessAssetMembersGetDefaultStatusCodeResponse

    type BusinessAssetMembersGetArgs = {
      pathParams:BusinessAssetMembersGetPathParams;
      queryParams:Result<BusinessAssetMembersGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessAssetPartnersGetPathParams = {
      businessId : string ;
    //#endregion
      assetId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BusinessAssetPartnersGetQueryParams = {
      startIndex : int option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BusinessAssetPartnersGetStatusCode200Response = {
      content:BusinessAssetPartnersGet200Response;
      
    }

    type BusinessAssetPartnersGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessAssetPartnersGetResult = BusinessAssetPartnersGetStatusCode200 of BusinessAssetPartnersGetStatusCode200Response|BusinessAssetPartnersGetDefaultStatusCode of BusinessAssetPartnersGetDefaultStatusCodeResponse

    type BusinessAssetPartnersGetArgs = {
      pathParams:BusinessAssetPartnersGetPathParams;
      queryParams:Result<BusinessAssetPartnersGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessAssetsGetPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BusinessAssetsGetQueryParams = {
      permissions : PermissionsWithOwner[] option;


      childAssetId : string option;


      assetGroupId : string option;


      assetType : string option;


      startIndex : int option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BusinessAssetsGetStatusCode200Response = {
      content:BusinessAssetsGet200Response;
      
    }

    type BusinessAssetsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessAssetsGetResult = BusinessAssetsGetStatusCode200 of BusinessAssetsGetStatusCode200Response|BusinessAssetsGetDefaultStatusCode of BusinessAssetsGetDefaultStatusCodeResponse

    type BusinessAssetsGetArgs = {
      pathParams:BusinessAssetsGetPathParams;
      queryParams:Result<BusinessAssetsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessMemberAssetsGetPathParams = {
      businessId : string ;
    //#endregion
      memberId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BusinessMemberAssetsGetQueryParams = {
      assetType : string option;


      startIndex : int option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BusinessMemberAssetsGetStatusCode200Response = {
      content:BusinessMemberAssetsGet200Response;
      
    }

    type BusinessMemberAssetsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessMemberAssetsGetResult = BusinessMemberAssetsGetStatusCode200 of BusinessMemberAssetsGetStatusCode200Response|BusinessMemberAssetsGetDefaultStatusCode of BusinessMemberAssetsGetDefaultStatusCodeResponse

    type BusinessMemberAssetsGetArgs = {
      pathParams:BusinessMemberAssetsGetPathParams;
      queryParams:Result<BusinessMemberAssetsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessMembersAssetAccessDeletePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BusinessMembersAssetAccessDeleteBodyParams = BusinessMembersAssetAccessDeleteRequest
    //#endregion


    type BusinessMembersAssetAccessDeleteStatusCode200Response = {
      content:DeleteMemberAccessResultsResponseArray;
      
    }

    type BusinessMembersAssetAccessDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessMembersAssetAccessDeleteResult = BusinessMembersAssetAccessDeleteStatusCode200 of BusinessMembersAssetAccessDeleteStatusCode200Response|BusinessMembersAssetAccessDeleteDefaultStatusCode of BusinessMembersAssetAccessDeleteDefaultStatusCodeResponse

    type BusinessMembersAssetAccessDeleteArgs = {
      pathParams:BusinessMembersAssetAccessDeletePathParams;
      bodyParams:BusinessMembersAssetAccessDeleteBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessMembersAssetAccessUpdatePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BusinessMembersAssetAccessUpdateBodyParams = UpdateMemberAssetAccessBody
    //#endregion


    type BusinessMembersAssetAccessUpdateStatusCode200Response = {
      content:UpdateMemberAssetsResultsResponseArray;
      
    }

    type BusinessMembersAssetAccessUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessMembersAssetAccessUpdateResult = BusinessMembersAssetAccessUpdateStatusCode200 of BusinessMembersAssetAccessUpdateStatusCode200Response|BusinessMembersAssetAccessUpdateDefaultStatusCode of BusinessMembersAssetAccessUpdateDefaultStatusCodeResponse

    type BusinessMembersAssetAccessUpdateArgs = {
      pathParams:BusinessMembersAssetAccessUpdatePathParams;
      bodyParams:BusinessMembersAssetAccessUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessPartnerAssetAccessGetPathParams = {
      businessId : string ;
    //#endregion
      partnerId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BusinessPartnerAssetAccessGetQueryParams = {
      partnerType : PartnerType option;


      assetType : string option;


      startIndex : int option;


      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type BusinessPartnerAssetAccessGetStatusCode200Response = {
      content:BusinessPartnerAssetAccessGet200Response;
      
    }

    type BusinessPartnerAssetAccessGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessPartnerAssetAccessGetResult = BusinessPartnerAssetAccessGetStatusCode200 of BusinessPartnerAssetAccessGetStatusCode200Response|BusinessPartnerAssetAccessGetDefaultStatusCode of BusinessPartnerAssetAccessGetDefaultStatusCodeResponse

    type BusinessPartnerAssetAccessGetArgs = {
      pathParams:BusinessPartnerAssetAccessGetPathParams;
      queryParams:Result<BusinessPartnerAssetAccessGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeletePartnerAssetAccessHandlerImplPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeletePartnerAssetAccessHandlerImplBodyParams = DeletePartnerAssetAccessBody
    //#endregion


    type DeletePartnerAssetAccessHandlerImplStatusCode200Response = {
      content:DeletePartnerAssetsResultsResponseArray;
      
    }

    type DeletePartnerAssetAccessHandlerImplDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type DeletePartnerAssetAccessHandlerImplResult = DeletePartnerAssetAccessHandlerImplStatusCode200 of DeletePartnerAssetAccessHandlerImplStatusCode200Response|DeletePartnerAssetAccessHandlerImplDefaultStatusCode of DeletePartnerAssetAccessHandlerImplDefaultStatusCodeResponse

    type DeletePartnerAssetAccessHandlerImplArgs = {
      pathParams:DeletePartnerAssetAccessHandlerImplPathParams;
      bodyParams:DeletePartnerAssetAccessHandlerImplBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdatePartnerAssetAccessHandlerImplPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdatePartnerAssetAccessHandlerImplBodyParams = UpdatePartnerAssetAccessBody
    //#endregion


    type UpdatePartnerAssetAccessHandlerImplStatusCode200Response = {
      content:UpdatePartnerAssetsResultsResponseArray;
      
    }

    type UpdatePartnerAssetAccessHandlerImplDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UpdatePartnerAssetAccessHandlerImplResult = UpdatePartnerAssetAccessHandlerImplStatusCode200 of UpdatePartnerAssetAccessHandlerImplStatusCode200Response|UpdatePartnerAssetAccessHandlerImplDefaultStatusCode of UpdatePartnerAssetAccessHandlerImplDefaultStatusCodeResponse

    type UpdatePartnerAssetAccessHandlerImplArgs = {
      pathParams:UpdatePartnerAssetAccessHandlerImplPathParams;
      bodyParams:UpdatePartnerAssetAccessHandlerImplBodyParams
    }
