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
    instance = new PinterestSdk.PinMediaWithImageAllOfImages();
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

  describe('PinMediaWithImageAllOfImages', function() {
    it('should create an instance of PinMediaWithImageAllOfImages', function() {
      // uncomment below and update the code to test PinMediaWithImageAllOfImages
      //var instance = new PinterestSdk.PinMediaWithImageAllOfImages();
      //expect(instance).to.be.a(PinterestSdk.PinMediaWithImageAllOfImages);
    });

    it('should have the property _150x150 (base name: "150x150")', function() {
      // uncomment below and update the code to test the property _150x150
      //var instance = new PinterestSdk.PinMediaWithImageAllOfImages();
      //expect(instance).to.be();
    });

    it('should have the property _400x300 (base name: "400x300")', function() {
      // uncomment below and update the code to test the property _400x300
      //var instance = new PinterestSdk.PinMediaWithImageAllOfImages();
      //expect(instance).to.be();
    });

    it('should have the property _600x (base name: "600x")', function() {
      // uncomment below and update the code to test the property _600x
      //var instance = new PinterestSdk.PinMediaWithImageAllOfImages();
      //expect(instance).to.be();
    });

    it('should have the property _1200x (base name: "1200x")', function() {
      // uncomment below and update the code to test the property _1200x
      //var instance = new PinterestSdk.PinMediaWithImageAllOfImages();
      //expect(instance).to.be();
    });

  });

}));
