

/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */
export interface CatalogsRetailReportAllItemsFilter { 
  /**
   * Unique identifier of a catalog. If not given, oldest catalog will be used
   */
  catalog_id?: string;
  /**
   * Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
   */
  product_group_id?: string;
  report_type: CatalogsRetailReportAllItemsFilter.ReportTypeEnum;
}
export namespace CatalogsRetailReportAllItemsFilter {
  export const ReportTypeEnum = {
    AllItems: 'ALL_ITEMS'
  } as const;
  export type ReportTypeEnum = typeof ReportTypeEnum[keyof typeof ReportTypeEnum];
}


