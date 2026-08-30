namespace OpenAPI.Model

open System
open System.Collections.Generic

module StoreMetadata =

  //#region StoreMetadata


  type StoreMetadata = {
    Geohash : string;
    Latitude : double;
    Longitude : double;
    StoreCode : string;
    StoreId : string;
    StoreName : string;
  }
  //#endregion
