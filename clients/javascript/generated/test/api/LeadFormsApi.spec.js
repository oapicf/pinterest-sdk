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
    instance = new PinterestSdk.LeadFormsApi();
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

  describe('LeadFormsApi', function() {
    describe('leadFormGet', function() {
      it('should call leadFormGet successfully', function(done) {
        //uncomment below and update the code to test leadFormGet
        //instance.leadFormGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leadFormTestCreate', function() {
      it('should call leadFormTestCreate successfully', function(done) {
        //uncomment below and update the code to test leadFormTestCreate
        //instance.leadFormTestCreate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leadFormsCreate', function() {
      it('should call leadFormsCreate successfully', function(done) {
        //uncomment below and update the code to test leadFormsCreate
        //instance.leadFormsCreate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leadFormsList', function() {
      it('should call leadFormsList successfully', function(done) {
        //uncomment below and update the code to test leadFormsList
        //instance.leadFormsList(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('leadFormsUpdate', function() {
      it('should call leadFormsUpdate successfully', function(done) {
        //uncomment below and update the code to test leadFormsUpdate
        //instance.leadFormsUpdate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
