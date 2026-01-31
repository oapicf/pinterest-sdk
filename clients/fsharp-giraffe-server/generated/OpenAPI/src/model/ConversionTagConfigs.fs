namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option

module ConversionTagConfigs =

  //#region ConversionTagConfigs


  type ConversionTagConfigs = {
    AemDbEnabled : bool option;
    AemEnabled : bool option;
    AemExternalIdEnabled : bool option;
    AemFnlnEnabled : bool option;
    AemGeEnabled : bool option;
    AemLocEnabled : bool option;
    AemPhEnabled : bool option;
    MdFrequency : decimal option;
    NoCodeCapiDomains : string[];
  }
  //#endregion
