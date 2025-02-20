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
    instance = new PinterestSdk.BillingApi();
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

  describe('BillingApi', function() {
    describe('adsCreditRedeem', function() {
      it('should call adsCreditRedeem successfully', function(done) {
        //uncomment below and update the code to test adsCreditRedeem
        //instance.adsCreditRedeem(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('adsCreditsDiscountsGet', function() {
      it('should call adsCreditsDiscountsGet successfully', function(done) {
        //uncomment below and update the code to test adsCreditsDiscountsGet
        //instance.adsCreditsDiscountsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('billingProfilesGet', function() {
      it('should call billingProfilesGet successfully', function(done) {
        //uncomment below and update the code to test billingProfilesGet
        //instance.billingProfilesGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('ssioAccountsGet', function() {
      it('should call ssioAccountsGet successfully', function(done) {
        //uncomment below and update the code to test ssioAccountsGet
        //instance.ssioAccountsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('ssioInsertionOrderCreate', function() {
      it('should call ssioInsertionOrderCreate successfully', function(done) {
        //uncomment below and update the code to test ssioInsertionOrderCreate
        //instance.ssioInsertionOrderCreate(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('ssioInsertionOrderEdit', function() {
      it('should call ssioInsertionOrderEdit successfully', function(done) {
        //uncomment below and update the code to test ssioInsertionOrderEdit
        //instance.ssioInsertionOrderEdit(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('ssioInsertionOrdersStatusGetByAdAccount', function() {
      it('should call ssioInsertionOrdersStatusGetByAdAccount successfully', function(done) {
        //uncomment below and update the code to test ssioInsertionOrdersStatusGetByAdAccount
        //instance.ssioInsertionOrdersStatusGetByAdAccount(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('ssioInsertionOrdersStatusGetByPinOrderId', function() {
      it('should call ssioInsertionOrdersStatusGetByPinOrderId successfully', function(done) {
        //uncomment below and update the code to test ssioInsertionOrdersStatusGetByPinOrderId
        //instance.ssioInsertionOrdersStatusGetByPinOrderId(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('ssioOrderLinesGetByAdAccount', function() {
      it('should call ssioOrderLinesGetByAdAccount successfully', function(done) {
        //uncomment below and update the code to test ssioOrderLinesGetByAdAccount
        //instance.ssioOrderLinesGetByAdAccount(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
