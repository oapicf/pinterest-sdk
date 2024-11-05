/**
 * The BusinessAccessInviteController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BusinessAccessInviteService');
const asset_access_requests/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.asset_access_requests/create);
};

const cancel_invites_or_requests = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancel_invites_or_requests);
};

const create_asset_invites = async (request, response) => {
  await Controller.handleRequest(request, response, service.create_asset_invites);
};

const create_membership_or_partnership_invites = async (request, response) => {
  await Controller.handleRequest(request, response, service.create_membership_or_partnership_invites);
};

const get/invites = async (request, response) => {
  await Controller.handleRequest(request, response, service.get/invites);
};

const respond_business_access_invites = async (request, response) => {
  await Controller.handleRequest(request, response, service.respond_business_access_invites);
};


module.exports = {
  asset_access_requests/create,
  cancel_invites_or_requests,
  create_asset_invites,
  create_membership_or_partnership_invites,
  get/invites,
  respond_business_access_invites,
};
