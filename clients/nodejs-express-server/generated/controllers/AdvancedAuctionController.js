/**
 * The AdvancedAuctionController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AdvancedAuctionService');
const advanced_auction_items_get/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.advanced_auction_items_get/post);
};

const advanced_auction_items_submit/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.advanced_auction_items_submit/post);
};


module.exports = {
  advanced_auction_items_get/post,
  advanced_auction_items_submit/post,
};
