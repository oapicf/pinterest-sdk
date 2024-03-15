namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.KeywordUpdateBody
open OpenAPI.Model.KeywordsGet200Response
open OpenAPI.Model.KeywordsMetricsArrayResponse
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.KeywordsResponse
open OpenAPI.Model.MatchType
open OpenAPI.Model.TrendType
open OpenAPI.Model.TrendingKeywordsResponse
open OpenAPI.Model.TrendsSupportedRegion
open KeywordsApiHandlerParams
open KeywordsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module KeywordsApiServiceImplementation =

    //#region Service implementation
    type KeywordsApiServiceImpl() =
      interface IKeywordsApiService with

        member this.CountryKeywordsMetricsGet ctx args =
          if true then
            let content = "Success" :> obj :?> KeywordsMetricsArrayResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CountryKeywordsMetricsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CountryKeywordsMetricsGetDefaultStatusCode { content = content }

        member this.KeywordsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> KeywordsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            KeywordsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            KeywordsCreateDefaultStatusCode { content = content }

        member this.KeywordsGet ctx args =
          if true then
            let content = "Success" :> obj :?> KeywordsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            KeywordsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            KeywordsGetDefaultStatusCode { content = content }

        member this.KeywordsUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> KeywordsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            KeywordsUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            KeywordsUpdateDefaultStatusCode { content = content }

        member this.TrendingKeywordsList ctx args =
          if true then
            let content = "Success" :> obj :?> TrendingKeywordsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendingKeywordsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid trending keywords request parameters" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendingKeywordsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendingKeywordsListDefaultStatusCode { content = content }

      //#endregion

    let KeywordsApiService = KeywordsApiServiceImpl() :> IKeywordsApiService