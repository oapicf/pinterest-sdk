namespace OpenAPI

open OpenAPI.Model.AdAccountToAdAccountSharedAudience
open OpenAPI.Model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.AdAccountToBusinessSharedAudience
open OpenAPI.Model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.AdAccountsAudiencesSharedAccountsList200Response
open OpenAPI.Model.AudienceAccountType
open OpenAPI.Model.BusinessToAdAccountSharedAudience
open OpenAPI.Model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.BusinessToBusinessSharedAudience
open OpenAPI.Model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.Order
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SharedAudiencesForBusinessList200Response
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


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type AdAccountsAudiencesSharedAccountsListStatusCode200Response = {
      content:AdAccountsAudiencesSharedAccountsList200Response;
      
    }

    type AdAccountsAudiencesSharedAccountsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsAudiencesSharedAccountsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsAudiencesSharedAccountsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsAudiencesSharedAccountsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsAudiencesSharedAccountsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsAudiencesSharedAccountsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsAudiencesSharedAccountsListResult = AdAccountsAudiencesSharedAccountsListStatusCode200 of AdAccountsAudiencesSharedAccountsListStatusCode200Response|AdAccountsAudiencesSharedAccountsListStatusCode400 of AdAccountsAudiencesSharedAccountsListStatusCode400Response|AdAccountsAudiencesSharedAccountsListStatusCode401 of AdAccountsAudiencesSharedAccountsListStatusCode401Response|AdAccountsAudiencesSharedAccountsListStatusCode403 of AdAccountsAudiencesSharedAccountsListStatusCode403Response|AdAccountsAudiencesSharedAccountsListStatusCode404 of AdAccountsAudiencesSharedAccountsListStatusCode404Response|AdAccountsAudiencesSharedAccountsListStatusCode429 of AdAccountsAudiencesSharedAccountsListStatusCode429Response|AdAccountsAudiencesSharedAccountsListDefaultStatusCode of AdAccountsAudiencesSharedAccountsListDefaultStatusCodeResponse

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


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BusinessAccountAudiencesSharedAccountsListStatusCode200Response = {
      content:AdAccountsAudiencesSharedAccountsList200Response;
      
    }

    type BusinessAccountAudiencesSharedAccountsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BusinessAccountAudiencesSharedAccountsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BusinessAccountAudiencesSharedAccountsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BusinessAccountAudiencesSharedAccountsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BusinessAccountAudiencesSharedAccountsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BusinessAccountAudiencesSharedAccountsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BusinessAccountAudiencesSharedAccountsListResult = BusinessAccountAudiencesSharedAccountsListStatusCode200 of BusinessAccountAudiencesSharedAccountsListStatusCode200Response|BusinessAccountAudiencesSharedAccountsListStatusCode400 of BusinessAccountAudiencesSharedAccountsListStatusCode400Response|BusinessAccountAudiencesSharedAccountsListStatusCode401 of BusinessAccountAudiencesSharedAccountsListStatusCode401Response|BusinessAccountAudiencesSharedAccountsListStatusCode403 of BusinessAccountAudiencesSharedAccountsListStatusCode403Response|BusinessAccountAudiencesSharedAccountsListStatusCode404 of BusinessAccountAudiencesSharedAccountsListStatusCode404Response|BusinessAccountAudiencesSharedAccountsListStatusCode429 of BusinessAccountAudiencesSharedAccountsListStatusCode429Response|BusinessAccountAudiencesSharedAccountsListDefaultStatusCode of BusinessAccountAudiencesSharedAccountsListDefaultStatusCodeResponse

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
      order : Order option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type SharedAudiencesForBusinessListStatusCode200Response = {
      content:SharedAudiencesForBusinessList200Response;
      
    }

    type SharedAudiencesForBusinessListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SharedAudiencesForBusinessListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SharedAudiencesForBusinessListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SharedAudiencesForBusinessListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SharedAudiencesForBusinessListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SharedAudiencesForBusinessListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SharedAudiencesForBusinessListResult = SharedAudiencesForBusinessListStatusCode200 of SharedAudiencesForBusinessListStatusCode200Response|SharedAudiencesForBusinessListStatusCode400 of SharedAudiencesForBusinessListStatusCode400Response|SharedAudiencesForBusinessListStatusCode401 of SharedAudiencesForBusinessListStatusCode401Response|SharedAudiencesForBusinessListStatusCode403 of SharedAudiencesForBusinessListStatusCode403Response|SharedAudiencesForBusinessListStatusCode404 of SharedAudiencesForBusinessListStatusCode404Response|SharedAudiencesForBusinessListStatusCode429 of SharedAudiencesForBusinessListStatusCode429Response|SharedAudiencesForBusinessListDefaultStatusCode of SharedAudiencesForBusinessListDefaultStatusCodeResponse

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
    type UpdateAdAccountToAdAccountSharedAudienceBodyParams = AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    //#endregion


    type UpdateAdAccountToAdAccountSharedAudienceStatusCode200Response = {
      content:AdAccountToAdAccountSharedAudience;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UpdateAdAccountToAdAccountSharedAudienceResult = UpdateAdAccountToAdAccountSharedAudienceStatusCode200 of UpdateAdAccountToAdAccountSharedAudienceStatusCode200Response|UpdateAdAccountToAdAccountSharedAudienceStatusCode400 of UpdateAdAccountToAdAccountSharedAudienceStatusCode400Response|UpdateAdAccountToAdAccountSharedAudienceStatusCode401 of UpdateAdAccountToAdAccountSharedAudienceStatusCode401Response|UpdateAdAccountToAdAccountSharedAudienceStatusCode403 of UpdateAdAccountToAdAccountSharedAudienceStatusCode403Response|UpdateAdAccountToAdAccountSharedAudienceStatusCode404 of UpdateAdAccountToAdAccountSharedAudienceStatusCode404Response|UpdateAdAccountToAdAccountSharedAudienceStatusCode429 of UpdateAdAccountToAdAccountSharedAudienceStatusCode429Response|UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCode of UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCodeResponse

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
    type UpdateAdAccountToBusinessSharedAudienceBodyParams = AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
    //#endregion


    type UpdateAdAccountToBusinessSharedAudienceStatusCode200Response = {
      content:AdAccountToBusinessSharedAudience;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UpdateAdAccountToBusinessSharedAudienceDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UpdateAdAccountToBusinessSharedAudienceResult = UpdateAdAccountToBusinessSharedAudienceStatusCode200 of UpdateAdAccountToBusinessSharedAudienceStatusCode200Response|UpdateAdAccountToBusinessSharedAudienceStatusCode400 of UpdateAdAccountToBusinessSharedAudienceStatusCode400Response|UpdateAdAccountToBusinessSharedAudienceStatusCode401 of UpdateAdAccountToBusinessSharedAudienceStatusCode401Response|UpdateAdAccountToBusinessSharedAudienceStatusCode403 of UpdateAdAccountToBusinessSharedAudienceStatusCode403Response|UpdateAdAccountToBusinessSharedAudienceStatusCode404 of UpdateAdAccountToBusinessSharedAudienceStatusCode404Response|UpdateAdAccountToBusinessSharedAudienceStatusCode429 of UpdateAdAccountToBusinessSharedAudienceStatusCode429Response|UpdateAdAccountToBusinessSharedAudienceDefaultStatusCode of UpdateAdAccountToBusinessSharedAudienceDefaultStatusCodeResponse

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
    type UpdateBusinessToAdAccountSharedAudienceBodyParams = BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
    //#endregion


    type UpdateBusinessToAdAccountSharedAudienceStatusCode200Response = {
      content:BusinessToAdAccountSharedAudience;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToAdAccountSharedAudienceDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UpdateBusinessToAdAccountSharedAudienceResult = UpdateBusinessToAdAccountSharedAudienceStatusCode200 of UpdateBusinessToAdAccountSharedAudienceStatusCode200Response|UpdateBusinessToAdAccountSharedAudienceStatusCode400 of UpdateBusinessToAdAccountSharedAudienceStatusCode400Response|UpdateBusinessToAdAccountSharedAudienceStatusCode401 of UpdateBusinessToAdAccountSharedAudienceStatusCode401Response|UpdateBusinessToAdAccountSharedAudienceStatusCode403 of UpdateBusinessToAdAccountSharedAudienceStatusCode403Response|UpdateBusinessToAdAccountSharedAudienceStatusCode404 of UpdateBusinessToAdAccountSharedAudienceStatusCode404Response|UpdateBusinessToAdAccountSharedAudienceStatusCode429 of UpdateBusinessToAdAccountSharedAudienceStatusCode429Response|UpdateBusinessToAdAccountSharedAudienceDefaultStatusCode of UpdateBusinessToAdAccountSharedAudienceDefaultStatusCodeResponse

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
    type UpdateBusinessToBusinessSharedAudienceBodyParams = BusinessToBusinessSharedAudienceUpdateWithRequiredBody
    //#endregion


    type UpdateBusinessToBusinessSharedAudienceStatusCode200Response = {
      content:BusinessToBusinessSharedAudience;
      
    }

    type UpdateBusinessToBusinessSharedAudienceStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToBusinessSharedAudienceStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToBusinessSharedAudienceStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToBusinessSharedAudienceStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToBusinessSharedAudienceStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type UpdateBusinessToBusinessSharedAudienceDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type UpdateBusinessToBusinessSharedAudienceResult = UpdateBusinessToBusinessSharedAudienceStatusCode200 of UpdateBusinessToBusinessSharedAudienceStatusCode200Response|UpdateBusinessToBusinessSharedAudienceStatusCode400 of UpdateBusinessToBusinessSharedAudienceStatusCode400Response|UpdateBusinessToBusinessSharedAudienceStatusCode401 of UpdateBusinessToBusinessSharedAudienceStatusCode401Response|UpdateBusinessToBusinessSharedAudienceStatusCode403 of UpdateBusinessToBusinessSharedAudienceStatusCode403Response|UpdateBusinessToBusinessSharedAudienceStatusCode404 of UpdateBusinessToBusinessSharedAudienceStatusCode404Response|UpdateBusinessToBusinessSharedAudienceStatusCode429 of UpdateBusinessToBusinessSharedAudienceStatusCode429Response|UpdateBusinessToBusinessSharedAudienceDefaultStatusCode of UpdateBusinessToBusinessSharedAudienceDefaultStatusCodeResponse

    type UpdateBusinessToBusinessSharedAudienceArgs = {
      pathParams:UpdateBusinessToBusinessSharedAudiencePathParams;
      bodyParams:UpdateBusinessToBusinessSharedAudienceBodyParams
    }
