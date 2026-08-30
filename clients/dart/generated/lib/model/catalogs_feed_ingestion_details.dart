//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedIngestionDetails {
  /// Returns a new [CatalogsFeedIngestionDetails] instance.
  CatalogsFeedIngestionDetails({
    required this.errors,
    required this.info,
    required this.warnings,
  });

  CatalogsFeedIngestionErrors errors;

  CatalogsFeedIngestionInfo info;

  CatalogsFeedIngestionWarnings warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedIngestionDetails &&
    other.errors == errors &&
    other.info == info &&
    other.warnings == warnings;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (info.hashCode) +
    (warnings.hashCode);

  @override
  String toString() => 'CatalogsFeedIngestionDetails[errors=$errors, info=$info, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
      json[r'info'] = this.info;
      json[r'warnings'] = this.warnings;
    return json;
  }

  /// Returns a new [CatalogsFeedIngestionDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedIngestionDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'errors'), 'Required key "CatalogsFeedIngestionDetails[errors]" is missing from JSON.');
        assert(json[r'errors'] != null, 'Required key "CatalogsFeedIngestionDetails[errors]" has a null value in JSON.');
        assert(json.containsKey(r'info'), 'Required key "CatalogsFeedIngestionDetails[info]" is missing from JSON.');
        assert(json[r'info'] != null, 'Required key "CatalogsFeedIngestionDetails[info]" has a null value in JSON.');
        assert(json.containsKey(r'warnings'), 'Required key "CatalogsFeedIngestionDetails[warnings]" is missing from JSON.');
        assert(json[r'warnings'] != null, 'Required key "CatalogsFeedIngestionDetails[warnings]" has a null value in JSON.');
        return true;
      }());

      return CatalogsFeedIngestionDetails(
        errors: CatalogsFeedIngestionErrors.fromJson(json[r'errors'])!,
        info: CatalogsFeedIngestionInfo.fromJson(json[r'info'])!,
        warnings: CatalogsFeedIngestionWarnings.fromJson(json[r'warnings'])!,
      );
    }
    return null;
  }

  static List<CatalogsFeedIngestionDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedIngestionDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedIngestionDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedIngestionDetails> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedIngestionDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedIngestionDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedIngestionDetails-objects as value to a dart map
  static Map<String, List<CatalogsFeedIngestionDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedIngestionDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedIngestionDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'errors',
    'info',
    'warnings',
  };
}

