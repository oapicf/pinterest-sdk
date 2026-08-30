/**
 * The CatalogSupplementalController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CatalogSupplementalService');
const catalogs_local_inventory_items/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_local_inventory_items/post);
};

const catalogs_local_inventory_items_batch/operate = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_local_inventory_items_batch/operate);
};

const catalogs_local_stores/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_local_stores/create);
};

const catalogs_local_stores/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_local_stores/delete);
};

const catalogs_local_stores/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_local_stores/list);
};

const catalogs_local_stores/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_local_stores/update);
};

const catalogs_supplemental_items_batch/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_supplemental_items_batch/get);
};


module.exports = {
  catalogs_local_inventory_items/post,
  catalogs_local_inventory_items_batch/operate,
  catalogs_local_stores/create,
  catalogs_local_stores/delete,
  catalogs_local_stores/list,
  catalogs_local_stores/update,
  catalogs_supplemental_items_batch/get,
};
