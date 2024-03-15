namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserWebsiteSummary
open OpenAPI.Model.string option

module UserWebsitesGet200Response =

  //#region UserWebsitesGet200Response


  type user_websites_get_200_response = {
    Items : UserWebsiteSummary[];
    Bookmark : string option;
  }
  //#endregion
