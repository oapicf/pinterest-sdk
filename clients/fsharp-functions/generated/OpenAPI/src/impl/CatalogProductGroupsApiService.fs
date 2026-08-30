namespace OpenAPI
open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCountsVertical
open OpenAPI.Model.CatalogsProductGroupsCreateManyRequestItems
open OpenAPI.Model.CatalogsProductGroupsCreateRequestSchema
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequestSchema
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.PinterestLibError
open CatalogProductGroupsApiHandlerParams
open CatalogProductGroupsApiServiceInterface
open System.Collections.Generic
open System

module CatalogProductGroupsApiServiceImplementation =

    //#region Service implementation
    type CatalogProductGroupsApiServiceImpl() =
      interface ICatalogProductGroupsApiService with

        member this.CatalogsProductGroupPinsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsProductGroupPinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupPinsListDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsCreate (parameters:CatalogsProductGroupsCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsCreateMany (parameters:CatalogsProductGroupsCreateManyBodyParams) =
          if true then
            let content = "The request has succeeded and a new resource has been created as a result." :> obj :?> string[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsCreateManyDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsDelete () =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode200 { content = content }
          else if true then
            let content = "Resource deleted successfully." 
            CatalogsProductGroupsDeleteStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsDeleteMany () =
          if true then
            let content = "Resource deleted successfully." 
            CatalogsProductGroupsDeleteManyStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsDeleteManyDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsGetDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsProductGroupsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsListDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsProductCountsGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsProductGroupProductCountsVertical // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsProductCountsGetDefaultStatusCode { content = content }

        member this.CatalogsProductGroupsUpdate (parameters:CatalogsProductGroupsUpdateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsVerticalProductGroup // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CatalogsProductGroupsUpdateDefaultStatusCode { content = content }

        member this.ProductsByProductGroupFilterList (parameters:ProductsByProductGroupFilterListBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsProductGroupPinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductsByProductGroupFilterListDefaultStatusCode { content = content }

      //#endregion

    let CatalogProductGroupsApiService = CatalogProductGroupsApiServiceImpl() :> ICatalogProductGroupsApiService