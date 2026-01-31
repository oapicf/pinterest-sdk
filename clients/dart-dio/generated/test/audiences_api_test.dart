import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AudiencesApi
void main() {
  final instance = Openapi().getAudiencesApi();

  group(AudiencesApi, () {
    // Create audience
    //
    // Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>.
    //
    //Future<Audience> audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest) async
    test('test audiencesCreate', () async {
      // TODO
    });

    // Get audience
    //
    // Get a specific audience given the audience ID.
    //
    //Future<Audience> audiencesGet(String adAccountId, String audienceId) async
    test('test audiencesGet', () async {
      // TODO
    });

    // List audiences
    //
    // Get list of audiences for the ad account.
    //
    //Future<AudiencesList200Response> audiencesList(String adAccountId, { String bookmark, String order, int pageSize, String ownershipType }) async
    test('test audiencesList', () async {
      // TODO
    });

    // Update audience
    //
    // Update (edit or remove) an existing targeting audience.
    //
    //Future<Audience> audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest) async
    test('test audiencesUpdate', () async {
      // TODO
    });

  });
}
