import { ItemAttributesRequest } from './item-attributes-request';
import { CatalogsCreateRetailItem } from './catalogs-create-retail-item';
import { CatalogsDeleteRetailItem } from './catalogs-delete-retail-item';
import { CatalogsUpdateRetailItem } from './catalogs-update-retail-item';
import { UpdateMaskFieldType } from './update-mask-field-type';
import { CatalogsUpsertRetailItem } from './catalogs-upsert-retail-item';


/**
 * @type CatalogsRetailBatchRequestItemsItems
 * @export
 */
export type CatalogsRetailBatchRequestItemsItems = CatalogsCreateRetailItem | CatalogsDeleteRetailItem | CatalogsUpdateRetailItem | CatalogsUpsertRetailItem;

