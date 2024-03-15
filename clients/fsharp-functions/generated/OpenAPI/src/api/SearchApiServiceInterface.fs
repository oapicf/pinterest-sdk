namespace OpenAPI
open SearchApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module SearchApiServiceInterface =

    //#region Service interface
    type ISearchApiService =
      abstract member SearchPartnerPins : unit -> SearchPartnerPinsResult
      abstract member SearchUserBoardsGet : unit -> SearchUserBoardsGetResult
      abstract member SearchUserPinsList : unit -> SearchUserPinsListResult
    //#endregion