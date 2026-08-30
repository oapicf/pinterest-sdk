namespace OpenAPI

open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ProductTagsBulkAddRequest
open OpenAPI.Model.ProductTagsBulkDeleteRequest
open OpenAPI.Model.ProductTagsError
open OpenAPI.Model.ProductTagsResponse
open System.Collections.Generic
open System

module ProductTagsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ProductTagsBulkAddPathParams = {
      pinId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProductTagsBulkAddBodyParams = ProductTagsBulkAddRequest
    //#endregion


    type ProductTagsBulkAddStatusCode200Response = {
      content:ProductTagsResponse;
      
    }

    type ProductTagsBulkAddStatusCode400Response = {
      content:ProductTagsError;
      
    }

    type ProductTagsBulkAddStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkAddStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkAddStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkAddDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductTagsBulkAddResult = ProductTagsBulkAddStatusCode200 of ProductTagsBulkAddStatusCode200Response|ProductTagsBulkAddStatusCode400 of ProductTagsBulkAddStatusCode400Response|ProductTagsBulkAddStatusCode401 of ProductTagsBulkAddStatusCode401Response|ProductTagsBulkAddStatusCode403 of ProductTagsBulkAddStatusCode403Response|ProductTagsBulkAddStatusCode429 of ProductTagsBulkAddStatusCode429Response|ProductTagsBulkAddDefaultStatusCode of ProductTagsBulkAddDefaultStatusCodeResponse

    type ProductTagsBulkAddArgs = {
      pathParams:ProductTagsBulkAddPathParams;
      bodyParams:ProductTagsBulkAddBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ProductTagsBulkDeletePathParams = {
      pinId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProductTagsBulkDeleteBodyParams = ProductTagsBulkDeleteRequest
    //#endregion


    type ProductTagsBulkDeleteStatusCode204Response = {
      content:string;
      
    }

    type ProductTagsBulkDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsBulkDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductTagsBulkDeleteResult = ProductTagsBulkDeleteStatusCode204 of ProductTagsBulkDeleteStatusCode204Response|ProductTagsBulkDeleteStatusCode400 of ProductTagsBulkDeleteStatusCode400Response|ProductTagsBulkDeleteStatusCode401 of ProductTagsBulkDeleteStatusCode401Response|ProductTagsBulkDeleteStatusCode403 of ProductTagsBulkDeleteStatusCode403Response|ProductTagsBulkDeleteStatusCode404 of ProductTagsBulkDeleteStatusCode404Response|ProductTagsBulkDeleteStatusCode429 of ProductTagsBulkDeleteStatusCode429Response|ProductTagsBulkDeleteDefaultStatusCode of ProductTagsBulkDeleteDefaultStatusCodeResponse

    type ProductTagsBulkDeleteArgs = {
      pathParams:ProductTagsBulkDeletePathParams;
      bodyParams:ProductTagsBulkDeleteBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ProductTagsListPathParams = {
      pinId : string ;
    }
    //#endregion


    type ProductTagsListStatusCode200Response = {
      content:ProductTagsResponse;
      
    }

    type ProductTagsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductTagsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductTagsListResult = ProductTagsListStatusCode200 of ProductTagsListStatusCode200Response|ProductTagsListStatusCode400 of ProductTagsListStatusCode400Response|ProductTagsListStatusCode401 of ProductTagsListStatusCode401Response|ProductTagsListStatusCode403 of ProductTagsListStatusCode403Response|ProductTagsListStatusCode404 of ProductTagsListStatusCode404Response|ProductTagsListStatusCode429 of ProductTagsListStatusCode429Response|ProductTagsListDefaultStatusCode of ProductTagsListDefaultStatusCodeResponse

    type ProductTagsListArgs = {
      pathParams:ProductTagsListPathParams;
    }
