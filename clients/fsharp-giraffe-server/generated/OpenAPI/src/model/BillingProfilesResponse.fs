namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BillingProfileCardType
open OpenAPI.Model.BillingProfilePaymentMethodBrand
open OpenAPI.Model.BillingProfileStatus
open OpenAPI.Model.BillingType

module BillingProfilesResponse =

  //#region BillingProfilesResponse


  type BillingProfilesResponse = {
    AdvertiserId : string;
    BillingType : BillingType;
    CardType : BillingProfileCardType;
    Id : string;
    PaymentMethodBrand : BillingProfilePaymentMethodBrand;
    Status : BillingProfileStatus;
  }
  //#endregion
