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
    instance = new PinterestSdk.BusinessAccessRelationshipsApi();
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

  describe('BusinessAccessRelationshipsApi', function() {
    describe('deleteBusinessMembership', function() {
      it('should call deleteBusinessMembership successfully', function(done) {
        //uncomment below and update the code to test deleteBusinessMembership
        //instance.deleteBusinessMembership(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteBusinessPartners', function() {
      it('should call deleteBusinessPartners successfully', function(done) {
        //uncomment below and update the code to test deleteBusinessPartners
        //instance.deleteBusinessPartners(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessEmployers', function() {
      it('should call getBusinessEmployers successfully', function(done) {
        //uncomment below and update the code to test getBusinessEmployers
        //instance.getBusinessEmployers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessMembers', function() {
      it('should call getBusinessMembers successfully', function(done) {
        //uncomment below and update the code to test getBusinessMembers
        //instance.getBusinessMembers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessPartners', function() {
      it('should call getBusinessPartners successfully', function(done) {
        //uncomment below and update the code to test getBusinessPartners
        //instance.getBusinessPartners(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateBusinessMemberships', function() {
      it('should call updateBusinessMemberships successfully', function(done) {
        //uncomment below and update the code to test updateBusinessMemberships
        //instance.updateBusinessMemberships(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
