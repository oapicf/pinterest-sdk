/**
 * The MediaController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MediaService');
const media/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.media/create);
};

const media/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.media/get);
};

const media/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.media/list);
};


module.exports = {
  media/create,
  media/get,
  media/list,
};
