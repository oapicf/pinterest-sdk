namespace OpenAPI

open OpenAPI.Model.ConversionAccessTokenResponse
open OpenAPI.Model.Error
open OpenAPI.Model.OauthAccessTokenResponse
open System.Collections.Generic
open System

module OauthApiHandlerParams =



    type OauthConversionTokenStatusCode200Response = {
      content:ConversionAccessTokenResponse;
      
    }

    type OauthConversionTokenDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type OauthConversionTokenResult = OauthConversionTokenStatusCode200 of OauthConversionTokenStatusCode200Response|OauthConversionTokenDefaultStatusCode of OauthConversionTokenDefaultStatusCodeResponse


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

    //#region Form parameters
    [<CLIMutable>]
    type TokenRevokeFormParams = {
      token : string ;
    //#endregion

    //#region Form parameters
      tokenTypeHint : string option;
    }
    //#endregion


    type TokenRevokeStatusCode200Response = {
      content:string;
      
    }

    type TokenRevokeStatusCode401Response = {
      content:Error;
      
    }

    type TokenRevokeStatusCode403Response = {
      content:Error;
      
    }

    type TokenRevokeDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TokenRevokeResult = TokenRevokeStatusCode200 of TokenRevokeStatusCode200Response|TokenRevokeStatusCode401 of TokenRevokeStatusCode401Response|TokenRevokeStatusCode403 of TokenRevokeStatusCode403Response|TokenRevokeDefaultStatusCode of TokenRevokeDefaultStatusCodeResponse

    type TokenRevokeArgs = {
      formParams:Result<TokenRevokeFormParams,string>
    }
