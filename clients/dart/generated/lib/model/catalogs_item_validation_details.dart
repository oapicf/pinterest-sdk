//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemValidationDetails {
  /// Returns a new [CatalogsItemValidationDetails] instance.
  CatalogsItemValidationDetails({
    required this.attributeName,
    required this.providedValue,
  });

  NullableCatalogsItemFieldType? attributeName;

  /// Provided value that caused the validation issue.
  String? providedValue;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemValidationDetails &&
    other.attributeName == attributeName &&
    other.providedValue == providedValue;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributeName == null ? 0 : attributeName!.hashCode) +
    (providedValue == null ? 0 : providedValue!.hashCode);

  @override
  String toString() => 'CatalogsItemValidationDetails[attributeName=$attributeName, providedValue=$providedValue]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributeName != null) {
      json[r'attribute_name'] = this.attributeName;
    } else {
      json[r'attribute_name'] = null;
    }
    if (this.providedValue != null) {
      json[r'provided_value'] = this.providedValue;
    } else {
      json[r'provided_value'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsItemValidationDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemValidationDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsItemValidationDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsItemValidationDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsItemValidationDetails(
        attributeName: NullableCatalogsItemFieldType.fromJson(json[r'attribute_name']),
        providedValue: mapValueOfType<String>(json, r'provided_value'),
      );
    }
    return null;
  }

  static List<CatalogsItemValidationDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemValidationDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemValidationDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemValidationDetails> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemValidationDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemValidationDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemValidationDetails-objects as value to a dart map
  static Map<String, List<CatalogsItemValidationDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemValidationDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemValidationDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'attribute_name',
    'provided_value',
  };
}

