/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add product tags to pin
* Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
*
* pinUnderscoreid String Unique identifier of the hero pin that will receive product tags.
* productTagsBulkAddRequest ProductTagsBulkAddRequest 
* returns ProductTagsResponse
* */
const product_tags/bulk_add = ({ pinUnderscoreid, productTagsBulkAddRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
        productTagsBulkAddRequest,
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
* Delete product tags from pin
* Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
*
* pinUnderscoreid String Unique identifier of the hero pin that will receive product tags.
* productTagsBulkDeleteRequest ProductTagsBulkDeleteRequest 
* no response value expected for this operation
* */
const product_tags/bulk_delete = ({ pinUnderscoreid, productTagsBulkDeleteRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
        productTagsBulkDeleteRequest,
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
* Get product tags for pin
* Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
*
* pinUnderscoreid String Unique identifier of the hero pin that will receive product tags.
* returns ProductTagsResponse
* */
const product_tags/list = ({ pinUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pinUnderscoreid,
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
  product_tags/bulk_add,
  product_tags/bulk_delete,
  product_tags/list,
};
