/**
 * The ProductCategoriesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProductCategoriesService');
const trends_featured_topics/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.trends_featured_topics/list);
};

const trends_product_categories_details/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.trends_product_categories_details/list);
};

const trends_product_categories_trending/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.trends_product_categories_trending/list);
};


module.exports = {
  trends_featured_topics/list,
  trends_product_categories_details/list,
  trends_product_categories_trending/list,
};
