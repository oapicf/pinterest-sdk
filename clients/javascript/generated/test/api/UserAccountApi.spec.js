/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.PinterestSdk);
  }
}(this, function(expect, PinterestSdk) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new PinterestSdk.UserAccountApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('UserAccountApi', function() {
    describe('boardsUserFollowsList', function() {
      it('should call boardsUserFollowsList successfully', function(done) {
        //uncomment below and update the code to test boardsUserFollowsList
        //instance.boardsUserFollowsList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('followUserUpdate', function() {
      it('should call followUserUpdate successfully', function(done) {
        //uncomment below and update the code to test followUserUpdate
        //instance.followUserUpdate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('followersList', function() {
      it('should call followersList successfully', function(done) {
        //uncomment below and update the code to test followersList
        //instance.followersList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('linkedBusinessAccountsGet', function() {
      it('should call linkedBusinessAccountsGet successfully', function(done) {
        //uncomment below and update the code to test linkedBusinessAccountsGet
        //instance.linkedBusinessAccountsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('unverifyWebsiteDelete', function() {
      it('should call unverifyWebsiteDelete successfully', function(done) {
        //uncomment below and update the code to test unverifyWebsiteDelete
        //instance.unverifyWebsiteDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('userAccountAnalytics', function() {
      it('should call userAccountAnalytics successfully', function(done) {
        //uncomment below and update the code to test userAccountAnalytics
        //instance.userAccountAnalytics(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('userAccountAnalyticsTopPins', function() {
      it('should call userAccountAnalyticsTopPins successfully', function(done) {
        //uncomment below and update the code to test userAccountAnalyticsTopPins
        //instance.userAccountAnalyticsTopPins(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('userAccountAnalyticsTopVideoPins', function() {
      it('should call userAccountAnalyticsTopVideoPins successfully', function(done) {
        //uncomment below and update the code to test userAccountAnalyticsTopVideoPins
        //instance.userAccountAnalyticsTopVideoPins(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('userAccountFollowedInterests', function() {
      it('should call userAccountFollowedInterests successfully', function(done) {
        //uncomment below and update the code to test userAccountFollowedInterests
        //instance.userAccountFollowedInterests(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('userAccountGet', function() {
      it('should call userAccountGet successfully', function(done) {
        //uncomment below and update the code to test userAccountGet
        //instance.userAccountGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('userFollowingGet', function() {
      it('should call userFollowingGet successfully', function(done) {
        //uncomment below and update the code to test userFollowingGet
        //instance.userFollowingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('userWebsitesGet', function() {
      it('should call userWebsitesGet successfully', function(done) {
        //uncomment below and update the code to test userWebsitesGet
        //instance.userWebsitesGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('verifyWebsiteUpdate', function() {
      it('should call verifyWebsiteUpdate successfully', function(done) {
        //uncomment below and update the code to test verifyWebsiteUpdate
        //instance.verifyWebsiteUpdate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('websiteVerificationGet', function() {
      it('should call websiteVerificationGet successfully', function(done) {
        //uncomment below and update the code to test websiteVerificationGet
        //instance.websiteVerificationGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
