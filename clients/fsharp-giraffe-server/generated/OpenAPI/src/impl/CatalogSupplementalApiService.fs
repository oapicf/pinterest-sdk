namespace OpenAPI
open OpenAPI.Model.CatalogsLocalStoresCreate200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresDelete200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresList200Response
open OpenAPI.Model.LocalInventoryItemsBatch
open OpenAPI.Model.LocalInventoryItemsBatchCreate
open OpenAPI.Model.LocalInventoryItemsGet
open OpenAPI.Model.LocalInventoryItemsGetCreate
open OpenAPI.Model.LocalStore
open OpenAPI.Model.LocalStoreBatchUpdate
open OpenAPI.Model.LocalStoreCreate
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SupplementalItemsBatchResponse
open CatalogSupplementalApiHandlerParams
open CatalogSupplementalApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CatalogSupplementalApiServiceImplementation =

    //#region Service implementation
    type CatalogSupplementalApiServiceImpl() =
      interface ICatalogSupplementalApiService with

        member this.CatalogsLocalInventoryItemsBatchOperate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SupplementalItemsBatchResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> LocalInventoryItemsBatch // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsBatchOperateDefaultStatusCode { content = content }

        member this.CatalogsLocalInventoryItemsPost ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> LocalInventoryItemsGet // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> LocalInventoryItemsGet // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalInventoryItemsPostDefaultStatusCode { content = content }

        member this.CatalogsLocalStoresCreate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsLocalStoresCreate200ResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> LocalStore[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresCreateDefaultStatusCode { content = content }

        member this.CatalogsLocalStoresDelete ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsLocalStoresDelete200ResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresDeleteStatusCode200 { content = content }
          else if true then
            let content = "Resource deleted successfully." 
            CatalogsLocalStoresDeleteStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresDeleteStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresDeleteStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresDeleteStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresDeleteStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresDeleteStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresDeleteDefaultStatusCode { content = content }

        member this.CatalogsLocalStoresList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsLocalStoresList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresListDefaultStatusCode { content = content }

        member this.CatalogsLocalStoresUpdate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsLocalStoresCreate200ResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsLocalStoresUpdateDefaultStatusCode { content = content }

        member this.CatalogsSupplementalItemsBatchGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SupplementalItemsBatchResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsSupplementalItemsBatchGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsSupplementalItemsBatchGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsSupplementalItemsBatchGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsSupplementalItemsBatchGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsSupplementalItemsBatchGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsSupplementalItemsBatchGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsSupplementalItemsBatchGetDefaultStatusCode { content = content }

      //#endregion

    let CatalogSupplementalApiService = CatalogSupplementalApiServiceImpl() :> ICatalogSupplementalApiService