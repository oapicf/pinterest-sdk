namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TemplateResponse
open OpenAPI.Model.string option

module TemplatesList200Response =

  //#region TemplatesList200Response


  type templates_list_200_response = {
    Items : TemplateResponse[];
    Bookmark : string option;
  }
  //#endregion
