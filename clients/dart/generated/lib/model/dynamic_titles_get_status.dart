//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DynamicTitlesGetStatus {
  /// Returns a new [DynamicTitlesGetStatus] instance.
  DynamicTitlesGetStatus({
    this.generatedCount,
    this.isReady,
    this.reviewedCount,
  });

  /// The count of generated titles.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? generatedCount;

  /// Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isReady;

  /// The count of advertiser reviewed titles.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? reviewedCount;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DynamicTitlesGetStatus &&
    other.generatedCount == generatedCount &&
    other.isReady == isReady &&
    other.reviewedCount == reviewedCount;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (generatedCount == null ? 0 : generatedCount!.hashCode) +
    (isReady == null ? 0 : isReady!.hashCode) +
    (reviewedCount == null ? 0 : reviewedCount!.hashCode);

  @override
  String toString() => 'DynamicTitlesGetStatus[generatedCount=$generatedCount, isReady=$isReady, reviewedCount=$reviewedCount]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.generatedCount != null) {
      json[r'generated_count'] = this.generatedCount;
    } else {
      json[r'generated_count'] = null;
    }
    if (this.isReady != null) {
      json[r'is_ready'] = this.isReady;
    } else {
      json[r'is_ready'] = null;
    }
    if (this.reviewedCount != null) {
      json[r'reviewed_count'] = this.reviewedCount;
    } else {
      json[r'reviewed_count'] = null;
    }
    return json;
  }

  /// Returns a new [DynamicTitlesGetStatus] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DynamicTitlesGetStatus? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return DynamicTitlesGetStatus(
        generatedCount: mapValueOfType<int>(json, r'generated_count'),
        isReady: mapValueOfType<bool>(json, r'is_ready'),
        reviewedCount: mapValueOfType<int>(json, r'reviewed_count'),
      );
    }
    return null;
  }

  static List<DynamicTitlesGetStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DynamicTitlesGetStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DynamicTitlesGetStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DynamicTitlesGetStatus> mapFromJson(dynamic json) {
    final map = <String, DynamicTitlesGetStatus>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DynamicTitlesGetStatus.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DynamicTitlesGetStatus-objects as value to a dart map
  static Map<String, List<DynamicTitlesGetStatus>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DynamicTitlesGetStatus>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DynamicTitlesGetStatus.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

