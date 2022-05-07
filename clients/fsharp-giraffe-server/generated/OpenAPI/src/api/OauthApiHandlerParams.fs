namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.OauthAccessTokenResponse
open System.Collections.Generic
open System

module OauthApiHandlerParams =


    //#region Form parameters
    [<CLIMutable>]
    type OauthTokenFormParams = {
      grantType : string ;
    }
    //#endregion


    type OauthTokenStatusCode200Response = {
      content:OauthAccessTokenResponse;
      
    }

    type OauthTokenDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type OauthTokenResult = OauthTokenStatusCode200 of OauthTokenStatusCode200Response|OauthTokenDefaultStatusCode of OauthTokenDefaultStatusCodeResponse

    type OauthTokenArgs = {
      formParams:Result<OauthTokenFormParams,string>
    }
