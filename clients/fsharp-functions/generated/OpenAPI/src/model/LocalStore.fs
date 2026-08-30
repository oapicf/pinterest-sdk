namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country

module LocalStore =

  //#region LocalStore

  [<CLIMutable>]
  type LocalStore = {
    [<JsonProperty(PropertyName = "address_primary")>]
    AddressPrimary : string;
    [<JsonProperty(PropertyName = "address_secondary")>]
    AddressSecondary : string;
    [<JsonProperty(PropertyName = "city")>]
    City : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : DateTime;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "latitude")>]
    Latitude : float;
    [<JsonProperty(PropertyName = "longitude")>]
    Longitude : float;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "postal_code")>]
    PostalCode : string;
    [<JsonProperty(PropertyName = "region")>]
    Region : string;
    [<JsonProperty(PropertyName = "store_code")>]
    StoreCode : string;
    [<JsonProperty(PropertyName = "updated_at")>]
    UpdatedAt : DateTime;
  }

  //#endregion
