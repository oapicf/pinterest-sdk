/**
 * The CampaignsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CampaignsService');
const campaign_targeting_analytics/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaign_targeting_analytics/get);
};

const campaigns/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaigns/analytics);
};

const campaigns/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaigns/create);
};

const campaigns/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaigns/get);
};

const campaigns/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaigns/list);
};

const campaigns/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.campaigns/update);
};


module.exports = {
  campaign_targeting_analytics/get,
  campaigns/analytics,
  campaigns/create,
  campaigns/get,
  campaigns/list,
  campaigns/update,
};
