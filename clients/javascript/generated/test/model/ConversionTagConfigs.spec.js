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
    instance = new PinterestSdk.ConversionTagConfigs();
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

  describe('ConversionTagConfigs', function() {
    it('should create an instance of ConversionTagConfigs', function() {
      // uncomment below and update the code to test ConversionTagConfigs
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be.a(PinterestSdk.ConversionTagConfigs);
    });

    it('should have the property aemEnabled (base name: "aem_enabled")', function() {
      // uncomment below and update the code to test the property aemEnabled
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be();
    });

    it('should have the property mdFrequency (base name: "md_frequency")', function() {
      // uncomment below and update the code to test the property mdFrequency
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be();
    });

    it('should have the property aemFnlnEnabled (base name: "aem_fnln_enabled")', function() {
      // uncomment below and update the code to test the property aemFnlnEnabled
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be();
    });

    it('should have the property aemPhEnabled (base name: "aem_ph_enabled")', function() {
      // uncomment below and update the code to test the property aemPhEnabled
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be();
    });

    it('should have the property aemGeEnabled (base name: "aem_ge_enabled")', function() {
      // uncomment below and update the code to test the property aemGeEnabled
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be();
    });

    it('should have the property aemDbEnabled (base name: "aem_db_enabled")', function() {
      // uncomment below and update the code to test the property aemDbEnabled
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be();
    });

    it('should have the property aemLocEnabled (base name: "aem_loc_enabled")', function() {
      // uncomment below and update the code to test the property aemLocEnabled
      //var instance = new PinterestSdk.ConversionTagConfigs();
      //expect(instance).to.be();
    });

  });

}));
