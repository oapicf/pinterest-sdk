namespace OpenAPI
open PromotionsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PromotionsApiServiceInterface =

    //#region Service interface
    type IPromotionsApiService =
      abstract member PromotionsCreate : PromotionsCreateBodyParams -> PromotionsCreateResult
      abstract member PromotionsDelete : unit -> PromotionsDeleteResult
      abstract member PromotionsGet : unit -> PromotionsGetResult
      abstract member PromotionsList : unit -> PromotionsListResult
      abstract member PromotionsUpdate : PromotionsUpdateBodyParams -> PromotionsUpdateResult
    //#endregion