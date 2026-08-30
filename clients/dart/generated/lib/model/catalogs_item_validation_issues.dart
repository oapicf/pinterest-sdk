//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemValidationIssues {
  /// Returns a new [CatalogsItemValidationIssues] instance.
  CatalogsItemValidationIssues({
    required this.errors,
    required this.itemId,
    required this.itemNumber,
    required this.warnings,
  });

  CatalogsItemValidationErrors errors;

  /// The merchant-created unique ID that represents the product.
  String? itemId;

  /// Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  int itemNumber;

  CatalogsItemValidationWarnings warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemValidationIssues &&
    other.errors == errors &&
    other.itemId == itemId &&
    other.itemNumber == itemNumber &&
    other.warnings == warnings;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (itemNumber.hashCode) +
    (warnings.hashCode);

  @override
  String toString() => 'CatalogsItemValidationIssues[errors=$errors, itemId=$itemId, itemNumber=$itemNumber, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
      json[r'item_number'] = this.itemNumber;
      json[r'warnings'] = this.warnings;
    return json;
  }

  /// Returns a new [CatalogsItemValidationIssues] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemValidationIssues? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'errors'), 'Required key "CatalogsItemValidationIssues[errors]" is missing from JSON.');
        assert(json[r'errors'] != null, 'Required key "CatalogsItemValidationIssues[errors]" has a null value in JSON.');
        assert(json.containsKey(r'item_id'), 'Required key "CatalogsItemValidationIssues[item_id]" is missing from JSON.');
        assert(json.containsKey(r'item_number'), 'Required key "CatalogsItemValidationIssues[item_number]" is missing from JSON.');
        assert(json[r'item_number'] != null, 'Required key "CatalogsItemValidationIssues[item_number]" has a null value in JSON.');
        assert(json.containsKey(r'warnings'), 'Required key "CatalogsItemValidationIssues[warnings]" is missing from JSON.');
        assert(json[r'warnings'] != null, 'Required key "CatalogsItemValidationIssues[warnings]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemValidationIssues(
        errors: CatalogsItemValidationErrors.fromJson(json[r'errors'])!,
        itemId: mapValueOfType<String>(json, r'item_id'),
        itemNumber: mapValueOfType<int>(json, r'item_number')!,
        warnings: CatalogsItemValidationWarnings.fromJson(json[r'warnings'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemValidationIssues> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemValidationIssues>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemValidationIssues.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemValidationIssues> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemValidationIssues>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemValidationIssues.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemValidationIssues-objects as value to a dart map
  static Map<String, List<CatalogsItemValidationIssues>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemValidationIssues>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemValidationIssues.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'errors',
    'item_id',
    'item_number',
    'warnings',
  };
}

