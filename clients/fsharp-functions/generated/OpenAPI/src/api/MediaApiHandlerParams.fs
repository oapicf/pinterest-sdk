namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.MediaList200Response
open OpenAPI.Model.MediaUpload
open OpenAPI.Model.MediaUploadDetails
open OpenAPI.Model.MediaUploadRequest
open System.Collections.Generic
open System

module MediaApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type MediaCreateBodyParams = MediaUploadRequest
    //#endregion


    type MediaCreateStatusCode201Response = {
      content:MediaUpload;
      
    }

    type MediaCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type MediaCreateResult = MediaCreateStatusCode201 of MediaCreateStatusCode201Response|MediaCreateDefaultStatusCode of MediaCreateDefaultStatusCodeResponse

    type MediaCreateArgs = {
      bodyParams:MediaCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type MediaGetPathParams = {
      mediaId : string ;
    }
    //#endregion


    type MediaGetStatusCode200Response = {
      content:MediaUploadDetails;
      
    }

    type MediaGetStatusCode404Response = {
      content:Error;
      
    }

    type MediaGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type MediaGetResult = MediaGetStatusCode200 of MediaGetStatusCode200Response|MediaGetStatusCode404 of MediaGetStatusCode404Response|MediaGetDefaultStatusCode of MediaGetDefaultStatusCodeResponse

    type MediaGetArgs = {
      pathParams:MediaGetPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MediaListQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type MediaListStatusCode200Response = {
      content:MediaList200Response;
      
    }

    type MediaListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type MediaListResult = MediaListStatusCode200 of MediaListStatusCode200Response|MediaListDefaultStatusCode of MediaListDefaultStatusCodeResponse

    type MediaListArgs = {
      queryParams:Result<MediaListQueryParams,string>;
    }
