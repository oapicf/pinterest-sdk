//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadSubscriptionPostParamsCreate {
  /// Returns a new [LeadSubscriptionPostParamsCreate] instance.
  LeadSubscriptionPostParamsCreate({
    this.leadFormId,
    required this.webhookUrl,
    this.partnerAccessToken,
    this.partnerMetadata,
    this.partnerRefreshToken,
  });

  /// Lead form ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? leadFormId;

  /// Standard HTTPS webhook URL.
  String webhookUrl;

  /// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
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
  LeadSubscriptionPostParamsCreateAllOfPartnerMetadata? partnerMetadata;

  /// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerRefreshToken;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadSubscriptionPostParamsCreate &&
    other.leadFormId == leadFormId &&
    other.webhookUrl == webhookUrl &&
    other.partnerAccessToken == partnerAccessToken &&
    other.partnerMetadata == partnerMetadata &&
    other.partnerRefreshToken == partnerRefreshToken;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (leadFormId == null ? 0 : leadFormId!.hashCode) +
    (webhookUrl.hashCode) +
    (partnerAccessToken == null ? 0 : partnerAccessToken!.hashCode) +
    (partnerMetadata == null ? 0 : partnerMetadata!.hashCode) +
    (partnerRefreshToken == null ? 0 : partnerRefreshToken!.hashCode);

  @override
  String toString() => 'LeadSubscriptionPostParamsCreate[leadFormId=$leadFormId, webhookUrl=$webhookUrl, partnerAccessToken=$partnerAccessToken, partnerMetadata=$partnerMetadata, partnerRefreshToken=$partnerRefreshToken]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.leadFormId != null) {
      json[r'lead_form_id'] = this.leadFormId;
    } else {
      json[r'lead_form_id'] = null;
    }
      json[r'webhook_url'] = this.webhookUrl;
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

  /// Returns a new [LeadSubscriptionPostParamsCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadSubscriptionPostParamsCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadSubscriptionPostParamsCreate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadSubscriptionPostParamsCreate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadSubscriptionPostParamsCreate(
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        webhookUrl: mapValueOfType<String>(json, r'webhook_url')!,
        partnerAccessToken: mapValueOfType<String>(json, r'partner_access_token'),
        partnerMetadata: LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.fromJson(json[r'partner_metadata']),
        partnerRefreshToken: mapValueOfType<String>(json, r'partner_refresh_token'),
      );
    }
    return null;
  }

  static List<LeadSubscriptionPostParamsCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadSubscriptionPostParamsCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadSubscriptionPostParamsCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadSubscriptionPostParamsCreate> mapFromJson(dynamic json) {
    final map = <String, LeadSubscriptionPostParamsCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadSubscriptionPostParamsCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadSubscriptionPostParamsCreate-objects as value to a dart map
  static Map<String, List<LeadSubscriptionPostParamsCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadSubscriptionPostParamsCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadSubscriptionPostParamsCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'webhook_url',
  };
}

