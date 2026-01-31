import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for LabelsApi
void main() {
  final instance = Openapi().getLabelsApi();

  group(LabelsApi, () {
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
    //Future<LabelsList200Response> labelsList(String adAccountId, { BuiltList<String> campaignIds, BuiltList<String> labelIds, BuiltList<String> entityStatuses, BuiltList<String> labelTypes, int pageSize, String bookmark }) async
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
