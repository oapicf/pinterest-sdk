/**
 * The LeadAdsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LeadAdsService');
const ad_accounts_subscriptions/del_by_id = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts_subscriptions/del_by_id);
};

const ad_accounts_subscriptions/get_by_id = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts_subscriptions/get_by_id);
};

const ad_accounts_subscriptions/get_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts_subscriptions/get_list);
};

const ad_accounts_subscriptions/post = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts_subscriptions/post);
};


module.exports = {
  ad_accounts_subscriptions/del_by_id,
  ad_accounts_subscriptions/get_by_id,
  ad_accounts_subscriptions/get_list,
  ad_accounts_subscriptions/post,
};
