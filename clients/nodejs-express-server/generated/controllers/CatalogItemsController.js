/**
 * The CatalogItemsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CatalogItemsService');
const items/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.items/post);
};

const items_batch/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.items_batch/get);
};

const items_batch/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.items_batch/post);
};


module.exports = {
  items/post,
  items_batch/get,
  items_batch/post,
};
