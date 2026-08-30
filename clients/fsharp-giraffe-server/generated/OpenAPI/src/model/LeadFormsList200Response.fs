namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadForm
open OpenAPI.Model.string option

module LeadFormsList200Response =

  //#region LeadFormsList200Response


  type lead_forms_list_200_response = {
    Bookmark : string option;
    Items : LeadForm[];
  }
  //#endregion
