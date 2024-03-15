/**
 * The CustomerListsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CustomerListsService');
const customer_lists/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.customer_lists/create);
};

const customer_lists/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.customer_lists/get);
};

const customer_lists/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.customer_lists/list);
};

const customer_lists/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.customer_lists/update);
};


module.exports = {
  customer_lists/create,
  customer_lists/get,
  customer_lists/list,
  customer_lists/update,
};
