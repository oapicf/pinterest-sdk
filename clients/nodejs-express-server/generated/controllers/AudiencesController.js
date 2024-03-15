/**
 * The AudiencesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AudiencesService');
const audiences/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.audiences/create);
};

const audiences/create_custom = async (request, response) => {
  await Controller.handleRequest(request, response, service.audiences/create_custom);
};

const audiences/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.audiences/get);
};

const audiences/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.audiences/list);
};

const audiences/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.audiences/update);
};


module.exports = {
  audiences/create,
  audiences/create_custom,
  audiences/get,
  audiences/list,
  audiences/update,
};
