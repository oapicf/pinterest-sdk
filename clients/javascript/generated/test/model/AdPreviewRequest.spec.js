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
    instance = new PinterestSdk.AdPreviewRequest();
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

  describe('AdPreviewRequest', function() {
    it('should create an instance of AdPreviewRequest', function() {
      // uncomment below and update the code to test AdPreviewRequest
      //var instance = new PinterestSdk.AdPreviewRequest();
      //expect(instance).to.be.a(PinterestSdk.AdPreviewRequest);
    });

    it('should have the property imageUrl (base name: "image_url")', function() {
      // uncomment below and update the code to test the property imageUrl
      //var instance = new PinterestSdk.AdPreviewRequest();
      //expect(instance).to.be();
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instance = new PinterestSdk.AdPreviewRequest();
      //expect(instance).to.be();
    });

    it('should have the property pinId (base name: "pin_id")', function() {
      // uncomment below and update the code to test the property pinId
      //var instance = new PinterestSdk.AdPreviewRequest();
      //expect(instance).to.be();
    });

  });

}));
