namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserBusinessRoleBinding
open OpenAPI.Model.string option

module GetBusinessEmployers200Response =

  //#region GetBusinessEmployers200Response


  type get_business_employers_200_response = {
    Items : UserBusinessRoleBinding[];
    Bookmark : string option;
  }
  //#endregion
