/**
 * The ResourcesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ResourcesService');
const ad_account_countries/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_account_countries/get);
};

const delivery_metrics/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.delivery_metrics/get);
};

const interest_targeting_options/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.interest_targeting_options/get);
};

const lead_form_questions/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.lead_form_questions/get);
};

const metrics_ready_state/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.metrics_ready_state/get);
};

const targeting_options/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.targeting_options/get);
};


module.exports = {
  ad_account_countries/get,
  delivery_metrics/get,
  interest_targeting_options/get,
  lead_form_questions/get,
  metrics_ready_state/get,
  targeting_options/get,
};
