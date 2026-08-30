namespace OpenAPI
open OpenAPI.Model.AdsCreditRedeem
open OpenAPI.Model.AdsCreditRedeemCreate
open OpenAPI.Model.AdsCreditsDiscountsGet200Response
open OpenAPI.Model.BillingInvoiceDocumentType
open OpenAPI.Model.BillingInvoiceDownloadResponse
open OpenAPI.Model.BillingInvoiceSortField
open OpenAPI.Model.BillingInvoiceStatus
open OpenAPI.Model.BillingInvoicesGet200Response
open OpenAPI.Model.BillingProfilesGet200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.SSIOAccount
open OpenAPI.Model.SSIOInsertionOrder
open OpenAPI.Model.SSIOInsertionOrderCreate
open OpenAPI.Model.SSIOInsertionOrderStatusResponse
open OpenAPI.Model.SSIOInsertionOrderUpdate
open OpenAPI.Model.SsioInsertionOrdersStatusGetByAdAccount200Response
open OpenAPI.Model.SsioOrderLinesGetByAdAccount200Response
open BillingApiHandlerParams
open BillingApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BillingApiServiceImplementation =

    //#region Service implementation
    type BillingApiServiceImpl() =
      interface IBillingApiService with

        member this.AdsCreditRedeem ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AdsCreditRedeem // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> AdsCreditRedeem // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemDefaultStatusCode { content = content }

        member this.AdsCreditsDiscountsGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AdsCreditsDiscountsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetDefaultStatusCode { content = content }

        member this.BillingInvoiceDownloadGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BillingInvoiceDownloadResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoiceDownloadGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoiceDownloadGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoiceDownloadGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoiceDownloadGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoiceDownloadGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoiceDownloadGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoiceDownloadGetDefaultStatusCode { content = content }

        member this.BillingInvoicesGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BillingInvoicesGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoicesGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoicesGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoicesGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoicesGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoicesGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoicesGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingInvoicesGetDefaultStatusCode { content = content }

        member this.BillingProfilesGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BillingProfilesGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetDefaultStatusCode { content = content }

        member this.SsioAccountsGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SSIOAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetDefaultStatusCode { content = content }

        member this.SsioInsertionOrderCreate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SSIOInsertionOrder // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> SSIOInsertionOrder // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateDefaultStatusCode { content = content }

        member this.SsioInsertionOrderEdit ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SSIOInsertionOrder // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditDefaultStatusCode { content = content }

        member this.SsioInsertionOrdersStatusGetByAdAccount ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SsioInsertionOrdersStatusGetByAdAccount200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCode { content = content }

        member this.SsioInsertionOrdersStatusGetByPinOrderId ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SSIOInsertionOrderStatusResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCode { content = content }

        member this.SsioOrderLinesGetByAdAccount ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SsioOrderLinesGetByAdAccount200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountDefaultStatusCode { content = content }

      //#endregion

    let BillingApiService = BillingApiServiceImpl() :> IBillingApiService