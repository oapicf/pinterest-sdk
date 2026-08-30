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
open System.Collections.Generic
open System

module BillingApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdsCreditRedeemPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdsCreditRedeemBodyParams = AdsCreditRedeemCreate
    //#endregion


    type AdsCreditRedeemStatusCode200Response = {
      content:AdsCreditRedeem;
      
    }

    type AdsCreditRedeemStatusCode201Response = {
      content:AdsCreditRedeem;
      
    }

    type AdsCreditRedeemStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditRedeemStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditRedeemStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditRedeemStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditRedeemStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditRedeemDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdsCreditRedeemResult = AdsCreditRedeemStatusCode200 of AdsCreditRedeemStatusCode200Response|AdsCreditRedeemStatusCode201 of AdsCreditRedeemStatusCode201Response|AdsCreditRedeemStatusCode400 of AdsCreditRedeemStatusCode400Response|AdsCreditRedeemStatusCode401 of AdsCreditRedeemStatusCode401Response|AdsCreditRedeemStatusCode403 of AdsCreditRedeemStatusCode403Response|AdsCreditRedeemStatusCode404 of AdsCreditRedeemStatusCode404Response|AdsCreditRedeemStatusCode429 of AdsCreditRedeemStatusCode429Response|AdsCreditRedeemDefaultStatusCode of AdsCreditRedeemDefaultStatusCodeResponse

    type AdsCreditRedeemArgs = {
      pathParams:AdsCreditRedeemPathParams;
      bodyParams:AdsCreditRedeemBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdsCreditsDiscountsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdsCreditsDiscountsGetQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type AdsCreditsDiscountsGetStatusCode200Response = {
      content:AdsCreditsDiscountsGet200Response;
      
    }

    type AdsCreditsDiscountsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditsDiscountsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditsDiscountsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditsDiscountsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditsDiscountsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdsCreditsDiscountsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdsCreditsDiscountsGetResult = AdsCreditsDiscountsGetStatusCode200 of AdsCreditsDiscountsGetStatusCode200Response|AdsCreditsDiscountsGetStatusCode400 of AdsCreditsDiscountsGetStatusCode400Response|AdsCreditsDiscountsGetStatusCode401 of AdsCreditsDiscountsGetStatusCode401Response|AdsCreditsDiscountsGetStatusCode403 of AdsCreditsDiscountsGetStatusCode403Response|AdsCreditsDiscountsGetStatusCode404 of AdsCreditsDiscountsGetStatusCode404Response|AdsCreditsDiscountsGetStatusCode429 of AdsCreditsDiscountsGetStatusCode429Response|AdsCreditsDiscountsGetDefaultStatusCode of AdsCreditsDiscountsGetDefaultStatusCodeResponse

    type AdsCreditsDiscountsGetArgs = {
      pathParams:AdsCreditsDiscountsGetPathParams;
      queryParams:Result<AdsCreditsDiscountsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BillingInvoiceDownloadGetPathParams = {
      adAccountId : string ;
    //#endregion
      billingInvoiceId : string ;
    }
    //#endregion


    type BillingInvoiceDownloadGetStatusCode200Response = {
      content:BillingInvoiceDownloadResponse;
      
    }

    type BillingInvoiceDownloadGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoiceDownloadGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoiceDownloadGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoiceDownloadGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoiceDownloadGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoiceDownloadGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BillingInvoiceDownloadGetResult = BillingInvoiceDownloadGetStatusCode200 of BillingInvoiceDownloadGetStatusCode200Response|BillingInvoiceDownloadGetStatusCode400 of BillingInvoiceDownloadGetStatusCode400Response|BillingInvoiceDownloadGetStatusCode401 of BillingInvoiceDownloadGetStatusCode401Response|BillingInvoiceDownloadGetStatusCode403 of BillingInvoiceDownloadGetStatusCode403Response|BillingInvoiceDownloadGetStatusCode404 of BillingInvoiceDownloadGetStatusCode404Response|BillingInvoiceDownloadGetStatusCode429 of BillingInvoiceDownloadGetStatusCode429Response|BillingInvoiceDownloadGetDefaultStatusCode of BillingInvoiceDownloadGetDefaultStatusCodeResponse

    type BillingInvoiceDownloadGetArgs = {
      pathParams:BillingInvoiceDownloadGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BillingInvoicesGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BillingInvoicesGetQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      sort : BillingInvoiceSortField option;


      status : BillingInvoiceStatus option;


      documentType : BillingInvoiceDocumentType option;


      startDueDate : DateTime option;


      endDueDate : DateTime option;

    }
    //#endregion


    type BillingInvoicesGetStatusCode200Response = {
      content:BillingInvoicesGet200Response;
      
    }

    type BillingInvoicesGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoicesGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoicesGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoicesGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoicesGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BillingInvoicesGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BillingInvoicesGetResult = BillingInvoicesGetStatusCode200 of BillingInvoicesGetStatusCode200Response|BillingInvoicesGetStatusCode400 of BillingInvoicesGetStatusCode400Response|BillingInvoicesGetStatusCode401 of BillingInvoicesGetStatusCode401Response|BillingInvoicesGetStatusCode403 of BillingInvoicesGetStatusCode403Response|BillingInvoicesGetStatusCode404 of BillingInvoicesGetStatusCode404Response|BillingInvoicesGetStatusCode429 of BillingInvoicesGetStatusCode429Response|BillingInvoicesGetDefaultStatusCode of BillingInvoicesGetDefaultStatusCodeResponse

    type BillingInvoicesGetArgs = {
      pathParams:BillingInvoicesGetPathParams;
      queryParams:Result<BillingInvoicesGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BillingProfilesGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BillingProfilesGetQueryParams = {
      isActive : bool ;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BillingProfilesGetStatusCode200Response = {
      content:BillingProfilesGet200Response;
      
    }

    type BillingProfilesGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BillingProfilesGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BillingProfilesGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BillingProfilesGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BillingProfilesGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BillingProfilesGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BillingProfilesGetResult = BillingProfilesGetStatusCode200 of BillingProfilesGetStatusCode200Response|BillingProfilesGetStatusCode400 of BillingProfilesGetStatusCode400Response|BillingProfilesGetStatusCode401 of BillingProfilesGetStatusCode401Response|BillingProfilesGetStatusCode403 of BillingProfilesGetStatusCode403Response|BillingProfilesGetStatusCode404 of BillingProfilesGetStatusCode404Response|BillingProfilesGetStatusCode429 of BillingProfilesGetStatusCode429Response|BillingProfilesGetDefaultStatusCode of BillingProfilesGetDefaultStatusCodeResponse

    type BillingProfilesGetArgs = {
      pathParams:BillingProfilesGetPathParams;
      queryParams:Result<BillingProfilesGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SsioAccountsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion


    type SsioAccountsGetStatusCode200Response = {
      content:SSIOAccount;
      
    }

    type SsioAccountsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SsioAccountsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SsioAccountsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SsioAccountsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SsioAccountsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SsioAccountsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SsioAccountsGetResult = SsioAccountsGetStatusCode200 of SsioAccountsGetStatusCode200Response|SsioAccountsGetStatusCode400 of SsioAccountsGetStatusCode400Response|SsioAccountsGetStatusCode401 of SsioAccountsGetStatusCode401Response|SsioAccountsGetStatusCode403 of SsioAccountsGetStatusCode403Response|SsioAccountsGetStatusCode404 of SsioAccountsGetStatusCode404Response|SsioAccountsGetStatusCode429 of SsioAccountsGetStatusCode429Response|SsioAccountsGetDefaultStatusCode of SsioAccountsGetDefaultStatusCodeResponse

    type SsioAccountsGetArgs = {
      pathParams:SsioAccountsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SsioInsertionOrderCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SsioInsertionOrderCreateBodyParams = SSIOInsertionOrderCreate
    //#endregion


    type SsioInsertionOrderCreateStatusCode200Response = {
      content:SSIOInsertionOrder;
      
    }

    type SsioInsertionOrderCreateStatusCode201Response = {
      content:SSIOInsertionOrder;
      
    }

    type SsioInsertionOrderCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SsioInsertionOrderCreateResult = SsioInsertionOrderCreateStatusCode200 of SsioInsertionOrderCreateStatusCode200Response|SsioInsertionOrderCreateStatusCode201 of SsioInsertionOrderCreateStatusCode201Response|SsioInsertionOrderCreateStatusCode400 of SsioInsertionOrderCreateStatusCode400Response|SsioInsertionOrderCreateStatusCode401 of SsioInsertionOrderCreateStatusCode401Response|SsioInsertionOrderCreateStatusCode403 of SsioInsertionOrderCreateStatusCode403Response|SsioInsertionOrderCreateStatusCode404 of SsioInsertionOrderCreateStatusCode404Response|SsioInsertionOrderCreateStatusCode429 of SsioInsertionOrderCreateStatusCode429Response|SsioInsertionOrderCreateDefaultStatusCode of SsioInsertionOrderCreateDefaultStatusCodeResponse

    type SsioInsertionOrderCreateArgs = {
      pathParams:SsioInsertionOrderCreatePathParams;
      bodyParams:SsioInsertionOrderCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SsioInsertionOrderEditPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SsioInsertionOrderEditBodyParams = SSIOInsertionOrderUpdate
    //#endregion


    type SsioInsertionOrderEditStatusCode200Response = {
      content:SSIOInsertionOrder;
      
    }

    type SsioInsertionOrderEditStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderEditStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderEditStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderEditStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderEditStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrderEditDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SsioInsertionOrderEditResult = SsioInsertionOrderEditStatusCode200 of SsioInsertionOrderEditStatusCode200Response|SsioInsertionOrderEditStatusCode400 of SsioInsertionOrderEditStatusCode400Response|SsioInsertionOrderEditStatusCode401 of SsioInsertionOrderEditStatusCode401Response|SsioInsertionOrderEditStatusCode403 of SsioInsertionOrderEditStatusCode403Response|SsioInsertionOrderEditStatusCode404 of SsioInsertionOrderEditStatusCode404Response|SsioInsertionOrderEditStatusCode429 of SsioInsertionOrderEditStatusCode429Response|SsioInsertionOrderEditDefaultStatusCode of SsioInsertionOrderEditDefaultStatusCodeResponse

    type SsioInsertionOrderEditArgs = {
      pathParams:SsioInsertionOrderEditPathParams;
      bodyParams:SsioInsertionOrderEditBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SsioInsertionOrdersStatusGetByAdAccountPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SsioInsertionOrdersStatusGetByAdAccountQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type SsioInsertionOrdersStatusGetByAdAccountStatusCode200Response = {
      content:SsioInsertionOrdersStatusGetByAdAccount200Response;
      
    }

    type SsioInsertionOrdersStatusGetByAdAccountStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByAdAccountStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByAdAccountStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByAdAccountStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByAdAccountStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SsioInsertionOrdersStatusGetByAdAccountResult = SsioInsertionOrdersStatusGetByAdAccountStatusCode200 of SsioInsertionOrdersStatusGetByAdAccountStatusCode200Response|SsioInsertionOrdersStatusGetByAdAccountStatusCode400 of SsioInsertionOrdersStatusGetByAdAccountStatusCode400Response|SsioInsertionOrdersStatusGetByAdAccountStatusCode401 of SsioInsertionOrdersStatusGetByAdAccountStatusCode401Response|SsioInsertionOrdersStatusGetByAdAccountStatusCode403 of SsioInsertionOrdersStatusGetByAdAccountStatusCode403Response|SsioInsertionOrdersStatusGetByAdAccountStatusCode404 of SsioInsertionOrdersStatusGetByAdAccountStatusCode404Response|SsioInsertionOrdersStatusGetByAdAccountStatusCode429 of SsioInsertionOrdersStatusGetByAdAccountStatusCode429Response|SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCode of SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCodeResponse

    type SsioInsertionOrdersStatusGetByAdAccountArgs = {
      pathParams:SsioInsertionOrdersStatusGetByAdAccountPathParams;
      queryParams:Result<SsioInsertionOrdersStatusGetByAdAccountQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SsioInsertionOrdersStatusGetByPinOrderIdPathParams = {
      adAccountId : string ;
    //#endregion
      pinOrderId : string ;
    }
    //#endregion


    type SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200Response = {
      content:SSIOInsertionOrderStatusResponse;
      
    }

    type SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByPinOrderIdStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByPinOrderIdStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByPinOrderIdStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByPinOrderIdStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SsioInsertionOrdersStatusGetByPinOrderIdResult = SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200Response|SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400Response|SsioInsertionOrdersStatusGetByPinOrderIdStatusCode401 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode401Response|SsioInsertionOrdersStatusGetByPinOrderIdStatusCode403 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode403Response|SsioInsertionOrdersStatusGetByPinOrderIdStatusCode404 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode404Response|SsioInsertionOrdersStatusGetByPinOrderIdStatusCode429 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode429Response|SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCode of SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCodeResponse

    type SsioInsertionOrdersStatusGetByPinOrderIdArgs = {
      pathParams:SsioInsertionOrdersStatusGetByPinOrderIdPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SsioOrderLinesGetByAdAccountPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SsioOrderLinesGetByAdAccountQueryParams = {
      pinOrderId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type SsioOrderLinesGetByAdAccountStatusCode200Response = {
      content:SsioOrderLinesGetByAdAccount200Response;
      
    }

    type SsioOrderLinesGetByAdAccountStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SsioOrderLinesGetByAdAccountStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SsioOrderLinesGetByAdAccountStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SsioOrderLinesGetByAdAccountStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SsioOrderLinesGetByAdAccountStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SsioOrderLinesGetByAdAccountDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SsioOrderLinesGetByAdAccountResult = SsioOrderLinesGetByAdAccountStatusCode200 of SsioOrderLinesGetByAdAccountStatusCode200Response|SsioOrderLinesGetByAdAccountStatusCode400 of SsioOrderLinesGetByAdAccountStatusCode400Response|SsioOrderLinesGetByAdAccountStatusCode401 of SsioOrderLinesGetByAdAccountStatusCode401Response|SsioOrderLinesGetByAdAccountStatusCode403 of SsioOrderLinesGetByAdAccountStatusCode403Response|SsioOrderLinesGetByAdAccountStatusCode404 of SsioOrderLinesGetByAdAccountStatusCode404Response|SsioOrderLinesGetByAdAccountStatusCode429 of SsioOrderLinesGetByAdAccountStatusCode429Response|SsioOrderLinesGetByAdAccountDefaultStatusCode of SsioOrderLinesGetByAdAccountDefaultStatusCodeResponse

    type SsioOrderLinesGetByAdAccountArgs = {
      pathParams:SsioOrderLinesGetByAdAccountPathParams;
      queryParams:Result<SsioOrderLinesGetByAdAccountQueryParams,string>;
    }
