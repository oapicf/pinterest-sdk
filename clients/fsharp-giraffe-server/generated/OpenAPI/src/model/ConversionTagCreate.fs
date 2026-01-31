namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option

module ConversionTagCreate =

  //#region ConversionTagCreate


  type ConversionTagCreate = {
    AemDbEnabled : bool option;
    AemEnabled : bool option;
    AemExternalIdEnabled : bool option;
    AemFnlnEnabled : bool option;
    AemGeEnabled : bool option;
    AemLocEnabled : bool option;
    AemPhEnabled : bool option;
    MdFrequency : decimal option;
    Name : string;
  }
  //#endregion
