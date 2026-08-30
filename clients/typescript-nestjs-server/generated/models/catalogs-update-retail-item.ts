import { UpdatableItemAttributes } from './updatable-item-attributes';
import { UpdateMaskFieldType } from './update-mask-field-type';


/**
 * An item to be updated
 */
export interface CatalogsUpdateRetailItem { 
  attributes: UpdatableItemAttributes;
  /**
   * The catalog item id in the merchant namespace
   */
  item_id: string;
  operation: CatalogsUpdateRetailItem.OperationEnum;
  /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   */
  update_mask?: Array<UpdateMaskFieldType> | null;
}
export namespace CatalogsUpdateRetailItem {
  export const OperationEnum = {
    Update: 'UPDATE'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


