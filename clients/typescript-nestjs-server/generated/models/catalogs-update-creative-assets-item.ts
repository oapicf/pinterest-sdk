import { CatalogsUpdatableCreativeAssetsAttributes } from './catalogs-updatable-creative-assets-attributes';


/**
 * A creative assets item to be updated.
 */
export interface CatalogsUpdateCreativeAssetsItem { 
  attributes: CatalogsUpdatableCreativeAssetsAttributes;
  /**
   * The catalog creative assets item id in the merchant namespace
   */
  creative_assets_id: string;
  operation: CatalogsUpdateCreativeAssetsItem.OperationEnum;
}
export namespace CatalogsUpdateCreativeAssetsItem {
  export const OperationEnum = {
    Update: 'UPDATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


