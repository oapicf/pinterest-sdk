namespace OpenAPI

open OpenAPI.Model.AdAccountCreateSubscriptionRequest
open OpenAPI.Model.AdAccountCreateSubscriptionResponse
open OpenAPI.Model.AdAccountGetSubscriptionResponse
open OpenAPI.Model.AdAccountsSubscriptionsGetList200Response
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module LeadAdsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdAccountsSubscriptionsDelByIdPathParams = {
      adAccountId : string ;
    //#endregion
      subscriptionId : string ;
    }
    //#endregion


    type AdAccountsSubscriptionsDelByIdStatusCode204Response = {
      content:string;
      
    }

    type AdAccountsSubscriptionsDelByIdStatusCode400Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsDelByIdStatusCode403Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsDelByIdStatusCode404Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsDelByIdDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountsSubscriptionsDelByIdResult = AdAccountsSubscriptionsDelByIdStatusCode204 of AdAccountsSubscriptionsDelByIdStatusCode204Response|AdAccountsSubscriptionsDelByIdStatusCode400 of AdAccountsSubscriptionsDelByIdStatusCode400Response|AdAccountsSubscriptionsDelByIdStatusCode403 of AdAccountsSubscriptionsDelByIdStatusCode403Response|AdAccountsSubscriptionsDelByIdStatusCode404 of AdAccountsSubscriptionsDelByIdStatusCode404Response|AdAccountsSubscriptionsDelByIdDefaultStatusCode of AdAccountsSubscriptionsDelByIdDefaultStatusCodeResponse

    type AdAccountsSubscriptionsDelByIdArgs = {
      pathParams:AdAccountsSubscriptionsDelByIdPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdAccountsSubscriptionsGetByIdPathParams = {
      adAccountId : string ;
    //#endregion
      subscriptionId : string ;
    }
    //#endregion


    type AdAccountsSubscriptionsGetByIdStatusCode200Response = {
      content:AdAccountGetSubscriptionResponse;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode400Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode403Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode404Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsGetByIdDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountsSubscriptionsGetByIdResult = AdAccountsSubscriptionsGetByIdStatusCode200 of AdAccountsSubscriptionsGetByIdStatusCode200Response|AdAccountsSubscriptionsGetByIdStatusCode400 of AdAccountsSubscriptionsGetByIdStatusCode400Response|AdAccountsSubscriptionsGetByIdStatusCode403 of AdAccountsSubscriptionsGetByIdStatusCode403Response|AdAccountsSubscriptionsGetByIdStatusCode404 of AdAccountsSubscriptionsGetByIdStatusCode404Response|AdAccountsSubscriptionsGetByIdDefaultStatusCode of AdAccountsSubscriptionsGetByIdDefaultStatusCodeResponse

    type AdAccountsSubscriptionsGetByIdArgs = {
      pathParams:AdAccountsSubscriptionsGetByIdPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdAccountsSubscriptionsGetListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdAccountsSubscriptionsGetListQueryParams = {
      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type AdAccountsSubscriptionsGetListStatusCode200Response = {
      content:AdAccountsSubscriptionsGetList200Response;
      
    }

    type AdAccountsSubscriptionsGetListStatusCode403Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsGetListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountsSubscriptionsGetListResult = AdAccountsSubscriptionsGetListStatusCode200 of AdAccountsSubscriptionsGetListStatusCode200Response|AdAccountsSubscriptionsGetListStatusCode403 of AdAccountsSubscriptionsGetListStatusCode403Response|AdAccountsSubscriptionsGetListDefaultStatusCode of AdAccountsSubscriptionsGetListDefaultStatusCodeResponse

    type AdAccountsSubscriptionsGetListArgs = {
      pathParams:AdAccountsSubscriptionsGetListPathParams;
      queryParams:Result<AdAccountsSubscriptionsGetListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdAccountsSubscriptionsPostPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdAccountsSubscriptionsPostBodyParams = AdAccountCreateSubscriptionRequest
    //#endregion


    type AdAccountsSubscriptionsPostStatusCode200Response = {
      content:AdAccountCreateSubscriptionResponse;
      
    }

    type AdAccountsSubscriptionsPostStatusCode400Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsPostStatusCode403Response = {
      content:Error;
      
    }

    type AdAccountsSubscriptionsPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountsSubscriptionsPostResult = AdAccountsSubscriptionsPostStatusCode200 of AdAccountsSubscriptionsPostStatusCode200Response|AdAccountsSubscriptionsPostStatusCode400 of AdAccountsSubscriptionsPostStatusCode400Response|AdAccountsSubscriptionsPostStatusCode403 of AdAccountsSubscriptionsPostStatusCode403Response|AdAccountsSubscriptionsPostDefaultStatusCode of AdAccountsSubscriptionsPostDefaultStatusCodeResponse

    type AdAccountsSubscriptionsPostArgs = {
      pathParams:AdAccountsSubscriptionsPostPathParams;
      bodyParams:AdAccountsSubscriptionsPostBodyParams
    }
