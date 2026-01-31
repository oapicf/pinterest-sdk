namespace OpenAPI

open OpenAPI.Model.Media
open OpenAPI.Model.MediaList200Response
open OpenAPI.Model.MediaUpload
open OpenAPI.Model.MediaUploadCreate
open OpenAPI.Model.PinterestLibError
open System.Collections.Generic
open System

module MediaApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type MediaCreateBodyParams = MediaUploadCreate
    //#endregion


    type MediaCreateStatusCode200Response = {
      content:MediaUpload;
      
    }

    type MediaCreateStatusCode201Response = {
      content:MediaUpload;
      
    }

    type MediaCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type MediaCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type MediaCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type MediaCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type MediaCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type MediaCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type MediaCreateResult = MediaCreateStatusCode200 of MediaCreateStatusCode200Response|MediaCreateStatusCode201 of MediaCreateStatusCode201Response|MediaCreateStatusCode400 of MediaCreateStatusCode400Response|MediaCreateStatusCode401 of MediaCreateStatusCode401Response|MediaCreateStatusCode403 of MediaCreateStatusCode403Response|MediaCreateStatusCode404 of MediaCreateStatusCode404Response|MediaCreateStatusCode429 of MediaCreateStatusCode429Response|MediaCreateDefaultStatusCode of MediaCreateDefaultStatusCodeResponse

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
      content:Media;
      
    }

    type MediaGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type MediaGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type MediaGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type MediaGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type MediaGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type MediaGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type MediaGetResult = MediaGetStatusCode200 of MediaGetStatusCode200Response|MediaGetStatusCode400 of MediaGetStatusCode400Response|MediaGetStatusCode401 of MediaGetStatusCode401Response|MediaGetStatusCode403 of MediaGetStatusCode403Response|MediaGetStatusCode404 of MediaGetStatusCode404Response|MediaGetStatusCode429 of MediaGetStatusCode429Response|MediaGetDefaultStatusCode of MediaGetDefaultStatusCodeResponse

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

    type MediaListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type MediaListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type MediaListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type MediaListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type MediaListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type MediaListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type MediaListResult = MediaListStatusCode200 of MediaListStatusCode200Response|MediaListStatusCode400 of MediaListStatusCode400Response|MediaListStatusCode401 of MediaListStatusCode401Response|MediaListStatusCode403 of MediaListStatusCode403Response|MediaListStatusCode404 of MediaListStatusCode404Response|MediaListStatusCode429 of MediaListStatusCode429Response|MediaListDefaultStatusCode of MediaListDefaultStatusCodeResponse

    type MediaListArgs = {
      queryParams:Result<MediaListQueryParams,string>;
    }
