import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for AudiencesApi
void main() {
  final instance = Openapi().getAudiencesApi();

  group(AudiencesApi, () {
    // Create audience
    //
    // Create a new audience for the ad account.
    //
    //Future<AdAccountsAudience> audiencesCreate(String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate) async
    test('test audiencesCreate', () async {
      // TODO
    });

    // Get audience
    //
    // Get a specific audience given the audience ID.
    //
    //Future<AdAccountsAudience> audiencesGet(String audienceId, String adAccountId) async
    test('test audiencesGet', () async {
      // TODO
    });

    // List audiences
    //
    // Get list of audiences for the ad account.
    //
    //Future<AudiencesList200Response> audiencesList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, AudienceOwnershipType ownershipType, bool excludeNca }) async
    test('test audiencesList', () async {
      // TODO
    });

    // Update audience
    //
    // Update an existing audience for the ad account.
    //
    //Future<AdAccountsAudience> audiencesUpdate(String audienceId, String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate) async
    test('test audiencesUpdate', () async {
      // TODO
    });

  });
}
