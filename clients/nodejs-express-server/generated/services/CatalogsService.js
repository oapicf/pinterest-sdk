/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create product group
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.
*
* catalogsProductGroupCreateRequest CatalogsProductGroupCreateRequest Request object used to created a catalogs product group.
* returns Object
* */
const catalogs_product_groups/create = ({ catalogsProductGroupCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogsProductGroupCreateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete product group
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.
*
* productUnderscoregroupUnderscoreid String Unique identifier of a product group
* no response value expected for this operation
* */
const catalogs_product_groups/delete = ({ productUnderscoregroupUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        productUnderscoregroupUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get product groups list
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.
*
* feedUnderscoreid String Unique identifier of a feed
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* returns Paginated
* */
const catalogs_product_groups/list = ({ feedUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        feedUnderscoreid,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update product group
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.
*
* productUnderscoregroupUnderscoreid String Unique identifier of a product group
* catalogsProductGroupUpdateRequest CatalogsProductGroupUpdateRequest Request object used to Update a catalogs product group.
* returns CatalogsProductGroup
* */
const catalogs_product_groups/update = ({ productUnderscoregroupUnderscoreid, catalogsProductGroupUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        productUnderscoregroupUnderscoreid,
        catalogsProductGroupUpdateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List processing results for a given feed
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.
*
* feedUnderscoreid String Unique identifier of a feed
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* returns Paginated
* */
const feed_processing_results/list = ({ feedUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        feedUnderscoreid,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create feed
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".
*
* catalogsFeedsCreateRequest CatalogsFeedsCreateRequest Request object used to created a feed.
* returns CatalogsFeed
* */
const feeds/create = ({ catalogsFeedsCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogsFeedsCreateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete feed
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".
*
* feedUnderscoreid String Unique identifier of a feed
* no response value expected for this operation
* */
const feeds/delete = ({ feedUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        feedUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get feed
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".
*
* feedUnderscoreid String Unique identifier of a feed
* returns CatalogsFeed
* */
const feeds/get = ({ feedUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        feedUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List feeds
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* returns Paginated
* */
const feeds/list = ({ bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update feed
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".
*
* feedUnderscoreid String Unique identifier of a feed
* catalogsFeedsUpdateRequest CatalogsFeedsUpdateRequest Request object used to update a feed.
* returns CatalogsFeed
* */
const feeds/update = ({ feedUnderscoreid, catalogsFeedsUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        feedUnderscoreid,
        catalogsFeedsUpdateRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get catalogs items
* Get the items of the catalog created by the \"operating user_account\"
*
* country String Country for the Catalogs Items
* itemUnderscoreids List Catalos Item ids
* language String Language for the Catalogs Items
* returns CatalogsItems
* */
const items/get = ({ country, itemUnderscoreids, language }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        country,
        itemUnderscoreids,
        language,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get catalogs items batch
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".
*
* batchUnderscoreid String Id of a catalogs items batch to fetch
* returns CatalogsItemsBatch
* */
const items_batch/get = ({ batchUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        batchUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Perform an operation on an item batch
* <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.
*
* catalogsItemsBatchRequest CatalogsItemsBatchRequest Request object used to create catalogs items in a batch
* returns CatalogsItemsBatch
* */
const items_batch/post = ({ catalogsItemsBatchRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        catalogsItemsBatchRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  catalogs_product_groups/create,
  catalogs_product_groups/delete,
  catalogs_product_groups/list,
  catalogs_product_groups/update,
  feed_processing_results/list,
  feeds/create,
  feeds/delete,
  feeds/get,
  feeds/list,
  feeds/update,
  items/get,
  items_batch/get,
  items_batch/post,
};
