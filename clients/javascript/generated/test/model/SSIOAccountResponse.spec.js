/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
    instance = new PinterestSdk.SSIOAccountResponse();
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

  describe('SSIOAccountResponse', function() {
    it('should create an instance of SSIOAccountResponse', function() {
      // uncomment below and update the code to test SSIOAccountResponse
      //var instance = new PinterestSdk.SSIOAccountResponse();
      //expect(instance).to.be.a(PinterestSdk.SSIOAccountResponse);
    });

    it('should have the property eligible (base name: "eligible")', function() {
      // uncomment below and update the code to test the property eligible
      //var instance = new PinterestSdk.SSIOAccountResponse();
      //expect(instance).to.be();
    });

    it('should have the property canEdit (base name: "can_edit")', function() {
      // uncomment below and update the code to test the property canEdit
      //var instance = new PinterestSdk.SSIOAccountResponse();
      //expect(instance).to.be();
    });

    it('should have the property billtoInfos (base name: "billto_infos")', function() {
      // uncomment below and update the code to test the property billtoInfos
      //var instance = new PinterestSdk.SSIOAccountResponse();
      //expect(instance).to.be();
    });

    it('should have the property currency (base name: "currency")', function() {
      // uncomment below and update the code to test the property currency
      //var instance = new PinterestSdk.SSIOAccountResponse();
      //expect(instance).to.be();
    });

    it('should have the property pmpNames (base name: "pmp_names")', function() {
      // uncomment below and update the code to test the property pmpNames
      //var instance = new PinterestSdk.SSIOAccountResponse();
      //expect(instance).to.be();
    });

    it('should have the property error (base name: "error")', function() {
      // uncomment below and update the code to test the property error
      //var instance = new PinterestSdk.SSIOAccountResponse();
      //expect(instance).to.be();
    });

  });

}));