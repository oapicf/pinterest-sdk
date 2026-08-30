import { CatalogsCreativeAssetsAttributes } from './catalogs-creative-assets-attributes';


/**
 * A creative assets item to be created.
 */
export interface CatalogsCreateCreativeAssetsItem { 
  attributes: CatalogsCreativeAssetsAttributes;
  /**
   * The catalog creative assets id in the merchant namespace
   */
  creative_assets_id: string;
  operation: CatalogsCreateCreativeAssetsItem.OperationEnum;
}
export namespace CatalogsCreateCreativeAssetsItem {
  export const OperationEnum = {
    Create: 'CREATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


