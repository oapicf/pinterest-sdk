namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.string option

module AdGroupsList200Response =

  //#region AdGroupsList200Response


  type ad_groups_list_200_response = {
    Bookmark : string option;
    Items : AdGroupResponse[];
  }
  //#endregion
