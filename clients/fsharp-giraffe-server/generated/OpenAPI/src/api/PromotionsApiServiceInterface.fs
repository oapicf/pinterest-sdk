namespace OpenAPI
open PromotionsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PromotionsApiServiceInterface =

    //#region Service interface
    type IPromotionsApiService =
      abstract member PromotionsCreate:HttpContext -> PromotionsCreateArgs->PromotionsCreateResult
      abstract member PromotionsDelete:HttpContext -> PromotionsDeleteArgs->PromotionsDeleteResult
      abstract member PromotionsGet:HttpContext -> PromotionsGetArgs->PromotionsGetResult
      abstract member PromotionsList:HttpContext -> PromotionsListArgs->PromotionsListResult
      abstract member PromotionsUpdate:HttpContext -> PromotionsUpdateArgs->PromotionsUpdateResult
    //#endregion