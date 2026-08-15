//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreativeAssetsProcessingRecord {
  /// Returns a new [CreativeAssetsProcessingRecord] instance.
  CreativeAssetsProcessingRecord({
    this.creativeAssetsId,
    this.errors = const [],
    this.status,
    this.warnings = const [],
  });

  /// The catalog creative assets id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? creativeAssetsId;

  /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  List<ItemValidationEvent> errors;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ItemProcessingStatus? status;

  /// Array with the validation warnings for the item processing record
  List<ItemValidationEvent> warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreativeAssetsProcessingRecord &&
    other.creativeAssetsId == creativeAssetsId &&
    _deepEquality.equals(other.errors, errors) &&
    other.status == status &&
    _deepEquality.equals(other.warnings, warnings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (creativeAssetsId == null ? 0 : creativeAssetsId!.hashCode) +
    (errors.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (warnings.hashCode);

  @override
  String toString() => 'CreativeAssetsProcessingRecord[creativeAssetsId=$creativeAssetsId, errors=$errors, status=$status, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.creativeAssetsId != null) {
      json[r'creative_assets_id'] = this.creativeAssetsId;
    } else {
      json[r'creative_assets_id'] = null;
    }
      json[r'errors'] = this.errors;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'warnings'] = this.warnings;
    return json;
  }

  /// Returns a new [CreativeAssetsProcessingRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreativeAssetsProcessingRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreativeAssetsProcessingRecord[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreativeAssetsProcessingRecord[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreativeAssetsProcessingRecord(
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id'),
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
        status: ItemProcessingStatus.fromJson(json[r'status']),
        warnings: ItemValidationEvent.listFromJson(json[r'warnings']),
      );
    }
    return null;
  }

  static List<CreativeAssetsProcessingRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreativeAssetsProcessingRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreativeAssetsProcessingRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreativeAssetsProcessingRecord> mapFromJson(dynamic json) {
    final map = <String, CreativeAssetsProcessingRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreativeAssetsProcessingRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreativeAssetsProcessingRecord-objects as value to a dart map
  static Map<String, List<CreativeAssetsProcessingRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreativeAssetsProcessingRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreativeAssetsProcessingRecord.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

