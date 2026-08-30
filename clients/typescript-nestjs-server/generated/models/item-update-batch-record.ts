import { UpdatableItemAttributes } from './updatable-item-attributes';
import { UpdateMaskFieldType } from './update-mask-field-type';


/**
 * Object describing an item batch record to update items
 */
export interface ItemUpdateBatchRecord { 
  attributes?: UpdatableItemAttributes;
  /**
   * The catalog item id in the merchant namespace
   */
  item_id?: string;
  /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   */
  update_mask?: Array<UpdateMaskFieldType> | null;
}

