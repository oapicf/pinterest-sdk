namespace OpenAPI

open OpenAPI.Model.IntegrationLogsInvalidLogResponse
open OpenAPI.Model.IntegrationLogsRequestCreate
open OpenAPI.Model.IntegrationLogsSuccessResponse
open OpenAPI.Model.IntegrationMetadata
open OpenAPI.Model.IntegrationMetadataCreate
open OpenAPI.Model.IntegrationMetadataUpdate
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.IntegrationsGetList200Response
open OpenAPI.Model.PinterestLibError
open System.Collections.Generic
open System

module IntegrationsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type IntegrationsCommerceDelPathParams = {
      externalBusinessId : string ;
    }
    //#endregion


    type IntegrationsCommerceDelStatusCode200Response = {
      content:IntegrationMetadata;
      
    }

    type IntegrationsCommerceDelStatusCode204Response = {
      content:string;
      
    }

    type IntegrationsCommerceDelStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceDelStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceDelStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceDelStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceDelStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceDelDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type IntegrationsCommerceDelResult = IntegrationsCommerceDelStatusCode200 of IntegrationsCommerceDelStatusCode200Response|IntegrationsCommerceDelStatusCode204 of IntegrationsCommerceDelStatusCode204Response|IntegrationsCommerceDelStatusCode400 of IntegrationsCommerceDelStatusCode400Response|IntegrationsCommerceDelStatusCode401 of IntegrationsCommerceDelStatusCode401Response|IntegrationsCommerceDelStatusCode403 of IntegrationsCommerceDelStatusCode403Response|IntegrationsCommerceDelStatusCode404 of IntegrationsCommerceDelStatusCode404Response|IntegrationsCommerceDelStatusCode429 of IntegrationsCommerceDelStatusCode429Response|IntegrationsCommerceDelDefaultStatusCode of IntegrationsCommerceDelDefaultStatusCodeResponse

    type IntegrationsCommerceDelArgs = {
      pathParams:IntegrationsCommerceDelPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type IntegrationsCommerceGetPathParams = {
      externalBusinessId : string ;
    }
    //#endregion


    type IntegrationsCommerceGetStatusCode200Response = {
      content:IntegrationMetadata;
      
    }

    type IntegrationsCommerceGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommerceGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type IntegrationsCommerceGetResult = IntegrationsCommerceGetStatusCode200 of IntegrationsCommerceGetStatusCode200Response|IntegrationsCommerceGetStatusCode400 of IntegrationsCommerceGetStatusCode400Response|IntegrationsCommerceGetStatusCode401 of IntegrationsCommerceGetStatusCode401Response|IntegrationsCommerceGetStatusCode403 of IntegrationsCommerceGetStatusCode403Response|IntegrationsCommerceGetStatusCode404 of IntegrationsCommerceGetStatusCode404Response|IntegrationsCommerceGetStatusCode429 of IntegrationsCommerceGetStatusCode429Response|IntegrationsCommerceGetDefaultStatusCode of IntegrationsCommerceGetDefaultStatusCodeResponse

    type IntegrationsCommerceGetArgs = {
      pathParams:IntegrationsCommerceGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type IntegrationsCommercePatchPathParams = {
      externalBusinessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type IntegrationsCommercePatchBodyParams = IntegrationMetadataUpdate
    //#endregion


    type IntegrationsCommercePatchStatusCode200Response = {
      content:IntegrationMetadata;
      
    }

    type IntegrationsCommercePatchStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePatchStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePatchStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePatchStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePatchStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePatchDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type IntegrationsCommercePatchResult = IntegrationsCommercePatchStatusCode200 of IntegrationsCommercePatchStatusCode200Response|IntegrationsCommercePatchStatusCode400 of IntegrationsCommercePatchStatusCode400Response|IntegrationsCommercePatchStatusCode401 of IntegrationsCommercePatchStatusCode401Response|IntegrationsCommercePatchStatusCode403 of IntegrationsCommercePatchStatusCode403Response|IntegrationsCommercePatchStatusCode404 of IntegrationsCommercePatchStatusCode404Response|IntegrationsCommercePatchStatusCode429 of IntegrationsCommercePatchStatusCode429Response|IntegrationsCommercePatchDefaultStatusCode of IntegrationsCommercePatchDefaultStatusCodeResponse

    type IntegrationsCommercePatchArgs = {
      pathParams:IntegrationsCommercePatchPathParams;
      bodyParams:IntegrationsCommercePatchBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type IntegrationsCommercePostBodyParams = IntegrationMetadataCreate
    //#endregion


    type IntegrationsCommercePostStatusCode200Response = {
      content:IntegrationMetadata;
      
    }

    type IntegrationsCommercePostStatusCode201Response = {
      content:IntegrationMetadata;
      
    }

    type IntegrationsCommercePostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePostStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePostStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePostStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsCommercePostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type IntegrationsCommercePostResult = IntegrationsCommercePostStatusCode200 of IntegrationsCommercePostStatusCode200Response|IntegrationsCommercePostStatusCode201 of IntegrationsCommercePostStatusCode201Response|IntegrationsCommercePostStatusCode400 of IntegrationsCommercePostStatusCode400Response|IntegrationsCommercePostStatusCode401 of IntegrationsCommercePostStatusCode401Response|IntegrationsCommercePostStatusCode403 of IntegrationsCommercePostStatusCode403Response|IntegrationsCommercePostStatusCode404 of IntegrationsCommercePostStatusCode404Response|IntegrationsCommercePostStatusCode429 of IntegrationsCommercePostStatusCode429Response|IntegrationsCommercePostDefaultStatusCode of IntegrationsCommercePostDefaultStatusCodeResponse

    type IntegrationsCommercePostArgs = {
      bodyParams:IntegrationsCommercePostBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type IntegrationsGetByIdPathParams = {
      id : string ;
    }
    //#endregion


    type IntegrationsGetByIdStatusCode200Response = {
      content:IntegrationRecord;
      
    }

    type IntegrationsGetByIdStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetByIdStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetByIdStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetByIdStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetByIdStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetByIdDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type IntegrationsGetByIdResult = IntegrationsGetByIdStatusCode200 of IntegrationsGetByIdStatusCode200Response|IntegrationsGetByIdStatusCode400 of IntegrationsGetByIdStatusCode400Response|IntegrationsGetByIdStatusCode401 of IntegrationsGetByIdStatusCode401Response|IntegrationsGetByIdStatusCode403 of IntegrationsGetByIdStatusCode403Response|IntegrationsGetByIdStatusCode404 of IntegrationsGetByIdStatusCode404Response|IntegrationsGetByIdStatusCode429 of IntegrationsGetByIdStatusCode429Response|IntegrationsGetByIdDefaultStatusCode of IntegrationsGetByIdDefaultStatusCodeResponse

    type IntegrationsGetByIdArgs = {
      pathParams:IntegrationsGetByIdPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type IntegrationsGetListQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type IntegrationsGetListStatusCode200Response = {
      content:IntegrationsGetList200Response;
      
    }

    type IntegrationsGetListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsGetListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type IntegrationsGetListResult = IntegrationsGetListStatusCode200 of IntegrationsGetListStatusCode200Response|IntegrationsGetListStatusCode400 of IntegrationsGetListStatusCode400Response|IntegrationsGetListStatusCode401 of IntegrationsGetListStatusCode401Response|IntegrationsGetListStatusCode403 of IntegrationsGetListStatusCode403Response|IntegrationsGetListStatusCode404 of IntegrationsGetListStatusCode404Response|IntegrationsGetListStatusCode429 of IntegrationsGetListStatusCode429Response|IntegrationsGetListDefaultStatusCode of IntegrationsGetListDefaultStatusCodeResponse

    type IntegrationsGetListArgs = {
      queryParams:Result<IntegrationsGetListQueryParams,string>;
    }

    //#region Body parameters
    [<CLIMutable>]
    type IntegrationsLogsPostBodyParams = IntegrationLogsRequestCreate
    //#endregion


    type IntegrationsLogsPostStatusCode200Response = {
      content:IntegrationLogsSuccessResponse;
      
    }

    type IntegrationsLogsPostStatusCode400Response = {
      content:IntegrationLogsInvalidLogResponse;
      
    }

    type IntegrationsLogsPostStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsLogsPostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsLogsPostStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsLogsPostStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type IntegrationsLogsPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type IntegrationsLogsPostResult = IntegrationsLogsPostStatusCode200 of IntegrationsLogsPostStatusCode200Response|IntegrationsLogsPostStatusCode400 of IntegrationsLogsPostStatusCode400Response|IntegrationsLogsPostStatusCode401 of IntegrationsLogsPostStatusCode401Response|IntegrationsLogsPostStatusCode403 of IntegrationsLogsPostStatusCode403Response|IntegrationsLogsPostStatusCode404 of IntegrationsLogsPostStatusCode404Response|IntegrationsLogsPostStatusCode429 of IntegrationsLogsPostStatusCode429Response|IntegrationsLogsPostDefaultStatusCode of IntegrationsLogsPostDefaultStatusCodeResponse

    type IntegrationsLogsPostArgs = {
      bodyParams:IntegrationsLogsPostBodyParams
    }
