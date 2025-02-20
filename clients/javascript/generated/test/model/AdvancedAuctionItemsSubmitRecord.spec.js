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
    instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
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

  describe('AdvancedAuctionItemsSubmitRecord', function() {
    it('should create an instance of AdvancedAuctionItemsSubmitRecord', function() {
      // uncomment below and update the code to test AdvancedAuctionItemsSubmitRecord
      //var instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
      //expect(instance).to.be.a(PinterestSdk.AdvancedAuctionItemsSubmitRecord);
    });

    it('should have the property operation (base name: "operation")', function() {
      // uncomment below and update the code to test the property operation
      //var instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
      //expect(instance).to.be();
    });

    it('should have the property itemId (base name: "item_id")', function() {
      // uncomment below and update the code to test the property itemId
      //var instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
      //expect(instance).to.be();
    });

    it('should have the property country (base name: "country")', function() {
      // uncomment below and update the code to test the property country
      //var instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
      //expect(instance).to.be();
    });

    it('should have the property language (base name: "language")', function() {
      // uncomment below and update the code to test the property language
      //var instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
      //expect(instance).to.be();
    });

    it('should have the property bidOptions (base name: "bid_options")', function() {
      // uncomment below and update the code to test the property bidOptions
      //var instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
      //expect(instance).to.be();
    });

    it('should have the property updateMask (base name: "update_mask")', function() {
      // uncomment below and update the code to test the property updateMask
      //var instance = new PinterestSdk.AdvancedAuctionItemsSubmitRecord();
      //expect(instance).to.be();
    });

  });

}));
