namespace OpenAPI

open OpenAPI.Model.DetailedError
open OpenAPI.Model.Error
open OpenAPI.Model.IntegrationLogsRequest
open OpenAPI.Model.IntegrationLogsSuccessResponse
open OpenAPI.Model.IntegrationMetadata
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.IntegrationRequest
open OpenAPI.Model.IntegrationRequestPatch
open OpenAPI.Model.IntegrationsGetList200Response
open System.Collections.Generic
open System

module IntegrationsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type IntegrationsCommerceDelPathParams = {
      externalBusinessId : string ;
    }
    //#endregion


    type IntegrationsCommerceDelStatusCode204Response = {
      content:string;
      
    }

    type IntegrationsCommerceDelDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type IntegrationsCommerceDelResult = IntegrationsCommerceDelStatusCode204 of IntegrationsCommerceDelStatusCode204Response|IntegrationsCommerceDelDefaultStatusCode of IntegrationsCommerceDelDefaultStatusCodeResponse

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

    type IntegrationsCommerceGetStatusCode404Response = {
      content:Error;
      
    }

    type IntegrationsCommerceGetStatusCode409Response = {
      content:Error;
      
    }

    type IntegrationsCommerceGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type IntegrationsCommerceGetResult = IntegrationsCommerceGetStatusCode200 of IntegrationsCommerceGetStatusCode200Response|IntegrationsCommerceGetStatusCode404 of IntegrationsCommerceGetStatusCode404Response|IntegrationsCommerceGetStatusCode409 of IntegrationsCommerceGetStatusCode409Response|IntegrationsCommerceGetDefaultStatusCode of IntegrationsCommerceGetDefaultStatusCodeResponse

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
    type IntegrationsCommercePatchBodyParams = IntegrationRequestPatch
    //#endregion


    type IntegrationsCommercePatchStatusCode200Response = {
      content:IntegrationMetadata;
      
    }

    type IntegrationsCommercePatchStatusCode404Response = {
      content:Error;
      
    }

    type IntegrationsCommercePatchStatusCode409Response = {
      content:Error;
      
    }

    type IntegrationsCommercePatchDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type IntegrationsCommercePatchResult = IntegrationsCommercePatchStatusCode200 of IntegrationsCommercePatchStatusCode200Response|IntegrationsCommercePatchStatusCode404 of IntegrationsCommercePatchStatusCode404Response|IntegrationsCommercePatchStatusCode409 of IntegrationsCommercePatchStatusCode409Response|IntegrationsCommercePatchDefaultStatusCode of IntegrationsCommercePatchDefaultStatusCodeResponse

    type IntegrationsCommercePatchArgs = {
      pathParams:IntegrationsCommercePatchPathParams;
      bodyParams:IntegrationsCommercePatchBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type IntegrationsCommercePostBodyParams = IntegrationRequest
    //#endregion


    type IntegrationsCommercePostStatusCode200Response = {
      content:IntegrationMetadata;
      
    }

    type IntegrationsCommercePostStatusCode404Response = {
      content:Error;
      
    }

    type IntegrationsCommercePostStatusCode409Response = {
      content:Error;
      
    }

    type IntegrationsCommercePostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type IntegrationsCommercePostResult = IntegrationsCommercePostStatusCode200 of IntegrationsCommercePostStatusCode200Response|IntegrationsCommercePostStatusCode404 of IntegrationsCommercePostStatusCode404Response|IntegrationsCommercePostStatusCode409 of IntegrationsCommercePostStatusCode409Response|IntegrationsCommercePostDefaultStatusCode of IntegrationsCommercePostDefaultStatusCodeResponse

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

    type IntegrationsGetByIdStatusCode404Response = {
      content:Error;
      
    }

    type IntegrationsGetByIdDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type IntegrationsGetByIdResult = IntegrationsGetByIdStatusCode200 of IntegrationsGetByIdStatusCode200Response|IntegrationsGetByIdStatusCode404 of IntegrationsGetByIdStatusCode404Response|IntegrationsGetByIdDefaultStatusCode of IntegrationsGetByIdDefaultStatusCodeResponse

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

    type IntegrationsGetListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type IntegrationsGetListResult = IntegrationsGetListStatusCode200 of IntegrationsGetListStatusCode200Response|IntegrationsGetListDefaultStatusCode of IntegrationsGetListDefaultStatusCodeResponse

    type IntegrationsGetListArgs = {
      queryParams:Result<IntegrationsGetListQueryParams,string>;
    }

    //#region Body parameters
    [<CLIMutable>]
    type IntegrationsLogsPostBodyParams = IntegrationLogsRequest
    //#endregion


    type IntegrationsLogsPostStatusCode200Response = {
      content:IntegrationLogsSuccessResponse;
      
    }

    type IntegrationsLogsPostStatusCode400Response = {
      content:DetailedError;
      
    }

    type IntegrationsLogsPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type IntegrationsLogsPostResult = IntegrationsLogsPostStatusCode200 of IntegrationsLogsPostStatusCode200Response|IntegrationsLogsPostStatusCode400 of IntegrationsLogsPostStatusCode400Response|IntegrationsLogsPostDefaultStatusCode of IntegrationsLogsPostDefaultStatusCodeResponse

    type IntegrationsLogsPostArgs = {
      bodyParams:IntegrationsLogsPostBodyParams
    }
