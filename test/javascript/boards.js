const assert = require('assert');
const PinterestSdk = require('pinterest-sdk');

describe('boards', function() {
  describe('list pins', function() {
    it('should respond with error 401 unauthorized when token is invalid', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error.message, 'Unauthorized');
        assert.equal(typeof data, 'object');
        assert.equal(response.res.statusCode, 401);
        done();
      };

      const apiClient = PinterestSdk.ApiClient.instance;
      var pinterestOAuth2 = apiClient.authentications['pinterest_oauth2'];
      pinterestOAuth2.accessToken = "SOME INVALID TOKEN"
      
      const boardsApi = new PinterestSdk.BoardsApi();
      boardsApi.boardsListPins('12345', {}, callback);
    });
  });
});