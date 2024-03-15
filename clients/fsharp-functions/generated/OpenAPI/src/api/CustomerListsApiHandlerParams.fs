namespace OpenAPI

open OpenAPI.Model.CustomerList
open OpenAPI.Model.CustomerListRequest
open OpenAPI.Model.CustomerListUpdateRequest
open OpenAPI.Model.CustomerListsList200Response
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module CustomerListsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CustomerListsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CustomerListsCreateBodyParams = CustomerListRequest
    //#endregion


    type CustomerListsCreateStatusCode200Response = {
      content:CustomerList;
      
    }

    type CustomerListsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CustomerListsCreateResult = CustomerListsCreateStatusCode200 of CustomerListsCreateStatusCode200Response|CustomerListsCreateDefaultStatusCode of CustomerListsCreateDefaultStatusCodeResponse

    type CustomerListsCreateArgs = {
      pathParams:CustomerListsCreatePathParams;
      bodyParams:CustomerListsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CustomerListsGetPathParams = {
      adAccountId : string ;
    //#endregion
      customerListId : string ;
    }
    //#endregion


    type CustomerListsGetStatusCode200Response = {
      content:CustomerList;
      
    }

    type CustomerListsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CustomerListsGetResult = CustomerListsGetStatusCode200 of CustomerListsGetStatusCode200Response|CustomerListsGetDefaultStatusCode of CustomerListsGetDefaultStatusCodeResponse

    type CustomerListsGetArgs = {
      pathParams:CustomerListsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CustomerListsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CustomerListsListQueryParams = {
      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type CustomerListsListStatusCode200Response = {
      content:CustomerListsList200Response;
      
    }

    type CustomerListsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CustomerListsListResult = CustomerListsListStatusCode200 of CustomerListsListStatusCode200Response|CustomerListsListDefaultStatusCode of CustomerListsListDefaultStatusCodeResponse

    type CustomerListsListArgs = {
      pathParams:CustomerListsListPathParams;
      queryParams:Result<CustomerListsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CustomerListsUpdatePathParams = {
      adAccountId : string ;
    //#endregion
      customerListId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CustomerListsUpdateBodyParams = CustomerListUpdateRequest
    //#endregion


    type CustomerListsUpdateStatusCode200Response = {
      content:CustomerList;
      
    }

    type CustomerListsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CustomerListsUpdateResult = CustomerListsUpdateStatusCode200 of CustomerListsUpdateStatusCode200Response|CustomerListsUpdateDefaultStatusCode of CustomerListsUpdateDefaultStatusCodeResponse

    type CustomerListsUpdateArgs = {
      pathParams:CustomerListsUpdatePathParams;
      bodyParams:CustomerListsUpdateBodyParams
    }
