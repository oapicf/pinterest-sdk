/**
 * The CatalogReportsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CatalogReportsService');
const reports/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.reports/create);
};

const reports/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.reports/get);
};

const reports/stats = async (request, response) => {
  await Controller.handleRequest(request, response, service.reports/stats);
};


module.exports = {
  reports/create,
  reports/get,
  reports/stats,
};
