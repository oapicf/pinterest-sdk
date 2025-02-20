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
    instance = new PinterestSdk.BaseInviteDataResponse();
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

  describe('BaseInviteDataResponse', function() {
    it('should create an instance of BaseInviteDataResponse', function() {
      // uncomment below and update the code to test BaseInviteDataResponse
      //var instance = new PinterestSdk.BaseInviteDataResponse();
      //expect(instance).to.be.a(PinterestSdk.BaseInviteDataResponse);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new PinterestSdk.BaseInviteDataResponse();
      //expect(instance).to.be();
    });

    it('should have the property inviteData (base name: "invite_data")', function() {
      // uncomment below and update the code to test the property inviteData
      //var instance = new PinterestSdk.BaseInviteDataResponse();
      //expect(instance).to.be();
    });

    it('should have the property isReceivedInvite (base name: "is_received_invite")', function() {
      // uncomment below and update the code to test the property isReceivedInvite
      //var instance = new PinterestSdk.BaseInviteDataResponse();
      //expect(instance).to.be();
    });

    it('should have the property user (base name: "user")', function() {
      // uncomment below and update the code to test the property user
      //var instance = new PinterestSdk.BaseInviteDataResponse();
      //expect(instance).to.be();
    });

  });

}));
