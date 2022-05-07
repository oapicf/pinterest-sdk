namespace OpenAPI
open OpenAPI.Model.Board
open OpenAPI.Model.BoardSection
open OpenAPI.Model.BoardUpdate
open OpenAPI.Model.Error
open OpenAPI.Model.Paginated
open BoardsApiHandlerParams
open BoardsApiServiceInterface
open System.Collections.Generic
open System

module BoardsApiServiceImplementation =

    //#region Service implementation
    type BoardsApiServiceImpl() =
      interface IBoardsApiService with

        member this.BoardSectionsCreate (parameters:BoardSectionsCreateBodyParams) =
          if true then
            let content = "response" :> obj :?> BoardSection // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsCreateStatusCode201 { content = content }
          else if true then
            let content = "Invalid board section parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsCreateStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to create board sections." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsCreateStatusCode403 { content = content }
          else if true then
            let content = "Could not get exclusive access to the board to create a new section." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsCreateStatusCode409 { content = content }
          else if true then
            let content = "Could not create a new board section." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsCreateStatusCode500 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsCreateDefaultStatusCode { content = content }

        member this.BoardSectionsDelete () =
          if true then
            let content = "Board section deleted successfully" 
            BoardSectionsDeleteStatusCode204 { content = content }
          else if true then
            let content = "Not authorized to delete board section." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsDeleteStatusCode403 { content = content }
          else if true then
            let content = "Board section not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsDeleteStatusCode404 { content = content }
          else if true then
            let content = "Board section conflict." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsDeleteStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsDeleteDefaultStatusCode { content = content }

        member this.BoardSectionsList () =
          if true then
            let content = "response" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListDefaultStatusCode { content = content }

        member this.BoardSectionsListPins () =
          if true then
            let content = "response" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListPinsStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access Pins on board section." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListPinsStatusCode403 { content = content }
          else if true then
            let content = "Board or section not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListPinsStatusCode404 { content = content }
          else if true then
            let content = "Board section conflict." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListPinsStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListPinsDefaultStatusCode { content = content }

        member this.BoardSectionsUpdate (parameters:BoardSectionsUpdateBodyParams) =
          if true then
            let content = "response" :> obj :?> BoardSection // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid board section parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to update board section." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsUpdateStatusCode403 { content = content }
          else if true then
            let content = "Board section conflict." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsUpdateStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsUpdateDefaultStatusCode { content = content }

        member this.BoardsCreate (parameters:BoardsCreateBodyParams) =
          if true then
            let content = "response" :> obj :?> Board // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode201 { content = content }
          else if true then
            let content = "The board name is invalid or duplicated." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateDefaultStatusCode { content = content }

        member this.BoardsDelete () =
          if true then
            let content = "Board deleted successfully" 
            BoardsDeleteStatusCode204 { content = content }
          else if true then
            let content = "Not authorized to delete the board." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode403 { content = content }
          else if true then
            let content = "Board not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode404 { content = content }
          else if true then
            let content = "Could not get exclusive access to delete the board." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode409 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode429 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteDefaultStatusCode { content = content }

        member this.BoardsGet () =
          if true then
            let content = "response" :> obj :?> Board // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode200 { content = content }
          else if true then
            let content = "Board not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetDefaultStatusCode { content = content }

        member this.BoardsList () =
          if true then
            let content = "response" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListDefaultStatusCode { content = content }

        member this.BoardsListPins () =
          if true then
            let content = "response" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListPinsStatusCode200 { content = content }
          else if true then
            let content = "Board not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListPinsStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListPinsDefaultStatusCode { content = content }

        member this.BoardsUpdate (parameters:BoardsUpdateBodyParams) =
          if true then
            let content = "response" :> obj :?> Board // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid board parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to update the board." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode403 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode429 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateDefaultStatusCode { content = content }

      //#endregion

    let BoardsApiService = BoardsApiServiceImpl() :> IBoardsApiService