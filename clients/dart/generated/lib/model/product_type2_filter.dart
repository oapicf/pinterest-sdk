//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductType2Filter {
  /// Returns a new [ProductType2Filter] instance.
  ProductType2Filter({
    required this.PRODUCT_TYPE_2,
  });

  CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductType2Filter &&
    other.PRODUCT_TYPE_2 == PRODUCT_TYPE_2;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (PRODUCT_TYPE_2.hashCode);

  @override
  String toString() => 'ProductType2Filter[PRODUCT_TYPE_2=$PRODUCT_TYPE_2]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'PRODUCT_TYPE_2'] = this.PRODUCT_TYPE_2;
    return json;
  }

  /// Returns a new [ProductType2Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductType2Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'PRODUCT_TYPE_2'), 'Required key "ProductType2Filter[PRODUCT_TYPE_2]" is missing from JSON.');
        assert(json[r'PRODUCT_TYPE_2'] != null, 'Required key "ProductType2Filter[PRODUCT_TYPE_2]" has a null value in JSON.');
        return true;
      }());

      return ProductType2Filter(
        PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria.fromJson(json[r'PRODUCT_TYPE_2'])!,
      );
    }
    return null;
  }

  static List<ProductType2Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductType2Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductType2Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductType2Filter> mapFromJson(dynamic json) {
    final map = <String, ProductType2Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductType2Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductType2Filter-objects as value to a dart map
  static Map<String, List<ProductType2Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductType2Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductType2Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'PRODUCT_TYPE_2',
  };
}

