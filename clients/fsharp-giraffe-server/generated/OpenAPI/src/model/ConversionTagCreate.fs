namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option

module ConversionTagCreate =

  //#region ConversionTagCreate


  type ConversionTagCreate = {
    Name : string;
    AemEnabled : bool option;
    MdFrequency : decimal option;
    AemFnlnEnabled : bool option;
    AemPhEnabled : bool option;
    AemGeEnabled : bool option;
    AemDbEnabled : bool option;
    AemLocEnabled : bool option;
  }
  //#endregion
