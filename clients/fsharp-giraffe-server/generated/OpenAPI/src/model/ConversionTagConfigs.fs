namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option

module ConversionTagConfigs =

  //#region ConversionTagConfigs


  type ConversionTagConfigs = {
    AemEnabled : bool option;
    MdFrequency : decimal option;
    AemFnlnEnabled : bool option;
    AemPhEnabled : bool option;
    AemGeEnabled : bool option;
    AemDbEnabled : bool option;
    AemLocEnabled : bool option;
  }
  //#endregion
