/**
 * The TargetingTemplateController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TargetingTemplateService');
const targeting_template/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.targeting_template/create);
};

const targeting_template/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.targeting_template/list);
};

const targeting_template/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.targeting_template/update);
};


module.exports = {
  targeting_template/create,
  targeting_template/list,
  targeting_template/update,
};
