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
    instance = new PinterestSdk.KeywordsCommon();
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

  describe('KeywordsCommon', function() {
    it('should create an instance of KeywordsCommon', function() {
      // uncomment below and update the code to test KeywordsCommon
      //var instance = new PinterestSdk.KeywordsCommon();
      //expect(instance).to.be.a(PinterestSdk.KeywordsCommon);
    });

    it('should have the property bid (base name: "bid")', function() {
      // uncomment below and update the code to test the property bid
      //var instance = new PinterestSdk.KeywordsCommon();
      //expect(instance).to.be();
    });

    it('should have the property matchType (base name: "match_type")', function() {
      // uncomment below and update the code to test the property matchType
      //var instance = new PinterestSdk.KeywordsCommon();
      //expect(instance).to.be();
    });

    it('should have the property value (base name: "value")', function() {
      // uncomment below and update the code to test the property value
      //var instance = new PinterestSdk.KeywordsCommon();
      //expect(instance).to.be();
    });

  });

}));
