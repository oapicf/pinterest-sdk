/**
 * The BoardsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BoardsService');
const board_sections/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.board_sections/create);
};

const board_sections/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.board_sections/delete);
};

const board_sections/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.board_sections/list);
};

const board_sections/list_pins = async (request, response) => {
  await Controller.handleRequest(request, response, service.board_sections/list_pins);
};

const board_sections/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.board_sections/update);
};

const boards/create = async (request, response) => {
  await Controller.handleRequest(request, response, service.boards/create);
};

const boards/delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.boards/delete);
};

const boards/get = async (request, response) => {
  await Controller.handleRequest(request, response, service.boards/get);
};

const boards/list = async (request, response) => {
  await Controller.handleRequest(request, response, service.boards/list);
};

const boards/list_pins = async (request, response) => {
  await Controller.handleRequest(request, response, service.boards/list_pins);
};

const boards/update = async (request, response) => {
  await Controller.handleRequest(request, response, service.boards/update);
};


module.exports = {
  board_sections/create,
  board_sections/delete,
  board_sections/list,
  board_sections/list_pins,
  board_sections/update,
  boards/create,
  boards/delete,
  boards/get,
  boards/list,
  boards/list_pins,
  boards/update,
};
