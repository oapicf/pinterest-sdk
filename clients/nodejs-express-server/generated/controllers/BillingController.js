/**
 * The BillingController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BillingService');
const ads_credit/redeem = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads_credit/redeem);
};

const ads_credits_discounts/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ads_credits_discounts/get);
};

const billing_profiles/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.billing_profiles/get);
};

const ssio_accounts/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.ssio_accounts/get);
};

const ssio_insertion_order/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.ssio_insertion_order/create);
};

const ssio_insertion_order/edit = async (request, response) => {
  await Controller.handleRequest(request, response, service.ssio_insertion_order/edit);
};

const ssio_insertion_orders_status/get_by_ad_account = async (request, response) => {
  await Controller.handleRequest(request, response, service.ssio_insertion_orders_status/get_by_ad_account);
};

const ssio_insertion_orders_status/get_by_pin_order_id = async (request, response) => {
  await Controller.handleRequest(request, response, service.ssio_insertion_orders_status/get_by_pin_order_id);
};

const ssio_order_lines/get_by_ad_account = async (request, response) => {
  await Controller.handleRequest(request, response, service.ssio_order_lines/get_by_ad_account);
};


module.exports = {
  ads_credit/redeem,
  ads_credits_discounts/get,
  billing_profiles/get,
  ssio_accounts/get,
  ssio_insertion_order/create,
  ssio_insertion_order/edit,
  ssio_insertion_orders_status/get_by_ad_account,
  ssio_insertion_orders_status/get_by_pin_order_id,
  ssio_order_lines/get_by_ad_account,
};
