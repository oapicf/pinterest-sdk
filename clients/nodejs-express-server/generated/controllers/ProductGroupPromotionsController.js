/**
 * The ProductGroupPromotionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProductGroupPromotionsService');
const product_group_promotions/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_group_promotions/create);
};

const product_group_promotions/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_group_promotions/get);
};

const product_group_promotions/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_group_promotions/list);
};

const product_group_promotions/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_group_promotions/update);
};

const product_groups/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.product_groups/analytics);
};


module.exports = {
  product_group_promotions/create,
  product_group_promotions/get,
  product_group_promotions/list,
  product_group_promotions/update,
  product_groups/analytics,
};
