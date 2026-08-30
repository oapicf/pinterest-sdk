namespace OpenAPI

open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLinesList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open System.Collections.Generic
open System

module OrderLinesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type OrderLinesGetPathParams = {
      orderLineId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type OrderLinesGetStatusCode200Response = {
      content:OrderLine;
      
    }

    type OrderLinesGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type OrderLinesGetResult = OrderLinesGetStatusCode200 of OrderLinesGetStatusCode200Response|OrderLinesGetStatusCode400 of OrderLinesGetStatusCode400Response|OrderLinesGetStatusCode401 of OrderLinesGetStatusCode401Response|OrderLinesGetStatusCode403 of OrderLinesGetStatusCode403Response|OrderLinesGetStatusCode404 of OrderLinesGetStatusCode404Response|OrderLinesGetStatusCode429 of OrderLinesGetStatusCode429Response|OrderLinesGetDefaultStatusCode of OrderLinesGetDefaultStatusCodeResponse

    type OrderLinesGetArgs = {
      pathParams:OrderLinesGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type OrderLinesListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type OrderLinesListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;

    }
    //#endregion


    type OrderLinesListStatusCode200Response = {
      content:OrderLinesList200Response;
      
    }

    type OrderLinesListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type OrderLinesListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type OrderLinesListResult = OrderLinesListStatusCode200 of OrderLinesListStatusCode200Response|OrderLinesListStatusCode400 of OrderLinesListStatusCode400Response|OrderLinesListStatusCode401 of OrderLinesListStatusCode401Response|OrderLinesListStatusCode403 of OrderLinesListStatusCode403Response|OrderLinesListStatusCode404 of OrderLinesListStatusCode404Response|OrderLinesListStatusCode429 of OrderLinesListStatusCode429Response|OrderLinesListDefaultStatusCode of OrderLinesListDefaultStatusCodeResponse

    type OrderLinesListArgs = {
      pathParams:OrderLinesListPathParams;
      queryParams:Result<OrderLinesListQueryParams,string>;
    }
