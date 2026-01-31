namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TargetingTemplateGetResponseData
open OpenAPI.Model.string option

module TargetingTemplateList200Response =

  //#region TargetingTemplateList200Response


  type targeting_template_list_200_response = {
    Bookmark : string option;
    Items : TargetingTemplateGetResponseData[];
  }
  //#endregion
