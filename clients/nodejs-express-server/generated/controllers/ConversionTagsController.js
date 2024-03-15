/**
 * The ConversionTagsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ConversionTagsService');
const conversion_tags/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.conversion_tags/create);
};

const conversion_tags/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.conversion_tags/get);
};

const conversion_tags/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.conversion_tags/list);
};

const ocpm_eligible_conversion_tags/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ocpm_eligible_conversion_tags/get);
};

const page_visit_conversion_tags/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.page_visit_conversion_tags/get);
};


module.exports = {
  conversion_tags/create,
  conversion_tags/get,
  conversion_tags/list,
  ocpm_eligible_conversion_tags/get,
  page_visit_conversion_tags/get,
};
