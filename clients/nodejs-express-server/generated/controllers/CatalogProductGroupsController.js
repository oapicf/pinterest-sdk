/**
 * The CatalogProductGroupsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CatalogProductGroupsService');
const catalogs_product_group_pins/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_group_pins/list);
};

const catalogs_product_groups/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/create);
};

const catalogs_product_groups/create_many = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/create_many);
};

const catalogs_product_groups/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/delete);
};

const catalogs_product_groups/delete_many = async (request, response) => {
  await Controller.handleRequest(request, response, service.catalogs_product_groups/delete_many);
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

const products_by_product_group_filter/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.products_by_product_group_filter/list);
};


module.exports = {
  catalogs_product_group_pins/list,
  catalogs_product_groups/create,
  catalogs_product_groups/create_many,
  catalogs_product_groups/delete,
  catalogs_product_groups/delete_many,
  catalogs_product_groups/get,
  catalogs_product_groups/list,
  catalogs_product_groups/product_counts_get,
  catalogs_product_groups/update,
  products_by_product_group_filter/list,
};
