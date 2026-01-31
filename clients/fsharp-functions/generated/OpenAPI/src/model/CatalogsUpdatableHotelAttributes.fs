namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelAddress
open OpenAPI.Model.CatalogsHotelGuestRatings
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsUpdatableHotelAttributes =

  //#region CatalogsUpdatableHotelAttributes

  [<CLIMutable>]
  type CatalogsUpdatableHotelAttributes = {
    [<JsonProperty(PropertyName = "address")>]
    Address : CatalogsHotelAddress;
    [<JsonProperty(PropertyName = "base_price")>]
    BasePrice : string option;
    [<JsonProperty(PropertyName = "brand")>]
    Brand : string option;
    [<JsonProperty(PropertyName = "category")>]
    Category : string option;
    [<JsonProperty(PropertyName = "custom_label_0")>]
    CustomLabel0 : string option;
    [<JsonProperty(PropertyName = "custom_label_1")>]
    CustomLabel1 : string option;
    [<JsonProperty(PropertyName = "custom_label_2")>]
    CustomLabel2 : string option;
    [<JsonProperty(PropertyName = "custom_label_3")>]
    CustomLabel3 : string option;
    [<JsonProperty(PropertyName = "custom_label_4")>]
    CustomLabel4 : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "guest_ratings")>]
    GuestRatings : CatalogsHotelGuestRatings;
    [<JsonProperty(PropertyName = "latitude")>]
    Latitude : decimal;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "longitude")>]
    Longitude : decimal option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "neighborhood")>]
    Neighborhood : string[];
    [<JsonProperty(PropertyName = "sale_price")>]
    SalePrice : string option;
  }

  //#endregion
