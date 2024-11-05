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
open CatalogsApiHandlerParams
open CatalogsApiServiceInterface
open System.Collections.Generic
open System

module CatalogsApiServiceImplementation =

    //#region Service implementation
    type CatalogsApiServiceImpl() =
      interface ICatalogsApiService with

        member this.CatalogsCreate (parameters:CatalogsCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> Catalog // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode401 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateDefaultStatusCode { content = content }

        member this.CatalogsList () =
          if true then
            let content = "Success" :> obj :?> CatalogsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode401 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListDefaultStatusCode { content = content }

        member this.CatalogsProductGroupPinsList () =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupPinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode401 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsCreate (parameters:CatalogsProductGroupsCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode201 { content = content }
          else if true then
            let content = "Invalid body." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode403 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t create this catalogs product group with this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsCreateMany (parameters:CatalogsProductGroupsCreateManyBodyParams) =
          if true then
            let content = "Success" :> obj :?> string[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode201 { content = content }
          else if true then
            let content = "Invalid body." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode403 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t create this catalogs product group with this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsDelete () =
          if true then
            let content = "Catalogs Product Group deleted successfully." 
            CatalogsProductGroupsDeleteStatusCode204 { content = content }
          else if true then
            let content = "Invalid catalogs product group id parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t delete this catalogs product group." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsDeleteMany () =
          if true then
            let content = "Catalogs Product Groups deleted successfully." 
            CatalogsProductGroupsDeleteManyStatusCode204 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t delete this catalogs product group." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsGet () =
          if true then
            let content = "Success" :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode200 { content = content }
          else if true then
            let content = "Invalid catalogs product group id parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t get a catalogs product group without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsList () =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid feed parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode403 { content = content }
          else if true then
            let content = "Data feed not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t create this catalogs product group with this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsProductCountsGet () =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupProductCountsVertical // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode200 { content = content }
          else if true then
            let content = "Product Group Not Found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this feature without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsUpdate (parameters:CatalogsProductGroupsUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode401 { content = content }
          else if true then
            let content = "Forbidden. Account not approved for catalog product group mutations yet." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode403 { content = content }
          else if true then
            let content = "Catalogs product group not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode404 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t update this catalogs product group to this value." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateDefaultStatusCode { content = content }

        member this.FeedProcessingResultsList () =
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

        member this.FeedsCreate (parameters:FeedsCreateBodyParams) =
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

        member this.FeedsDelete () =
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

        member this.FeedsGet () =
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

        member this.FeedsIngest () =
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

        member this.FeedsList () =
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

        member this.FeedsUpdate (parameters:FeedsUpdateBodyParams) =
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

        member this.ItemsBatchGet () =
          if true then
            let content = "Response containing the requested catalogs items batch" :> obj :?> CatalogsItemsBatch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode200 { content = content }
          else if true then
            let content = "Not authenticated to access catalogs items batch" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items batch" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode403 { content = content }
          else if true then
            let content = "Catalogs items batch not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode404 { content = content }
          else if true then
            let content = "Method Not Allowed." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetStatusCode405 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchGetDefaultStatusCode { content = content }

        member this.ItemsBatchPost (parameters:ItemsBatchPostBodyParams) =
          if true then
            let content = "Response containing the requested catalogs items batch" :> obj :?> CatalogsItemsBatch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode400 { content = content }
          else if true then
            let content = "Not authenticated to post catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to post catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsBatchPostDefaultStatusCode { content = content }

        member this.ItemsGet () =
          if true then
            let content = "Response containing the requested catalogs items" :> obj :?> CatalogsItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsGetStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsGetStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsGetStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsGetStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsGetDefaultStatusCode { content = content }

        member this.ItemsIssuesList () =
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

        member this.ItemsPost (parameters:ItemsPostBodyParams) =
          if true then
            let content = "Response containing the requested catalogs items" :> obj :?> CatalogsItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid request" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to access catalogs items" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemsPostDefaultStatusCode { content = content }

        member this.ProductsByProductGroupFilterList (parameters:ProductsByProductGroupFilterListBodyParams) =
          if true then
            let content = "Success" :> obj :?> CatalogsProductGroupPinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode200 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode401 { content = content }
          else if true then
            let content = "Conflict. Can&#39;t get products." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListDefaultStatusCode { content = content }

        member this.ReportsCreate (parameters:ReportsCreateBodyParams) =
          if true then
            let content = "Response containing the report token" :> obj :?> CatalogsCreateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode200 { content = content }
          else if true then
            let content = "Entity (e.g., catalog, feed or processing_result) not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this feature without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateDefaultStatusCode { content = content }

        member this.ReportsGet () =
          if true then
            let content = "Response that contains a link to download the report" :> obj :?> CatalogsReport // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode200 { content = content }
          else if true then
            let content = "The token you provided is not valid or has expired." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode400 { content = content }
          else if true then
            let content = "Can&#39;t access this feature without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetDefaultStatusCode { content = content }

        member this.ReportsStats () =
          if true then
            let content = "Response containing the diagnostics aggregated counters" :> obj :?> ReportsStats200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access catalogs" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode401 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsDefaultStatusCode { content = content }

      //#endregion

    let CatalogsApiService = CatalogsApiServiceImpl() :> ICatalogsApiService