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
open CatalogFeedsApiHandlerParams
open CatalogFeedsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CatalogFeedsApiServiceImplementation =

    //#region Service implementation
    type CatalogFeedsApiServiceImpl() =
      interface ICatalogFeedsApiService with

        member this.FeedProcessingResultsList ctx args =
          if true then
            let content = "Success" :> obj :?> FeedProcessingResultsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedProcessingResultsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedProcessingResultsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedProcessingResultsListStatusCode401 { content = content }
          else if true then
            let content = "Feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedProcessingResultsListStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedProcessingResultsListDefaultStatusCode { content = content }

        member this.FeedsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> CatalogsFeed // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateStatusCode201 { content = content }
          else if true then
            let content = "Invalid feed parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateStatusCode401 { content = content }
          else if true then
            let content = "Business account required." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateStatusCode403 { content = content }
          else if true then
            let content = "User website required." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateStatusCode409 { content = content }
          else if true then
            let content = "Unique feed name is required." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateStatusCode422 { content = content }
          else if true then
            let content = "Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;)." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateStatusCode501 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsCreateDefaultStatusCode { content = content }

        member this.FeedsDelete ctx args =
          if true then
            let content = "Feed deleted successfully." 
            FeedsDeleteStatusCode204 { content = content }
          else if true then
            let content = "Invalid feed parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsDeleteStatusCode400 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for feed mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsDeleteStatusCode403 { content = content }
          else if true then
            let content = "Data feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsDeleteStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t delete a feed with active promotions." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsDeleteStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsDeleteDefaultStatusCode { content = content }

        member this.FeedsGet ctx args =
          if true then
            let content = "Success" :> obj :?> CatalogsFeed // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsGetStatusCode200 { content = content }
          else if true then
            let content = "Invalid feed parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsGetStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsGetStatusCode401 { content = content }
          else if true then
            let content = "Data feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsGetStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsGetDefaultStatusCode { content = content }

        member this.FeedsIngest ctx args =
          if true then
            let content = "The ingestion process was successfully started." :> obj :?> CatalogsFeedIngestion // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsIngestStatusCode200 { content = content }
          else if true then
            let content = "Invalid feed parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsIngestStatusCode400 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for feed mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsIngestStatusCode403 { content = content }
          else if true then
            let content = "Data feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsIngestStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsIngestDefaultStatusCode { content = content }

        member this.FeedsList ctx args =
          if true then
            let content = "Success" :> obj :?> FeedsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsListStatusCode401 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsListDefaultStatusCode { content = content }

        member this.FeedsUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> CatalogsFeed // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid feed parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for feed mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsUpdateStatusCode403 { content = content }
          else if true then
            let content = "Data feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsUpdateStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FeedsUpdateDefaultStatusCode { content = content }

        member this.ItemsIssuesList ctx args =
          if true then
            let content = "Success" :> obj :?> ItemsIssuesList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsIssuesListStatusCode200 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsIssuesListStatusCode401 { content = content }
          else if true then
            let content = "Processing Result not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsIssuesListStatusCode404 { content = content }
          else if true then
            let content = "Not implemented." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsIssuesListStatusCode501 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsIssuesListDefaultStatusCode { content = content }

      //#endregion

    let CatalogFeedsApiService = CatalogFeedsApiServiceImpl() :> ICatalogFeedsApiService