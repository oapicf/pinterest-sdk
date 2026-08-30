import { CreativeAssetsVisibilityType } from './creative-assets-visibility-type';


/**
 * Creative assets product metadata entity
 */
export interface CatalogsCreativeAssetsProductMetadata { 
  /**
   * The user-created unique ID that represents the creative assets item.
   */
  creative_assets_id: string;
  visibility: CreativeAssetsVisibilityType;
}
export namespace CatalogsCreativeAssetsProductMetadata {
}


