/**
 * The LabelsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LabelsService');
const labels/apply = async (request, response) => {
  await Controller.handleRequest(request, response, service.labels/apply);
};

const labels/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.labels/create);
};

const labels/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.labels/list);
};

const labels/remove = async (request, response) => {
  await Controller.handleRequest(request, response, service.labels/remove);
};

const labels/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.labels/update);
};


module.exports = {
  labels/apply,
  labels/create,
  labels/list,
  labels/remove,
  labels/update,
};
