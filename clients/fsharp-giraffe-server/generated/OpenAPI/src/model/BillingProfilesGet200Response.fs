namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BillingProfilesResponse
open OpenAPI.Model.string option

module BillingProfilesGet200Response =

  //#region BillingProfilesGet200Response


  type billing_profiles_get_200_response = {
    Items : BillingProfilesResponse[];
    Bookmark : string option;
  }
  //#endregion
