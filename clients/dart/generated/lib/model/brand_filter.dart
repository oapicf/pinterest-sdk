//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BrandFilter {
  /// Returns a new [BrandFilter] instance.
  BrandFilter({
    required this.BRAND,
  });

  CatalogsProductGroupMultipleStringCriteria BRAND;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BrandFilter &&
    other.BRAND == BRAND;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (BRAND.hashCode);

  @override
  String toString() => 'BrandFilter[BRAND=$BRAND]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'BRAND'] = this.BRAND;
    return json;
  }

  /// Returns a new [BrandFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BrandFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'BRAND'), 'Required key "BrandFilter[BRAND]" is missing from JSON.');
        assert(json[r'BRAND'] != null, 'Required key "BrandFilter[BRAND]" has a null value in JSON.');
        return true;
      }());

      return BrandFilter(
        BRAND: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'BRAND'])!,
      );
    }
    return null;
  }

  static List<BrandFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BrandFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BrandFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BrandFilter> mapFromJson(dynamic json) {
    final map = <String, BrandFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BrandFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BrandFilter-objects as value to a dart map
  static Map<String, List<BrandFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BrandFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BrandFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'BRAND',
  };
}

