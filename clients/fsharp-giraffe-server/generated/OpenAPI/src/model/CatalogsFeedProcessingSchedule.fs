namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedProcessingScheduleTimezone

module CatalogsFeedProcessingSchedule =

  //#region CatalogsFeedProcessingSchedule


  type CatalogsFeedProcessingSchedule = {
    Time : string;
    Timezone : CatalogsFeedProcessingScheduleTimezone;
  }
  //#endregion
