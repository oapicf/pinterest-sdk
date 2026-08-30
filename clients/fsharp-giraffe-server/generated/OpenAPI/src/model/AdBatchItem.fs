namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Ad
open OpenAPI.Model.PinterestLibError

module AdBatchItem =

  //#region AdBatchItem


  type AdBatchItem = {
    Data : Ad;
    Exceptions : PinterestLibError;
  }
  //#endregion
