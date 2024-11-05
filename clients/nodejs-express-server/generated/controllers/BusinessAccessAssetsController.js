/**
 * The BusinessAccessAssetsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BusinessAccessAssetsService');
const asset_group/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.asset_group/create);
};

const asset_group/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.asset_group/delete);
};

const asset_group/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.asset_group/update);
};

const business_asset_members/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_asset_members/get);
};

const business_asset_partners/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_asset_partners/get);
};

const business_assets/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_assets/get);
};

const business_member_assets/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_member_assets/get);
};

const business_members_asset_access/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_members_asset_access/delete);
};

const business_members_asset_access/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_members_asset_access/update);
};

const business_partner_asset_access/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.business_partner_asset_access/get);
};

const delete_partner_asset_access_handler_impl = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_partner_asset_access_handler_impl);
};

const update_partner_asset_access_handler_impl = async (request, response) => {
  await Controller.handleRequest(request, response, service.update_partner_asset_access_handler_impl);
};


module.exports = {
  asset_group/create,
  asset_group/delete,
  asset_group/update,
  business_asset_members/get,
  business_asset_partners/get,
  business_assets/get,
  business_member_assets/get,
  business_members_asset_access/delete,
  business_members_asset_access/update,
  business_partner_asset_access/get,
  delete_partner_asset_access_handler_impl,
  update_partner_asset_access_handler_impl,
};
