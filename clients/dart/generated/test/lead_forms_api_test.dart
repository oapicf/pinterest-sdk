//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for LeadFormsApi
void main() {
  // final instance = LeadFormsApi();

  group('tests for LeadFormsApi', () {
    // Get lead form by id
    //
    // Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<LeadFormResponse> leadFormGet(String adAccountId, String leadFormId) async
    test('test leadFormGet', () async {
      // TODO
    });

    // Create lead form test data
    //
    // Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
    //
    //Future<LeadFormTestResponse> leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest) async
    test('test leadFormTestCreate', () async {
      // TODO
    });

    // Get lead forms
    //
    // Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<LeadFormsList200Response> leadFormsList(String adAccountId, { int pageSize, String order, String bookmark }) async
    test('test leadFormsList', () async {
      // TODO
    });

  });
}
