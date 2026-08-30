namespace OpenAPI

open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.RelatedTerms
open System.Collections.Generic
open System

module TermsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type TermsRelatedListQueryParams = {
      terms : string[] ;

    }
    //#endregion


    type TermsRelatedListStatusCode200Response = {
      content:RelatedTerms;
      
    }

    type TermsRelatedListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TermsRelatedListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TermsRelatedListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TermsRelatedListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TermsRelatedListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TermsRelatedListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TermsRelatedListResult = TermsRelatedListStatusCode200 of TermsRelatedListStatusCode200Response|TermsRelatedListStatusCode400 of TermsRelatedListStatusCode400Response|TermsRelatedListStatusCode401 of TermsRelatedListStatusCode401Response|TermsRelatedListStatusCode403 of TermsRelatedListStatusCode403Response|TermsRelatedListStatusCode404 of TermsRelatedListStatusCode404Response|TermsRelatedListStatusCode429 of TermsRelatedListStatusCode429Response|TermsRelatedListDefaultStatusCode of TermsRelatedListDefaultStatusCodeResponse

    type TermsRelatedListArgs = {
      queryParams:Result<TermsRelatedListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type TermsSuggestedListQueryParams = {
      term : string ;


      limit : int option;

    }
    //#endregion


    type TermsSuggestedListStatusCode200Response = {
      content:string[];
      
    }

    type TermsSuggestedListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TermsSuggestedListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TermsSuggestedListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TermsSuggestedListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TermsSuggestedListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TermsSuggestedListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TermsSuggestedListResult = TermsSuggestedListStatusCode200 of TermsSuggestedListStatusCode200Response|TermsSuggestedListStatusCode400 of TermsSuggestedListStatusCode400Response|TermsSuggestedListStatusCode401 of TermsSuggestedListStatusCode401Response|TermsSuggestedListStatusCode403 of TermsSuggestedListStatusCode403Response|TermsSuggestedListStatusCode404 of TermsSuggestedListStatusCode404Response|TermsSuggestedListStatusCode429 of TermsSuggestedListStatusCode429Response|TermsSuggestedListDefaultStatusCode of TermsSuggestedListDefaultStatusCodeResponse

    type TermsSuggestedListArgs = {
      queryParams:Result<TermsSuggestedListQueryParams,string>;
    }
