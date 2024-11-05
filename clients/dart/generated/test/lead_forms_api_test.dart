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
    // <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    //
    //Future<LeadFormResponse> leadFormGet(String adAccountId, String leadFormId) async
    test('test leadFormGet', () async {
      // TODO
    });

    // Create lead form test data
    //
    // Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
    //
    //Future<LeadFormTestResponse> leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest) async
    test('test leadFormTestCreate', () async {
      // TODO
    });

    // Create lead forms
    //
    // <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    //
    //Future<LeadFormArrayResponse> leadFormsCreate(String adAccountId, List<LeadFormCreateRequest> leadFormCreateRequest) async
    test('test leadFormsCreate', () async {
      // TODO
    });

    // List lead forms
    //
    // <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    //
    //Future<LeadFormsList200Response> leadFormsList(String adAccountId, { int pageSize, String order, String bookmark }) async
    test('test leadFormsList', () async {
      // TODO
    });

    // Update lead forms
    //
    // <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    //
    //Future<LeadFormArrayResponse> leadFormsUpdate(String adAccountId, List<LeadFormUpdateRequest> leadFormUpdateRequest) async
    test('test leadFormsUpdate', () async {
      // TODO
    });

  });
}
