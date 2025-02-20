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
    instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
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

  describe('CatalogsUpdatableCreativeAssetsAttributes', function() {
    it('should create an instance of CatalogsUpdatableCreativeAssetsAttributes', function() {
      // uncomment below and update the code to test CatalogsUpdatableCreativeAssetsAttributes
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be.a(PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes);
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property link (base name: "link")', function() {
      // uncomment below and update the code to test the property link
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property iosDeepLink (base name: "ios_deep_link")', function() {
      // uncomment below and update the code to test the property iosDeepLink
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property androidDeepLink (base name: "android_deep_link")', function() {
      // uncomment below and update the code to test the property androidDeepLink
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property googleProductCategory (base name: "google_product_category")', function() {
      // uncomment below and update the code to test the property googleProductCategory
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property customLabel0 (base name: "custom_label_0")', function() {
      // uncomment below and update the code to test the property customLabel0
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property customLabel1 (base name: "custom_label_1")', function() {
      // uncomment below and update the code to test the property customLabel1
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property customLabel2 (base name: "custom_label_2")', function() {
      // uncomment below and update the code to test the property customLabel2
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property customLabel3 (base name: "custom_label_3")', function() {
      // uncomment below and update the code to test the property customLabel3
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property customLabel4 (base name: "custom_label_4")', function() {
      // uncomment below and update the code to test the property customLabel4
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

    it('should have the property visibility (base name: "visibility")', function() {
      // uncomment below and update the code to test the property visibility
      //var instance = new PinterestSdk.CatalogsUpdatableCreativeAssetsAttributes();
      //expect(instance).to.be();
    });

  });

}));
