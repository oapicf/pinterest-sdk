namespace OpenAPI

open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.CatalogsFeedCreateRequestSchema
open OpenAPI.Model.CatalogsFeedIngestion
open OpenAPI.Model.CatalogsFeedUpdateRequestSchema
open OpenAPI.Model.CatalogsItemValidationIssue
open OpenAPI.Model.FeedProcessingResultsList200Response
open OpenAPI.Model.FeedsList200Response
open OpenAPI.Model.ItemsIssuesList200Response
open OpenAPI.Model.PinterestLibError
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
      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type FeedProcessingResultsListStatusCode200Response = {
      content:FeedProcessingResultsList200Response;
      
    }

    type FeedProcessingResultsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type FeedProcessingResultsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FeedProcessingResultsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FeedProcessingResultsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FeedProcessingResultsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FeedProcessingResultsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FeedProcessingResultsListResult = FeedProcessingResultsListStatusCode200 of FeedProcessingResultsListStatusCode200Response|FeedProcessingResultsListStatusCode400 of FeedProcessingResultsListStatusCode400Response|FeedProcessingResultsListStatusCode401 of FeedProcessingResultsListStatusCode401Response|FeedProcessingResultsListStatusCode403 of FeedProcessingResultsListStatusCode403Response|FeedProcessingResultsListStatusCode404 of FeedProcessingResultsListStatusCode404Response|FeedProcessingResultsListStatusCode429 of FeedProcessingResultsListStatusCode429Response|FeedProcessingResultsListDefaultStatusCode of FeedProcessingResultsListDefaultStatusCodeResponse

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
    type FeedsCreateBodyParams = CatalogsFeedCreateRequestSchema
    //#endregion


    type FeedsCreateStatusCode200Response = {
      content:CatalogsFeed;
      
    }

    type FeedsCreateStatusCode201Response = {
      content:CatalogsFeed;
      
    }

    type FeedsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type FeedsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FeedsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FeedsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FeedsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FeedsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FeedsCreateResult = FeedsCreateStatusCode200 of FeedsCreateStatusCode200Response|FeedsCreateStatusCode201 of FeedsCreateStatusCode201Response|FeedsCreateStatusCode400 of FeedsCreateStatusCode400Response|FeedsCreateStatusCode401 of FeedsCreateStatusCode401Response|FeedsCreateStatusCode403 of FeedsCreateStatusCode403Response|FeedsCreateStatusCode404 of FeedsCreateStatusCode404Response|FeedsCreateStatusCode429 of FeedsCreateStatusCode429Response|FeedsCreateDefaultStatusCode of FeedsCreateDefaultStatusCodeResponse

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


    type FeedsDeleteStatusCode200Response = {
      content:CatalogsFeed;
      
    }

    type FeedsDeleteStatusCode204Response = {
      content:string;
      
    }

    type FeedsDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type FeedsDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FeedsDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FeedsDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FeedsDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FeedsDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FeedsDeleteResult = FeedsDeleteStatusCode200 of FeedsDeleteStatusCode200Response|FeedsDeleteStatusCode204 of FeedsDeleteStatusCode204Response|FeedsDeleteStatusCode400 of FeedsDeleteStatusCode400Response|FeedsDeleteStatusCode401 of FeedsDeleteStatusCode401Response|FeedsDeleteStatusCode403 of FeedsDeleteStatusCode403Response|FeedsDeleteStatusCode404 of FeedsDeleteStatusCode404Response|FeedsDeleteStatusCode429 of FeedsDeleteStatusCode429Response|FeedsDeleteDefaultStatusCode of FeedsDeleteDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type FeedsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FeedsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FeedsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FeedsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FeedsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FeedsGetResult = FeedsGetStatusCode200 of FeedsGetStatusCode200Response|FeedsGetStatusCode400 of FeedsGetStatusCode400Response|FeedsGetStatusCode401 of FeedsGetStatusCode401Response|FeedsGetStatusCode403 of FeedsGetStatusCode403Response|FeedsGetStatusCode404 of FeedsGetStatusCode404Response|FeedsGetStatusCode429 of FeedsGetStatusCode429Response|FeedsGetDefaultStatusCode of FeedsGetDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type FeedsIngestStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FeedsIngestStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FeedsIngestStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FeedsIngestStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FeedsIngestDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FeedsIngestResult = FeedsIngestStatusCode200 of FeedsIngestStatusCode200Response|FeedsIngestStatusCode400 of FeedsIngestStatusCode400Response|FeedsIngestStatusCode401 of FeedsIngestStatusCode401Response|FeedsIngestStatusCode403 of FeedsIngestStatusCode403Response|FeedsIngestStatusCode404 of FeedsIngestStatusCode404Response|FeedsIngestStatusCode429 of FeedsIngestStatusCode429Response|FeedsIngestDefaultStatusCode of FeedsIngestDefaultStatusCodeResponse

    type FeedsIngestArgs = {
      pathParams:FeedsIngestPathParams;
      queryParams:Result<FeedsIngestQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type FeedsListQueryParams = {
      catalogId : string option;


      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type FeedsListStatusCode200Response = {
      content:FeedsList200Response;
      
    }

    type FeedsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type FeedsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FeedsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FeedsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FeedsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FeedsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FeedsListResult = FeedsListStatusCode200 of FeedsListStatusCode200Response|FeedsListStatusCode400 of FeedsListStatusCode400Response|FeedsListStatusCode401 of FeedsListStatusCode401Response|FeedsListStatusCode403 of FeedsListStatusCode403Response|FeedsListStatusCode404 of FeedsListStatusCode404Response|FeedsListStatusCode429 of FeedsListStatusCode429Response|FeedsListDefaultStatusCode of FeedsListDefaultStatusCodeResponse

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
    type FeedsUpdateBodyParams = CatalogsFeedUpdateRequestSchema
    //#endregion


    type FeedsUpdateStatusCode200Response = {
      content:CatalogsFeed;
      
    }

    type FeedsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type FeedsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type FeedsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type FeedsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type FeedsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type FeedsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type FeedsUpdateResult = FeedsUpdateStatusCode200 of FeedsUpdateStatusCode200Response|FeedsUpdateStatusCode400 of FeedsUpdateStatusCode400Response|FeedsUpdateStatusCode401 of FeedsUpdateStatusCode401Response|FeedsUpdateStatusCode403 of FeedsUpdateStatusCode403Response|FeedsUpdateStatusCode404 of FeedsUpdateStatusCode404Response|FeedsUpdateStatusCode429 of FeedsUpdateStatusCode429Response|FeedsUpdateDefaultStatusCode of FeedsUpdateDefaultStatusCodeResponse

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
      itemNumbers : int[] option;


      itemValidationIssue : CatalogsItemValidationIssue option;


      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type ItemsIssuesListStatusCode200Response = {
      content:ItemsIssuesList200Response;
      
    }

    type ItemsIssuesListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ItemsIssuesListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ItemsIssuesListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ItemsIssuesListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ItemsIssuesListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ItemsIssuesListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ItemsIssuesListResult = ItemsIssuesListStatusCode200 of ItemsIssuesListStatusCode200Response|ItemsIssuesListStatusCode400 of ItemsIssuesListStatusCode400Response|ItemsIssuesListStatusCode401 of ItemsIssuesListStatusCode401Response|ItemsIssuesListStatusCode403 of ItemsIssuesListStatusCode403Response|ItemsIssuesListStatusCode404 of ItemsIssuesListStatusCode404Response|ItemsIssuesListStatusCode429 of ItemsIssuesListStatusCode429Response|ItemsIssuesListDefaultStatusCode of ItemsIssuesListDefaultStatusCodeResponse

    type ItemsIssuesListArgs = {
      pathParams:ItemsIssuesListPathParams;
      queryParams:Result<ItemsIssuesListQueryParams,string>;
    }
