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

const ad_accounts/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts/list);
};

const ad_groups/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/analytics);
};

const ad_groups/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/list);
};

const ads/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads/analytics);
};

const ads/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads/list);
};

const analytics/create_report = async (request, response) => {
  await Controller.handleRequest(request, response, service.analytics/create_report);
};

const analytics/get_report = async (request, response) => {
  await Controller.handleRequest(request, response, service.analytics/get_report);
};

const campaigns/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaigns/analytics);
};

const campaigns/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaigns/list);
};

const product_groups/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_groups/analytics);
};


module.exports = {
  ad_account/analytics,
  ad_accounts/list,
  ad_groups/analytics,
  ad_groups/list,
  ads/analytics,
  ads/list,
  analytics/create_report,
  analytics/get_report,
  campaigns/analytics,
  campaigns/list,
  product_groups/analytics,
};
