namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EntityLabel

module EntityLabelError =

  //#region EntityLabelError


  type EntityLabelError = {
    Data : EntityLabel;
    ErrorMessages : string[];
  }
  //#endregion
