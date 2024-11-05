namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserBusinessRoleBinding
open OpenAPI.Model.string option

module GetBusinessPartners200Response =

  //#region GetBusinessPartners200Response


  type get_business_partners_200_response = {
    Items : UserBusinessRoleBinding[];
    Bookmark : string option;
  }
  //#endregion
