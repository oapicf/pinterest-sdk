

/**
 * The counts can be null early in the process.
 */
export interface CatalogsFeedProductCounts { 
  /**
   * The number of products successfully ingested from the feed file.
   */
  ingested?: number;
  /**
   * The number of products in the feed file.
   */
  original?: number;
}

