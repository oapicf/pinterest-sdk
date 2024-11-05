/**
 * The AudienceSharingController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AudienceSharingService');
const ad_accounts_audiences_shared_accounts/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ad_accounts_audiences_shared_accounts/list);
};

const business_account_audiences_shared_accounts/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_account_audiences_shared_accounts/list);
};

const shared_audiences_for_business/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.shared_audiences_for_business/list);
};

const update_ad_account_to_ad_account_shared_audience = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_ad_account_to_ad_account_shared_audience);
};

const update_ad_account_to_business_shared_audience = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_ad_account_to_business_shared_audience);
};

const update_business_to_ad_account_shared_audience = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_business_to_ad_account_shared_audience);
};

const update_business_to_business_shared_audience = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_business_to_business_shared_audience);
};


module.exports = {
  ad_accounts_audiences_shared_accounts/list,
  business_account_audiences_shared_accounts/list,
  shared_audiences_for_business/list,
  update_ad_account_to_ad_account_shared_audience,
  update_ad_account_to_business_shared_audience,
  update_business_to_ad_account_shared_audience,
  update_business_to_business_shared_audience,
};
