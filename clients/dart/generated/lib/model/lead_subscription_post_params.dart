//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadSubscriptionPostParams {
  /// Returns a new [LeadSubscriptionPostParams] instance.
  LeadSubscriptionPostParams({
    this.adAccountId,
    this.apiVersion,
    this.createdTime,
    this.cryptographicAlgorithm,
    this.cryptographicKey,
    this.id,
    this.leadFormId,
    this.userAccountId,
    this.webhookUrl,
    this.partnerAccessToken,
    this.partnerMetadata,
    this.partnerRefreshToken,
  });

  /// The Ad Account ID that this lead form belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// API version.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? apiVersion;

  /// Subscription creation time. Unix timestamp in milliseconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// Lead data encryption algorithm.
  String? cryptographicAlgorithm;

  /// Base64 encoded key for client to decrypt lead data.
  String? cryptographicKey;

  /// Subscription ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Lead form ID.
  String? leadFormId;

  /// User account used to subscribe lead data.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userAccountId;

  /// Standard HTTPS webhook URL.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? webhookUrl;

  /// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerAccessToken;

  /// Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PartnerMetadata? partnerMetadata;

  /// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerRefreshToken;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadSubscriptionPostParams &&
    other.adAccountId == adAccountId &&
    other.apiVersion == apiVersion &&
    other.createdTime == createdTime &&
    other.cryptographicAlgorithm == cryptographicAlgorithm &&
    other.cryptographicKey == cryptographicKey &&
    other.id == id &&
    other.leadFormId == leadFormId &&
    other.userAccountId == userAccountId &&
    other.webhookUrl == webhookUrl &&
    other.partnerAccessToken == partnerAccessToken &&
    other.partnerMetadata == partnerMetadata &&
    other.partnerRefreshToken == partnerRefreshToken;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (apiVersion == null ? 0 : apiVersion!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (cryptographicAlgorithm == null ? 0 : cryptographicAlgorithm!.hashCode) +
    (cryptographicKey == null ? 0 : cryptographicKey!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (leadFormId == null ? 0 : leadFormId!.hashCode) +
    (userAccountId == null ? 0 : userAccountId!.hashCode) +
    (webhookUrl == null ? 0 : webhookUrl!.hashCode) +
    (partnerAccessToken == null ? 0 : partnerAccessToken!.hashCode) +
    (partnerMetadata == null ? 0 : partnerMetadata!.hashCode) +
    (partnerRefreshToken == null ? 0 : partnerRefreshToken!.hashCode);

  @override
  String toString() => 'LeadSubscriptionPostParams[adAccountId=$adAccountId, apiVersion=$apiVersion, createdTime=$createdTime, cryptographicAlgorithm=$cryptographicAlgorithm, cryptographicKey=$cryptographicKey, id=$id, leadFormId=$leadFormId, userAccountId=$userAccountId, webhookUrl=$webhookUrl, partnerAccessToken=$partnerAccessToken, partnerMetadata=$partnerMetadata, partnerRefreshToken=$partnerRefreshToken]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.apiVersion != null) {
      json[r'api_version'] = this.apiVersion;
    } else {
      json[r'api_version'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.cryptographicAlgorithm != null) {
      json[r'cryptographic_algorithm'] = this.cryptographicAlgorithm;
    } else {
      json[r'cryptographic_algorithm'] = null;
    }
    if (this.cryptographicKey != null) {
      json[r'cryptographic_key'] = this.cryptographicKey;
    } else {
      json[r'cryptographic_key'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.leadFormId != null) {
      json[r'lead_form_id'] = this.leadFormId;
    } else {
      json[r'lead_form_id'] = null;
    }
    if (this.userAccountId != null) {
      json[r'user_account_id'] = this.userAccountId;
    } else {
      json[r'user_account_id'] = null;
    }
    if (this.webhookUrl != null) {
      json[r'webhook_url'] = this.webhookUrl;
    } else {
      json[r'webhook_url'] = null;
    }
    if (this.partnerAccessToken != null) {
      json[r'partner_access_token'] = this.partnerAccessToken;
    } else {
      json[r'partner_access_token'] = null;
    }
    if (this.partnerMetadata != null) {
      json[r'partner_metadata'] = this.partnerMetadata;
    } else {
      json[r'partner_metadata'] = null;
    }
    if (this.partnerRefreshToken != null) {
      json[r'partner_refresh_token'] = this.partnerRefreshToken;
    } else {
      json[r'partner_refresh_token'] = null;
    }
    return json;
  }

  /// Returns a new [LeadSubscriptionPostParams] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadSubscriptionPostParams? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LeadSubscriptionPostParams(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        apiVersion: mapValueOfType<String>(json, r'api_version'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        cryptographicAlgorithm: mapValueOfType<String>(json, r'cryptographic_algorithm'),
        cryptographicKey: mapValueOfType<String>(json, r'cryptographic_key'),
        id: mapValueOfType<String>(json, r'id'),
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        userAccountId: mapValueOfType<String>(json, r'user_account_id'),
        webhookUrl: mapValueOfType<String>(json, r'webhook_url'),
        partnerAccessToken: mapValueOfType<String>(json, r'partner_access_token'),
        partnerMetadata: PartnerMetadata.fromJson(json[r'partner_metadata']),
        partnerRefreshToken: mapValueOfType<String>(json, r'partner_refresh_token'),
      );
    }
    return null;
  }

  static List<LeadSubscriptionPostParams> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadSubscriptionPostParams>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadSubscriptionPostParams.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadSubscriptionPostParams> mapFromJson(dynamic json) {
    final map = <String, LeadSubscriptionPostParams>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadSubscriptionPostParams.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadSubscriptionPostParams-objects as value to a dart map
  static Map<String, List<LeadSubscriptionPostParams>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadSubscriptionPostParams>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadSubscriptionPostParams.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

