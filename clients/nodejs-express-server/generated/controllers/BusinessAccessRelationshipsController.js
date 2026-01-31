/**
 * The BusinessAccessRelationshipsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BusinessAccessRelationshipsService');
const brand_accounts/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.brand_accounts/create);
};

const brand_accounts/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.brand_accounts/update);
};

const delete_business_membership = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_business_membership);
};

const delete_business_partners = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_business_partners);
};

const get/business_employers = async (request, response) => {
  await Controller.handleRequest(request, response, service.get/business_employers);
};

const get/business_members = async (request, response) => {
  await Controller.handleRequest(request, response, service.get/business_members);
};

const get/business_partners = async (request, response) => {
  await Controller.handleRequest(request, response, service.get/business_partners);
};

const system_user/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.system_user/update);
};

const update/business_memberships = async (request, response) => {
  await Controller.handleRequest(request, response, service.update/business_memberships);
};


module.exports = {
  brand_accounts/create,
  brand_accounts/update,
  delete_business_membership,
  delete_business_partners,
  get/business_employers,
  get/business_members,
  get/business_partners,
  system_user/update,
  update/business_memberships,
};
