namespace OpenAPI
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ProductTagsBulkAddRequest
open OpenAPI.Model.ProductTagsBulkDeleteRequest
open OpenAPI.Model.ProductTagsError
open OpenAPI.Model.ProductTagsResponse
open ProductTagsApiHandlerParams
open ProductTagsApiServiceInterface
open System.Collections.Generic
open System

module ProductTagsApiServiceImplementation =

    //#region Service implementation
    type ProductTagsApiServiceImpl() =
      interface IProductTagsApiService with

        member this.ProductTagsBulkAdd (parameters:ProductTagsBulkAddBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductTagsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkAddStatusCode200 { content = content }
          else if true then
            let content = "The request contains ineligible product tags." :> obj :?> ProductTagsError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkAddStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkAddStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkAddStatusCode403 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkAddStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkAddDefaultStatusCode { content = content }

        member this.ProductTagsBulkDelete (parameters:ProductTagsBulkDeleteBodyParams) =
          if true then
            let content = "Resource deleted successfully." 
            ProductTagsBulkDeleteStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkDeleteStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkDeleteStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkDeleteStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkDeleteStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkDeleteStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsBulkDeleteDefaultStatusCode { content = content }

        member this.ProductTagsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductTagsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductTagsListDefaultStatusCode { content = content }

      //#endregion

    let ProductTagsApiService = ProductTagsApiServiceImpl() :> IProductTagsApiService