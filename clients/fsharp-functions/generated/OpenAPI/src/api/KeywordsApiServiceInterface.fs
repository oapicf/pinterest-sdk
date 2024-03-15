namespace OpenAPI
open KeywordsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module KeywordsApiServiceInterface =

    //#region Service interface
    type IKeywordsApiService =
      abstract member CountryKeywordsMetricsGet : unit -> CountryKeywordsMetricsGetResult
      abstract member KeywordsCreate : KeywordsCreateBodyParams -> KeywordsCreateResult
      abstract member KeywordsGet : unit -> KeywordsGetResult
      abstract member KeywordsUpdate : KeywordsUpdateBodyParams -> KeywordsUpdateResult
      abstract member TrendingKeywordsList : unit -> TrendingKeywordsListResult
    //#endregion