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
    instance = new PinterestSdk.ConversionEventsUserDataAnyOf();
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

  describe('ConversionEventsUserDataAnyOf', function() {
    it('should create an instance of ConversionEventsUserDataAnyOf', function() {
      // uncomment below and update the code to test ConversionEventsUserDataAnyOf
      //var instance = new PinterestSdk.ConversionEventsUserDataAnyOf();
      //expect(instance).to.be.a(PinterestSdk.ConversionEventsUserDataAnyOf);
    });

    it('should have the property em (base name: "em")', function() {
      // uncomment below and update the code to test the property em
      //var instance = new PinterestSdk.ConversionEventsUserDataAnyOf();
      //expect(instance).to.be();
    });

    it('should have the property hashedMaids (base name: "hashed_maids")', function() {
      // uncomment below and update the code to test the property hashedMaids
      //var instance = new PinterestSdk.ConversionEventsUserDataAnyOf();
      //expect(instance).to.be();
    });

    it('should have the property clientIpAddress (base name: "client_ip_address")', function() {
      // uncomment below and update the code to test the property clientIpAddress
      //var instance = new PinterestSdk.ConversionEventsUserDataAnyOf();
      //expect(instance).to.be();
    });

    it('should have the property clientUserAgent (base name: "client_user_agent")', function() {
      // uncomment below and update the code to test the property clientUserAgent
      //var instance = new PinterestSdk.ConversionEventsUserDataAnyOf();
      //expect(instance).to.be();
    });

  });

}));
