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


/// tests for IntegrationsApi
void main() {
  // final instance = IntegrationsApi();

  group('tests for IntegrationsApi', () {
    // Delete commerce integration
    //
    // Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future integrationsCommerceDel(String externalBusinessId) async
    test('test integrationsCommerceDel', () async {
      // TODO
    });

    // Get commerce integration
    //
    // Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<IntegrationMetadata> integrationsCommerceGet(String externalBusinessId) async
    test('test integrationsCommerceGet', () async {
      // TODO
    });

    // Update commerce integration
    //
    // Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<IntegrationMetadata> integrationsCommercePatch(String externalBusinessId, { IntegrationRequestPatch integrationRequestPatch }) async
    test('test integrationsCommercePatch', () async {
      // TODO
    });

    // Create commerce integration
    //
    // Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<IntegrationMetadata> integrationsCommercePost({ IntegrationRequest integrationRequest }) async
    test('test integrationsCommercePost', () async {
      // TODO
    });

    // Get integration metadata
    //
    // Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<IntegrationRecord> integrationsGetById(String id) async
    test('test integrationsGetById', () async {
      // TODO
    });

    // Get integration metadata list
    //
    // Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<IntegrationsGetList200Response> integrationsGetList({ String bookmark, int pageSize }) async
    test('test integrationsGetList', () async {
      // TODO
    });

    // Receives batched logs from integration applications.
    //
    // This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    //
    //Future<IntegrationLogsSuccessResponse> integrationsLogsPost(IntegrationLogsRequest integrationLogsRequest) async
    test('test integrationsLogsPost', () async {
      // TODO
    });

  });
}
