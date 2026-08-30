/**
 * The CustomerSegmentController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CustomerSegmentService');
const customer_segment/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.customer_segment/create);
};

const customer_segment/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.customer_segment/list);
};

const customer_segment/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.customer_segment/update);
};


module.exports = {
  customer_segment/create,
  customer_segment/list,
  customer_segment/update,
};
