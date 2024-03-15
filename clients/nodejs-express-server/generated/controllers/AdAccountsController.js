/**
 * The AdAccountsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AdAccountsService');
const ad_account/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_account/analytics);
};

const ad_account_targeting_analytics/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_account_targeting_analytics/get);
};

const ad_accounts/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts/create);
};

const ad_accounts/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts/get);
};

const ad_accounts/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts/list);
};

const analytics/create_mmm_report = async (request, response) => {
  await Controller.handleRequest(request, response, service.analytics/create_mmm_report);
};

const analytics/create_report = async (request, response) => {
  await Controller.handleRequest(request, response, service.analytics/create_report);
};

const analytics/create_template_report = async (request, response) => {
  await Controller.handleRequest(request, response, service.analytics/create_template_report);
};

const analytics/get_mmm_report = async (request, response) => {
  await Controller.handleRequest(request, response, service.analytics/get_mmm_report);
};

const analytics/get_report = async (request, response) => {
  await Controller.handleRequest(request, response, service.analytics/get_report);
};

const sandbox/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.sandbox/delete);
};

const templates/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.templates/list);
};


module.exports = {
  ad_account/analytics,
  ad_account_targeting_analytics/get,
  ad_accounts/create,
  ad_accounts/get,
  ad_accounts/list,
  analytics/create_mmm_report,
  analytics/create_report,
  analytics/create_template_report,
  analytics/get_mmm_report,
  analytics/get_report,
  sandbox/delete,
  templates/list,
};
