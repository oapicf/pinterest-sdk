//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DynamicTitlesProcessCSVError {
  /// Returns a new [DynamicTitlesProcessCSVError] instance.
  DynamicTitlesProcessCSVError({
    this.errorType,
    this.rowNumber,
  });

  /// The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? errorType;

  /// The row number with a validation error. -1 indicates a file-level error.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? rowNumber;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DynamicTitlesProcessCSVError &&
    other.errorType == errorType &&
    other.rowNumber == rowNumber;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errorType == null ? 0 : errorType!.hashCode) +
    (rowNumber == null ? 0 : rowNumber!.hashCode);

  @override
  String toString() => 'DynamicTitlesProcessCSVError[errorType=$errorType, rowNumber=$rowNumber]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.errorType != null) {
      json[r'error_type'] = this.errorType;
    } else {
      json[r'error_type'] = null;
    }
    if (this.rowNumber != null) {
      json[r'row_number'] = this.rowNumber;
    } else {
      json[r'row_number'] = null;
    }
    return json;
  }

  /// Returns a new [DynamicTitlesProcessCSVError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DynamicTitlesProcessCSVError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return DynamicTitlesProcessCSVError(
        errorType: mapValueOfType<String>(json, r'error_type'),
        rowNumber: mapValueOfType<int>(json, r'row_number'),
      );
    }
    return null;
  }

  static List<DynamicTitlesProcessCSVError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DynamicTitlesProcessCSVError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DynamicTitlesProcessCSVError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DynamicTitlesProcessCSVError> mapFromJson(dynamic json) {
    final map = <String, DynamicTitlesProcessCSVError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DynamicTitlesProcessCSVError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DynamicTitlesProcessCSVError-objects as value to a dart map
  static Map<String, List<DynamicTitlesProcessCSVError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DynamicTitlesProcessCSVError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DynamicTitlesProcessCSVError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

