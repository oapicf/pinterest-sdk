//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelFilterValuesMap {
  /// Returns a new [CatalogsHotelFilterValuesMap] instance.
  CatalogsHotelFilterValuesMap({
    this.brand = const [],
    this.customLabel0 = const [],
    this.customLabel1 = const [],
    this.customLabel2 = const [],
    this.customLabel3 = const [],
    this.customLabel4 = const [],
  });

  List<String> brand;

  List<String> customLabel0;

  List<String> customLabel1;

  List<String> customLabel2;

  List<String> customLabel3;

  List<String> customLabel4;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelFilterValuesMap &&
    _deepEquality.equals(other.brand, brand) &&
    _deepEquality.equals(other.customLabel0, customLabel0) &&
    _deepEquality.equals(other.customLabel1, customLabel1) &&
    _deepEquality.equals(other.customLabel2, customLabel2) &&
    _deepEquality.equals(other.customLabel3, customLabel3) &&
    _deepEquality.equals(other.customLabel4, customLabel4);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (brand.hashCode) +
    (customLabel0.hashCode) +
    (customLabel1.hashCode) +
    (customLabel2.hashCode) +
    (customLabel3.hashCode) +
    (customLabel4.hashCode);

  @override
  String toString() => 'CatalogsHotelFilterValuesMap[brand=$brand, customLabel0=$customLabel0, customLabel1=$customLabel1, customLabel2=$customLabel2, customLabel3=$customLabel3, customLabel4=$customLabel4]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'brand'] = this.brand;
      json[r'custom_label_0'] = this.customLabel0;
      json[r'custom_label_1'] = this.customLabel1;
      json[r'custom_label_2'] = this.customLabel2;
      json[r'custom_label_3'] = this.customLabel3;
      json[r'custom_label_4'] = this.customLabel4;
    return json;
  }

  /// Returns a new [CatalogsHotelFilterValuesMap] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelFilterValuesMap? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelFilterValuesMap[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelFilterValuesMap[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelFilterValuesMap(
        brand: json[r'brand'] is Iterable
            ? (json[r'brand'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel0: json[r'custom_label_0'] is Iterable
            ? (json[r'custom_label_0'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel1: json[r'custom_label_1'] is Iterable
            ? (json[r'custom_label_1'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel2: json[r'custom_label_2'] is Iterable
            ? (json[r'custom_label_2'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel3: json[r'custom_label_3'] is Iterable
            ? (json[r'custom_label_3'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        customLabel4: json[r'custom_label_4'] is Iterable
            ? (json[r'custom_label_4'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsHotelFilterValuesMap> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelFilterValuesMap>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelFilterValuesMap.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelFilterValuesMap> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelFilterValuesMap>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelFilterValuesMap.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelFilterValuesMap-objects as value to a dart map
  static Map<String, List<CatalogsHotelFilterValuesMap>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelFilterValuesMap>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelFilterValuesMap.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

