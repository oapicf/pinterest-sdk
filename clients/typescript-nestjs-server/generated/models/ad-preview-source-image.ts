

/**
 * Ad preview source from an image URL.
 */
export interface AdPreviewSourceImage { 
  /**
   * Image URL.
   */
  image_url: string;
  /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   */
  promotion_id?: string;
  /**
   * Title displayed below ad.
   */
  title: string;
}

