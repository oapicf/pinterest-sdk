namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ItemAttributes =

  //#region ItemAttributes


  type ItemAttributes = {
    AdLink : string option;
    Adult : bool option;
    AgeGroup : string option;
    Availability : string;
    AverageReviewRating : decimal option;
    Brand : string option;
    CheckoutEnabled : bool option;
    Color : string option;
    Condition : string option;
    CustomLabel0 : string option;
    CustomLabel1 : string option;
    CustomLabel2 : string option;
    CustomLabel3 : string option;
    CustomLabel4 : string option;
    Description : string;
    FreeShippingLabel : bool option;
    FreeShippingLimit : string option;
    Gender : string option;
    GoogleProductCategory : string option;
    Gtin : int option;
    Id : string;
    ItemGroupId : string option;
    LastUpdatedTime : int64;
    Link : string;
    Material : string option;
    MinAdPrice : string option;
    MobileLink : string option;
    Mpn : string option;
    NumberOfRatings : int option;
    NumberOfReviews : int option;
    Pattern : string option;
    Price : string;
    ProductType : string option;
    SalePrice : string option;
    Shipping : string option;
    ShippingHeight : string option;
    ShippingWeight : string option;
    ShippingWidth : string option;
    Size : string option;
    SizeSystem : string option;
    SizeType : string option;
    Tax : string option;
    Title : string;
    VariantNames : string[];
    VariantValues : string[];
    AdditionalImageLink : string[];
    ImageLink : string[];
  }
  //#endregion
