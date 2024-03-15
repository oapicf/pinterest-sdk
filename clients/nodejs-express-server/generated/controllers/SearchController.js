/**
 * The SearchController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SearchService');
const search_partner_pins = async (request, response) => {
  await Controller.handleRequest(request, response, service.search_partner_pins);
};

const search_user_boards/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.search_user_boards/get);
};

const search_user_pins/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.search_user_pins/list);
};


module.exports = {
  search_partner_pins,
  search_user_boards/get,
  search_user_pins/list,
};
