namespace OpenAPI
open OpenAPI.Model.Board
open OpenAPI.Model.BoardCreate
open OpenAPI.Model.BoardPrivacyFilter
open OpenAPI.Model.BoardSection
open OpenAPI.Model.BoardSectionsList200Response
open OpenAPI.Model.BoardWithUpdatePrivacy
open OpenAPI.Model.BoardWithUpdatePrivacyUpdate
open OpenAPI.Model.BoardsList200Response
open OpenAPI.Model.BoardsListPins200Response
open OpenAPI.Model.CreativeType
open OpenAPI.Model.Error
open OpenAPI.Model.PinterestLibError
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
            let content = "response" :> obj :?> BoardSectionsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardSectionsListDefaultStatusCode { content = content }

        member this.BoardSectionsListPins () =
          if true then
            let content = "response" :> obj :?> BoardsListPins200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
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
            let content = "The request has succeeded." :> obj :?> Board // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> Board // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsCreateDefaultStatusCode { content = content }

        member this.BoardsDelete () =
          if true then
            let content = "Resource deleted successfully." 
            BoardsDeleteStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsDeleteDefaultStatusCode { content = content }

        member this.BoardsGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> Board // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsGetDefaultStatusCode { content = content }

        member this.BoardsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> BoardsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListDefaultStatusCode { content = content }

        member this.BoardsListPins () =
          if true then
            let content = "response" :> obj :?> BoardsListPins200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListPinsStatusCode200 { content = content }
          else if true then
            let content = "Board not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListPinsStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsListPinsDefaultStatusCode { content = content }

        member this.BoardsUpdate (parameters:BoardsUpdateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> BoardWithUpdatePrivacy // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BoardsUpdateDefaultStatusCode { content = content }

      //#endregion

    let BoardsApiService = BoardsApiServiceImpl() :> IBoardsApiService