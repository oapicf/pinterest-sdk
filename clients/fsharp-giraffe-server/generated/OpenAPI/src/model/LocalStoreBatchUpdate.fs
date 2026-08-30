namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country

module LocalStoreBatchUpdate =

  //#region LocalStoreBatchUpdate


  type LocalStoreBatchUpdate = {
    AddressPrimary : string;
    AddressSecondary : string;
    City : string;
    Country : Country;
    Id : string;
    Latitude : float;
    Longitude : float;
    Name : string;
    PostalCode : string;
    Region : string;
    StoreCode : string;
  }
  //#endregion
