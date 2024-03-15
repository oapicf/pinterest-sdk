namespace OpenAPI
open KeywordsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module KeywordsApiServiceInterface =

    //#region Service interface
    type IKeywordsApiService =
      abstract member CountryKeywordsMetricsGet:HttpContext -> CountryKeywordsMetricsGetArgs->CountryKeywordsMetricsGetResult
      abstract member KeywordsCreate:HttpContext -> KeywordsCreateArgs->KeywordsCreateResult
      abstract member KeywordsGet:HttpContext -> KeywordsGetArgs->KeywordsGetResult
      abstract member KeywordsUpdate:HttpContext -> KeywordsUpdateArgs->KeywordsUpdateResult
      abstract member TrendingKeywordsList:HttpContext -> TrendingKeywordsListArgs->TrendingKeywordsListResult
    //#endregion