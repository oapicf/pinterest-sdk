namespace OpenAPI

open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.CatalogsFeedIngestion
open OpenAPI.Model.CatalogsItemValidationIssue
open OpenAPI.Model.Error
open OpenAPI.Model.FeedProcessingResultsList200Response
open OpenAPI.Model.FeedsCreateRequest
open OpenAPI.Model.FeedsList200Response
open OpenAPI.Model.FeedsUpdateRequest
open OpenAPI.Model.ItemsIssuesList200Response
open System.Collections.Generic
open System

module CatalogFeedsApiHandlerParams =

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
