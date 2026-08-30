import { BulkDownloadCampaignFilter } from './bulk-download-campaign-filter';
import { BulkOutputFormat } from './bulk-output-format';
import { BulkEntityType } from './bulk-entity-type';


/**
 * Resource create operation model.
 */
export interface BulkDownloadCreate { 
  campaign_filter?: BulkDownloadCampaignFilter;
  /**
   * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
   */
  entity_ids?: Array<string>;
  /**
   * All entity types specified will be downloaded. Fewer types result in faster downloads.
   */
  entity_types?: Array<BulkEntityType>;
  output_format?: BulkOutputFormat;
  /**
   * Unix UTC timestamp to retrieve all entities that have changed since this time.
   */
  updated_since?: string;
}
export namespace BulkDownloadCreate {
}


