//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedValidationDetails {
  /// Returns a new [CatalogsFeedValidationDetails] instance.
  CatalogsFeedValidationDetails({
    required this.errors,
    required this.warnings,
  });

  CatalogsFeedValidationErrors errors;

  CatalogsFeedValidationWarnings warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedValidationDetails &&
    other.errors == errors &&
    other.warnings == warnings;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (warnings.hashCode);

  @override
  String toString() => 'CatalogsFeedValidationDetails[errors=$errors, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
      json[r'warnings'] = this.warnings;
    return json;
  }

  /// Returns a new [CatalogsFeedValidationDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedValidationDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsFeedValidationDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsFeedValidationDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsFeedValidationDetails(
        errors: CatalogsFeedValidationErrors.fromJson(json[r'errors'])!,
        warnings: CatalogsFeedValidationWarnings.fromJson(json[r'warnings'])!,
      );
    }
    return null;
  }

  static List<CatalogsFeedValidationDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedValidationDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedValidationDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedValidationDetails> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedValidationDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedValidationDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedValidationDetails-objects as value to a dart map
  static Map<String, List<CatalogsFeedValidationDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedValidationDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedValidationDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'errors',
    'warnings',
  };
}

