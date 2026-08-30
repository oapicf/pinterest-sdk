//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinterestProductCategoriesFilter {
  /// Returns a new [PinterestProductCategoriesFilter] instance.
  PinterestProductCategoriesFilter({
    required this.PINTEREST_PRODUCT_CATEGORIES,
  });

  CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinterestProductCategoriesFilter &&
    other.PINTEREST_PRODUCT_CATEGORIES == PINTEREST_PRODUCT_CATEGORIES;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (PINTEREST_PRODUCT_CATEGORIES.hashCode);

  @override
  String toString() => 'PinterestProductCategoriesFilter[PINTEREST_PRODUCT_CATEGORIES=$PINTEREST_PRODUCT_CATEGORIES]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'PINTEREST_PRODUCT_CATEGORIES'] = this.PINTEREST_PRODUCT_CATEGORIES;
    return json;
  }

  /// Returns a new [PinterestProductCategoriesFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinterestProductCategoriesFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'PINTEREST_PRODUCT_CATEGORIES'), 'Required key "PinterestProductCategoriesFilter[PINTEREST_PRODUCT_CATEGORIES]" is missing from JSON.');
        assert(json[r'PINTEREST_PRODUCT_CATEGORIES'] != null, 'Required key "PinterestProductCategoriesFilter[PINTEREST_PRODUCT_CATEGORIES]" has a null value in JSON.');
        return true;
      }());

      return PinterestProductCategoriesFilter(
        PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria.fromJson(json[r'PINTEREST_PRODUCT_CATEGORIES'])!,
      );
    }
    return null;
  }

  static List<PinterestProductCategoriesFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinterestProductCategoriesFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinterestProductCategoriesFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinterestProductCategoriesFilter> mapFromJson(dynamic json) {
    final map = <String, PinterestProductCategoriesFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinterestProductCategoriesFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinterestProductCategoriesFilter-objects as value to a dart map
  static Map<String, List<PinterestProductCategoriesFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinterestProductCategoriesFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinterestProductCategoriesFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'PINTEREST_PRODUCT_CATEGORIES',
  };
}

