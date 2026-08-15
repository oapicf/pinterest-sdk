//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountCreateSubscriptionRequest {
  /// Returns a new [AdAccountCreateSubscriptionRequest] instance.
  AdAccountCreateSubscriptionRequest({
    this.leadFormId,
    this.partnerAccessToken,
    this.partnerMetadata,
    this.partnerRefreshToken,
    required this.webhookUrl,
  });

  /// Lead form ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? leadFormId;

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
  AdAccountCreateSubscriptionRequestPartnerMetadata? partnerMetadata;

  /// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? partnerRefreshToken;

  /// Standard HTTPS webhook URL.
  String webhookUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountCreateSubscriptionRequest &&
    other.leadFormId == leadFormId &&
    other.partnerAccessToken == partnerAccessToken &&
    other.partnerMetadata == partnerMetadata &&
    other.partnerRefreshToken == partnerRefreshToken &&
    other.webhookUrl == webhookUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (leadFormId == null ? 0 : leadFormId!.hashCode) +
    (partnerAccessToken == null ? 0 : partnerAccessToken!.hashCode) +
    (partnerMetadata == null ? 0 : partnerMetadata!.hashCode) +
    (partnerRefreshToken == null ? 0 : partnerRefreshToken!.hashCode) +
    (webhookUrl.hashCode);

  @override
  String toString() => 'AdAccountCreateSubscriptionRequest[leadFormId=$leadFormId, partnerAccessToken=$partnerAccessToken, partnerMetadata=$partnerMetadata, partnerRefreshToken=$partnerRefreshToken, webhookUrl=$webhookUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.leadFormId != null) {
      json[r'lead_form_id'] = this.leadFormId;
    } else {
      json[r'lead_form_id'] = null;
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
      json[r'webhook_url'] = this.webhookUrl;
    return json;
  }

  /// Returns a new [AdAccountCreateSubscriptionRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountCreateSubscriptionRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdAccountCreateSubscriptionRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdAccountCreateSubscriptionRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdAccountCreateSubscriptionRequest(
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        partnerAccessToken: mapValueOfType<String>(json, r'partner_access_token'),
        partnerMetadata: AdAccountCreateSubscriptionRequestPartnerMetadata.fromJson(json[r'partner_metadata']),
        partnerRefreshToken: mapValueOfType<String>(json, r'partner_refresh_token'),
        webhookUrl: mapValueOfType<String>(json, r'webhook_url')!,
      );
    }
    return null;
  }

  static List<AdAccountCreateSubscriptionRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountCreateSubscriptionRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountCreateSubscriptionRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountCreateSubscriptionRequest> mapFromJson(dynamic json) {
    final map = <String, AdAccountCreateSubscriptionRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountCreateSubscriptionRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountCreateSubscriptionRequest-objects as value to a dart map
  static Map<String, List<AdAccountCreateSubscriptionRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountCreateSubscriptionRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountCreateSubscriptionRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'webhook_url',
  };
}

