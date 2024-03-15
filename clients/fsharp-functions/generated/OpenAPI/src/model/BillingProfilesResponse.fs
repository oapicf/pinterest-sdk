namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BillingProfilesResponse =

  //#region BillingProfilesResponse

  [<CLIMutable>]
  type BillingProfilesResponse = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "card_type")>]
    CardType : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "advertiser_id")>]
    AdvertiserId : string;
    [<JsonProperty(PropertyName = "payment_method_brand")>]
    PaymentMethodBrand : string;
  }

  //#endregion
