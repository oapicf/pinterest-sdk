namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ImageDetails
open OpenAPI.Model.PinMedia
open OpenAPI.Model.PinMediaWithImageAllOf
open System.Collections.Generic

module PinMediaWithImage =

  //#region PinMediaWithImage


  type PinMediaWithImage = {
    Images : IDictionary<string, ImageDetails>;
  }
  //#endregion
