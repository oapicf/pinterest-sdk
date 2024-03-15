namespace OpenAPI

open OpenAPI.Model.Error
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
      content:Error;
      
    }

    type TermsRelatedListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TermsRelatedListResult = TermsRelatedListStatusCode200 of TermsRelatedListStatusCode200Response|TermsRelatedListStatusCode400 of TermsRelatedListStatusCode400Response|TermsRelatedListDefaultStatusCode of TermsRelatedListDefaultStatusCodeResponse

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
      content:Error;
      
    }

    type TermsSuggestedListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TermsSuggestedListResult = TermsSuggestedListStatusCode200 of TermsSuggestedListStatusCode200Response|TermsSuggestedListStatusCode400 of TermsSuggestedListStatusCode400Response|TermsSuggestedListDefaultStatusCode of TermsSuggestedListDefaultStatusCodeResponse

    type TermsSuggestedListArgs = {
      queryParams:Result<TermsSuggestedListQueryParams,string>;
    }
