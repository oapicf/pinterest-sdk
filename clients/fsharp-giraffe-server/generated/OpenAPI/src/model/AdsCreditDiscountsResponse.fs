namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdsCreditDiscountType
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AdsCreditDiscountsResponse =

  //#region AdsCreditDiscountsResponse


  type AdsCreditDiscountsResponse = {
    Active : bool;
    AdvertiserId : string;
    DiscountCurrency : string option;
    DiscountInMicroCurrency : decimal option;
    DiscountType : AdsCreditDiscountType;
    RemainingDiscountInMicroCurrency : decimal option;
    Title : string option;
  }
  //#endregion
