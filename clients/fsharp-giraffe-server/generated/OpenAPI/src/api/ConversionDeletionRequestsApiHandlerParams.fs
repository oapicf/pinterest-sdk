namespace OpenAPI

open OpenAPI.Model.ConversionDeletionRequest
open OpenAPI.Model.ConversionDeletionRequestCreate
open OpenAPI.Model.ConversionDeletionRequestList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open System.Collections.Generic
open System

module ConversionDeletionRequestsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ConversionDeletionRequestCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ConversionDeletionRequestCreateBodyParams = ConversionDeletionRequestCreate
    //#endregion


    type ConversionDeletionRequestCreateStatusCode200Response = {
      content:ConversionDeletionRequest;
      
    }

    type ConversionDeletionRequestCreateStatusCode201Response = {
      content:ConversionDeletionRequest;
      
    }

    type ConversionDeletionRequestCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionDeletionRequestCreateResult = ConversionDeletionRequestCreateStatusCode200 of ConversionDeletionRequestCreateStatusCode200Response|ConversionDeletionRequestCreateStatusCode201 of ConversionDeletionRequestCreateStatusCode201Response|ConversionDeletionRequestCreateStatusCode400 of ConversionDeletionRequestCreateStatusCode400Response|ConversionDeletionRequestCreateStatusCode401 of ConversionDeletionRequestCreateStatusCode401Response|ConversionDeletionRequestCreateStatusCode403 of ConversionDeletionRequestCreateStatusCode403Response|ConversionDeletionRequestCreateStatusCode404 of ConversionDeletionRequestCreateStatusCode404Response|ConversionDeletionRequestCreateStatusCode429 of ConversionDeletionRequestCreateStatusCode429Response|ConversionDeletionRequestCreateDefaultStatusCode of ConversionDeletionRequestCreateDefaultStatusCodeResponse

    type ConversionDeletionRequestCreateArgs = {
      pathParams:ConversionDeletionRequestCreatePathParams;
      bodyParams:ConversionDeletionRequestCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConversionDeletionRequestDeletePathParams = {
      requestId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type ConversionDeletionRequestDeleteStatusCode200Response = {
      content:ConversionDeletionRequest;
      
    }

    type ConversionDeletionRequestDeleteStatusCode204Response = {
      content:string;
      
    }

    type ConversionDeletionRequestDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionDeletionRequestDeleteResult = ConversionDeletionRequestDeleteStatusCode200 of ConversionDeletionRequestDeleteStatusCode200Response|ConversionDeletionRequestDeleteStatusCode204 of ConversionDeletionRequestDeleteStatusCode204Response|ConversionDeletionRequestDeleteStatusCode400 of ConversionDeletionRequestDeleteStatusCode400Response|ConversionDeletionRequestDeleteStatusCode401 of ConversionDeletionRequestDeleteStatusCode401Response|ConversionDeletionRequestDeleteStatusCode403 of ConversionDeletionRequestDeleteStatusCode403Response|ConversionDeletionRequestDeleteStatusCode404 of ConversionDeletionRequestDeleteStatusCode404Response|ConversionDeletionRequestDeleteStatusCode429 of ConversionDeletionRequestDeleteStatusCode429Response|ConversionDeletionRequestDeleteDefaultStatusCode of ConversionDeletionRequestDeleteDefaultStatusCodeResponse

    type ConversionDeletionRequestDeleteArgs = {
      pathParams:ConversionDeletionRequestDeletePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConversionDeletionRequestGetPathParams = {
      requestId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type ConversionDeletionRequestGetStatusCode200Response = {
      content:ConversionDeletionRequest;
      
    }

    type ConversionDeletionRequestGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionDeletionRequestGetResult = ConversionDeletionRequestGetStatusCode200 of ConversionDeletionRequestGetStatusCode200Response|ConversionDeletionRequestGetStatusCode400 of ConversionDeletionRequestGetStatusCode400Response|ConversionDeletionRequestGetStatusCode401 of ConversionDeletionRequestGetStatusCode401Response|ConversionDeletionRequestGetStatusCode403 of ConversionDeletionRequestGetStatusCode403Response|ConversionDeletionRequestGetStatusCode404 of ConversionDeletionRequestGetStatusCode404Response|ConversionDeletionRequestGetStatusCode429 of ConversionDeletionRequestGetStatusCode429Response|ConversionDeletionRequestGetDefaultStatusCode of ConversionDeletionRequestGetDefaultStatusCodeResponse

    type ConversionDeletionRequestGetArgs = {
      pathParams:ConversionDeletionRequestGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConversionDeletionRequestListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ConversionDeletionRequestListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;

    }
    //#endregion


    type ConversionDeletionRequestListStatusCode200Response = {
      content:ConversionDeletionRequestList200Response;
      
    }

    type ConversionDeletionRequestListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionDeletionRequestListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionDeletionRequestListResult = ConversionDeletionRequestListStatusCode200 of ConversionDeletionRequestListStatusCode200Response|ConversionDeletionRequestListStatusCode400 of ConversionDeletionRequestListStatusCode400Response|ConversionDeletionRequestListStatusCode401 of ConversionDeletionRequestListStatusCode401Response|ConversionDeletionRequestListStatusCode403 of ConversionDeletionRequestListStatusCode403Response|ConversionDeletionRequestListStatusCode404 of ConversionDeletionRequestListStatusCode404Response|ConversionDeletionRequestListStatusCode429 of ConversionDeletionRequestListStatusCode429Response|ConversionDeletionRequestListDefaultStatusCode of ConversionDeletionRequestListDefaultStatusCodeResponse

    type ConversionDeletionRequestListArgs = {
      pathParams:ConversionDeletionRequestListPathParams;
      queryParams:Result<ConversionDeletionRequestListQueryParams,string>;
    }
