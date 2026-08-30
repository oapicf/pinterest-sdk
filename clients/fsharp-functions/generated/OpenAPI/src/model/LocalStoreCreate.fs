namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country

module LocalStoreCreate =

  //#region LocalStoreCreate

  [<CLIMutable>]
  type LocalStoreCreate = {
    [<JsonProperty(PropertyName = "address_primary")>]
    AddressPrimary : string;
    [<JsonProperty(PropertyName = "address_secondary")>]
    AddressSecondary : string;
    [<JsonProperty(PropertyName = "city")>]
    City : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
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
  }

  //#endregion
