/**
 * The ProductTagsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProductTagsService');
const product_tags/bulk_add = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_tags/bulk_add);
};

const product_tags/bulk_delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_tags/bulk_delete);
};

const product_tags/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_tags/list);
};


module.exports = {
  product_tags/bulk_add,
  product_tags/bulk_delete,
  product_tags/list,
};
