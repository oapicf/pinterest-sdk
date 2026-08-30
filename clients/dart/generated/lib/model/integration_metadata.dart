//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationMetadata {
  /// Returns a new [IntegrationMetadata] instance.
  IntegrationMetadata({
    this.additionalId1,
    this.connectedAdvertiserId,
    this.connectedLbaId,
    this.connectedMerchantId,
    this.connectedTagId,
    this.connectedUserId,
    this.createdTimestamp,
    this.externalBusinessId,
    this.id,
    this.partnerAccessTokenExpiry,
    this.partnerMetadata,
    this.partnerRefreshTokenExpiry,
    this.scopes,
    this.updatedTimestamp,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? additionalId1;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? connectedAdvertiserId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? connectedLbaId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? connectedMerchantId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
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
  num? createdTimestamp;

  /// External business ID for the integration.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? externalBusinessId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? partnerAccessTokenExpiry;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerMetadata;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? partnerRefreshTokenExpiry;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? scopes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? updatedTimestamp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationMetadata &&
    other.additionalId1 == additionalId1 &&
    other.connectedAdvertiserId == connectedAdvertiserId &&
    other.connectedLbaId == connectedLbaId &&
    other.connectedMerchantId == connectedMerchantId &&
    other.connectedTagId == connectedTagId &&
    other.connectedUserId == connectedUserId &&
    other.createdTimestamp == createdTimestamp &&
    other.externalBusinessId == externalBusinessId &&
    other.id == id &&
    other.partnerAccessTokenExpiry == partnerAccessTokenExpiry &&
    other.partnerMetadata == partnerMetadata &&
    other.partnerRefreshTokenExpiry == partnerRefreshTokenExpiry &&
    other.scopes == scopes &&
    other.updatedTimestamp == updatedTimestamp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (additionalId1 == null ? 0 : additionalId1!.hashCode) +
    (connectedAdvertiserId == null ? 0 : connectedAdvertiserId!.hashCode) +
    (connectedLbaId == null ? 0 : connectedLbaId!.hashCode) +
    (connectedMerchantId == null ? 0 : connectedMerchantId!.hashCode) +
    (connectedTagId == null ? 0 : connectedTagId!.hashCode) +
    (connectedUserId == null ? 0 : connectedUserId!.hashCode) +
    (createdTimestamp == null ? 0 : createdTimestamp!.hashCode) +
    (externalBusinessId == null ? 0 : externalBusinessId!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (partnerAccessTokenExpiry == null ? 0 : partnerAccessTokenExpiry!.hashCode) +
    (partnerMetadata == null ? 0 : partnerMetadata!.hashCode) +
    (partnerRefreshTokenExpiry == null ? 0 : partnerRefreshTokenExpiry!.hashCode) +
    (scopes == null ? 0 : scopes!.hashCode) +
    (updatedTimestamp == null ? 0 : updatedTimestamp!.hashCode);

  @override
  String toString() => 'IntegrationMetadata[additionalId1=$additionalId1, connectedAdvertiserId=$connectedAdvertiserId, connectedLbaId=$connectedLbaId, connectedMerchantId=$connectedMerchantId, connectedTagId=$connectedTagId, connectedUserId=$connectedUserId, createdTimestamp=$createdTimestamp, externalBusinessId=$externalBusinessId, id=$id, partnerAccessTokenExpiry=$partnerAccessTokenExpiry, partnerMetadata=$partnerMetadata, partnerRefreshTokenExpiry=$partnerRefreshTokenExpiry, scopes=$scopes, updatedTimestamp=$updatedTimestamp]';

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
    if (this.createdTimestamp != null) {
      json[r'created_timestamp'] = this.createdTimestamp;
    } else {
      json[r'created_timestamp'] = null;
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
    if (this.updatedTimestamp != null) {
      json[r'updated_timestamp'] = this.updatedTimestamp;
    } else {
      json[r'updated_timestamp'] = null;
    }
    return json;
  }

  /// Returns a new [IntegrationMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return IntegrationMetadata(
        additionalId1: mapValueOfType<String>(json, r'additional_id_1'),
        connectedAdvertiserId: mapValueOfType<String>(json, r'connected_advertiser_id'),
        connectedLbaId: mapValueOfType<String>(json, r'connected_lba_id'),
        connectedMerchantId: mapValueOfType<String>(json, r'connected_merchant_id'),
        connectedTagId: mapValueOfType<String>(json, r'connected_tag_id'),
        connectedUserId: mapValueOfType<String>(json, r'connected_user_id'),
        createdTimestamp: num.parse('${json[r'created_timestamp']}'),
        externalBusinessId: mapValueOfType<String>(json, r'external_business_id'),
        id: mapValueOfType<String>(json, r'id'),
        partnerAccessTokenExpiry: num.parse('${json[r'partner_access_token_expiry']}'),
        partnerMetadata: mapValueOfType<String>(json, r'partner_metadata'),
        partnerRefreshTokenExpiry: num.parse('${json[r'partner_refresh_token_expiry']}'),
        scopes: mapValueOfType<String>(json, r'scopes'),
        updatedTimestamp: num.parse('${json[r'updated_timestamp']}'),
      );
    }
    return null;
  }

  static List<IntegrationMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationMetadata> mapFromJson(dynamic json) {
    final map = <String, IntegrationMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationMetadata-objects as value to a dart map
  static Map<String, List<IntegrationMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

