/**
 * The KeywordsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/KeywordsService');
const country_keywords_metrics/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.country_keywords_metrics/get);
};

const keywords/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.keywords/create);
};

const keywords/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.keywords/get);
};

const keywords/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.keywords/update);
};

const trending_keywords/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.trending_keywords/list);
};


module.exports = {
  country_keywords_metrics/get,
  keywords/create,
  keywords/get,
  keywords/update,
  trending_keywords/list,
};
