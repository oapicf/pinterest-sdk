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


/// tests for LabelsApi
void main() {
  // final instance = LabelsApi();

  group('tests for LabelsApi', () {
    // Create labels
    //
    // <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
    //
    //Future<LabelsResponse> labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest) async
    test('test labelsCreate', () async {
      // TODO
    });

    // List labels
    //
    // <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
    //
    //Future<LabelsList200Response> labelsList(String adAccountId, { List<String> campaignIds, List<String> labelIds, List<String> entityStatuses, List<String> labelTypes, int pageSize, String bookmark }) async
    test('test labelsList', () async {
      // TODO
    });

    // Update labels
    //
    // <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
    //
    //Future<LabelsResponse> labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest) async
    test('test labelsUpdate', () async {
      // TODO
    });

  });
}
