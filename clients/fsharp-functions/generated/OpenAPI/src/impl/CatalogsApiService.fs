namespace OpenAPI
open OpenAPI.Model.Catalog
open OpenAPI.Model.CatalogCreate
open OpenAPI.Model.CatalogsAvailableFilterValues
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.Country
open OpenAPI.Model.PinterestLibError
open CatalogsApiHandlerParams
open CatalogsApiServiceInterface
open System.Collections.Generic
open System

module CatalogsApiServiceImplementation =

    //#region Service implementation
    type CatalogsApiServiceImpl() =
      interface ICatalogsApiService with

        member this.CatalogsAvailableFilterValues () =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsAvailableFilterValues // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsAvailableFilterValuesDefaultStatusCode { content = content }

        member this.CatalogsCreate (parameters:CatalogsCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> Catalog // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> Catalog // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsCreateDefaultStatusCode { content = content }

        member this.CatalogsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsListDefaultStatusCode { content = content }

      //#endregion

    let CatalogsApiService = CatalogsApiServiceImpl() :> ICatalogsApiService