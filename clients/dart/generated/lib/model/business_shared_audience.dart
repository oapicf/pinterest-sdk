//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessSharedAudience {
  /// Returns a new [BusinessSharedAudience] instance.
  BusinessSharedAudience({
    required this.audienceId,
    required this.operationType,
    this.recipientBusinessIds = const [],
  });

  /// Unique identifier of an audience
  String audienceId;

  OperationType operationType;

  /// List of business IDs to share with or revoke from.
  List<String> recipientBusinessIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessSharedAudience &&
    other.audienceId == audienceId &&
    other.operationType == operationType &&
    _deepEquality.equals(other.recipientBusinessIds, recipientBusinessIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceId.hashCode) +
    (operationType.hashCode) +
    (recipientBusinessIds.hashCode);

  @override
  String toString() => 'BusinessSharedAudience[audienceId=$audienceId, operationType=$operationType, recipientBusinessIds=$recipientBusinessIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'audience_id'] = this.audienceId;
      json[r'operation_type'] = this.operationType;
      json[r'recipient_business_ids'] = this.recipientBusinessIds;
    return json;
  }

  /// Returns a new [BusinessSharedAudience] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessSharedAudience? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BusinessSharedAudience[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BusinessSharedAudience[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BusinessSharedAudience(
        audienceId: mapValueOfType<String>(json, r'audience_id')!,
        operationType: OperationType.fromJson(json[r'operation_type'])!,
        recipientBusinessIds: json[r'recipient_business_ids'] is Iterable
            ? (json[r'recipient_business_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<BusinessSharedAudience> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessSharedAudience>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessSharedAudience.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessSharedAudience> mapFromJson(dynamic json) {
    final map = <String, BusinessSharedAudience>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessSharedAudience.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessSharedAudience-objects as value to a dart map
  static Map<String, List<BusinessSharedAudience>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessSharedAudience>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessSharedAudience.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'audience_id',
    'operation_type',
    'recipient_business_ids',
  };
}

