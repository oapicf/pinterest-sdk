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
    instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
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

  describe('CatalogsProductGroupFilterKeys', function() {
    it('should create an instance of CatalogsProductGroupFilterKeys', function() {
      // uncomment below and update the code to test CatalogsProductGroupFilterKeys
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be.a(PinterestSdk.CatalogsProductGroupFilterKeys);
    });

    it('should have the property MIN_PRICE (base name: "MIN_PRICE")', function() {
      // uncomment below and update the code to test the property MIN_PRICE
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property MAX_PRICE (base name: "MAX_PRICE")', function() {
      // uncomment below and update the code to test the property MAX_PRICE
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property CURRENCY (base name: "CURRENCY")', function() {
      // uncomment below and update the code to test the property CURRENCY
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property ITEM_ID (base name: "ITEM_ID")', function() {
      // uncomment below and update the code to test the property ITEM_ID
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property AVAILABILITY (base name: "AVAILABILITY")', function() {
      // uncomment below and update the code to test the property AVAILABILITY
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property BRAND (base name: "BRAND")', function() {
      // uncomment below and update the code to test the property BRAND
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property CONDITION (base name: "CONDITION")', function() {
      // uncomment below and update the code to test the property CONDITION
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property cUSTOMLABEL0 (base name: "CUSTOM_LABEL_0")', function() {
      // uncomment below and update the code to test the property cUSTOMLABEL0
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property cUSTOMLABEL1 (base name: "CUSTOM_LABEL_1")', function() {
      // uncomment below and update the code to test the property cUSTOMLABEL1
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property cUSTOMLABEL2 (base name: "CUSTOM_LABEL_2")', function() {
      // uncomment below and update the code to test the property cUSTOMLABEL2
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property cUSTOMLABEL3 (base name: "CUSTOM_LABEL_3")', function() {
      // uncomment below and update the code to test the property cUSTOMLABEL3
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property cUSTOMLABEL4 (base name: "CUSTOM_LABEL_4")', function() {
      // uncomment below and update the code to test the property cUSTOMLABEL4
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property ITEM_GROUP_ID (base name: "ITEM_GROUP_ID")', function() {
      // uncomment below and update the code to test the property ITEM_GROUP_ID
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property GENDER (base name: "GENDER")', function() {
      // uncomment below and update the code to test the property GENDER
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property pRODUCTTYPE4 (base name: "PRODUCT_TYPE_4")', function() {
      // uncomment below and update the code to test the property pRODUCTTYPE4
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property pRODUCTTYPE3 (base name: "PRODUCT_TYPE_3")', function() {
      // uncomment below and update the code to test the property pRODUCTTYPE3
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property pRODUCTTYPE2 (base name: "PRODUCT_TYPE_2")', function() {
      // uncomment below and update the code to test the property pRODUCTTYPE2
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property pRODUCTTYPE1 (base name: "PRODUCT_TYPE_1")', function() {
      // uncomment below and update the code to test the property pRODUCTTYPE1
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property pRODUCTTYPE0 (base name: "PRODUCT_TYPE_0")', function() {
      // uncomment below and update the code to test the property pRODUCTTYPE0
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property gOOGLEPRODUCTCATEGORY6 (base name: "GOOGLE_PRODUCT_CATEGORY_6")', function() {
      // uncomment below and update the code to test the property gOOGLEPRODUCTCATEGORY6
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property gOOGLEPRODUCTCATEGORY5 (base name: "GOOGLE_PRODUCT_CATEGORY_5")', function() {
      // uncomment below and update the code to test the property gOOGLEPRODUCTCATEGORY5
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property gOOGLEPRODUCTCATEGORY4 (base name: "GOOGLE_PRODUCT_CATEGORY_4")', function() {
      // uncomment below and update the code to test the property gOOGLEPRODUCTCATEGORY4
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property gOOGLEPRODUCTCATEGORY3 (base name: "GOOGLE_PRODUCT_CATEGORY_3")', function() {
      // uncomment below and update the code to test the property gOOGLEPRODUCTCATEGORY3
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property gOOGLEPRODUCTCATEGORY2 (base name: "GOOGLE_PRODUCT_CATEGORY_2")', function() {
      // uncomment below and update the code to test the property gOOGLEPRODUCTCATEGORY2
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property gOOGLEPRODUCTCATEGORY1 (base name: "GOOGLE_PRODUCT_CATEGORY_1")', function() {
      // uncomment below and update the code to test the property gOOGLEPRODUCTCATEGORY1
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

    it('should have the property gOOGLEPRODUCTCATEGORY0 (base name: "GOOGLE_PRODUCT_CATEGORY_0")', function() {
      // uncomment below and update the code to test the property gOOGLEPRODUCTCATEGORY0
      //var instance = new PinterestSdk.CatalogsProductGroupFilterKeys();
      //expect(instance).to.be();
    });

  });

}));