//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationMetadataUpdate {
  /// Returns a new [IntegrationMetadataUpdate] instance.
  IntegrationMetadataUpdate({
    this.additionalId1,
    this.connectedAdvertiserId,
    this.connectedLbaId,
    this.connectedMerchantId,
    this.connectedTagId,
    this.partnerAccessToken,
    this.partnerAccessTokenExpiry,
    this.partnerMetadata,
    this.partnerPrimaryEmail,
    this.partnerRefreshToken,
    this.partnerRefreshTokenExpiry,
    this.scopes,
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
  String? partnerAccessToken;

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
  String? partnerPrimaryEmail;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerRefreshToken;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationMetadataUpdate &&
    other.additionalId1 == additionalId1 &&
    other.connectedAdvertiserId == connectedAdvertiserId &&
    other.connectedLbaId == connectedLbaId &&
    other.connectedMerchantId == connectedMerchantId &&
    other.connectedTagId == connectedTagId &&
    other.partnerAccessToken == partnerAccessToken &&
    other.partnerAccessTokenExpiry == partnerAccessTokenExpiry &&
    other.partnerMetadata == partnerMetadata &&
    other.partnerPrimaryEmail == partnerPrimaryEmail &&
    other.partnerRefreshToken == partnerRefreshToken &&
    other.partnerRefreshTokenExpiry == partnerRefreshTokenExpiry &&
    other.scopes == scopes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (additionalId1 == null ? 0 : additionalId1!.hashCode) +
    (connectedAdvertiserId == null ? 0 : connectedAdvertiserId!.hashCode) +
    (connectedLbaId == null ? 0 : connectedLbaId!.hashCode) +
    (connectedMerchantId == null ? 0 : connectedMerchantId!.hashCode) +
    (connectedTagId == null ? 0 : connectedTagId!.hashCode) +
    (partnerAccessToken == null ? 0 : partnerAccessToken!.hashCode) +
    (partnerAccessTokenExpiry == null ? 0 : partnerAccessTokenExpiry!.hashCode) +
    (partnerMetadata == null ? 0 : partnerMetadata!.hashCode) +
    (partnerPrimaryEmail == null ? 0 : partnerPrimaryEmail!.hashCode) +
    (partnerRefreshToken == null ? 0 : partnerRefreshToken!.hashCode) +
    (partnerRefreshTokenExpiry == null ? 0 : partnerRefreshTokenExpiry!.hashCode) +
    (scopes == null ? 0 : scopes!.hashCode);

  @override
  String toString() => 'IntegrationMetadataUpdate[additionalId1=$additionalId1, connectedAdvertiserId=$connectedAdvertiserId, connectedLbaId=$connectedLbaId, connectedMerchantId=$connectedMerchantId, connectedTagId=$connectedTagId, partnerAccessToken=$partnerAccessToken, partnerAccessTokenExpiry=$partnerAccessTokenExpiry, partnerMetadata=$partnerMetadata, partnerPrimaryEmail=$partnerPrimaryEmail, partnerRefreshToken=$partnerRefreshToken, partnerRefreshTokenExpiry=$partnerRefreshTokenExpiry, scopes=$scopes]';

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
    return json;
  }

  /// Returns a new [IntegrationMetadataUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationMetadataUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return IntegrationMetadataUpdate(
        additionalId1: mapValueOfType<String>(json, r'additional_id_1'),
        connectedAdvertiserId: mapValueOfType<String>(json, r'connected_advertiser_id'),
        connectedLbaId: mapValueOfType<String>(json, r'connected_lba_id'),
        connectedMerchantId: mapValueOfType<String>(json, r'connected_merchant_id'),
        connectedTagId: mapValueOfType<String>(json, r'connected_tag_id'),
        partnerAccessToken: mapValueOfType<String>(json, r'partner_access_token'),
        partnerAccessTokenExpiry: num.parse('${json[r'partner_access_token_expiry']}'),
        partnerMetadata: mapValueOfType<String>(json, r'partner_metadata'),
        partnerPrimaryEmail: mapValueOfType<String>(json, r'partner_primary_email'),
        partnerRefreshToken: mapValueOfType<String>(json, r'partner_refresh_token'),
        partnerRefreshTokenExpiry: num.parse('${json[r'partner_refresh_token_expiry']}'),
        scopes: mapValueOfType<String>(json, r'scopes'),
      );
    }
    return null;
  }

  static List<IntegrationMetadataUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationMetadataUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationMetadataUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationMetadataUpdate> mapFromJson(dynamic json) {
    final map = <String, IntegrationMetadataUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationMetadataUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationMetadataUpdate-objects as value to a dart map
  static Map<String, List<IntegrationMetadataUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationMetadataUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationMetadataUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

