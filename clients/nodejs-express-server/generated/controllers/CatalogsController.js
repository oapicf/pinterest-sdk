/**
 * The CatalogsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CatalogsService');
const catalogs/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs/list);
};

const catalogs_product_group_pins/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_group_pins/list);
};

const catalogs_product_groups/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/create);
};

const catalogs_product_groups/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/delete);
};

const catalogs_product_groups/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/get);
};

const catalogs_product_groups/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/list);
};

const catalogs_product_groups/product_counts_get = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/product_counts_get);
};

const catalogs_product_groups/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/update);
};

const feed_processing_results/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.feed_processing_results/list);
};

const feeds/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/create);
};

const feeds/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/delete);
};

const feeds/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/get);
};

const feeds/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/list);
};

const feeds/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/update);
};

const items/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.items/get);
};

const items_batch/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.items_batch/get);
};

const items_batch/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.items_batch/post);
};

const items_issues/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.items_issues/list);
};

const products_by_product_group_filter/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.products_by_product_group_filter/list);
};


module.exports = {
  catalogs/list,
  catalogs_product_group_pins/list,
  catalogs_product_groups/create,
  catalogs_product_groups/delete,
  catalogs_product_groups/get,
  catalogs_product_groups/list,
  catalogs_product_groups/product_counts_get,
  catalogs_product_groups/update,
  feed_processing_results/list,
  feeds/create,
  feeds/delete,
  feeds/get,
  feeds/list,
  feeds/update,
  items/get,
  items_batch/get,
  items_batch/post,
  items_issues/list,
  products_by_product_group_filter/list,
};
