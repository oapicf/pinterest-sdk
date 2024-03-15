/**
 * The AdsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AdsService');
const ad_previews/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_previews/create);
};

const ad_targeting_analytics/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_targeting_analytics/get);
};

const ads/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads/analytics);
};

const ads/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads/create);
};

const ads/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads/get);
};

const ads/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads/list);
};

const ads/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads/update);
};


module.exports = {
  ad_previews/create,
  ad_targeting_analytics/get,
  ads/analytics,
  ads/create,
  ads/get,
  ads/list,
  ads/update,
};
