namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserBusinessRoleBinding
open OpenAPI.Model.string option

module GetBusinessMembers200Response =

  //#region GetBusinessMembers200Response


  type get_business_members_200_response = {
    Bookmark : string option;
    Items : UserBusinessRoleBinding[];
  }
  //#endregion
