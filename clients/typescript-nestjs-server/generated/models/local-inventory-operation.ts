import { LocalInventoryCreateOperation } from './local-inventory-create-operation';
import { LocalInventoryUpdateOperation } from './local-inventory-update-operation';
import { LocalInventoryDeleteOperation } from './local-inventory-delete-operation';
import { LocalInventoryUpsertOperation } from './local-inventory-upsert-operation';
import { RetailLocalInventoryItemAttributes } from './retail-local-inventory-item-attributes';


/**
 * @type LocalInventoryOperation
 * @export
 */
export type LocalInventoryOperation = LocalInventoryCreateOperation | LocalInventoryDeleteOperation | LocalInventoryUpdateOperation | LocalInventoryUpsertOperation;

