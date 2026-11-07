import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CustomerListsApi
void main() {
  final instance = Openapi().getCustomerListsApi();

  group(CustomerListsApi, () {
    // Create customer lists
    //
    // Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
    //
    //Future<CustomerList> customerListsCreate(String adAccountId, CustomerListCreate customerListCreate) async
    test('test customerListsCreate', () async {
      // TODO
    });

    // Get customer list
    //
    // Gets a specific customer list given the customer list ID.
    //
    //Future<CustomerList> customerListsGet(String adAccountId, String customerListId) async
    test('test customerListsGet', () async {
      // TODO
    });

    // Get customer lists
    //
    // Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    //
    //Future<CustomerListsList200Response> customerListsList(String adAccountId, { String bookmark, int pageSize, PinterestLibPaginationOrder order, bool excludeNca }) async
    test('test customerListsList', () async {
      // TODO
    });

    // Update customer list
    //
    // Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    //
    //Future<CustomerList> customerListsUpdate(String adAccountId, String customerListId, CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody) async
    test('test customerListsUpdate', () async {
      // TODO
    });

  });
}
