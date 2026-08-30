import { CatalogsCreativeAssetsAttributes } from './catalogs-creative-assets-attributes';


/**
 * A creative assets item to be upserted.
 */
export interface CatalogsUpsertCreativeAssetsItem { 
  attributes: CatalogsCreativeAssetsAttributes;
  /**
   * The catalog creative assets id in the merchant namespace
   */
  creative_assets_id: string;
  operation: CatalogsUpsertCreativeAssetsItem.OperationEnum;
}
export namespace CatalogsUpsertCreativeAssetsItem {
  export const OperationEnum = {
    Upsert: 'UPSERT'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


