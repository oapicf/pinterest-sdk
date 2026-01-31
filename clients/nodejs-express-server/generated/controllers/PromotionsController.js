/**
 * The PromotionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PromotionsService');
const promotions/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.promotions/create);
};

const promotions/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.promotions/delete);
};

const promotions/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.promotions/get);
};

const promotions/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.promotions/list);
};

const promotions/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.promotions/update);
};


module.exports = {
  promotions/create,
  promotions/delete,
  promotions/get,
  promotions/list,
  promotions/update,
};
