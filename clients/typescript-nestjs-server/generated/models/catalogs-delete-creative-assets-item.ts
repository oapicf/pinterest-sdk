

/**
 * A creative assets item to be deleted
 */
export interface CatalogsDeleteCreativeAssetsItem { 
  /**
   * The catalog creative assets id in the merchant namespace
   */
  creative_assets_id: string;
  operation: CatalogsDeleteCreativeAssetsItem.OperationEnum;
}
export namespace CatalogsDeleteCreativeAssetsItem {
  export const OperationEnum = {
    Delete: 'DELETE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


