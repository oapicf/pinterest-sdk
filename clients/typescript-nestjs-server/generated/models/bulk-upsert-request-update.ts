import { ScheduleUpdateRequest } from './schedule-update-request';
import { BulkUpsertRequestUpdateCatalogProductGroupsItems } from './bulk-upsert-request-update-catalog-product-groups-items';
import { CampaignUpdateRequest } from './campaign-update-request';
import { AdGroupUpdateRequest } from './ad-group-update-request';
import { KeywordUpdateGenerated } from './keyword-update-generated';
import { LabelBulkUpdateRequest } from './label-bulk-update-request';
import { ProductGroupPromotionUpdateRequest } from './product-group-promotion-update-request';
import { AdUpdateRequest } from './ad-update-request';


/**
 * Request for creation of entities in bulk.
 */
export interface BulkUpsertRequestUpdate { 
  ad_groups?: Array<AdGroupUpdateRequest>;
  ads?: Array<AdUpdateRequest>;
  campaigns?: Array<CampaignUpdateRequest>;
  catalog_product_groups?: Array<BulkUpsertRequestUpdateCatalogProductGroupsItems>;
  keywords?: Array<KeywordUpdateGenerated>;
  labels?: Array<LabelBulkUpdateRequest>;
  product_groups?: Array<ProductGroupPromotionUpdateRequest>;
  schedules?: Array<ScheduleUpdateRequest>;
}

