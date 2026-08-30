//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TotalCountByEntityStatus {
  /// Returns a new [TotalCountByEntityStatus] instance.
  TotalCountByEntityStatus({
    this.ACTIVE,
    this.ARCHIVED,
    this.PAUSED,
  });

  /// Count of ACTIVE assets
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ACTIVE;

  /// Count of ARCHIVED assets
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ARCHIVED;

  /// Count of PAUSED assets
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? PAUSED;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TotalCountByEntityStatus &&
    other.ACTIVE == ACTIVE &&
    other.ARCHIVED == ARCHIVED &&
    other.PAUSED == PAUSED;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ACTIVE == null ? 0 : ACTIVE!.hashCode) +
    (ARCHIVED == null ? 0 : ARCHIVED!.hashCode) +
    (PAUSED == null ? 0 : PAUSED!.hashCode);

  @override
  String toString() => 'TotalCountByEntityStatus[ACTIVE=$ACTIVE, ARCHIVED=$ARCHIVED, PAUSED=$PAUSED]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ACTIVE != null) {
      json[r'ACTIVE'] = this.ACTIVE;
    } else {
      json[r'ACTIVE'] = null;
    }
    if (this.ARCHIVED != null) {
      json[r'ARCHIVED'] = this.ARCHIVED;
    } else {
      json[r'ARCHIVED'] = null;
    }
    if (this.PAUSED != null) {
      json[r'PAUSED'] = this.PAUSED;
    } else {
      json[r'PAUSED'] = null;
    }
    return json;
  }

  /// Returns a new [TotalCountByEntityStatus] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TotalCountByEntityStatus? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TotalCountByEntityStatus(
        ACTIVE: mapValueOfType<int>(json, r'ACTIVE'),
        ARCHIVED: mapValueOfType<int>(json, r'ARCHIVED'),
        PAUSED: mapValueOfType<int>(json, r'PAUSED'),
      );
    }
    return null;
  }

  static List<TotalCountByEntityStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TotalCountByEntityStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TotalCountByEntityStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TotalCountByEntityStatus> mapFromJson(dynamic json) {
    final map = <String, TotalCountByEntityStatus>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TotalCountByEntityStatus.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TotalCountByEntityStatus-objects as value to a dart map
  static Map<String, List<TotalCountByEntityStatus>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TotalCountByEntityStatus>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TotalCountByEntityStatus.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

