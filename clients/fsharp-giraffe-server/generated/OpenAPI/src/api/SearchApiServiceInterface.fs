namespace OpenAPI
open SearchApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module SearchApiServiceInterface =

    //#region Service interface
    type ISearchApiService =
      abstract member SearchPartnerPins:HttpContext -> SearchPartnerPinsArgs->SearchPartnerPinsResult
      abstract member SearchUserBoardsGet:HttpContext -> SearchUserBoardsGetArgs->SearchUserBoardsGetResult
      abstract member SearchUserPinsList:HttpContext -> SearchUserPinsListArgs->SearchUserPinsListResult
    //#endregion