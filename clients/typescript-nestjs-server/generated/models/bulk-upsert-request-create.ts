import { CampaignCreateRequest } from './campaign-create-request';
import { LabelBulkCreateRequest } from './label-bulk-create-request';
import { AdGroupCreateRequest } from './ad-group-create-request';
import { ScheduleCreateRequest } from './schedule-create-request';
import { KeywordsRequest } from './keywords-request';
import { BulkUpsertRequestCreateCatalogProductGroupsItems } from './bulk-upsert-request-create-catalog-product-groups-items';
import { AdCreateRequest } from './ad-create-request';
import { ProductGroupPromotionCreateRequest } from './product-group-promotion-create-request';


/**
 * Request for creation of entities in bulk.
 */
export interface BulkUpsertRequestCreate { 
  ad_groups?: Array<AdGroupCreateRequest>;
  ads?: Array<AdCreateRequest>;
  campaigns?: Array<CampaignCreateRequest>;
  catalog_product_groups?: Array<BulkUpsertRequestCreateCatalogProductGroupsItems>;
  keywords?: Array<KeywordsRequest>;
  labels?: Array<LabelBulkCreateRequest>;
  product_groups?: Array<ProductGroupPromotionCreateRequest>;
  schedules?: Array<ScheduleCreateRequest>;
}

