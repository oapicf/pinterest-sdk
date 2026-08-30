namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserWebsite
open OpenAPI.Model.string option

module UserWebsitesGet200Response =

  //#region UserWebsitesGet200Response


  type user_websites_get_200_response = {
    Bookmark : string option;
    Items : UserWebsite[];
  }
  //#endregion
