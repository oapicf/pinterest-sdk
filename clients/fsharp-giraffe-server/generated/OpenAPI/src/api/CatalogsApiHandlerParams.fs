namespace OpenAPI

open OpenAPI.Model.Catalog
open OpenAPI.Model.CatalogsCreateReportResponse
open OpenAPI.Model.CatalogsCreateRequest
open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.CatalogsFeedIngestion
open OpenAPI.Model.CatalogsItemValidationIssue
open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsFilters
open OpenAPI.Model.CatalogsItemsRequest
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCountsVertical
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.CatalogsReport
open OpenAPI.Model.CatalogsReportParameters
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.Error
open OpenAPI.Model.FeedProcessingResultsList200Response
open OpenAPI.Model.FeedsCreateRequest
open OpenAPI.Model.FeedsList200Response
open OpenAPI.Model.FeedsUpdateRequest
open OpenAPI.Model.ItemsBatchPostRequest
open OpenAPI.Model.ItemsIssuesList200Response
open OpenAPI.Model.MultipleProductGroupsInner
open OpenAPI.Model.ReportsStats200Response
open System.Collections.Generic
open System

module CatalogsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type CatalogsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsCreateBodyParams = CatalogsCreateRequest
    //#endregion


    type CatalogsCreateStatusCode200Response = {
      content:Catalog;
      
    }

    type CatalogsCreateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsCreateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsCreateResult = CatalogsCreateStatusCode200 of CatalogsCreateStatusCode200Response|CatalogsCreateStatusCode400 of CatalogsCreateStatusCode400Response|CatalogsCreateStatusCode401 of CatalogsCreateStatusCode401Response|CatalogsCreateDefaultStatusCode of CatalogsCreateDefaultStatusCodeResponse

    type CatalogsCreateArgs = {
      queryParams:Result<CatalogsCreateQueryParams,string>;
      bodyParams:CatalogsCreateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsListStatusCode200Response = {
      content:CatalogsList200Response;
      
    }

    type CatalogsListStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsListStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsListResult = CatalogsListStatusCode200 of CatalogsListStatusCode200Response|CatalogsListStatusCode400 of CatalogsListStatusCode400Response|CatalogsListStatusCode401 of CatalogsListStatusCode401Response|CatalogsListDefaultStatusCode of CatalogsListDefaultStatusCodeResponse

    type CatalogsListArgs = {
      queryParams:Result<CatalogsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupPinsListPathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupPinsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;


      pinMetrics : bool option;

    }
    //#endregion


    type CatalogsProductGroupPinsListStatusCode200Response = {
      content:CatalogsProductGroupPinsList200Response;
      
    }

    type CatalogsProductGroupPinsListStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupPinsListStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupPinsListStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupPinsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupPinsListResult = CatalogsProductGroupPinsListStatusCode200 of CatalogsProductGroupPinsListStatusCode200Response|CatalogsProductGroupPinsListStatusCode400 of CatalogsProductGroupPinsListStatusCode400Response|CatalogsProductGroupPinsListStatusCode401 of CatalogsProductGroupPinsListStatusCode401Response|CatalogsProductGroupPinsListStatusCode404 of CatalogsProductGroupPinsListStatusCode404Response|CatalogsProductGroupPinsListDefaultStatusCode of CatalogsProductGroupPinsListDefaultStatusCodeResponse

    type CatalogsProductGroupPinsListArgs = {
      pathParams:CatalogsProductGroupPinsListPathParams;
      queryParams:Result<CatalogsProductGroupPinsListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateBodyParams = MultipleProductGroupsInner
    //#endregion


    type CatalogsProductGroupsCreateStatusCode201Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsCreateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsCreateResult = CatalogsProductGroupsCreateStatusCode201 of CatalogsProductGroupsCreateStatusCode201Response|CatalogsProductGroupsCreateStatusCode400 of CatalogsProductGroupsCreateStatusCode400Response|CatalogsProductGroupsCreateStatusCode401 of CatalogsProductGroupsCreateStatusCode401Response|CatalogsProductGroupsCreateStatusCode403 of CatalogsProductGroupsCreateStatusCode403Response|CatalogsProductGroupsCreateStatusCode409 of CatalogsProductGroupsCreateStatusCode409Response|CatalogsProductGroupsCreateDefaultStatusCode of CatalogsProductGroupsCreateDefaultStatusCodeResponse

    type CatalogsProductGroupsCreateArgs = {
      queryParams:Result<CatalogsProductGroupsCreateQueryParams,string>;
      bodyParams:CatalogsProductGroupsCreateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateManyQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateManyBodyParams = MultipleProductGroupsInner[]
    //#endregion


    type CatalogsProductGroupsCreateManyStatusCode201Response = {
      content:string[];
      
    }

    type CatalogsProductGroupsCreateManyStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsCreateManyResult = CatalogsProductGroupsCreateManyStatusCode201 of CatalogsProductGroupsCreateManyStatusCode201Response|CatalogsProductGroupsCreateManyStatusCode400 of CatalogsProductGroupsCreateManyStatusCode400Response|CatalogsProductGroupsCreateManyStatusCode401 of CatalogsProductGroupsCreateManyStatusCode401Response|CatalogsProductGroupsCreateManyStatusCode403 of CatalogsProductGroupsCreateManyStatusCode403Response|CatalogsProductGroupsCreateManyStatusCode409 of CatalogsProductGroupsCreateManyStatusCode409Response|CatalogsProductGroupsCreateManyDefaultStatusCode of CatalogsProductGroupsCreateManyDefaultStatusCodeResponse

    type CatalogsProductGroupsCreateManyArgs = {
      queryParams:Result<CatalogsProductGroupsCreateManyQueryParams,string>;
      bodyParams:CatalogsProductGroupsCreateManyBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsDeletePathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsDeleteQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsDeleteStatusCode204Response = {
      content:string;
      
    }

    type CatalogsProductGroupsDeleteStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsDeleteResult = CatalogsProductGroupsDeleteStatusCode204 of CatalogsProductGroupsDeleteStatusCode204Response|CatalogsProductGroupsDeleteStatusCode400 of CatalogsProductGroupsDeleteStatusCode400Response|CatalogsProductGroupsDeleteStatusCode401 of CatalogsProductGroupsDeleteStatusCode401Response|CatalogsProductGroupsDeleteStatusCode403 of CatalogsProductGroupsDeleteStatusCode403Response|CatalogsProductGroupsDeleteStatusCode404 of CatalogsProductGroupsDeleteStatusCode404Response|CatalogsProductGroupsDeleteStatusCode409 of CatalogsProductGroupsDeleteStatusCode409Response|CatalogsProductGroupsDeleteDefaultStatusCode of CatalogsProductGroupsDeleteDefaultStatusCodeResponse

    type CatalogsProductGroupsDeleteArgs = {
      pathParams:CatalogsProductGroupsDeletePathParams;
      queryParams:Result<CatalogsProductGroupsDeleteQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsDeleteManyQueryParams = {
      id : int[] ;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsDeleteManyStatusCode204Response = {
      content:string;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsDeleteManyResult = CatalogsProductGroupsDeleteManyStatusCode204 of CatalogsProductGroupsDeleteManyStatusCode204Response|CatalogsProductGroupsDeleteManyStatusCode401 of CatalogsProductGroupsDeleteManyStatusCode401Response|CatalogsProductGroupsDeleteManyStatusCode403 of CatalogsProductGroupsDeleteManyStatusCode403Response|CatalogsProductGroupsDeleteManyStatusCode404 of CatalogsProductGroupsDeleteManyStatusCode404Response|CatalogsProductGroupsDeleteManyStatusCode409 of CatalogsProductGroupsDeleteManyStatusCode409Response|CatalogsProductGroupsDeleteManyDefaultStatusCode of CatalogsProductGroupsDeleteManyDefaultStatusCodeResponse

    type CatalogsProductGroupsDeleteManyArgs = {
      queryParams:Result<CatalogsProductGroupsDeleteManyQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsGetPathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsGetStatusCode200Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsGetStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsGetResult = CatalogsProductGroupsGetStatusCode200 of CatalogsProductGroupsGetStatusCode200Response|CatalogsProductGroupsGetStatusCode400 of CatalogsProductGroupsGetStatusCode400Response|CatalogsProductGroupsGetStatusCode401 of CatalogsProductGroupsGetStatusCode401Response|CatalogsProductGroupsGetStatusCode403 of CatalogsProductGroupsGetStatusCode403Response|CatalogsProductGroupsGetStatusCode404 of CatalogsProductGroupsGetStatusCode404Response|CatalogsProductGroupsGetStatusCode409 of CatalogsProductGroupsGetStatusCode409Response|CatalogsProductGroupsGetDefaultStatusCode of CatalogsProductGroupsGetDefaultStatusCodeResponse

    type CatalogsProductGroupsGetArgs = {
      pathParams:CatalogsProductGroupsGetPathParams;
      queryParams:Result<CatalogsProductGroupsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsListQueryParams = {
      id : int[] option;


      feedId : string option;


      catalogId : string option;


      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsListStatusCode200Response = {
      content:CatalogsProductGroupsList200Response;
      
    }

    type CatalogsProductGroupsListStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsListResult = CatalogsProductGroupsListStatusCode200 of CatalogsProductGroupsListStatusCode200Response|CatalogsProductGroupsListStatusCode400 of CatalogsProductGroupsListStatusCode400Response|CatalogsProductGroupsListStatusCode401 of CatalogsProductGroupsListStatusCode401Response|CatalogsProductGroupsListStatusCode403 of CatalogsProductGroupsListStatusCode403Response|CatalogsProductGroupsListStatusCode404 of CatalogsProductGroupsListStatusCode404Response|CatalogsProductGroupsListStatusCode409 of CatalogsProductGroupsListStatusCode409Response|CatalogsProductGroupsListDefaultStatusCode of CatalogsProductGroupsListDefaultStatusCodeResponse

    type CatalogsProductGroupsListArgs = {
      queryParams:Result<CatalogsProductGroupsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsProductCountsGetPathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsProductCountsGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsProductCountsGetStatusCode200Response = {
      content:CatalogsProductGroupProductCountsVertical;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsProductCountsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsProductCountsGetResult = CatalogsProductGroupsProductCountsGetStatusCode200 of CatalogsProductGroupsProductCountsGetStatusCode200Response|CatalogsProductGroupsProductCountsGetStatusCode404 of CatalogsProductGroupsProductCountsGetStatusCode404Response|CatalogsProductGroupsProductCountsGetStatusCode409 of CatalogsProductGroupsProductCountsGetStatusCode409Response|CatalogsProductGroupsProductCountsGetDefaultStatusCode of CatalogsProductGroupsProductCountsGetDefaultStatusCodeResponse

    type CatalogsProductGroupsProductCountsGetArgs = {
      pathParams:CatalogsProductGroupsProductCountsGetPathParams;
      queryParams:Result<CatalogsProductGroupsProductCountsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdatePathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdateBodyParams = CatalogsProductGroupsUpdateRequest
    //#endregion


    type CatalogsProductGroupsUpdateStatusCode200Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsUpdateResult = CatalogsProductGroupsUpdateStatusCode200 of CatalogsProductGroupsUpdateStatusCode200Response|CatalogsProductGroupsUpdateStatusCode400 of CatalogsProductGroupsUpdateStatusCode400Response|CatalogsProductGroupsUpdateStatusCode401 of CatalogsProductGroupsUpdateStatusCode401Response|CatalogsProductGroupsUpdateStatusCode403 of CatalogsProductGroupsUpdateStatusCode403Response|CatalogsProductGroupsUpdateStatusCode404 of CatalogsProductGroupsUpdateStatusCode404Response|CatalogsProductGroupsUpdateStatusCode409 of CatalogsProductGroupsUpdateStatusCode409Response|CatalogsProductGroupsUpdateDefaultStatusCode of CatalogsProductGroupsUpdateDefaultStatusCodeResponse

    type CatalogsProductGroupsUpdateArgs = {
      pathParams:CatalogsProductGroupsUpdatePathParams;
      queryParams:Result<CatalogsProductGroupsUpdateQueryParams,string>;
      bodyParams:CatalogsProductGroupsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedProcessingResultsListPathParams = {
      feedId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type FeedProcessingResultsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;

    }
    //#endregion


    type FeedProcessingResultsListStatusCode200Response = {
      content:FeedProcessingResultsList200Response;
      
    }

    type FeedProcessingResultsListStatusCode400Response = {
      content:Error;
      
    }

    type FeedProcessingResultsListStatusCode401Response = {
      content:Error;
      
    }

    type FeedProcessingResultsListStatusCode404Response = {
      content:Error;
      
    }

    type FeedProcessingResultsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedProcessingResultsListResult = FeedProcessingResultsListStatusCode200 of FeedProcessingResultsListStatusCode200Response|FeedProcessingResultsListStatusCode400 of FeedProcessingResultsListStatusCode400Response|FeedProcessingResultsListStatusCode401 of FeedProcessingResultsListStatusCode401Response|FeedProcessingResultsListStatusCode404 of FeedProcessingResultsListStatusCode404Response|FeedProcessingResultsListDefaultStatusCode of FeedProcessingResultsListDefaultStatusCodeResponse

    type FeedProcessingResultsListArgs = {
      pathParams:FeedProcessingResultsListPathParams;
      queryParams:Result<FeedProcessingResultsListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type FeedsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type FeedsCreateBodyParams = FeedsCreateRequest
    //#endregion


    type FeedsCreateStatusCode201Response = {
      content:CatalogsFeed;
      
    }

    type FeedsCreateStatusCode400Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode401Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode403Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode409Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode422Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode501Response = {
      content:Error;
      
    }

    type FeedsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsCreateResult = FeedsCreateStatusCode201 of FeedsCreateStatusCode201Response|FeedsCreateStatusCode400 of FeedsCreateStatusCode400Response|FeedsCreateStatusCode401 of FeedsCreateStatusCode401Response|FeedsCreateStatusCode403 of FeedsCreateStatusCode403Response|FeedsCreateStatusCode409 of FeedsCreateStatusCode409Response|FeedsCreateStatusCode422 of FeedsCreateStatusCode422Response|FeedsCreateStatusCode501 of FeedsCreateStatusCode501Response|FeedsCreateDefaultStatusCode of FeedsCreateDefaultStatusCodeResponse

    type FeedsCreateArgs = {
      queryParams:Result<FeedsCreateQueryParams,string>;
      bodyParams:FeedsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedsDeletePathParams = {
      feedId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type FeedsDeleteQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type FeedsDeleteStatusCode204Response = {
      content:string;
      
    }

    type FeedsDeleteStatusCode400Response = {
      content:Error;
      
    }

    type FeedsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type FeedsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type FeedsDeleteStatusCode409Response = {
      content:Error;
      
    }

    type FeedsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsDeleteResult = FeedsDeleteStatusCode204 of FeedsDeleteStatusCode204Response|FeedsDeleteStatusCode400 of FeedsDeleteStatusCode400Response|FeedsDeleteStatusCode403 of FeedsDeleteStatusCode403Response|FeedsDeleteStatusCode404 of FeedsDeleteStatusCode404Response|FeedsDeleteStatusCode409 of FeedsDeleteStatusCode409Response|FeedsDeleteDefaultStatusCode of FeedsDeleteDefaultStatusCodeResponse

    type FeedsDeleteArgs = {
      pathParams:FeedsDeletePathParams;
      queryParams:Result<FeedsDeleteQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedsGetPathParams = {
      feedId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type FeedsGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type FeedsGetStatusCode200Response = {
      content:CatalogsFeed;
      
    }

    type FeedsGetStatusCode400Response = {
      content:Error;
      
    }

    type FeedsGetStatusCode401Response = {
      content:Error;
      
    }

    type FeedsGetStatusCode404Response = {
      content:Error;
      
    }

    type FeedsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsGetResult = FeedsGetStatusCode200 of FeedsGetStatusCode200Response|FeedsGetStatusCode400 of FeedsGetStatusCode400Response|FeedsGetStatusCode401 of FeedsGetStatusCode401Response|FeedsGetStatusCode404 of FeedsGetStatusCode404Response|FeedsGetDefaultStatusCode of FeedsGetDefaultStatusCodeResponse

    type FeedsGetArgs = {
      pathParams:FeedsGetPathParams;
      queryParams:Result<FeedsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedsIngestPathParams = {
      feedId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type FeedsIngestQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type FeedsIngestStatusCode200Response = {
      content:CatalogsFeedIngestion;
      
    }

    type FeedsIngestStatusCode400Response = {
      content:Error;
      
    }

    type FeedsIngestStatusCode403Response = {
      content:Error;
      
    }

    type FeedsIngestStatusCode404Response = {
      content:Error;
      
    }

    type FeedsIngestDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsIngestResult = FeedsIngestStatusCode200 of FeedsIngestStatusCode200Response|FeedsIngestStatusCode400 of FeedsIngestStatusCode400Response|FeedsIngestStatusCode403 of FeedsIngestStatusCode403Response|FeedsIngestStatusCode404 of FeedsIngestStatusCode404Response|FeedsIngestDefaultStatusCode of FeedsIngestDefaultStatusCodeResponse

    type FeedsIngestArgs = {
      pathParams:FeedsIngestPathParams;
      queryParams:Result<FeedsIngestQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type FeedsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      catalogId : string option;


      adAccountId : string option;

    }
    //#endregion


    type FeedsListStatusCode200Response = {
      content:FeedsList200Response;
      
    }

    type FeedsListStatusCode400Response = {
      content:Error;
      
    }

    type FeedsListStatusCode401Response = {
      content:Error;
      
    }

    type FeedsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsListResult = FeedsListStatusCode200 of FeedsListStatusCode200Response|FeedsListStatusCode400 of FeedsListStatusCode400Response|FeedsListStatusCode401 of FeedsListStatusCode401Response|FeedsListDefaultStatusCode of FeedsListDefaultStatusCodeResponse

    type FeedsListArgs = {
      queryParams:Result<FeedsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedsUpdatePathParams = {
      feedId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type FeedsUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type FeedsUpdateBodyParams = FeedsUpdateRequest
    //#endregion


    type FeedsUpdateStatusCode200Response = {
      content:CatalogsFeed;
      
    }

    type FeedsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type FeedsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type FeedsUpdateStatusCode404Response = {
      content:Error;
      
    }

    type FeedsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsUpdateResult = FeedsUpdateStatusCode200 of FeedsUpdateStatusCode200Response|FeedsUpdateStatusCode400 of FeedsUpdateStatusCode400Response|FeedsUpdateStatusCode403 of FeedsUpdateStatusCode403Response|FeedsUpdateStatusCode404 of FeedsUpdateStatusCode404Response|FeedsUpdateDefaultStatusCode of FeedsUpdateDefaultStatusCodeResponse

    type FeedsUpdateArgs = {
      pathParams:FeedsUpdatePathParams;
      queryParams:Result<FeedsUpdateQueryParams,string>;
      bodyParams:FeedsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemsBatchGetPathParams = {
      batchId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ItemsBatchGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type ItemsBatchGetStatusCode200Response = {
      content:CatalogsItemsBatch;
      
    }

    type ItemsBatchGetStatusCode401Response = {
      content:Error;
      
    }

    type ItemsBatchGetStatusCode403Response = {
      content:Error;
      
    }

    type ItemsBatchGetStatusCode404Response = {
      content:Error;
      
    }

    type ItemsBatchGetStatusCode405Response = {
      content:Error;
      
    }

    type ItemsBatchGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsBatchGetResult = ItemsBatchGetStatusCode200 of ItemsBatchGetStatusCode200Response|ItemsBatchGetStatusCode401 of ItemsBatchGetStatusCode401Response|ItemsBatchGetStatusCode403 of ItemsBatchGetStatusCode403Response|ItemsBatchGetStatusCode404 of ItemsBatchGetStatusCode404Response|ItemsBatchGetStatusCode405 of ItemsBatchGetStatusCode405Response|ItemsBatchGetDefaultStatusCode of ItemsBatchGetDefaultStatusCodeResponse

    type ItemsBatchGetArgs = {
      pathParams:ItemsBatchGetPathParams;
      queryParams:Result<ItemsBatchGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemsBatchPostQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ItemsBatchPostBodyParams = ItemsBatchPostRequest
    //#endregion


    type ItemsBatchPostStatusCode200Response = {
      content:CatalogsItemsBatch;
      
    }

    type ItemsBatchPostStatusCode400Response = {
      content:Error;
      
    }

    type ItemsBatchPostStatusCode401Response = {
      content:Error;
      
    }

    type ItemsBatchPostStatusCode403Response = {
      content:Error;
      
    }

    type ItemsBatchPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsBatchPostResult = ItemsBatchPostStatusCode200 of ItemsBatchPostStatusCode200Response|ItemsBatchPostStatusCode400 of ItemsBatchPostStatusCode400Response|ItemsBatchPostStatusCode401 of ItemsBatchPostStatusCode401Response|ItemsBatchPostStatusCode403 of ItemsBatchPostStatusCode403Response|ItemsBatchPostDefaultStatusCode of ItemsBatchPostDefaultStatusCodeResponse

    type ItemsBatchPostArgs = {
      queryParams:Result<ItemsBatchPostQueryParams,string>;
      bodyParams:ItemsBatchPostBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemsGetQueryParams = {
      adAccountId : string option;


      country : string ;


      language : string ;


      itemIds : string[] option;


      filters : CatalogsItemsFilters option;

    }
    //#endregion


    type ItemsGetStatusCode200Response = {
      content:CatalogsItems;
      
    }

    type ItemsGetStatusCode400Response = {
      content:Error;
      
    }

    type ItemsGetStatusCode401Response = {
      content:Error;
      
    }

    type ItemsGetStatusCode403Response = {
      content:Error;
      
    }

    type ItemsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsGetResult = ItemsGetStatusCode200 of ItemsGetStatusCode200Response|ItemsGetStatusCode400 of ItemsGetStatusCode400Response|ItemsGetStatusCode401 of ItemsGetStatusCode401Response|ItemsGetStatusCode403 of ItemsGetStatusCode403Response|ItemsGetDefaultStatusCode of ItemsGetDefaultStatusCodeResponse

    type ItemsGetArgs = {
      queryParams:Result<ItemsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemsIssuesListPathParams = {
      processingResultId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ItemsIssuesListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      itemNumbers : int[] option;


      itemValidationIssue : CatalogsItemValidationIssue option;


      adAccountId : string option;

    }
    //#endregion


    type ItemsIssuesListStatusCode200Response = {
      content:ItemsIssuesList200Response;
      
    }

    type ItemsIssuesListStatusCode401Response = {
      content:Error;
      
    }

    type ItemsIssuesListStatusCode404Response = {
      content:Error;
      
    }

    type ItemsIssuesListStatusCode501Response = {
      content:Error;
      
    }

    type ItemsIssuesListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsIssuesListResult = ItemsIssuesListStatusCode200 of ItemsIssuesListStatusCode200Response|ItemsIssuesListStatusCode401 of ItemsIssuesListStatusCode401Response|ItemsIssuesListStatusCode404 of ItemsIssuesListStatusCode404Response|ItemsIssuesListStatusCode501 of ItemsIssuesListStatusCode501Response|ItemsIssuesListDefaultStatusCode of ItemsIssuesListDefaultStatusCodeResponse

    type ItemsIssuesListArgs = {
      pathParams:ItemsIssuesListPathParams;
      queryParams:Result<ItemsIssuesListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemsPostQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ItemsPostBodyParams = CatalogsItemsRequest
    //#endregion


    type ItemsPostStatusCode200Response = {
      content:CatalogsItems;
      
    }

    type ItemsPostStatusCode400Response = {
      content:Error;
      
    }

    type ItemsPostStatusCode401Response = {
      content:Error;
      
    }

    type ItemsPostStatusCode403Response = {
      content:Error;
      
    }

    type ItemsPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsPostResult = ItemsPostStatusCode200 of ItemsPostStatusCode200Response|ItemsPostStatusCode400 of ItemsPostStatusCode400Response|ItemsPostStatusCode401 of ItemsPostStatusCode401Response|ItemsPostStatusCode403 of ItemsPostStatusCode403Response|ItemsPostDefaultStatusCode of ItemsPostDefaultStatusCodeResponse

    type ItemsPostArgs = {
      queryParams:Result<ItemsPostQueryParams,string>;
      bodyParams:ItemsPostBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ProductsByProductGroupFilterListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;


      pinMetrics : bool option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProductsByProductGroupFilterListBodyParams = CatalogsListProductsByFilterRequest
    //#endregion


    type ProductsByProductGroupFilterListStatusCode200Response = {
      content:CatalogsProductGroupPinsList200Response;
      
    }

    type ProductsByProductGroupFilterListStatusCode401Response = {
      content:Error;
      
    }

    type ProductsByProductGroupFilterListStatusCode409Response = {
      content:Error;
      
    }

    type ProductsByProductGroupFilterListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ProductsByProductGroupFilterListResult = ProductsByProductGroupFilterListStatusCode200 of ProductsByProductGroupFilterListStatusCode200Response|ProductsByProductGroupFilterListStatusCode401 of ProductsByProductGroupFilterListStatusCode401Response|ProductsByProductGroupFilterListStatusCode409 of ProductsByProductGroupFilterListStatusCode409Response|ProductsByProductGroupFilterListDefaultStatusCode of ProductsByProductGroupFilterListDefaultStatusCodeResponse

    type ProductsByProductGroupFilterListArgs = {
      queryParams:Result<ProductsByProductGroupFilterListQueryParams,string>;
      bodyParams:ProductsByProductGroupFilterListBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ReportsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ReportsCreateBodyParams = CatalogsReportParameters
    //#endregion


    type ReportsCreateStatusCode200Response = {
      content:CatalogsCreateReportResponse;
      
    }

    type ReportsCreateStatusCode404Response = {
      content:Error;
      
    }

    type ReportsCreateStatusCode409Response = {
      content:Error;
      
    }

    type ReportsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ReportsCreateResult = ReportsCreateStatusCode200 of ReportsCreateStatusCode200Response|ReportsCreateStatusCode404 of ReportsCreateStatusCode404Response|ReportsCreateStatusCode409 of ReportsCreateStatusCode409Response|ReportsCreateDefaultStatusCode of ReportsCreateDefaultStatusCodeResponse

    type ReportsCreateArgs = {
      queryParams:Result<ReportsCreateQueryParams,string>;
      bodyParams:ReportsCreateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ReportsGetQueryParams = {
      adAccountId : string option;


      token : string ;

    }
    //#endregion


    type ReportsGetStatusCode200Response = {
      content:CatalogsReport;
      
    }

    type ReportsGetStatusCode400Response = {
      content:Error;
      
    }

    type ReportsGetStatusCode409Response = {
      content:Error;
      
    }

    type ReportsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ReportsGetResult = ReportsGetStatusCode200 of ReportsGetStatusCode200Response|ReportsGetStatusCode400 of ReportsGetStatusCode400Response|ReportsGetStatusCode409 of ReportsGetStatusCode409Response|ReportsGetDefaultStatusCode of ReportsGetDefaultStatusCodeResponse

    type ReportsGetArgs = {
      queryParams:Result<ReportsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ReportsStatsQueryParams = {
      adAccountId : string option;


      pageSize : int option;


      bookmark : string option;


      parameters : CatalogsReportParameters ;

    }
    //#endregion


    type ReportsStatsStatusCode200Response = {
      content:ReportsStats200Response;
      
    }

    type ReportsStatsStatusCode401Response = {
      content:Error;
      
    }

    type ReportsStatsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ReportsStatsResult = ReportsStatsStatusCode200 of ReportsStatsStatusCode200Response|ReportsStatsStatusCode401 of ReportsStatsStatusCode401Response|ReportsStatsDefaultStatusCode of ReportsStatsDefaultStatusCodeResponse

    type ReportsStatsArgs = {
      queryParams:Result<ReportsStatsQueryParams,string>;
    }
