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
    type AdsCreditRedeemBodyParams = AdsCreditRedeemRequest
    //#endregion


    type AdsCreditRedeemStatusCode200Response = {
      content:AdsCreditRedeemResponse;
      
    }

    type AdsCreditRedeemStatusCode400Response = {
      content:Error;
      
    }

    type AdsCreditRedeemDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdsCreditRedeemResult = AdsCreditRedeemStatusCode200 of AdsCreditRedeemStatusCode200Response|AdsCreditRedeemStatusCode400 of AdsCreditRedeemStatusCode400Response|AdsCreditRedeemDefaultStatusCode of AdsCreditRedeemDefaultStatusCodeResponse

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

    type AdsCreditsDiscountsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdsCreditsDiscountsGetResult = AdsCreditsDiscountsGetStatusCode200 of AdsCreditsDiscountsGetStatusCode200Response|AdsCreditsDiscountsGetDefaultStatusCode of AdsCreditsDiscountsGetDefaultStatusCodeResponse

    type AdsCreditsDiscountsGetArgs = {
      pathParams:AdsCreditsDiscountsGetPathParams;
      queryParams:Result<AdsCreditsDiscountsGetQueryParams,string>;
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

    type BillingProfilesGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BillingProfilesGetResult = BillingProfilesGetStatusCode200 of BillingProfilesGetStatusCode200Response|BillingProfilesGetDefaultStatusCode of BillingProfilesGetDefaultStatusCodeResponse

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
      content:SSIOAccountResponse;
      
    }

    type SsioAccountsGetStatusCode400Response = {
      content:Error;
      
    }

    type SsioAccountsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SsioAccountsGetResult = SsioAccountsGetStatusCode200 of SsioAccountsGetStatusCode200Response|SsioAccountsGetStatusCode400 of SsioAccountsGetStatusCode400Response|SsioAccountsGetDefaultStatusCode of SsioAccountsGetDefaultStatusCodeResponse

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
    type SsioInsertionOrderCreateBodyParams = SSIOCreateInsertionOrderRequest
    //#endregion


    type SsioInsertionOrderCreateStatusCode200Response = {
      content:SSIOCreateInsertionOrderResponse;
      
    }

    type SsioInsertionOrderCreateStatusCode400Response = {
      content:Error;
      
    }

    type SsioInsertionOrderCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SsioInsertionOrderCreateResult = SsioInsertionOrderCreateStatusCode200 of SsioInsertionOrderCreateStatusCode200Response|SsioInsertionOrderCreateStatusCode400 of SsioInsertionOrderCreateStatusCode400Response|SsioInsertionOrderCreateDefaultStatusCode of SsioInsertionOrderCreateDefaultStatusCodeResponse

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
    type SsioInsertionOrderEditBodyParams = SSIOEditInsertionOrderRequest
    //#endregion


    type SsioInsertionOrderEditStatusCode200Response = {
      content:SSIOEditInsertionOrderResponse;
      
    }

    type SsioInsertionOrderEditStatusCode400Response = {
      content:Error;
      
    }

    type SsioInsertionOrderEditDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SsioInsertionOrderEditResult = SsioInsertionOrderEditStatusCode200 of SsioInsertionOrderEditStatusCode200Response|SsioInsertionOrderEditStatusCode400 of SsioInsertionOrderEditStatusCode400Response|SsioInsertionOrderEditDefaultStatusCode of SsioInsertionOrderEditDefaultStatusCodeResponse

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
      content:Error;
      
    }

    type SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SsioInsertionOrdersStatusGetByAdAccountResult = SsioInsertionOrdersStatusGetByAdAccountStatusCode200 of SsioInsertionOrdersStatusGetByAdAccountStatusCode200Response|SsioInsertionOrdersStatusGetByAdAccountStatusCode400 of SsioInsertionOrdersStatusGetByAdAccountStatusCode400Response|SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCode of SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCodeResponse

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
      content:Error;
      
    }

    type SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SsioInsertionOrdersStatusGetByPinOrderIdResult = SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200Response|SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400 of SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400Response|SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCode of SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;


      pinOrderId : string option;

    }
    //#endregion


    type SsioOrderLinesGetByAdAccountStatusCode200Response = {
      content:SsioOrderLinesGetByAdAccount200Response;
      
    }

    type SsioOrderLinesGetByAdAccountStatusCode400Response = {
      content:Error;
      
    }

    type SsioOrderLinesGetByAdAccountDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SsioOrderLinesGetByAdAccountResult = SsioOrderLinesGetByAdAccountStatusCode200 of SsioOrderLinesGetByAdAccountStatusCode200Response|SsioOrderLinesGetByAdAccountStatusCode400 of SsioOrderLinesGetByAdAccountStatusCode400Response|SsioOrderLinesGetByAdAccountDefaultStatusCode of SsioOrderLinesGetByAdAccountDefaultStatusCodeResponse

    type SsioOrderLinesGetByAdAccountArgs = {
      pathParams:SsioOrderLinesGetByAdAccountPathParams;
      queryParams:Result<SsioOrderLinesGetByAdAccountQueryParams,string>;
    }
