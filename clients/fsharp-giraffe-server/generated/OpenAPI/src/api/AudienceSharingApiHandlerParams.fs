namespace OpenAPI

open OpenAPI.Model.AdAccountsAudiencesSharedAccountsList200Response
open OpenAPI.Model.AudienceAccountType
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.BusinessSharedAudience
open OpenAPI.Model.BusinessSharedAudienceResponse
open OpenAPI.Model.Error
open OpenAPI.Model.SharedAudience
open OpenAPI.Model.SharedAudienceResponse
open System.Collections.Generic
open System

module AudienceSharingApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdAccountsAudiencesSharedAccountsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdAccountsAudiencesSharedAccountsListQueryParams = {
      audienceId : string ;


      accountType : AudienceAccountType ;


      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type AdAccountsAudiencesSharedAccountsListStatusCode200Response = {
      content:AdAccountsAudiencesSharedAccountsList200Response;
      
    }

    type AdAccountsAudiencesSharedAccountsListStatusCode400Response = {
      content:Error;
      
    }

    type AdAccountsAudiencesSharedAccountsListStatusCode404Response = {
      content:Error;
      
    }

    type AdAccountsAudiencesSharedAccountsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountsAudiencesSharedAccountsListResult = AdAccountsAudiencesSharedAccountsListStatusCode200 of AdAccountsAudiencesSharedAccountsListStatusCode200Response|AdAccountsAudiencesSharedAccountsListStatusCode400 of AdAccountsAudiencesSharedAccountsListStatusCode400Response|AdAccountsAudiencesSharedAccountsListStatusCode404 of AdAccountsAudiencesSharedAccountsListStatusCode404Response|AdAccountsAudiencesSharedAccountsListDefaultStatusCode of AdAccountsAudiencesSharedAccountsListDefaultStatusCodeResponse

    type AdAccountsAudiencesSharedAccountsListArgs = {
      pathParams:AdAccountsAudiencesSharedAccountsListPathParams;
      queryParams:Result<AdAccountsAudiencesSharedAccountsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BusinessAccountAudiencesSharedAccountsListPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BusinessAccountAudiencesSharedAccountsListQueryParams = {
      audienceId : string ;


      accountType : AudienceAccountType ;


      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type BusinessAccountAudiencesSharedAccountsListStatusCode200Response = {
      content:AdAccountsAudiencesSharedAccountsList200Response;
      
    }

    type BusinessAccountAudiencesSharedAccountsListStatusCode400Response = {
      content:Error;
      
    }

    type BusinessAccountAudiencesSharedAccountsListStatusCode404Response = {
      content:Error;
      
    }

    type BusinessAccountAudiencesSharedAccountsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BusinessAccountAudiencesSharedAccountsListResult = BusinessAccountAudiencesSharedAccountsListStatusCode200 of BusinessAccountAudiencesSharedAccountsListStatusCode200Response|BusinessAccountAudiencesSharedAccountsListStatusCode400 of BusinessAccountAudiencesSharedAccountsListStatusCode400Response|BusinessAccountAudiencesSharedAccountsListStatusCode404 of BusinessAccountAudiencesSharedAccountsListStatusCode404Response|BusinessAccountAudiencesSharedAccountsListDefaultStatusCode of BusinessAccountAudiencesSharedAccountsListDefaultStatusCodeResponse

    type BusinessAccountAudiencesSharedAccountsListArgs = {
      pathParams:BusinessAccountAudiencesSharedAccountsListPathParams;
      queryParams:Result<BusinessAccountAudiencesSharedAccountsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SharedAudiencesForBusinessListPathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SharedAudiencesForBusinessListQueryParams = {
      bookmark : string option;


      order : string option;


      pageSize : int option;

    }
    //#endregion


    type SharedAudiencesForBusinessListStatusCode200Response = {
      content:AudiencesList200Response;
      
    }

    type SharedAudiencesForBusinessListStatusCode400Response = {
      content:Error;
      
    }

    type SharedAudiencesForBusinessListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SharedAudiencesForBusinessListResult = SharedAudiencesForBusinessListStatusCode200 of SharedAudiencesForBusinessListStatusCode200Response|SharedAudiencesForBusinessListStatusCode400 of SharedAudiencesForBusinessListStatusCode400Response|SharedAudiencesForBusinessListDefaultStatusCode of SharedAudiencesForBusinessListDefaultStatusCodeResponse

    type SharedAudiencesForBusinessListArgs = {
      pathParams:SharedAudiencesForBusinessListPathParams;
      queryParams:Result<SharedAudiencesForBusinessListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateAdAccountToAdAccountSharedAudiencePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateAdAccountToAdAccountSharedAudienceBodyParams = SharedAudience
    //#endregion


    type UpdateAdAccountToAdAccountSharedAudienceStatusCode200Response = {
      content:SharedAudienceResponse;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceStatusCode400Response = {
      content:Error;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UpdateAdAccountToAdAccountSharedAudienceResult = UpdateAdAccountToAdAccountSharedAudienceStatusCode200 of UpdateAdAccountToAdAccountSharedAudienceStatusCode200Response|UpdateAdAccountToAdAccountSharedAudienceStatusCode400 of UpdateAdAccountToAdAccountSharedAudienceStatusCode400Response|UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCode of UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCodeResponse

    type UpdateAdAccountToAdAccountSharedAudienceArgs = {
      pathParams:UpdateAdAccountToAdAccountSharedAudiencePathParams;
      bodyParams:UpdateAdAccountToAdAccountSharedAudienceBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateAdAccountToBusinessSharedAudiencePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateAdAccountToBusinessSharedAudienceBodyParams = BusinessSharedAudience
    //#endregion


    type UpdateAdAccountToBusinessSharedAudienceStatusCode200Response = {
      content:BusinessSharedAudienceResponse;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceStatusCode400Response = {
      content:Error;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UpdateAdAccountToBusinessSharedAudienceResult = UpdateAdAccountToBusinessSharedAudienceStatusCode200 of UpdateAdAccountToBusinessSharedAudienceStatusCode200Response|UpdateAdAccountToBusinessSharedAudienceStatusCode400 of UpdateAdAccountToBusinessSharedAudienceStatusCode400Response|UpdateAdAccountToBusinessSharedAudienceDefaultStatusCode of UpdateAdAccountToBusinessSharedAudienceDefaultStatusCodeResponse

    type UpdateAdAccountToBusinessSharedAudienceArgs = {
      pathParams:UpdateAdAccountToBusinessSharedAudiencePathParams;
      bodyParams:UpdateAdAccountToBusinessSharedAudienceBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateBusinessToAdAccountSharedAudiencePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateBusinessToAdAccountSharedAudienceBodyParams = SharedAudience
    //#endregion


    type UpdateBusinessToAdAccountSharedAudienceStatusCode200Response = {
      content:SharedAudienceResponse;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceStatusCode400Response = {
      content:Error;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UpdateBusinessToAdAccountSharedAudienceResult = UpdateBusinessToAdAccountSharedAudienceStatusCode200 of UpdateBusinessToAdAccountSharedAudienceStatusCode200Response|UpdateBusinessToAdAccountSharedAudienceStatusCode400 of UpdateBusinessToAdAccountSharedAudienceStatusCode400Response|UpdateBusinessToAdAccountSharedAudienceDefaultStatusCode of UpdateBusinessToAdAccountSharedAudienceDefaultStatusCodeResponse

    type UpdateBusinessToAdAccountSharedAudienceArgs = {
      pathParams:UpdateBusinessToAdAccountSharedAudiencePathParams;
      bodyParams:UpdateBusinessToAdAccountSharedAudienceBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateBusinessToBusinessSharedAudiencePathParams = {
      businessId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateBusinessToBusinessSharedAudienceBodyParams = BusinessSharedAudience
    //#endregion


    type UpdateBusinessToBusinessSharedAudienceStatusCode200Response = {
      content:BusinessSharedAudienceResponse;
      
    }

    type UpdateBusinessToBusinessSharedAudienceStatusCode400Response = {
      content:Error;
      
    }

    type UpdateBusinessToBusinessSharedAudienceDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UpdateBusinessToBusinessSharedAudienceResult = UpdateBusinessToBusinessSharedAudienceStatusCode200 of UpdateBusinessToBusinessSharedAudienceStatusCode200Response|UpdateBusinessToBusinessSharedAudienceStatusCode400 of UpdateBusinessToBusinessSharedAudienceStatusCode400Response|UpdateBusinessToBusinessSharedAudienceDefaultStatusCode of UpdateBusinessToBusinessSharedAudienceDefaultStatusCodeResponse

    type UpdateBusinessToBusinessSharedAudienceArgs = {
      pathParams:UpdateBusinessToBusinessSharedAudiencePathParams;
      bodyParams:UpdateBusinessToBusinessSharedAudienceBodyParams
    }
