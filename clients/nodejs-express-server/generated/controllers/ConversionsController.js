/**
 * The ConversionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ConversionsService');
const advertiser_defined_events/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.advertiser_defined_events/create);
};

const advertiser_defined_events/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.advertiser_defined_events/delete);
};

const advertiser_defined_events/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.advertiser_defined_events/get);
};

const advertiser_defined_events/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.advertiser_defined_events/update);
};


module.exports = {
  advertiser_defined_events/create,
  advertiser_defined_events/delete,
  advertiser_defined_events/get,
  advertiser_defined_events/update,
};
