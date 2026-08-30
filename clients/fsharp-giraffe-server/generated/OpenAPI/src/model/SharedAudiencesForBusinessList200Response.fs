namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Audience
open OpenAPI.Model.string option

module SharedAudiencesForBusinessList200Response =

  //#region SharedAudiencesForBusinessList200Response


  type shared_audiences_for_business_list_200_response = {
    Bookmark : string option;
    Items : Audience[];
  }
  //#endregion
