/**
 * The LeadFormsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LeadFormsService');
const lead_form/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.lead_form/get);
};

const lead_form_test/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.lead_form_test/create);
};

const lead_forms/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.lead_forms/list);
};


module.exports = {
  lead_form/get,
  lead_form_test/create,
  lead_forms/list,
};
