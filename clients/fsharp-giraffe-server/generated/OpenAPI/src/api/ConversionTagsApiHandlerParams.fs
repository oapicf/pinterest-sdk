namespace OpenAPI

open OpenAPI.Model.ConversionEventResponse
open OpenAPI.Model.ConversionTag
open OpenAPI.Model.ConversionTagCreate
open OpenAPI.Model.ConversionTagsList200Response
open System.Collections.Generic
open OpenAPI.Model.PageVisitConversionTagsGet200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
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
      content:ConversionTag;
      
    }

    type ConversionTagsCreateStatusCode201Response = {
      content:ConversionTag;
      
    }

    type ConversionTagsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionTagsCreateResult = ConversionTagsCreateStatusCode200 of ConversionTagsCreateStatusCode200Response|ConversionTagsCreateStatusCode201 of ConversionTagsCreateStatusCode201Response|ConversionTagsCreateStatusCode400 of ConversionTagsCreateStatusCode400Response|ConversionTagsCreateStatusCode401 of ConversionTagsCreateStatusCode401Response|ConversionTagsCreateStatusCode403 of ConversionTagsCreateStatusCode403Response|ConversionTagsCreateStatusCode404 of ConversionTagsCreateStatusCode404Response|ConversionTagsCreateStatusCode429 of ConversionTagsCreateStatusCode429Response|ConversionTagsCreateDefaultStatusCode of ConversionTagsCreateDefaultStatusCodeResponse

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
      content:ConversionTag;
      
    }

    type ConversionTagsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionTagsGetResult = ConversionTagsGetStatusCode200 of ConversionTagsGetStatusCode200Response|ConversionTagsGetStatusCode400 of ConversionTagsGetStatusCode400Response|ConversionTagsGetStatusCode401 of ConversionTagsGetStatusCode401Response|ConversionTagsGetStatusCode403 of ConversionTagsGetStatusCode403Response|ConversionTagsGetStatusCode404 of ConversionTagsGetStatusCode404Response|ConversionTagsGetStatusCode429 of ConversionTagsGetStatusCode429Response|ConversionTagsGetDefaultStatusCode of ConversionTagsGetDefaultStatusCodeResponse

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
      content:ConversionTagsList200Response;
      
    }

    type ConversionTagsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionTagsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionTagsListResult = ConversionTagsListStatusCode200 of ConversionTagsListStatusCode200Response|ConversionTagsListStatusCode400 of ConversionTagsListStatusCode400Response|ConversionTagsListStatusCode401 of ConversionTagsListStatusCode401Response|ConversionTagsListStatusCode403 of ConversionTagsListStatusCode403Response|ConversionTagsListStatusCode404 of ConversionTagsListStatusCode404Response|ConversionTagsListStatusCode429 of ConversionTagsListStatusCode429Response|ConversionTagsListDefaultStatusCode of ConversionTagsListDefaultStatusCodeResponse

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

    type OcpmEligibleConversionTagsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type OcpmEligibleConversionTagsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type OcpmEligibleConversionTagsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type OcpmEligibleConversionTagsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type OcpmEligibleConversionTagsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type OcpmEligibleConversionTagsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type OcpmEligibleConversionTagsGetResult = OcpmEligibleConversionTagsGetStatusCode200 of OcpmEligibleConversionTagsGetStatusCode200Response|OcpmEligibleConversionTagsGetStatusCode400 of OcpmEligibleConversionTagsGetStatusCode400Response|OcpmEligibleConversionTagsGetStatusCode401 of OcpmEligibleConversionTagsGetStatusCode401Response|OcpmEligibleConversionTagsGetStatusCode403 of OcpmEligibleConversionTagsGetStatusCode403Response|OcpmEligibleConversionTagsGetStatusCode404 of OcpmEligibleConversionTagsGetStatusCode404Response|OcpmEligibleConversionTagsGetStatusCode429 of OcpmEligibleConversionTagsGetStatusCode429Response|OcpmEligibleConversionTagsGetDefaultStatusCode of OcpmEligibleConversionTagsGetDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;

    }
    //#endregion


    type PageVisitConversionTagsGetStatusCode200Response = {
      content:PageVisitConversionTagsGet200Response;
      
    }

    type PageVisitConversionTagsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PageVisitConversionTagsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PageVisitConversionTagsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PageVisitConversionTagsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PageVisitConversionTagsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PageVisitConversionTagsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PageVisitConversionTagsGetResult = PageVisitConversionTagsGetStatusCode200 of PageVisitConversionTagsGetStatusCode200Response|PageVisitConversionTagsGetStatusCode400 of PageVisitConversionTagsGetStatusCode400Response|PageVisitConversionTagsGetStatusCode401 of PageVisitConversionTagsGetStatusCode401Response|PageVisitConversionTagsGetStatusCode403 of PageVisitConversionTagsGetStatusCode403Response|PageVisitConversionTagsGetStatusCode404 of PageVisitConversionTagsGetStatusCode404Response|PageVisitConversionTagsGetStatusCode429 of PageVisitConversionTagsGetStatusCode429Response|PageVisitConversionTagsGetDefaultStatusCode of PageVisitConversionTagsGetDefaultStatusCodeResponse

    type PageVisitConversionTagsGetArgs = {
      pathParams:PageVisitConversionTagsGetPathParams;
      queryParams:Result<PageVisitConversionTagsGetQueryParams,string>;
    }
