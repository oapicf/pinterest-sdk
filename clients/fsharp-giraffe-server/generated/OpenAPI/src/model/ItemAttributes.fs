namespace OpenAPI.Model

open System
open System.Collections.Generic

module ItemAttributes =

  //#region ItemAttributes


  type ItemAttributes = {
    AdLink : string;
    AdditionalImageLink : string[];
    Adult : bool;
    AgeGroup : string;
    Availability : string;
    AverageReviewRating : decimal;
    Brand : string;
    Color : string;
    Condition : string;
    CustomLabel0 : string;
    CustomLabel1 : string;
    CustomLabel2 : string;
    CustomLabel3 : string;
    CustomLabel4 : string;
    Description : string;
    FreeShippingLabel : bool;
    FreeShippingLimit : string;
    Gender : string;
    GoogleProductCategory : string;
    Gtin : int;
    Id : string;
    ImageLink : string[];
    ItemGroupId : string;
    LastUpdatedTime : int64;
    Link : string;
    Material : string;
    MinAdPrice : string;
    MobileLink : string;
    Mpn : string;
    NumberOfRatings : int;
    NumberOfReviews : int;
    Pattern : string;
    Price : string;
    ProductType : string;
    SalePrice : string;
    Shipping : string;
    ShippingHeight : string;
    ShippingWeight : string;
    ShippingWidth : string;
    Size : string;
    SizeSystem : string;
    SizeType : string;
    Tax : string;
    Title : string;
  }
  //#endregion
