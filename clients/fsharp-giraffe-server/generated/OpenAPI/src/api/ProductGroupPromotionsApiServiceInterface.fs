namespace OpenAPI
open ProductGroupPromotionsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ProductGroupPromotionsApiServiceInterface =

    //#region Service interface
    type IProductGroupPromotionsApiService =
      abstract member ProductGroupPromotionsCreate:HttpContext -> ProductGroupPromotionsCreateArgs->ProductGroupPromotionsCreateResult
      abstract member ProductGroupPromotionsGet:HttpContext -> ProductGroupPromotionsGetArgs->ProductGroupPromotionsGetResult
      abstract member ProductGroupPromotionsList:HttpContext -> ProductGroupPromotionsListArgs->ProductGroupPromotionsListResult
      abstract member ProductGroupPromotionsUpdate:HttpContext -> ProductGroupPromotionsUpdateArgs->ProductGroupPromotionsUpdateResult
      abstract member ProductGroupsAnalytics:HttpContext -> ProductGroupsAnalyticsArgs->ProductGroupsAnalyticsResult
    //#endregion