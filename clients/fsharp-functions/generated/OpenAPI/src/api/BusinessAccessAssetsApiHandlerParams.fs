namespace OpenAPI

open OpenAPI.Model.AssetGroupDeletion
open OpenAPI.Model.AssetGroupDeletionDelete
open OpenAPI.Model.AssetGroupInput
open OpenAPI.Model.AssetGroupInputCreate
open OpenAPI.Model.AssetGroupModification
open OpenAPI.Model.AssetGroupModificationReadOrUpdate
open OpenAPI.Model.AssetPermissionType
open OpenAPI.Model.AssetSearchBy
open OpenAPI.Model.AssetSortBy
open OpenAPI.Model.BusinessAssetMembersGet200Response
open OpenAPI.Model.BusinessAssetsGet200Response
open OpenAPI.Model.BusinessMemberAssetsGetResponse
open OpenAPI.Model.BusinessMembersAssetAccessDeleteBody
open OpenAPI.Model.BusinessPartnerAssetAccessGet200Response
open OpenAPI.Model.DeleteMemberAccessResultsResponseArray
open OpenAPI.Model.DeletePartnerAssetAccessBody
open OpenAPI.Model.DeletePartnerAssetAccessResultsResponseArray
open OpenAPI.Model.NonDraftEntityStatus
open OpenAPI.Model.PermissionsWithOwner
open OpenAPI.Model.PinterestLibError
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
    type AssetGroupCreateBodyParams = AssetGroupInputCreate
    //#endregion


    type AssetGroupCreateStatusCode200Response = {
      content:AssetGroupInput;
      
    }

    type AssetGroupCreateStatusCode201Response = {
      content:AssetGroupInput;
      
    }

    type AssetGroupCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AssetGroupCreateResult = AssetGroupCreateStatusCode200 of AssetGroupCreateStatusCode200Response|AssetGroupCreateStatusCode201 of AssetGroupCreateStatusCode201Response|AssetGroupCreateStatusCode400 of AssetGroupCreateStatusCode400Response|AssetGroupCreateStatusCode401 of AssetGroupCreateStatusCode401Response|AssetGroupCreateStatusCode403 of AssetGroupCreateStatusCode403Response|AssetGroupCreateStatusCode404 of AssetGroupCreateStatusCode404Response|AssetGroupCreateStatusCode429 of AssetGroupCreateStatusCode429Response|AssetGroupCreateDefaultStatusCode of AssetGroupCreateDefaultStatusCodeResponse

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
    type AssetGroupDeleteBodyParams = AssetGroupDeletionDelete
    //#endregion


    type AssetGroupDeleteStatusCode200Response = {
      content:AssetGroupDeletion;
      
    }

    type AssetGroupDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AssetGroupDeleteResult = AssetGroupDeleteStatusCode200 of AssetGroupDeleteStatusCode200Response|AssetGroupDeleteDefaultStatusCode of AssetGroupDeleteDefaultStatusCodeResponse

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
    type AssetGroupUpdateBodyParams = AssetGroupModificationReadOrUpdate
    //#endregion


    type AssetGroupUpdateStatusCode200Response = {
      content:AssetGroupModification;
      
    }

    type AssetGroupUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AssetGroupUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AssetGroupUpdateResult = AssetGroupUpdateStatusCode200 of AssetGroupUpdateStatusCode200Response|AssetGroupUpdateStatusCode400 of AssetGroupUpdateStatusCode400Response|AssetGroupUpdateStatusCode401 of AssetGroupUpdateStatusCode401Response|AssetGroupUpdateStatusCode403 of AssetGroupUpdateStatusCode403Response|AssetGroupUpdateStatusCode404 of AssetGroupUpdateStatusCode404Response|AssetGroupUpdateStatusCode429 of AssetGroupUpdateStatusCode429Response|AssetGroupUpdateDefaultStatusCode of AssetGroupUpdateDefaultStatusCodeResponse

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
      startIndex : int option;


      fetchSystemUsers : bool option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BusinessAssetMembersGetStatusCode200Response = {
      content:BusinessAssetMembersGet200Response;
      
    }

    type BusinessAssetMembersGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetMembersGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetMembersGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetMembersGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetMembersGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetMembersGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BusinessAssetMembersGetResult = BusinessAssetMembersGetStatusCode200 of BusinessAssetMembersGetStatusCode200Response|BusinessAssetMembersGetStatusCode400 of BusinessAssetMembersGetStatusCode400Response|BusinessAssetMembersGetStatusCode401 of BusinessAssetMembersGetStatusCode401Response|BusinessAssetMembersGetStatusCode403 of BusinessAssetMembersGetStatusCode403Response|BusinessAssetMembersGetStatusCode404 of BusinessAssetMembersGetStatusCode404Response|BusinessAssetMembersGetStatusCode429 of BusinessAssetMembersGetStatusCode429Response|BusinessAssetMembersGetDefaultStatusCode of BusinessAssetMembersGetDefaultStatusCodeResponse

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
      content:BusinessAssetMembersGet200Response;
      
    }

    type BusinessAssetPartnersGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetPartnersGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetPartnersGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetPartnersGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetPartnersGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetPartnersGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BusinessAssetPartnersGetResult = BusinessAssetPartnersGetStatusCode200 of BusinessAssetPartnersGetStatusCode200Response|BusinessAssetPartnersGetStatusCode400 of BusinessAssetPartnersGetStatusCode400Response|BusinessAssetPartnersGetStatusCode401 of BusinessAssetPartnersGetStatusCode401Response|BusinessAssetPartnersGetStatusCode403 of BusinessAssetPartnersGetStatusCode403Response|BusinessAssetPartnersGetStatusCode404 of BusinessAssetPartnersGetStatusCode404Response|BusinessAssetPartnersGetStatusCode429 of BusinessAssetPartnersGetStatusCode429Response|BusinessAssetPartnersGetDefaultStatusCode of BusinessAssetPartnersGetDefaultStatusCodeResponse

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

    type BusinessAssetsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BusinessAssetsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BusinessAssetsGetResult = BusinessAssetsGetStatusCode200 of BusinessAssetsGetStatusCode200Response|BusinessAssetsGetStatusCode400 of BusinessAssetsGetStatusCode400Response|BusinessAssetsGetStatusCode401 of BusinessAssetsGetStatusCode401Response|BusinessAssetsGetStatusCode403 of BusinessAssetsGetStatusCode403Response|BusinessAssetsGetStatusCode404 of BusinessAssetsGetStatusCode404Response|BusinessAssetsGetStatusCode429 of BusinessAssetsGetStatusCode429Response|BusinessAssetsGetDefaultStatusCode of BusinessAssetsGetDefaultStatusCodeResponse

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


      sortBy : AssetSortBy option;


      sortAscending : bool option;


      searchBy : AssetSearchBy option;


      searchValue : string option;


      assetPermissionType : AssetPermissionType option;


      adAccountStatuses : NonDraftEntityStatus[] option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BusinessMemberAssetsGetStatusCode200Response = {
      content:BusinessMemberAssetsGetResponse;
      
    }

    type BusinessMemberAssetsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BusinessMemberAssetsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BusinessMemberAssetsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BusinessMemberAssetsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BusinessMemberAssetsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BusinessMemberAssetsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BusinessMemberAssetsGetResult = BusinessMemberAssetsGetStatusCode200 of BusinessMemberAssetsGetStatusCode200Response|BusinessMemberAssetsGetStatusCode400 of BusinessMemberAssetsGetStatusCode400Response|BusinessMemberAssetsGetStatusCode401 of BusinessMemberAssetsGetStatusCode401Response|BusinessMemberAssetsGetStatusCode403 of BusinessMemberAssetsGetStatusCode403Response|BusinessMemberAssetsGetStatusCode404 of BusinessMemberAssetsGetStatusCode404Response|BusinessMemberAssetsGetStatusCode429 of BusinessMemberAssetsGetStatusCode429Response|BusinessMemberAssetsGetDefaultStatusCode of BusinessMemberAssetsGetDefaultStatusCodeResponse

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
    type BusinessMembersAssetAccessDeleteBodyParams = BusinessMembersAssetAccessDeleteBody
    //#endregion


    type BusinessMembersAssetAccessDeleteStatusCode200Response = {
      content:DeleteMemberAccessResultsResponseArray;
      
    }

    type BusinessMembersAssetAccessDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
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

    type BusinessMembersAssetAccessUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BusinessMembersAssetAccessUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BusinessMembersAssetAccessUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BusinessMembersAssetAccessUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BusinessMembersAssetAccessUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BusinessMembersAssetAccessUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BusinessMembersAssetAccessUpdateResult = BusinessMembersAssetAccessUpdateStatusCode200 of BusinessMembersAssetAccessUpdateStatusCode200Response|BusinessMembersAssetAccessUpdateStatusCode400 of BusinessMembersAssetAccessUpdateStatusCode400Response|BusinessMembersAssetAccessUpdateStatusCode401 of BusinessMembersAssetAccessUpdateStatusCode401Response|BusinessMembersAssetAccessUpdateStatusCode403 of BusinessMembersAssetAccessUpdateStatusCode403Response|BusinessMembersAssetAccessUpdateStatusCode404 of BusinessMembersAssetAccessUpdateStatusCode404Response|BusinessMembersAssetAccessUpdateStatusCode429 of BusinessMembersAssetAccessUpdateStatusCode429Response|BusinessMembersAssetAccessUpdateDefaultStatusCode of BusinessMembersAssetAccessUpdateDefaultStatusCodeResponse

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
      partnerType : string option;


      assetType : string option;


      startIndex : int option;


      sortBy : AssetSortBy option;


      sortAscending : bool option;


      searchBy : AssetSearchBy option;


      searchValue : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BusinessPartnerAssetAccessGetStatusCode200Response = {
      content:BusinessPartnerAssetAccessGet200Response;
      
    }

    type BusinessPartnerAssetAccessGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BusinessPartnerAssetAccessGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BusinessPartnerAssetAccessGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BusinessPartnerAssetAccessGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BusinessPartnerAssetAccessGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BusinessPartnerAssetAccessGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BusinessPartnerAssetAccessGetResult = BusinessPartnerAssetAccessGetStatusCode200 of BusinessPartnerAssetAccessGetStatusCode200Response|BusinessPartnerAssetAccessGetStatusCode400 of BusinessPartnerAssetAccessGetStatusCode400Response|BusinessPartnerAssetAccessGetStatusCode401 of BusinessPartnerAssetAccessGetStatusCode401Response|BusinessPartnerAssetAccessGetStatusCode403 of BusinessPartnerAssetAccessGetStatusCode403Response|BusinessPartnerAssetAccessGetStatusCode404 of BusinessPartnerAssetAccessGetStatusCode404Response|BusinessPartnerAssetAccessGetStatusCode429 of BusinessPartnerAssetAccessGetStatusCode429Response|BusinessPartnerAssetAccessGetDefaultStatusCode of BusinessPartnerAssetAccessGetDefaultStatusCodeResponse

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
      content:DeletePartnerAssetAccessResultsResponseArray;
      
    }

    type DeletePartnerAssetAccessHandlerImplDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
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

    type UpdatePartnerAssetAccessHandlerImplStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UpdatePartnerAssetAccessHandlerImplStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UpdatePartnerAssetAccessHandlerImplStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UpdatePartnerAssetAccessHandlerImplStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UpdatePartnerAssetAccessHandlerImplStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UpdatePartnerAssetAccessHandlerImplDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UpdatePartnerAssetAccessHandlerImplResult = UpdatePartnerAssetAccessHandlerImplStatusCode200 of UpdatePartnerAssetAccessHandlerImplStatusCode200Response|UpdatePartnerAssetAccessHandlerImplStatusCode400 of UpdatePartnerAssetAccessHandlerImplStatusCode400Response|UpdatePartnerAssetAccessHandlerImplStatusCode401 of UpdatePartnerAssetAccessHandlerImplStatusCode401Response|UpdatePartnerAssetAccessHandlerImplStatusCode403 of UpdatePartnerAssetAccessHandlerImplStatusCode403Response|UpdatePartnerAssetAccessHandlerImplStatusCode404 of UpdatePartnerAssetAccessHandlerImplStatusCode404Response|UpdatePartnerAssetAccessHandlerImplStatusCode429 of UpdatePartnerAssetAccessHandlerImplStatusCode429Response|UpdatePartnerAssetAccessHandlerImplDefaultStatusCode of UpdatePartnerAssetAccessHandlerImplDefaultStatusCodeResponse

    type UpdatePartnerAssetAccessHandlerImplArgs = {
      pathParams:UpdatePartnerAssetAccessHandlerImplPathParams;
      bodyParams:UpdatePartnerAssetAccessHandlerImplBodyParams
    }
