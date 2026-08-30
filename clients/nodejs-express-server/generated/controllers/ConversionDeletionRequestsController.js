/**
 * The ConversionDeletionRequestsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ConversionDeletionRequestsService');
const conversion_deletion_request/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.conversion_deletion_request/create);
};

const conversion_deletion_request/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.conversion_deletion_request/delete);
};

const conversion_deletion_request/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.conversion_deletion_request/get);
};

const conversion_deletion_request/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.conversion_deletion_request/list);
};


module.exports = {
  conversion_deletion_request/create,
  conversion_deletion_request/delete,
  conversion_deletion_request/get,
  conversion_deletion_request/list,
};
