namespace OpenAPI
open ProductGroupPromotionsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ProductGroupPromotionsApiServiceInterface =

    //#region Service interface
    type IProductGroupPromotionsApiService =
      abstract member ProductGroupPromotionsCreate : ProductGroupPromotionsCreateBodyParams -> ProductGroupPromotionsCreateResult
      abstract member ProductGroupPromotionsGet : unit -> ProductGroupPromotionsGetResult
      abstract member ProductGroupPromotionsList : unit -> ProductGroupPromotionsListResult
      abstract member ProductGroupPromotionsUpdate : ProductGroupPromotionsUpdateBodyParams -> ProductGroupPromotionsUpdateResult
      abstract member ProductGroupsAnalytics : unit -> ProductGroupsAnalyticsResult
    //#endregion