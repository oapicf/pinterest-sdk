/**
 * The UserAccountController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserAccountService');
const boards_user_follows/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.boards_user_follows/list);
};

const follow_user/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.follow_user/update);
};

const followers/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.followers/list);
};

const linked_business_accounts/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.linked_business_accounts/get);
};

const unverify_website/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.unverify_website/delete);
};

const user_account/analytics = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_account/analytics);
};

const user_account/analytics/top_pins = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_account/analytics/top_pins);
};

const user_account/analytics/top_video_pins = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_account/analytics/top_video_pins);
};

const user_account/followed_interests = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_account/followed_interests);
};

const user_account/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_account/get);
};

const user_following/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_following/get);
};

const user_websites/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_websites/get);
};

const verify_website/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.verify_website/update);
};

const website_verification/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.website_verification/get);
};


module.exports = {
  boards_user_follows/list,
  follow_user/update,
  followers/list,
  linked_business_accounts/get,
  unverify_website/delete,
  user_account/analytics,
  user_account/analytics/top_pins,
  user_account/analytics/top_video_pins,
  user_account/followed_interests,
  user_account/get,
  user_following/get,
  user_websites/get,
  verify_website/update,
  website_verification/get,
};
