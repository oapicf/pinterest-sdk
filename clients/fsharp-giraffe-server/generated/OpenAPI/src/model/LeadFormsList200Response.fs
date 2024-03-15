namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadFormResponse
open OpenAPI.Model.string option

module LeadFormsList200Response =

  //#region LeadFormsList200Response


  type lead_forms_list_200_response = {
    Items : LeadFormResponse[];
    Bookmark : string option;
  }
  //#endregion
