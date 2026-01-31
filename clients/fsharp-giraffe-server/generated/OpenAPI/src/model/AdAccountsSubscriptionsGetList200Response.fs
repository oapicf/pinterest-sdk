namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadSubscription
open OpenAPI.Model.string option

module AdAccountsSubscriptionsGetList200Response =

  //#region AdAccountsSubscriptionsGetList200Response


  type ad_accounts_subscriptions_get_list_200_response = {
    Bookmark : string option;
    Items : LeadSubscription[];
  }
  //#endregion
