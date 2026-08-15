//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SharedAudienceCommon {
  /// Returns a new [SharedAudienceCommon] instance.
  SharedAudienceCommon({
    this.audienceId,
    this.operationType,
  });

  /// Unique identifier of an audience
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? audienceId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OperationType? operationType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SharedAudienceCommon &&
    other.audienceId == audienceId &&
    other.operationType == operationType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceId == null ? 0 : audienceId!.hashCode) +
    (operationType == null ? 0 : operationType!.hashCode);

  @override
  String toString() => 'SharedAudienceCommon[audienceId=$audienceId, operationType=$operationType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.audienceId != null) {
      json[r'audience_id'] = this.audienceId;
    } else {
      json[r'audience_id'] = null;
    }
    if (this.operationType != null) {
      json[r'operation_type'] = this.operationType;
    } else {
      json[r'operation_type'] = null;
    }
    return json;
  }

  /// Returns a new [SharedAudienceCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SharedAudienceCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SharedAudienceCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SharedAudienceCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SharedAudienceCommon(
        audienceId: mapValueOfType<String>(json, r'audience_id'),
        operationType: OperationType.fromJson(json[r'operation_type']),
      );
    }
    return null;
  }

  static List<SharedAudienceCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SharedAudienceCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SharedAudienceCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SharedAudienceCommon> mapFromJson(dynamic json) {
    final map = <String, SharedAudienceCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SharedAudienceCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SharedAudienceCommon-objects as value to a dart map
  static Map<String, List<SharedAudienceCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SharedAudienceCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SharedAudienceCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

