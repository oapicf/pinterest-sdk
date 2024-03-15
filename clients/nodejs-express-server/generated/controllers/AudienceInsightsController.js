/**
 * The AudienceInsightsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AudienceInsightsService');
const audience_insights/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.audience_insights/get);
};

const audience_insights_scope_and_type/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.audience_insights_scope_and_type/get);
};


module.exports = {
  audience_insights/get,
  audience_insights_scope_and_type/get,
};
