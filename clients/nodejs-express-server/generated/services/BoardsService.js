/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create board section
* Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* boardSection BoardSection Create a board section.
* returns BoardSection
* */
const board_sections/create = ({ boardUnderscoreid, boardSection }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
        boardSection,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete board section
* Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* sectionUnderscoreid String Unique identifier of a board section.
* no response value expected for this operation
* */
const board_sections/delete = ({ boardUnderscoreid, sectionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
        sectionUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List board sections
* Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* returns Paginated
* */
const board_sections/list = ({ boardUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List Pins on board section
* Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* sectionUnderscoreid String Unique identifier of a board section.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* returns Paginated
* */
const board_sections/list_pins = ({ boardUnderscoreid, sectionUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
        sectionUnderscoreid,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update board section
* Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* sectionUnderscoreid String Unique identifier of a board section.
* boardSection BoardSection Update a board section.
* returns BoardSection
* */
const board_sections/update = ({ boardUnderscoreid, sectionUnderscoreid, boardSection }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
        sectionUnderscoreid,
        boardSection,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create board
* Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
*
* board Board Create a board using a single board json object.
* returns Board
* */
const boards/create = ({ board }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        board,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete board
* Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* no response value expected for this operation
* */
const boards/delete = ({ boardUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get board
* Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* returns Board
* */
const boards/get = ({ boardUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List boards
* Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
*
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* privacy String Privacy setting for a board. (optional)
* returns Paginated
* */
const boards/list = ({ bookmark, pageUnderscoresize, privacy }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bookmark,
        pageUnderscoresize,
        privacy,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List Pins on board
* Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
*
* boardUnderscoreid String Unique identifier of a board.
* bookmark String Cursor used to fetch the next page of items (optional)
* pageUnderscoresize Integer Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)
* returns Paginated
* */
const boards/list_pins = ({ boardUnderscoreid, bookmark, pageUnderscoresize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
        bookmark,
        pageUnderscoresize,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update board
* Update a board owned by the \"operating user_account\".
*
* boardUnderscoreid String Unique identifier of a board.
* boardUpdate BoardUpdate Update a board.
* returns Board
* */
const boards/update = ({ boardUnderscoreid, boardUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        boardUnderscoreid,
        boardUpdate,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

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
