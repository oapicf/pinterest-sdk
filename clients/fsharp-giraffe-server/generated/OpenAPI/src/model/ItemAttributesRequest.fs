namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsAiContentDisclosure
open OpenAPI.Model.ItemAttributesRequestImageLink
open OpenAPI.Model.UpdatableItemAttributesGtin
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ItemAttributesRequest =

  //#region ItemAttributesRequest


  type ItemAttributesRequest = {
    AdImage0Link : string option;
    AdImage0Tag : string option;
    AdImage10Link : string option;
    AdImage10Tag : string option;
    AdImage11Link : string option;
    AdImage11Tag : string option;
    AdImage12Link : string option;
    AdImage12Tag : string option;
    AdImage13Link : string option;
    AdImage13Tag : string option;
    AdImage14Link : string option;
    AdImage14Tag : string option;
    AdImage15Link : string option;
    AdImage15Tag : string option;
    AdImage16Link : string option;
    AdImage16Tag : string option;
    AdImage17Link : string option;
    AdImage17Tag : string option;
    AdImage18Link : string option;
    AdImage18Tag : string option;
    AdImage19Link : string option;
    AdImage19Tag : string option;
    AdImage1Link : string option;
    AdImage1Tag : string option;
    AdImage2Link : string option;
    AdImage2Tag : string option;
    AdImage3Link : string option;
    AdImage3Tag : string option;
    AdImage4Link : string option;
    AdImage4Tag : string option;
    AdImage5Link : string option;
    AdImage5Tag : string option;
    AdImage6Link : string option;
    AdImage6Tag : string option;
    AdImage7Link : string option;
    AdImage7Tag : string option;
    AdImage8Link : string option;
    AdImage8Tag : string option;
    AdImage9Link : string option;
    AdImage9Tag : string option;
    AdLink : string option;
    AdVideo0Link : string option;
    AdVideo0Tag : string option;
    AdVideo1Link : string option;
    AdVideo1Tag : string option;
    AdVideo2Link : string option;
    AdVideo2Tag : string option;
    AdditionalImageLink : string[];
    Adult : bool option;
    AgeGroup : string option;
    AiDisclosures : CatalogsAiContentDisclosure[];
    AndroidDeepLink : string;
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
    CustomNumber0 : int option;
    CustomNumber1 : int option;
    CustomNumber2 : int option;
    CustomNumber3 : int option;
    CustomNumber4 : int option;
    Description : string;
    FreeShippingLabel : bool option;
    FreeShippingLimit : string option;
    Gender : string option;
    GoogleProductCategory : string option;
    Gtin : UpdatableItemAttributesGtin;
    Id : string;
    ImageLink : ItemAttributesRequestImageLink;
    InstallmentPrice : string option;
    IosDeepLink : string;
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
    PromotionId : string option;
    SalePrice : string option;
    SalePriceEffectiveDate : string option;
    SavePinDisabled : bool;
    Shipping : string option;
    ShippingHeight : string option;
    ShippingWeight : string option;
    ShippingWidth : string option;
    Size : string option;
    SizeSystem : string option;
    SizeType : string option;
    Tax : string option;
    Title : string;
    UnitPricingBaseMeasure : string option;
    UnitPricingMeasure : string option;
    VariantNames : string[];
    VariantValues : string[];
    VideoLink : string option;
  }
  //#endregion
