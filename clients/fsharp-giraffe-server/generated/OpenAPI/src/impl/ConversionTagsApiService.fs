namespace OpenAPI
open OpenAPI.Model.ConversionEventResponse
open OpenAPI.Model.ConversionTagCreate
open OpenAPI.Model.ConversionTagListResponse
open OpenAPI.Model.ConversionTagResponse
open OpenAPI.Model.Error
open System.Collections.Generic
open OpenAPI.Model.PageVisitConversionTagsGet200Response
open ConversionTagsApiHandlerParams
open ConversionTagsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ConversionTagsApiServiceImplementation =

    //#region Service implementation
    type ConversionTagsApiServiceImpl() =
      interface IConversionTagsApiService with

        member this.ConversionTagsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> ConversionTagResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsCreateDefaultStatusCode { content = content }

        member this.ConversionTagsGet ctx args =
          if true then
            let content = "Success" :> obj :?> ConversionTagResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsGetDefaultStatusCode { content = content }

        member this.ConversionTagsList ctx args =
          if true then
            let content = "Success" :> obj :?> ConversionTagListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionTagsListDefaultStatusCode { content = content }

        member this.OcpmEligibleConversionTagsGet ctx args =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, ConversionEventResponse[]> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OcpmEligibleConversionTagsGetStatusCode200 { content = content }
          else
            let content = "Unexpected errors" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            OcpmEligibleConversionTagsGetDefaultStatusCode { content = content }

        member this.PageVisitConversionTagsGet ctx args =
          if true then
            let content = "Success" :> obj :?> PageVisitConversionTagsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PageVisitConversionTagsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PageVisitConversionTagsGetDefaultStatusCode { content = content }

      //#endregion

    let ConversionTagsApiService = ConversionTagsApiServiceImpl() :> IConversionTagsApiService