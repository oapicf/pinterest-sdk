namespace OpenAPI

open OpenAPI.Model.ConversionAccessToken
open OpenAPI.Model.OauthAccessToken
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.TokenGrantType
open OpenAPI.Model.TokenTypeHint
open System.Collections.Generic
open System

module OauthApiHandlerParams =



    type OauthConversionTokenStatusCode200Response = {
      content:ConversionAccessToken;
      
    }

    type OauthConversionTokenStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type OauthConversionTokenStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type OauthConversionTokenStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type OauthConversionTokenStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type OauthConversionTokenStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type OauthConversionTokenDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type OauthConversionTokenResult = OauthConversionTokenStatusCode200 of OauthConversionTokenStatusCode200Response|OauthConversionTokenStatusCode400 of OauthConversionTokenStatusCode400Response|OauthConversionTokenStatusCode401 of OauthConversionTokenStatusCode401Response|OauthConversionTokenStatusCode403 of OauthConversionTokenStatusCode403Response|OauthConversionTokenStatusCode404 of OauthConversionTokenStatusCode404Response|OauthConversionTokenStatusCode429 of OauthConversionTokenStatusCode429Response|OauthConversionTokenDefaultStatusCode of OauthConversionTokenDefaultStatusCodeResponse


    //#region Form parameters
    [<CLIMutable>]
    type OauthTokenFormParams = {
      code : string option;
    //#endregion

    //#region Form parameters
      continuousRefresh : string option;
    //#endregion

    //#region Form parameters
      grantType : TokenGrantType ;
    //#endregion

    //#region Form parameters
      redirectUri : string option;
    //#endregion

    //#region Form parameters
      refreshToken : string option;
    //#endregion

    //#region Form parameters
      scope : string option;
    }
    //#endregion


    type OauthTokenStatusCode200Response = {
      content:OauthAccessToken;
      
    }

    type OauthTokenStatusCode201Response = {
      content:OauthAccessToken;
      
    }

    type OauthTokenStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type OauthTokenStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type OauthTokenStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type OauthTokenStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type OauthTokenStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type OauthTokenDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type OauthTokenResult = OauthTokenStatusCode200 of OauthTokenStatusCode200Response|OauthTokenStatusCode201 of OauthTokenStatusCode201Response|OauthTokenStatusCode400 of OauthTokenStatusCode400Response|OauthTokenStatusCode401 of OauthTokenStatusCode401Response|OauthTokenStatusCode403 of OauthTokenStatusCode403Response|OauthTokenStatusCode404 of OauthTokenStatusCode404Response|OauthTokenStatusCode429 of OauthTokenStatusCode429Response|OauthTokenDefaultStatusCode of OauthTokenDefaultStatusCodeResponse

    type OauthTokenArgs = {
      formParams:Result<OauthTokenFormParams,string>
    }

    //#region Form parameters
    [<CLIMutable>]
    type TokenRevokeFormParams = {
      token : string ;
    //#endregion

    //#region Form parameters
      tokenTypeHint : TokenTypeHint option;
    }
    //#endregion


    type TokenRevokeStatusCode200Response = {
      content:string;
      
    }

    type TokenRevokeStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TokenRevokeStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TokenRevokeDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TokenRevokeResult = TokenRevokeStatusCode200 of TokenRevokeStatusCode200Response|TokenRevokeStatusCode401 of TokenRevokeStatusCode401Response|TokenRevokeStatusCode403 of TokenRevokeStatusCode403Response|TokenRevokeDefaultStatusCode of TokenRevokeDefaultStatusCodeResponse

    type TokenRevokeArgs = {
      formParams:Result<TokenRevokeFormParams,string>
    }
