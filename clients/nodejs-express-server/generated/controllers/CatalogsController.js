/**
 * The CatalogsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CatalogsService');
const catalogs/available_filter_values = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs/available_filter_values);
};

const catalogs/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs/create);
};

const catalogs/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs/list);
};


module.exports = {
  catalogs/available_filter_values,
  catalogs/create,
  catalogs/list,
};
