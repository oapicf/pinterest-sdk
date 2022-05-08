/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
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
    factory(root.expect, root.PinterestRestApi);
  }
}(this, function(expect, PinterestRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new PinterestRestApi.MediaUpload();
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

  describe('MediaUpload', function() {
    it('should create an instance of MediaUpload', function() {
      // uncomment below and update the code to test MediaUpload
      //var instance = new PinterestRestApi.MediaUpload();
      //expect(instance).to.be.a(PinterestRestApi.MediaUpload);
    });

    it('should have the property mediaId (base name: "media_id")', function() {
      // uncomment below and update the code to test the property mediaId
      //var instance = new PinterestRestApi.MediaUpload();
      //expect(instance).to.be();
    });

    it('should have the property mediaType (base name: "media_type")', function() {
      // uncomment below and update the code to test the property mediaType
      //var instance = new PinterestRestApi.MediaUpload();
      //expect(instance).to.be();
    });

    it('should have the property uploadUrl (base name: "upload_url")', function() {
      // uncomment below and update the code to test the property uploadUrl
      //var instance = new PinterestRestApi.MediaUpload();
      //expect(instance).to.be();
    });

    it('should have the property uploadParameters (base name: "upload_parameters")', function() {
      // uncomment below and update the code to test the property uploadParameters
      //var instance = new PinterestRestApi.MediaUpload();
      //expect(instance).to.be();
    });

  });

}));