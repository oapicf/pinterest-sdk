namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeliveryMetricsResponseItemsItems =

  //#region DeliveryMetricsResponseItemsItems

  //#region enums
  type CategoryEnum = ADSEnum of string  |  ORGANICEnum of string  
  //#endregion

  type DeliveryMetricsResponseItemsItems = {
    Category : CategoryEnum;
    Definition : string;
    DisplayName : string;
    Name : string;
  }
  //#endregion
