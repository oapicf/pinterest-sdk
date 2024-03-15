namespace OpenAPI
open BillingApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BillingApiServiceInterface =

    //#region Service interface
    type IBillingApiService =
      abstract member AdsCreditRedeem : AdsCreditRedeemBodyParams -> AdsCreditRedeemResult
      abstract member AdsCreditsDiscountsGet : unit -> AdsCreditsDiscountsGetResult
      abstract member BillingProfilesGet : unit -> BillingProfilesGetResult
      abstract member SsioAccountsGet : unit -> SsioAccountsGetResult
      abstract member SsioInsertionOrderCreate : SsioInsertionOrderCreateBodyParams -> SsioInsertionOrderCreateResult
      abstract member SsioInsertionOrderEdit : SsioInsertionOrderEditBodyParams -> SsioInsertionOrderEditResult
      abstract member SsioInsertionOrdersStatusGetByAdAccount : unit -> SsioInsertionOrdersStatusGetByAdAccountResult
      abstract member SsioInsertionOrdersStatusGetByPinOrderId : unit -> SsioInsertionOrdersStatusGetByPinOrderIdResult
      abstract member SsioOrderLinesGetByAdAccount : unit -> SsioOrderLinesGetByAdAccountResult
    //#endregion