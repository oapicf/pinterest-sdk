namespace OpenAPI
open BoardsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BoardsApiServiceInterface =

    //#region Service interface
    type IBoardsApiService =
      abstract member BoardSectionsCreate:HttpContext -> BoardSectionsCreateArgs->BoardSectionsCreateResult
      abstract member BoardSectionsDelete:HttpContext -> BoardSectionsDeleteArgs->BoardSectionsDeleteResult
      abstract member BoardSectionsList:HttpContext -> BoardSectionsListArgs->BoardSectionsListResult
      abstract member BoardSectionsListPins:HttpContext -> BoardSectionsListPinsArgs->BoardSectionsListPinsResult
      abstract member BoardSectionsUpdate:HttpContext -> BoardSectionsUpdateArgs->BoardSectionsUpdateResult
      abstract member BoardsCreate:HttpContext -> BoardsCreateArgs->BoardsCreateResult
      abstract member BoardsDelete:HttpContext -> BoardsDeleteArgs->BoardsDeleteResult
      abstract member BoardsGet:HttpContext -> BoardsGetArgs->BoardsGetResult
      abstract member BoardsList:HttpContext -> BoardsListArgs->BoardsListResult
      abstract member BoardsListPins:HttpContext -> BoardsListPinsArgs->BoardsListPinsResult
      abstract member BoardsUpdate:HttpContext -> BoardsUpdateArgs->BoardsUpdateResult
    //#endregion