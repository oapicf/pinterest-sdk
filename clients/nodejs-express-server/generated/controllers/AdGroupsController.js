/**
 * The AdGroupsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AdGroupsService');
const ad_groups/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/analytics);
};

const ad_groups/audience_sizing = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/audience_sizing);
};

const ad_groups/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/create);
};

const ad_groups/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/get);
};

const ad_groups/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/list);
};

const ad_groups/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups/update);
};

const ad_groups_bid_floor/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups_bid_floor/get);
};

const ad_groups_targeting_analytics/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_groups_targeting_analytics/get);
};


module.exports = {
  ad_groups/analytics,
  ad_groups/audience_sizing,
  ad_groups/create,
  ad_groups/get,
  ad_groups/list,
  ad_groups/update,
  ad_groups_bid_floor/get,
  ad_groups_targeting_analytics/get,
};
