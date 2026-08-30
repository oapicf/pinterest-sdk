namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BillingApiHandlerParams
open BillingApiServiceInterface
open BillingApiServiceImplementation
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

module BillingApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdsCreditRedeem
    /// <summary>
    /// Redeem ad credits
    /// </summary>

    let AdsCreditRedeem (pathParams:AdsCreditRedeemPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdsCreditRedeemBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdsCreditRedeemArgs
          let result = BillingApiService.AdsCreditRedeem ctx serviceArgs
          return! (match result with
                      | AdsCreditRedeemStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsCreditRedeemStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | AdsCreditRedeemStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsCreditRedeemStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdsCreditRedeemStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdsCreditRedeemStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdsCreditRedeemStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdsCreditRedeemDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsCreditsDiscountsGet
    /// <summary>
    /// Get ads credit discounts
    /// </summary>

    let AdsCreditsDiscountsGet (pathParams:AdsCreditsDiscountsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdsCreditsDiscountsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdsCreditsDiscountsGetArgs
          let result = BillingApiService.AdsCreditsDiscountsGet ctx serviceArgs
          return! (match result with
                      | AdsCreditsDiscountsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsCreditsDiscountsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsCreditsDiscountsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdsCreditsDiscountsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdsCreditsDiscountsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdsCreditsDiscountsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdsCreditsDiscountsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BillingInvoiceDownloadGet
    /// <summary>
    /// Get download url for a billing invoice
    /// </summary>

    let BillingInvoiceDownloadGet (pathParams:BillingInvoiceDownloadGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : BillingInvoiceDownloadGetArgs
          let result = BillingApiService.BillingInvoiceDownloadGet ctx serviceArgs
          return! (match result with
                      | BillingInvoiceDownloadGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BillingInvoiceDownloadGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BillingInvoiceDownloadGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BillingInvoiceDownloadGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BillingInvoiceDownloadGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BillingInvoiceDownloadGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BillingInvoiceDownloadGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BillingInvoicesGet
    /// <summary>
    /// Get billing invoices
    /// </summary>

    let BillingInvoicesGet (pathParams:BillingInvoicesGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BillingInvoicesGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BillingInvoicesGetArgs
          let result = BillingApiService.BillingInvoicesGet ctx serviceArgs
          return! (match result with
                      | BillingInvoicesGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BillingInvoicesGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BillingInvoicesGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BillingInvoicesGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BillingInvoicesGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BillingInvoicesGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BillingInvoicesGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BillingProfilesGet
    /// <summary>
    /// Get billing profiles
    /// </summary>

    let BillingProfilesGet (pathParams:BillingProfilesGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BillingProfilesGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BillingProfilesGetArgs
          let result = BillingApiService.BillingProfilesGet ctx serviceArgs
          return! (match result with
                      | BillingProfilesGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BillingProfilesGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BillingProfilesGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BillingProfilesGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BillingProfilesGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BillingProfilesGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BillingProfilesGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SsioAccountsGet
    /// <summary>
    /// Get Salesforce account details including bill-to information.
    /// </summary>

    let SsioAccountsGet (pathParams:SsioAccountsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SsioAccountsGetArgs
          let result = BillingApiService.SsioAccountsGet ctx serviceArgs
          return! (match result with
                      | SsioAccountsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SsioAccountsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SsioAccountsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SsioAccountsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SsioAccountsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SsioAccountsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SsioAccountsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SsioInsertionOrderCreate
    /// <summary>
    /// Create insertion order through SSIO.
    /// </summary>

    let SsioInsertionOrderCreate (pathParams:SsioInsertionOrderCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SsioInsertionOrderCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SsioInsertionOrderCreateArgs
          let result = BillingApiService.SsioInsertionOrderCreate ctx serviceArgs
          return! (match result with
                      | SsioInsertionOrderCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SsioInsertionOrderCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | SsioInsertionOrderCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SsioInsertionOrderCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SsioInsertionOrderCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SsioInsertionOrderCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SsioInsertionOrderCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SsioInsertionOrderCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SsioInsertionOrderEdit
    /// <summary>
    /// Edit insertion order through SSIO.
    /// </summary>

    let SsioInsertionOrderEdit (pathParams:SsioInsertionOrderEditPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SsioInsertionOrderEditBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SsioInsertionOrderEditArgs
          let result = BillingApiService.SsioInsertionOrderEdit ctx serviceArgs
          return! (match result with
                      | SsioInsertionOrderEditStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SsioInsertionOrderEditStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SsioInsertionOrderEditStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SsioInsertionOrderEditStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SsioInsertionOrderEditStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SsioInsertionOrderEditStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SsioInsertionOrderEditDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SsioInsertionOrdersStatusGetByAdAccount
    /// <summary>
    /// Get insertion order status by ad account id.
    /// </summary>

    let SsioInsertionOrdersStatusGetByAdAccount (pathParams:SsioInsertionOrdersStatusGetByAdAccountPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SsioInsertionOrdersStatusGetByAdAccountQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : SsioInsertionOrdersStatusGetByAdAccountArgs
          let result = BillingApiService.SsioInsertionOrdersStatusGetByAdAccount ctx serviceArgs
          return! (match result with
                      | SsioInsertionOrdersStatusGetByAdAccountStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByAdAccountStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByAdAccountStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByAdAccountStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByAdAccountStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByAdAccountStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SsioInsertionOrdersStatusGetByPinOrderId
    /// <summary>
    /// Get insertion order status by pin order id.
    /// </summary>

    let SsioInsertionOrdersStatusGetByPinOrderId (pathParams:SsioInsertionOrdersStatusGetByPinOrderIdPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SsioInsertionOrdersStatusGetByPinOrderIdArgs
          let result = BillingApiService.SsioInsertionOrdersStatusGetByPinOrderId ctx serviceArgs
          return! (match result with
                      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SsioOrderLinesGetByAdAccount
    /// <summary>
    /// Get Salesforce order lines by ad account id.
    /// </summary>

    let SsioOrderLinesGetByAdAccount (pathParams:SsioOrderLinesGetByAdAccountPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SsioOrderLinesGetByAdAccountQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : SsioOrderLinesGetByAdAccountArgs
          let result = BillingApiService.SsioOrderLinesGetByAdAccount ctx serviceArgs
          return! (match result with
                      | SsioOrderLinesGetByAdAccountStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SsioOrderLinesGetByAdAccountStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SsioOrderLinesGetByAdAccountStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SsioOrderLinesGetByAdAccountStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SsioOrderLinesGetByAdAccountStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SsioOrderLinesGetByAdAccountStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SsioOrderLinesGetByAdAccountDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

