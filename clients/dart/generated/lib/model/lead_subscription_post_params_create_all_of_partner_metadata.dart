//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadSubscriptionPostParamsCreateAllOfPartnerMetadata {
  /// Returns a new [LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] instance.
  LeadSubscriptionPostParamsCreateAllOfPartnerMetadata({
    this.subscriberKey,
  });

  /// Text field value that uniquely identifies a subscriber.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? subscriberKey;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadSubscriptionPostParamsCreateAllOfPartnerMetadata &&
    other.subscriberKey == subscriberKey;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (subscriberKey == null ? 0 : subscriberKey!.hashCode);

  @override
  String toString() => 'LeadSubscriptionPostParamsCreateAllOfPartnerMetadata[subscriberKey=$subscriberKey]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.subscriberKey != null) {
      json[r'subscriber_key'] = this.subscriberKey;
    } else {
      json[r'subscriber_key'] = null;
    }
    return json;
  }

  /// Returns a new [LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadSubscriptionPostParamsCreateAllOfPartnerMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadSubscriptionPostParamsCreateAllOfPartnerMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadSubscriptionPostParamsCreateAllOfPartnerMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadSubscriptionPostParamsCreateAllOfPartnerMetadata(
        subscriberKey: mapValueOfType<String>(json, r'subscriber_key'),
      );
    }
    return null;
  }

  static List<LeadSubscriptionPostParamsCreateAllOfPartnerMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadSubscriptionPostParamsCreateAllOfPartnerMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadSubscriptionPostParamsCreateAllOfPartnerMetadata> mapFromJson(dynamic json) {
    final map = <String, LeadSubscriptionPostParamsCreateAllOfPartnerMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata-objects as value to a dart map
  static Map<String, List<LeadSubscriptionPostParamsCreateAllOfPartnerMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadSubscriptionPostParamsCreateAllOfPartnerMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

