//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadSubscription {
  /// Returns a new [LeadSubscription] instance.
  LeadSubscription({
    this.adAccountId,
    this.apiVersion,
    this.createdTime,
    this.cryptographicAlgorithm,
    this.cryptographicKey,
    this.id,
    this.leadFormId,
    this.userAccountId,
    this.webhookUrl,
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

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadSubscription &&
    other.adAccountId == adAccountId &&
    other.apiVersion == apiVersion &&
    other.createdTime == createdTime &&
    other.cryptographicAlgorithm == cryptographicAlgorithm &&
    other.cryptographicKey == cryptographicKey &&
    other.id == id &&
    other.leadFormId == leadFormId &&
    other.userAccountId == userAccountId &&
    other.webhookUrl == webhookUrl;

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
    (webhookUrl == null ? 0 : webhookUrl!.hashCode);

  @override
  String toString() => 'LeadSubscription[adAccountId=$adAccountId, apiVersion=$apiVersion, createdTime=$createdTime, cryptographicAlgorithm=$cryptographicAlgorithm, cryptographicKey=$cryptographicKey, id=$id, leadFormId=$leadFormId, userAccountId=$userAccountId, webhookUrl=$webhookUrl]';

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
    return json;
  }

  /// Returns a new [LeadSubscription] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadSubscription? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LeadSubscription(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        apiVersion: mapValueOfType<String>(json, r'api_version'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        cryptographicAlgorithm: mapValueOfType<String>(json, r'cryptographic_algorithm'),
        cryptographicKey: mapValueOfType<String>(json, r'cryptographic_key'),
        id: mapValueOfType<String>(json, r'id'),
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        userAccountId: mapValueOfType<String>(json, r'user_account_id'),
        webhookUrl: mapValueOfType<String>(json, r'webhook_url'),
      );
    }
    return null;
  }

  static List<LeadSubscription> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadSubscription>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadSubscription.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadSubscription> mapFromJson(dynamic json) {
    final map = <String, LeadSubscription>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadSubscription.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadSubscription-objects as value to a dart map
  static Map<String, List<LeadSubscription>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadSubscription>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadSubscription.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

