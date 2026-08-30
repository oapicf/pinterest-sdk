namespace OpenAPI

open OpenAPI.Model.CustomerList
open OpenAPI.Model.CustomerListCreate
open OpenAPI.Model.CustomerListUpdateWithRequiredBody
open OpenAPI.Model.CustomerListsList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
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
    type CustomerListsCreateBodyParams = CustomerListCreate
    //#endregion


    type CustomerListsCreateStatusCode200Response = {
      content:CustomerList;
      
    }

    type CustomerListsCreateStatusCode201Response = {
      content:CustomerList;
      
    }

    type CustomerListsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerListsCreateResult = CustomerListsCreateStatusCode200 of CustomerListsCreateStatusCode200Response|CustomerListsCreateStatusCode201 of CustomerListsCreateStatusCode201Response|CustomerListsCreateStatusCode400 of CustomerListsCreateStatusCode400Response|CustomerListsCreateStatusCode401 of CustomerListsCreateStatusCode401Response|CustomerListsCreateStatusCode403 of CustomerListsCreateStatusCode403Response|CustomerListsCreateStatusCode404 of CustomerListsCreateStatusCode404Response|CustomerListsCreateStatusCode429 of CustomerListsCreateStatusCode429Response|CustomerListsCreateDefaultStatusCode of CustomerListsCreateDefaultStatusCodeResponse

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

    type CustomerListsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerListsGetResult = CustomerListsGetStatusCode200 of CustomerListsGetStatusCode200Response|CustomerListsGetStatusCode400 of CustomerListsGetStatusCode400Response|CustomerListsGetStatusCode401 of CustomerListsGetStatusCode401Response|CustomerListsGetStatusCode403 of CustomerListsGetStatusCode403Response|CustomerListsGetStatusCode404 of CustomerListsGetStatusCode404Response|CustomerListsGetStatusCode429 of CustomerListsGetStatusCode429Response|CustomerListsGetDefaultStatusCode of CustomerListsGetDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      excludeNca : bool option;

    }
    //#endregion


    type CustomerListsListStatusCode200Response = {
      content:CustomerListsList200Response;
      
    }

    type CustomerListsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerListsListResult = CustomerListsListStatusCode200 of CustomerListsListStatusCode200Response|CustomerListsListStatusCode400 of CustomerListsListStatusCode400Response|CustomerListsListStatusCode401 of CustomerListsListStatusCode401Response|CustomerListsListStatusCode403 of CustomerListsListStatusCode403Response|CustomerListsListStatusCode404 of CustomerListsListStatusCode404Response|CustomerListsListStatusCode429 of CustomerListsListStatusCode429Response|CustomerListsListDefaultStatusCode of CustomerListsListDefaultStatusCodeResponse

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
    type CustomerListsUpdateBodyParams = CustomerListUpdateWithRequiredBody
    //#endregion


    type CustomerListsUpdateStatusCode200Response = {
      content:CustomerList;
      
    }

    type CustomerListsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerListsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerListsUpdateResult = CustomerListsUpdateStatusCode200 of CustomerListsUpdateStatusCode200Response|CustomerListsUpdateStatusCode400 of CustomerListsUpdateStatusCode400Response|CustomerListsUpdateStatusCode401 of CustomerListsUpdateStatusCode401Response|CustomerListsUpdateStatusCode403 of CustomerListsUpdateStatusCode403Response|CustomerListsUpdateStatusCode404 of CustomerListsUpdateStatusCode404Response|CustomerListsUpdateStatusCode429 of CustomerListsUpdateStatusCode429Response|CustomerListsUpdateDefaultStatusCode of CustomerListsUpdateDefaultStatusCodeResponse

    type CustomerListsUpdateArgs = {
      pathParams:CustomerListsUpdatePathParams;
      bodyParams:CustomerListsUpdateBodyParams
    }
