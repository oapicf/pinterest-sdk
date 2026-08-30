

export interface DeliveryMetricsResponseItemsItems { 
  /**
   * Category name
   */
  category?: DeliveryMetricsResponseItemsItems.CategoryEnum;
  /**
   * How the metric is defined.
   */
  definition?: string;
  /**
   * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
   */
  display_name?: string;
  /**
   * Metric\'s name.
   */
  name?: string;
}
export namespace DeliveryMetricsResponseItemsItems {
  export const CategoryEnum = {
    Ads: 'ADS',
    Organic: 'ORGANIC'
  } as const;
  export type CategoryEnum = typeof CategoryEnum[keyof typeof CategoryEnum];
}


