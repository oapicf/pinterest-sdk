namespace OpenAPI
open BillingApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BillingApiServiceInterface =

    //#region Service interface
    type IBillingApiService =
      abstract member AdsCreditRedeem:HttpContext -> AdsCreditRedeemArgs->AdsCreditRedeemResult
      abstract member AdsCreditsDiscountsGet:HttpContext -> AdsCreditsDiscountsGetArgs->AdsCreditsDiscountsGetResult
      abstract member BillingInvoiceDownloadGet:HttpContext -> BillingInvoiceDownloadGetArgs->BillingInvoiceDownloadGetResult
      abstract member BillingInvoicesGet:HttpContext -> BillingInvoicesGetArgs->BillingInvoicesGetResult
      abstract member BillingProfilesGet:HttpContext -> BillingProfilesGetArgs->BillingProfilesGetResult
      abstract member SsioAccountsGet:HttpContext -> SsioAccountsGetArgs->SsioAccountsGetResult
      abstract member SsioInsertionOrderCreate:HttpContext -> SsioInsertionOrderCreateArgs->SsioInsertionOrderCreateResult
      abstract member SsioInsertionOrderEdit:HttpContext -> SsioInsertionOrderEditArgs->SsioInsertionOrderEditResult
      abstract member SsioInsertionOrdersStatusGetByAdAccount:HttpContext -> SsioInsertionOrdersStatusGetByAdAccountArgs->SsioInsertionOrdersStatusGetByAdAccountResult
      abstract member SsioInsertionOrdersStatusGetByPinOrderId:HttpContext -> SsioInsertionOrdersStatusGetByPinOrderIdArgs->SsioInsertionOrdersStatusGetByPinOrderIdResult
      abstract member SsioOrderLinesGetByAdAccount:HttpContext -> SsioOrderLinesGetByAdAccountArgs->SsioOrderLinesGetByAdAccountResult
    //#endregion