/**
 * The PinsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PinsService');
const multi_pins/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.multi_pins/analytics);
};

const pins/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.pins/analytics);
};

const pins/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.pins/create);
};

const pins/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.pins/delete);
};

const pins/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.pins/get);
};

const pins/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pins/list);
};

const pins/save = async (request, response) => {
  await Controller.handleRequest(request, response, service.pins/save);
};

const pins/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.pins/update);
};


module.exports = {
  multi_pins/analytics,
  pins/analytics,
  pins/create,
  pins/delete,
  pins/get,
  pins/list,
  pins/save,
  pins/update,
};
