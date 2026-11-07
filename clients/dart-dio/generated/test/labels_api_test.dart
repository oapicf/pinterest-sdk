import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for LabelsApi
void main() {
  final instance = Openapi().getLabelsApi();

  group(LabelsApi, () {
    // Apply label to entity
    //
    //   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
    //
    //Future<LabeledEntities> labelsApply(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) async
    test('test labelsApply', () async {
      // TODO
    });

    // Create labels
    //
    // [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
    //
    //Future<LabelsResponse> labelsCreate(String adAccountId, LabelCreateRequest labelCreateRequest) async
    test('test labelsCreate', () async {
      // TODO
    });

    // List labels
    //
    // [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
    //
    //Future<LabelsList200Response> labelsList(String adAccountId, { BuiltList<String> campaignIds, BuiltList<String> labelIds, BuiltList<QueryLabelEntityStatusesItems> entityStatuses, BuiltList<QueryLabelTypesItems> labelTypes, String bookmark, int pageSize }) async
    test('test labelsList', () async {
      // TODO
    });

    // Remove label from entities
    //
    //   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
    //
    //Future<LabeledEntities> labelsRemove(String adAccountId, String labelId, LabeledEntitiesCreate labeledEntitiesCreate) async
    test('test labelsRemove', () async {
      // TODO
    });

    // Update labels
    //
    // [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
    //
    //Future<LabelsResponse> labelsUpdate(String adAccountId, LabelUpdateRequest labelUpdateRequest) async
    test('test labelsUpdate', () async {
      // TODO
    });

  });
}
