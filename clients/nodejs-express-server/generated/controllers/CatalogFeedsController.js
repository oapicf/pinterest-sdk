/**
 * The CatalogFeedsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CatalogFeedsService');
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

const feeds/ingest = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/ingest);
};

const feeds/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/list);
};

const feeds/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.feeds/update);
};

const items_issues/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.items_issues/list);
};


module.exports = {
  feed_processing_results/list,
  feeds/create,
  feeds/delete,
  feeds/get,
  feeds/ingest,
  feeds/list,
  feeds/update,
  items_issues/list,
};
