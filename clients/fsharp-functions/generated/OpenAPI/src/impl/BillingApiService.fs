namespace OpenAPI
open OpenAPI.Model.AdsCreditRedeemRequest
open OpenAPI.Model.AdsCreditRedeemResponse
open OpenAPI.Model.AdsCreditsDiscountsGet200Response
open OpenAPI.Model.BillingProfilesGet200Response
open OpenAPI.Model.Error
open OpenAPI.Model.SSIOAccountResponse
open OpenAPI.Model.SSIOCreateInsertionOrderRequest
open OpenAPI.Model.SSIOCreateInsertionOrderResponse
open OpenAPI.Model.SSIOEditInsertionOrderRequest
open OpenAPI.Model.SSIOEditInsertionOrderResponse
open OpenAPI.Model.SSIOInsertionOrderStatusResponse
open OpenAPI.Model.SsioInsertionOrdersStatusGetByAdAccount200Response
open OpenAPI.Model.SsioOrderLinesGetByAdAccount200Response
open BillingApiHandlerParams
open BillingApiServiceInterface
open System.Collections.Generic
open System

module BillingApiServiceImplementation =

    //#region Service implementation
    type BillingApiServiceImpl() =
      interface IBillingApiService with

        member this.AdsCreditRedeem (parameters:AdsCreditRedeemBodyParams) =
          if true then
            let content = "Successfully redeemed ad credits." :> obj :?> AdsCreditRedeemResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode200 { content = content }
          else if true then
            let content = "Error thrown when unable to redeem offer code." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditRedeemDefaultStatusCode { content = content }

        member this.AdsCreditsDiscountsGet () =
          if true then
            let content = "Success" :> obj :?> AdsCreditsDiscountsGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreditsDiscountsGetDefaultStatusCode { content = content }

        member this.BillingProfilesGet () =
          if true then
            let content = "Success" :> obj :?> BillingProfilesGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetStatusCode200 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BillingProfilesGetDefaultStatusCode { content = content }

        member this.SsioAccountsGet () =
          if true then
            let content = "Success" :> obj :?> SSIOAccountResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioAccountsGetDefaultStatusCode { content = content }

        member this.SsioInsertionOrderCreate (parameters:SsioInsertionOrderCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> SSIOCreateInsertionOrderResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid request." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderCreateDefaultStatusCode { content = content }

        member this.SsioInsertionOrderEdit (parameters:SsioInsertionOrderEditBodyParams) =
          if true then
            let content = "Success" :> obj :?> SSIOEditInsertionOrderResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode200 { content = content }
          else if true then
            let content = "Invalid request." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrderEditDefaultStatusCode { content = content }

        member this.SsioInsertionOrdersStatusGetByAdAccount () =
          if true then
            let content = "Success" :> obj :?> SsioInsertionOrdersStatusGetByAdAccount200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCode { content = content }

        member this.SsioInsertionOrdersStatusGetByPinOrderId () =
          if true then
            let content = "Success" :> obj :?> SSIOInsertionOrderStatusResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCode { content = content }

        member this.SsioOrderLinesGetByAdAccount () =
          if true then
            let content = "Success" :> obj :?> SsioOrderLinesGetByAdAccount200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SsioOrderLinesGetByAdAccountDefaultStatusCode { content = content }

      //#endregion

    let BillingApiService = BillingApiServiceImpl() :> IBillingApiService