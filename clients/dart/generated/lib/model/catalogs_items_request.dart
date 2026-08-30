//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsRequest {
  /// Returns a new [CatalogsItemsRequest] instance.
  CatalogsItemsRequest({
    required this.country,
    required this.filters,
    required this.language,
  });

  Country country;

  CatalogsItemsPostFilters filters;

  /// We recommend using the CatalogsLocale values.
  LanguageEnum language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsRequest &&
    other.country == country &&
    other.filters == filters &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (filters.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'CatalogsItemsRequest[country=$country, filters=$filters, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'filters'] = this.filters;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [CatalogsItemsRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'country'), 'Required key "CatalogsItemsRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsItemsRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'filters'), 'Required key "CatalogsItemsRequest[filters]" is missing from JSON.');
        assert(json[r'filters'] != null, 'Required key "CatalogsItemsRequest[filters]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsItemsRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsItemsRequest[language]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemsRequest(
        country: Country.fromJson(json[r'country'])!,
        filters: CatalogsItemsPostFilters.fromJson(json[r'filters'])!,
        language: LanguageEnum.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemsRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsRequest-objects as value to a dart map
  static Map<String, List<CatalogsItemsRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'filters',
    'language',
  };
}

