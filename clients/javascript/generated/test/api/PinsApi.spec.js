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
    instance = new PinterestSdk.PinsApi();
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

  describe('PinsApi', function() {
    describe('multiPinsAnalytics', function() {
      it('should call multiPinsAnalytics successfully', function(done) {
        //uncomment below and update the code to test multiPinsAnalytics
        //instance.multiPinsAnalytics(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pinsAnalytics', function() {
      it('should call pinsAnalytics successfully', function(done) {
        //uncomment below and update the code to test pinsAnalytics
        //instance.pinsAnalytics(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pinsCreate', function() {
      it('should call pinsCreate successfully', function(done) {
        //uncomment below and update the code to test pinsCreate
        //instance.pinsCreate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pinsDelete', function() {
      it('should call pinsDelete successfully', function(done) {
        //uncomment below and update the code to test pinsDelete
        //instance.pinsDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pinsGet', function() {
      it('should call pinsGet successfully', function(done) {
        //uncomment below and update the code to test pinsGet
        //instance.pinsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pinsList', function() {
      it('should call pinsList successfully', function(done) {
        //uncomment below and update the code to test pinsList
        //instance.pinsList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pinsSave', function() {
      it('should call pinsSave successfully', function(done) {
        //uncomment below and update the code to test pinsSave
        //instance.pinsSave(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pinsUpdate', function() {
      it('should call pinsUpdate successfully', function(done) {
        //uncomment below and update the code to test pinsUpdate
        //instance.pinsUpdate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
