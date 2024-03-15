namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.SearchPartnerPins200Response
open OpenAPI.Model.SearchUserBoardsGet200Response
open SearchApiHandlerParams
open SearchApiServiceInterface
open System.Collections.Generic
open System

module SearchApiServiceImplementation =

    //#region Service implementation
    type SearchApiServiceImpl() =
      interface ISearchApiService with

        member this.SearchPartnerPins () =
          if true then
            let content = "Success" :> obj :?> SearchPartnerPins200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchPartnerPinsStatusCode200 { content = content }
          else if true then
            let content = "Invalid pins" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchPartnerPinsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchPartnerPinsDefaultStatusCode { content = content }

        member this.SearchUserBoardsGet () =
          if true then
            let content = "response" :> obj :?> SearchUserBoardsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchUserBoardsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchUserBoardsGetDefaultStatusCode { content = content }

        member this.SearchUserPinsList () =
          if true then
            let content = "Success" :> obj :?> PinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchUserPinsListStatusCode200 { content = content }
          else if true then
            let content = "User not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchUserPinsListStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SearchUserPinsListDefaultStatusCode { content = content }

      //#endregion

    let SearchApiService = SearchApiServiceImpl() :> ISearchApiService