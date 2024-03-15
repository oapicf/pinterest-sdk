/**
 * The IntegrationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IntegrationsService');
const integrations/get_by_id = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrations/get_by_id);
};

const integrations/get_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrations/get_list);
};

const integrations_commerce/del = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrations_commerce/del);
};

const integrations_commerce/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrations_commerce/get);
};

const integrations_commerce/patch = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrations_commerce/patch);
};

const integrations_commerce/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrations_commerce/post);
};

const integrations_logs/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrations_logs/post);
};


module.exports = {
  integrations/get_by_id,
  integrations/get_list,
  integrations_commerce/del,
  integrations_commerce/get,
  integrations_commerce/patch,
  integrations_commerce/post,
  integrations_logs/post,
};
