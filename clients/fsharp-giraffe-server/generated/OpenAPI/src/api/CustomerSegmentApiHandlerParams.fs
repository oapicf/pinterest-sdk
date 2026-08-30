namespace OpenAPI

open OpenAPI.Model.CustomerSegment
open OpenAPI.Model.CustomerSegmentCreate
open OpenAPI.Model.CustomerSegmentList200Response
open OpenAPI.Model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open System.Collections.Generic
open System

module CustomerSegmentApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CustomerSegmentCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CustomerSegmentCreateBodyParams = CustomerSegmentCreate
    //#endregion


    type CustomerSegmentCreateStatusCode200Response = {
      content:CustomerSegment;
      
    }

    type CustomerSegmentCreateStatusCode201Response = {
      content:CustomerSegment;
      
    }

    type CustomerSegmentCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerSegmentCreateResult = CustomerSegmentCreateStatusCode200 of CustomerSegmentCreateStatusCode200Response|CustomerSegmentCreateStatusCode201 of CustomerSegmentCreateStatusCode201Response|CustomerSegmentCreateStatusCode400 of CustomerSegmentCreateStatusCode400Response|CustomerSegmentCreateStatusCode401 of CustomerSegmentCreateStatusCode401Response|CustomerSegmentCreateStatusCode403 of CustomerSegmentCreateStatusCode403Response|CustomerSegmentCreateStatusCode404 of CustomerSegmentCreateStatusCode404Response|CustomerSegmentCreateStatusCode429 of CustomerSegmentCreateStatusCode429Response|CustomerSegmentCreateDefaultStatusCode of CustomerSegmentCreateDefaultStatusCodeResponse

    type CustomerSegmentCreateArgs = {
      pathParams:CustomerSegmentCreatePathParams;
      bodyParams:CustomerSegmentCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CustomerSegmentListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CustomerSegmentListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      includeSizing : bool option;


      searchQuery : string option;

    }
    //#endregion


    type CustomerSegmentListStatusCode200Response = {
      content:CustomerSegmentList200Response;
      
    }

    type CustomerSegmentListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerSegmentListResult = CustomerSegmentListStatusCode200 of CustomerSegmentListStatusCode200Response|CustomerSegmentListStatusCode400 of CustomerSegmentListStatusCode400Response|CustomerSegmentListStatusCode401 of CustomerSegmentListStatusCode401Response|CustomerSegmentListStatusCode403 of CustomerSegmentListStatusCode403Response|CustomerSegmentListStatusCode404 of CustomerSegmentListStatusCode404Response|CustomerSegmentListStatusCode429 of CustomerSegmentListStatusCode429Response|CustomerSegmentListDefaultStatusCode of CustomerSegmentListDefaultStatusCodeResponse

    type CustomerSegmentListArgs = {
      pathParams:CustomerSegmentListPathParams;
      queryParams:Result<CustomerSegmentListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CustomerSegmentUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CustomerSegmentUpdateBodyParams = CustomerSegmentUpdateRequestUpdateWithRequiredBody
    //#endregion


    type CustomerSegmentUpdateStatusCode200Response = {
      content:string;
      
    }

    type CustomerSegmentUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerSegmentUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerSegmentUpdateResult = CustomerSegmentUpdateStatusCode200 of CustomerSegmentUpdateStatusCode200Response|CustomerSegmentUpdateStatusCode400 of CustomerSegmentUpdateStatusCode400Response|CustomerSegmentUpdateStatusCode401 of CustomerSegmentUpdateStatusCode401Response|CustomerSegmentUpdateStatusCode403 of CustomerSegmentUpdateStatusCode403Response|CustomerSegmentUpdateStatusCode404 of CustomerSegmentUpdateStatusCode404Response|CustomerSegmentUpdateStatusCode429 of CustomerSegmentUpdateStatusCode429Response|CustomerSegmentUpdateDefaultStatusCode of CustomerSegmentUpdateDefaultStatusCodeResponse

    type CustomerSegmentUpdateArgs = {
      pathParams:CustomerSegmentUpdatePathParams;
      bodyParams:CustomerSegmentUpdateBodyParams
    }
