/**
 * The TermsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TermsService');
const terms_related/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.terms_related/list);
};

const terms_suggested/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.terms_suggested/list);
};


module.exports = {
  terms_related/list,
  terms_suggested/list,
};
