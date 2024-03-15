namespace OpenAPI

open OpenAPI.Model.ConversionEventResponse
open OpenAPI.Model.ConversionTagCreate
open OpenAPI.Model.ConversionTagListResponse
open OpenAPI.Model.ConversionTagResponse
open OpenAPI.Model.Error
open System.Collections.Generic
open OpenAPI.Model.PageVisitConversionTagsGet200Response
open System.Collections.Generic
open System

module ConversionTagsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ConversionTagsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ConversionTagsCreateBodyParams = ConversionTagCreate
    //#endregion


    type ConversionTagsCreateStatusCode200Response = {
      content:ConversionTagResponse;
      
    }

    type ConversionTagsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ConversionTagsCreateResult = ConversionTagsCreateStatusCode200 of ConversionTagsCreateStatusCode200Response|ConversionTagsCreateDefaultStatusCode of ConversionTagsCreateDefaultStatusCodeResponse

    type ConversionTagsCreateArgs = {
      pathParams:ConversionTagsCreatePathParams;
      bodyParams:ConversionTagsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConversionTagsGetPathParams = {
      adAccountId : string ;
    //#endregion
      conversionTagId : string ;
    }
    //#endregion


    type ConversionTagsGetStatusCode200Response = {
      content:ConversionTagResponse;
      
    }

    type ConversionTagsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ConversionTagsGetResult = ConversionTagsGetStatusCode200 of ConversionTagsGetStatusCode200Response|ConversionTagsGetDefaultStatusCode of ConversionTagsGetDefaultStatusCodeResponse

    type ConversionTagsGetArgs = {
      pathParams:ConversionTagsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConversionTagsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ConversionTagsListQueryParams = {
      filterDeleted : bool option;

    }
    //#endregion


    type ConversionTagsListStatusCode200Response = {
      content:ConversionTagListResponse;
      
    }

    type ConversionTagsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ConversionTagsListResult = ConversionTagsListStatusCode200 of ConversionTagsListStatusCode200Response|ConversionTagsListDefaultStatusCode of ConversionTagsListDefaultStatusCodeResponse

    type ConversionTagsListArgs = {
      pathParams:ConversionTagsListPathParams;
      queryParams:Result<ConversionTagsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type OcpmEligibleConversionTagsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion


    type OcpmEligibleConversionTagsGetStatusCode200Response = {
      content:IDictionary<string, ConversionEventResponse[]>;
      
    }

    type OcpmEligibleConversionTagsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type OcpmEligibleConversionTagsGetResult = OcpmEligibleConversionTagsGetStatusCode200 of OcpmEligibleConversionTagsGetStatusCode200Response|OcpmEligibleConversionTagsGetDefaultStatusCode of OcpmEligibleConversionTagsGetDefaultStatusCodeResponse

    type OcpmEligibleConversionTagsGetArgs = {
      pathParams:OcpmEligibleConversionTagsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PageVisitConversionTagsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PageVisitConversionTagsGetQueryParams = {
      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type PageVisitConversionTagsGetStatusCode200Response = {
      content:PageVisitConversionTagsGet200Response;
      
    }

    type PageVisitConversionTagsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PageVisitConversionTagsGetResult = PageVisitConversionTagsGetStatusCode200 of PageVisitConversionTagsGetStatusCode200Response|PageVisitConversionTagsGetDefaultStatusCode of PageVisitConversionTagsGetDefaultStatusCodeResponse

    type PageVisitConversionTagsGetArgs = {
      pathParams:PageVisitConversionTagsGetPathParams;
      queryParams:Result<PageVisitConversionTagsGetQueryParams,string>;
    }
