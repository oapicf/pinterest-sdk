var PinterestSdk = require('pinterest-sdk');

var apiClient = PinterestSdk.ApiClient.instance;
var pinterestOAuth2 = apiClient.authentications['pinterest_oauth2'];
pinterestOAuth2.accessToken = 'YOUR_PINTEREST_ACCESS_TOKEN';

var api = new PinterestSdk.BoardsApi();
var boardId = 'board_id';
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.boardsListPins(boardId, {}, callback);
