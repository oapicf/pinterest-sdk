namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeliveryMetricsResponseItemsInner =

  //#region DeliveryMetricsResponseItemsInner

  //#region enums
  type CategoryEnum = ADSEnum of string  |  ORGANICEnum of string  
  //#endregion

  type DeliveryMetricsResponse_items_inner = {
    Name : string;
    Category : CategoryEnum;
    Definition : string;
    DisplayName : string;
  }
  //#endregion
