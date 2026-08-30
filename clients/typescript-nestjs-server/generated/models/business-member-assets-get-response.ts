import { TotalCountByEntityStatus } from './total-count-by-entity-status';
import { AssetIdPermissions } from './asset-id-permissions';


/**
 * Paginated response for business member assets with total count metadata.
 */
export interface BusinessMemberAssetsGetResponse { 
  bookmark?: string | null;
  items: Array<AssetIdPermissions>;
  /**
   * Total number of assets matching the query
   */
  total_data_count: number;
  /**
   * Breakdown of asset counts by entity status (ad accounts only)
   */
  total_data_count_by_status?: TotalCountByEntityStatus;
}

