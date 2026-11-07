import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CustomerListUploadsApi
void main() {
  final instance = Openapi().getCustomerListUploadsApi();

  group(CustomerListUploadsApi, () {
    // Create customer list upload
    //
    // Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
    //
    //Future<CustomerListUploadCreateResponse> customerListUploadsCreate(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest) async
    test('test customerListUploadsCreate', () async {
      // TODO
    });

    // Get customer list upload
    //
    // Get the metadata for a given upload by its ID.
    //
    //Future<CustomerListUpload> customerListUploadsGet(String adAccountId, String customerListId, String customerListUploadId) async
    test('test customerListUploadsGet', () async {
      // TODO
    });

    // Run customer list upload
    //
    // Begin processing a customer list upload.
    //
    //Future<CustomerListUpload> customerListUploadsRun(String adAccountId, String customerListId, String customerListUploadId) async
    test('test customerListUploadsRun', () async {
      // TODO
    });

  });
}
