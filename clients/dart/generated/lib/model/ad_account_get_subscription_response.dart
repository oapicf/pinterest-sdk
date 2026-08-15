//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountGetSubscriptionResponse {
  /// Returns a new [AdAccountGetSubscriptionResponse] instance.
  AdAccountGetSubscriptionResponse({
    this.leadFormId,
    this.webhookUrl,
    this.adAccountId,
    this.apiVersion,
    this.createdTime,
    this.cryptographicAlgorithm,
    this.cryptographicKey,
    this.id,
    this.userAccountId,
  });

  /// Lead form ID.
  String? leadFormId;

  /// Standard HTTPS webhook URL.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? webhookUrl;

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

  /// Lead subscription creation time. Unix timestamp in milliseconds.
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

  /// User account used to subscribe lead data.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userAccountId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountGetSubscriptionResponse &&
    other.leadFormId == leadFormId &&
    other.webhookUrl == webhookUrl &&
    other.adAccountId == adAccountId &&
    other.apiVersion == apiVersion &&
    other.createdTime == createdTime &&
    other.cryptographicAlgorithm == cryptographicAlgorithm &&
    other.cryptographicKey == cryptographicKey &&
    other.id == id &&
    other.userAccountId == userAccountId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (leadFormId == null ? 0 : leadFormId!.hashCode) +
    (webhookUrl == null ? 0 : webhookUrl!.hashCode) +
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (apiVersion == null ? 0 : apiVersion!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (cryptographicAlgorithm == null ? 0 : cryptographicAlgorithm!.hashCode) +
    (cryptographicKey == null ? 0 : cryptographicKey!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (userAccountId == null ? 0 : userAccountId!.hashCode);

  @override
  String toString() => 'AdAccountGetSubscriptionResponse[leadFormId=$leadFormId, webhookUrl=$webhookUrl, adAccountId=$adAccountId, apiVersion=$apiVersion, createdTime=$createdTime, cryptographicAlgorithm=$cryptographicAlgorithm, cryptographicKey=$cryptographicKey, id=$id, userAccountId=$userAccountId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.leadFormId != null) {
      json[r'lead_form_id'] = this.leadFormId;
    } else {
      json[r'lead_form_id'] = null;
    }
    if (this.webhookUrl != null) {
      json[r'webhook_url'] = this.webhookUrl;
    } else {
      json[r'webhook_url'] = null;
    }
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
    if (this.userAccountId != null) {
      json[r'user_account_id'] = this.userAccountId;
    } else {
      json[r'user_account_id'] = null;
    }
    return json;
  }

  /// Returns a new [AdAccountGetSubscriptionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountGetSubscriptionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdAccountGetSubscriptionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdAccountGetSubscriptionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdAccountGetSubscriptionResponse(
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        webhookUrl: mapValueOfType<String>(json, r'webhook_url'),
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        apiVersion: mapValueOfType<String>(json, r'api_version'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        cryptographicAlgorithm: mapValueOfType<String>(json, r'cryptographic_algorithm'),
        cryptographicKey: mapValueOfType<String>(json, r'cryptographic_key'),
        id: mapValueOfType<String>(json, r'id'),
        userAccountId: mapValueOfType<String>(json, r'user_account_id'),
      );
    }
    return null;
  }

  static List<AdAccountGetSubscriptionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountGetSubscriptionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountGetSubscriptionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountGetSubscriptionResponse> mapFromJson(dynamic json) {
    final map = <String, AdAccountGetSubscriptionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountGetSubscriptionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountGetSubscriptionResponse-objects as value to a dart map
  static Map<String, List<AdAccountGetSubscriptionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountGetSubscriptionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountGetSubscriptionResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

