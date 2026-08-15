//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationRecord {
  /// Returns a new [IntegrationRecord] instance.
  IntegrationRecord({
    this.additionalId1,
    this.connectedAdvertiserId,
    this.connectedLbaId,
    this.connectedMerchantId,
    this.connectedTagId,
    this.connectedUserId,
    this.createdTime,
    this.externalBusinessId,
    this.id,
    this.partnerAccessToken,
    this.partnerAccessTokenExpiry,
    this.partnerMetadata,
    this.partnerPrimaryEmail,
    this.partnerRefreshToken,
    this.partnerRefreshTokenExpiry,
    this.scopes,
    this.updatedTime,
  });

  String? additionalId1;

  String? connectedAdvertiserId;

  String? connectedLbaId;

  String? connectedMerchantId;

  String? connectedTagId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? connectedUserId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  String? externalBusinessId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  String? partnerAccessToken;

  int? partnerAccessTokenExpiry;

  String? partnerMetadata;

  String? partnerPrimaryEmail;

  String? partnerRefreshToken;

  int? partnerRefreshTokenExpiry;

  String? scopes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationRecord &&
    other.additionalId1 == additionalId1 &&
    other.connectedAdvertiserId == connectedAdvertiserId &&
    other.connectedLbaId == connectedLbaId &&
    other.connectedMerchantId == connectedMerchantId &&
    other.connectedTagId == connectedTagId &&
    other.connectedUserId == connectedUserId &&
    other.createdTime == createdTime &&
    other.externalBusinessId == externalBusinessId &&
    other.id == id &&
    other.partnerAccessToken == partnerAccessToken &&
    other.partnerAccessTokenExpiry == partnerAccessTokenExpiry &&
    other.partnerMetadata == partnerMetadata &&
    other.partnerPrimaryEmail == partnerPrimaryEmail &&
    other.partnerRefreshToken == partnerRefreshToken &&
    other.partnerRefreshTokenExpiry == partnerRefreshTokenExpiry &&
    other.scopes == scopes &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (additionalId1 == null ? 0 : additionalId1!.hashCode) +
    (connectedAdvertiserId == null ? 0 : connectedAdvertiserId!.hashCode) +
    (connectedLbaId == null ? 0 : connectedLbaId!.hashCode) +
    (connectedMerchantId == null ? 0 : connectedMerchantId!.hashCode) +
    (connectedTagId == null ? 0 : connectedTagId!.hashCode) +
    (connectedUserId == null ? 0 : connectedUserId!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (externalBusinessId == null ? 0 : externalBusinessId!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (partnerAccessToken == null ? 0 : partnerAccessToken!.hashCode) +
    (partnerAccessTokenExpiry == null ? 0 : partnerAccessTokenExpiry!.hashCode) +
    (partnerMetadata == null ? 0 : partnerMetadata!.hashCode) +
    (partnerPrimaryEmail == null ? 0 : partnerPrimaryEmail!.hashCode) +
    (partnerRefreshToken == null ? 0 : partnerRefreshToken!.hashCode) +
    (partnerRefreshTokenExpiry == null ? 0 : partnerRefreshTokenExpiry!.hashCode) +
    (scopes == null ? 0 : scopes!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'IntegrationRecord[additionalId1=$additionalId1, connectedAdvertiserId=$connectedAdvertiserId, connectedLbaId=$connectedLbaId, connectedMerchantId=$connectedMerchantId, connectedTagId=$connectedTagId, connectedUserId=$connectedUserId, createdTime=$createdTime, externalBusinessId=$externalBusinessId, id=$id, partnerAccessToken=$partnerAccessToken, partnerAccessTokenExpiry=$partnerAccessTokenExpiry, partnerMetadata=$partnerMetadata, partnerPrimaryEmail=$partnerPrimaryEmail, partnerRefreshToken=$partnerRefreshToken, partnerRefreshTokenExpiry=$partnerRefreshTokenExpiry, scopes=$scopes, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.additionalId1 != null) {
      json[r'additional_id_1'] = this.additionalId1;
    } else {
      json[r'additional_id_1'] = null;
    }
    if (this.connectedAdvertiserId != null) {
      json[r'connected_advertiser_id'] = this.connectedAdvertiserId;
    } else {
      json[r'connected_advertiser_id'] = null;
    }
    if (this.connectedLbaId != null) {
      json[r'connected_lba_id'] = this.connectedLbaId;
    } else {
      json[r'connected_lba_id'] = null;
    }
    if (this.connectedMerchantId != null) {
      json[r'connected_merchant_id'] = this.connectedMerchantId;
    } else {
      json[r'connected_merchant_id'] = null;
    }
    if (this.connectedTagId != null) {
      json[r'connected_tag_id'] = this.connectedTagId;
    } else {
      json[r'connected_tag_id'] = null;
    }
    if (this.connectedUserId != null) {
      json[r'connected_user_id'] = this.connectedUserId;
    } else {
      json[r'connected_user_id'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.externalBusinessId != null) {
      json[r'external_business_id'] = this.externalBusinessId;
    } else {
      json[r'external_business_id'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.partnerAccessToken != null) {
      json[r'partner_access_token'] = this.partnerAccessToken;
    } else {
      json[r'partner_access_token'] = null;
    }
    if (this.partnerAccessTokenExpiry != null) {
      json[r'partner_access_token_expiry'] = this.partnerAccessTokenExpiry;
    } else {
      json[r'partner_access_token_expiry'] = null;
    }
    if (this.partnerMetadata != null) {
      json[r'partner_metadata'] = this.partnerMetadata;
    } else {
      json[r'partner_metadata'] = null;
    }
    if (this.partnerPrimaryEmail != null) {
      json[r'partner_primary_email'] = this.partnerPrimaryEmail;
    } else {
      json[r'partner_primary_email'] = null;
    }
    if (this.partnerRefreshToken != null) {
      json[r'partner_refresh_token'] = this.partnerRefreshToken;
    } else {
      json[r'partner_refresh_token'] = null;
    }
    if (this.partnerRefreshTokenExpiry != null) {
      json[r'partner_refresh_token_expiry'] = this.partnerRefreshTokenExpiry;
    } else {
      json[r'partner_refresh_token_expiry'] = null;
    }
    if (this.scopes != null) {
      json[r'scopes'] = this.scopes;
    } else {
      json[r'scopes'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [IntegrationRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "IntegrationRecord[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "IntegrationRecord[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return IntegrationRecord(
        additionalId1: mapValueOfType<String>(json, r'additional_id_1'),
        connectedAdvertiserId: mapValueOfType<String>(json, r'connected_advertiser_id'),
        connectedLbaId: mapValueOfType<String>(json, r'connected_lba_id'),
        connectedMerchantId: mapValueOfType<String>(json, r'connected_merchant_id'),
        connectedTagId: mapValueOfType<String>(json, r'connected_tag_id'),
        connectedUserId: mapValueOfType<String>(json, r'connected_user_id'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        externalBusinessId: mapValueOfType<String>(json, r'external_business_id'),
        id: mapValueOfType<String>(json, r'id'),
        partnerAccessToken: mapValueOfType<String>(json, r'partner_access_token'),
        partnerAccessTokenExpiry: mapValueOfType<int>(json, r'partner_access_token_expiry'),
        partnerMetadata: mapValueOfType<String>(json, r'partner_metadata'),
        partnerPrimaryEmail: mapValueOfType<String>(json, r'partner_primary_email'),
        partnerRefreshToken: mapValueOfType<String>(json, r'partner_refresh_token'),
        partnerRefreshTokenExpiry: mapValueOfType<int>(json, r'partner_refresh_token_expiry'),
        scopes: mapValueOfType<String>(json, r'scopes'),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<IntegrationRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationRecord> mapFromJson(dynamic json) {
    final map = <String, IntegrationRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationRecord-objects as value to a dart map
  static Map<String, List<IntegrationRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationRecord.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

