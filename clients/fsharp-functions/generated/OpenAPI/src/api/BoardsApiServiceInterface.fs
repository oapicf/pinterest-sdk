namespace OpenAPI
open BoardsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BoardsApiServiceInterface =

    //#region Service interface
    type IBoardsApiService =
      abstract member BoardSectionsCreate : BoardSectionsCreateBodyParams -> BoardSectionsCreateResult
      abstract member BoardSectionsDelete : unit -> BoardSectionsDeleteResult
      abstract member BoardSectionsList : unit -> BoardSectionsListResult
      abstract member BoardSectionsListPins : unit -> BoardSectionsListPinsResult
      abstract member BoardSectionsUpdate : BoardSectionsUpdateBodyParams -> BoardSectionsUpdateResult
      abstract member BoardsCreate : BoardsCreateBodyParams -> BoardsCreateResult
      abstract member BoardsDelete : unit -> BoardsDeleteResult
      abstract member BoardsGet : unit -> BoardsGetResult
      abstract member BoardsList : unit -> BoardsListResult
      abstract member BoardsListPins : unit -> BoardsListPinsResult
      abstract member BoardsUpdate : BoardsUpdateBodyParams -> BoardsUpdateResult
    //#endregion