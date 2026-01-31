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


/// tests for CustomerListUploadsApi
void main() {
  // final instance = CustomerListUploadsApi();

  group('tests for CustomerListUploadsApi', () {
    // Create customer list upload
    //
    // <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
    //
    //Future<CustomerListUploadCreateResponse> customerListUploadsCreate(String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest) async
    test('test customerListUploadsCreate', () async {
      // TODO
    });

    // Get customer list upload
    //
    // <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
    //
    //Future<CustomerListUploadResponse> customerListUploadsGet(String adAccountId, String customerListId, String customerListUploadId) async
    test('test customerListUploadsGet', () async {
      // TODO
    });

    // Run customer list upload
    //
    // <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
    //
    //Future<CustomerListUploadResponse> customerListUploadsRun(String adAccountId, String customerListId, String customerListUploadId) async
    test('test customerListUploadsRun', () async {
      // TODO
    });

  });
}
