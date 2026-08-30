//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadSubscriptionCreate {
  /// Returns a new [LeadSubscriptionCreate] instance.
  LeadSubscriptionCreate({
    this.leadFormId,
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

  /// Standard HTTPS webhook URL.
  String webhookUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadSubscriptionCreate &&
    other.leadFormId == leadFormId &&
    other.webhookUrl == webhookUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (leadFormId == null ? 0 : leadFormId!.hashCode) +
    (webhookUrl.hashCode);

  @override
  String toString() => 'LeadSubscriptionCreate[leadFormId=$leadFormId, webhookUrl=$webhookUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.leadFormId != null) {
      json[r'lead_form_id'] = this.leadFormId;
    } else {
      json[r'lead_form_id'] = null;
    }
      json[r'webhook_url'] = this.webhookUrl;
    return json;
  }

  /// Returns a new [LeadSubscriptionCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadSubscriptionCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'webhook_url'), 'Required key "LeadSubscriptionCreate[webhook_url]" is missing from JSON.');
        assert(json[r'webhook_url'] != null, 'Required key "LeadSubscriptionCreate[webhook_url]" has a null value in JSON.');
        return true;
      }());

      return LeadSubscriptionCreate(
        leadFormId: mapValueOfType<String>(json, r'lead_form_id'),
        webhookUrl: mapValueOfType<String>(json, r'webhook_url')!,
      );
    }
    return null;
  }

  static List<LeadSubscriptionCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadSubscriptionCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadSubscriptionCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadSubscriptionCreate> mapFromJson(dynamic json) {
    final map = <String, LeadSubscriptionCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadSubscriptionCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadSubscriptionCreate-objects as value to a dart map
  static Map<String, List<LeadSubscriptionCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadSubscriptionCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadSubscriptionCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'webhook_url',
  };
}

