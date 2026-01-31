namespace OpenAPI

open OpenAPI.Model.AdAccountsSubscriptionsGetList200Response
open OpenAPI.Model.LeadSubscription
open OpenAPI.Model.LeadSubscriptionPostParamsCreate
open OpenAPI.Model.PinterestLibError
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
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsDelByIdStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsDelByIdStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsDelByIdStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsDelByIdStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsDelByIdDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsSubscriptionsDelByIdResult = AdAccountsSubscriptionsDelByIdStatusCode204 of AdAccountsSubscriptionsDelByIdStatusCode204Response|AdAccountsSubscriptionsDelByIdStatusCode400 of AdAccountsSubscriptionsDelByIdStatusCode400Response|AdAccountsSubscriptionsDelByIdStatusCode401 of AdAccountsSubscriptionsDelByIdStatusCode401Response|AdAccountsSubscriptionsDelByIdStatusCode403 of AdAccountsSubscriptionsDelByIdStatusCode403Response|AdAccountsSubscriptionsDelByIdStatusCode404 of AdAccountsSubscriptionsDelByIdStatusCode404Response|AdAccountsSubscriptionsDelByIdStatusCode429 of AdAccountsSubscriptionsDelByIdStatusCode429Response|AdAccountsSubscriptionsDelByIdDefaultStatusCode of AdAccountsSubscriptionsDelByIdDefaultStatusCodeResponse

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
      content:LeadSubscription;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetByIdStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetByIdDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsSubscriptionsGetByIdResult = AdAccountsSubscriptionsGetByIdStatusCode200 of AdAccountsSubscriptionsGetByIdStatusCode200Response|AdAccountsSubscriptionsGetByIdStatusCode400 of AdAccountsSubscriptionsGetByIdStatusCode400Response|AdAccountsSubscriptionsGetByIdStatusCode401 of AdAccountsSubscriptionsGetByIdStatusCode401Response|AdAccountsSubscriptionsGetByIdStatusCode403 of AdAccountsSubscriptionsGetByIdStatusCode403Response|AdAccountsSubscriptionsGetByIdStatusCode404 of AdAccountsSubscriptionsGetByIdStatusCode404Response|AdAccountsSubscriptionsGetByIdStatusCode429 of AdAccountsSubscriptionsGetByIdStatusCode429Response|AdAccountsSubscriptionsGetByIdDefaultStatusCode of AdAccountsSubscriptionsGetByIdDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type AdAccountsSubscriptionsGetListStatusCode200Response = {
      content:AdAccountsSubscriptionsGetList200Response;
      
    }

    type AdAccountsSubscriptionsGetListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsGetListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsSubscriptionsGetListResult = AdAccountsSubscriptionsGetListStatusCode200 of AdAccountsSubscriptionsGetListStatusCode200Response|AdAccountsSubscriptionsGetListStatusCode400 of AdAccountsSubscriptionsGetListStatusCode400Response|AdAccountsSubscriptionsGetListStatusCode401 of AdAccountsSubscriptionsGetListStatusCode401Response|AdAccountsSubscriptionsGetListStatusCode403 of AdAccountsSubscriptionsGetListStatusCode403Response|AdAccountsSubscriptionsGetListStatusCode404 of AdAccountsSubscriptionsGetListStatusCode404Response|AdAccountsSubscriptionsGetListStatusCode429 of AdAccountsSubscriptionsGetListStatusCode429Response|AdAccountsSubscriptionsGetListDefaultStatusCode of AdAccountsSubscriptionsGetListDefaultStatusCodeResponse

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
    type AdAccountsSubscriptionsPostBodyParams = LeadSubscriptionPostParamsCreate
    //#endregion


    type AdAccountsSubscriptionsPostStatusCode200Response = {
      content:LeadSubscription;
      
    }

    type AdAccountsSubscriptionsPostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsPostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsSubscriptionsPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsSubscriptionsPostResult = AdAccountsSubscriptionsPostStatusCode200 of AdAccountsSubscriptionsPostStatusCode200Response|AdAccountsSubscriptionsPostStatusCode400 of AdAccountsSubscriptionsPostStatusCode400Response|AdAccountsSubscriptionsPostStatusCode403 of AdAccountsSubscriptionsPostStatusCode403Response|AdAccountsSubscriptionsPostDefaultStatusCode of AdAccountsSubscriptionsPostDefaultStatusCodeResponse

    type AdAccountsSubscriptionsPostArgs = {
      pathParams:AdAccountsSubscriptionsPostPathParams;
      bodyParams:AdAccountsSubscriptionsPostBodyParams
    }
