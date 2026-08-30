import { CatalogsCreateCreativeAssetsItem } from './catalogs-create-creative-assets-item';
import { CatalogsUpsertCreativeAssetsItem } from './catalogs-upsert-creative-assets-item';
import { CatalogsUpdateCreativeAssetsItem } from './catalogs-update-creative-assets-item';
import { CatalogsDeleteCreativeAssetsItem } from './catalogs-delete-creative-assets-item';
import { CatalogsUpdatableCreativeAssetsAttributes } from './catalogs-updatable-creative-assets-attributes';


/**
 * Creative assets batch item
 */
/**
 * @type CatalogsCreativeAssetsBatchItem
 * Creative assets batch item
 * @export
 */
export type CatalogsCreativeAssetsBatchItem = CatalogsCreateCreativeAssetsItem | CatalogsDeleteCreativeAssetsItem | CatalogsUpdateCreativeAssetsItem | CatalogsUpsertCreativeAssetsItem;

