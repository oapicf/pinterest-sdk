namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLinesList200Response
open System.Collections.Generic
open System

module OrderLinesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type OrderLinesGetPathParams = {
      adAccountId : string ;
    //#endregion
      orderLineId : string ;
    }
    //#endregion


    type OrderLinesGetStatusCode200Response = {
      content:OrderLine;
      
    }

    type OrderLinesGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type OrderLinesGetResult = OrderLinesGetStatusCode200 of OrderLinesGetStatusCode200Response|OrderLinesGetDefaultStatusCode of OrderLinesGetDefaultStatusCodeResponse

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
      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type OrderLinesListStatusCode200Response = {
      content:OrderLinesList200Response;
      
    }

    type OrderLinesListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type OrderLinesListResult = OrderLinesListStatusCode200 of OrderLinesListStatusCode200Response|OrderLinesListDefaultStatusCode of OrderLinesListDefaultStatusCodeResponse

    type OrderLinesListArgs = {
      pathParams:OrderLinesListPathParams;
      queryParams:Result<OrderLinesListQueryParams,string>;
    }
