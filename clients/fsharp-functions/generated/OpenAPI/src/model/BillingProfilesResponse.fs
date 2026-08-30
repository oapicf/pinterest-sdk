namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BillingProfileCardType
open OpenAPI.Model.BillingProfilePaymentMethodBrand
open OpenAPI.Model.BillingProfileStatus
open OpenAPI.Model.BillingType

module BillingProfilesResponse =

  //#region BillingProfilesResponse

  [<CLIMutable>]
  type BillingProfilesResponse = {
    [<JsonProperty(PropertyName = "advertiser_id")>]
    AdvertiserId : string;
    [<JsonProperty(PropertyName = "billing_type")>]
    BillingType : BillingType;
    [<JsonProperty(PropertyName = "card_type")>]
    CardType : BillingProfileCardType;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "payment_method_brand")>]
    PaymentMethodBrand : BillingProfilePaymentMethodBrand;
    [<JsonProperty(PropertyName = "status")>]
    Status : BillingProfileStatus;
  }

  //#endregion
