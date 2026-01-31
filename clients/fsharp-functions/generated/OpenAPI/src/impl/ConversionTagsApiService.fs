namespace OpenAPI
open OpenAPI.Model.ConversionEventResponse
open OpenAPI.Model.ConversionTag
open OpenAPI.Model.ConversionTagCreate
open OpenAPI.Model.ConversionTagsList200Response
open OpenAPI.Model.Error
open System.Collections.Generic
open OpenAPI.Model.PageVisitConversionTagsGet200Response
open OpenAPI.Model.PinterestLibError
open ConversionTagsApiHandlerParams
open ConversionTagsApiServiceInterface
open System.Collections.Generic
open System

module ConversionTagsApiServiceImplementation =

    //#region Service implementation
    type ConversionTagsApiServiceImpl() =
      interface IConversionTagsApiService with

        member this.ConversionTagsCreate (parameters:ConversionTagsCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> ConversionTag // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> ConversionTag // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateDefaultStatusCode { content = content }

        member this.ConversionTagsGet () =
          if true then
            let content = "Success" :> obj :?> ConversionTag // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsGetDefaultStatusCode { content = content }

        member this.ConversionTagsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> ConversionTagsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListDefaultStatusCode { content = content }

        member this.OcpmEligibleConversionTagsGet () =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, ConversionEventResponse[]> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OcpmEligibleConversionTagsGetStatusCode200 { content = content }
          else
            let content = "Unexpected errors" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OcpmEligibleConversionTagsGetDefaultStatusCode { content = content }

        member this.PageVisitConversionTagsGet () =
          if true then
            let content = "Success" :> obj :?> PageVisitConversionTagsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PageVisitConversionTagsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PageVisitConversionTagsGetDefaultStatusCode { content = content }

      //#endregion

    let ConversionTagsApiService = ConversionTagsApiServiceImpl() :> IConversionTagsApiService