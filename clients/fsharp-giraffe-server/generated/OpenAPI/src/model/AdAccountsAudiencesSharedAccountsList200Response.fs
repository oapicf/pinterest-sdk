namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SharedAudienceAccount
open OpenAPI.Model.string option

module AdAccountsAudiencesSharedAccountsList200Response =

  //#region AdAccountsAudiencesSharedAccountsList200Response


  type ad_accounts_audiences_shared_accounts_list_200_response = {
    Items : SharedAudienceAccount[];
    Bookmark : string option;
  }
  //#endregion
