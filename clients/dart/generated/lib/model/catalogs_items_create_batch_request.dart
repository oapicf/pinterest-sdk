//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsCreateBatchRequest {
  /// Returns a new [CatalogsItemsCreateBatchRequest] instance.
  CatalogsItemsCreateBatchRequest({
    required this.country,
    this.items = const [],
    required this.language,
    required this.operation,
  });

  Country country;

  /// Array with catalogs items
  List<ItemCreateBatchRecord> items;

  /// We recommend using the CatalogsLocale values.
  LanguageEnum language;

  BatchOperation operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsCreateBatchRequest &&
    other.country == country &&
    _deepEquality.equals(other.items, items) &&
    other.language == language &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (items.hashCode) +
    (language.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsItemsCreateBatchRequest[country=$country, items=$items, language=$language, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'items'] = this.items;
      json[r'language'] = this.language;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsItemsCreateBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsCreateBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsItemsCreateBatchRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsItemsCreateBatchRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsItemsCreateBatchRequest(
        country: Country.fromJson(json[r'country'])!,
        items: ItemCreateBatchRecord.listFromJson(json[r'items']),
        language: LanguageEnum.fromJson(json[r'language'])!,
        operation: BatchOperation.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemsCreateBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsCreateBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsCreateBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsCreateBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsCreateBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsCreateBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsCreateBatchRequest-objects as value to a dart map
  static Map<String, List<CatalogsItemsCreateBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsCreateBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsCreateBatchRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'items',
    'language',
    'operation',
  };
}

