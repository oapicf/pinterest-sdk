//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductType4Filter {
  /// Returns a new [ProductType4Filter] instance.
  ProductType4Filter({
    required this.pRODUCTTYPE4,
  });

  CatalogsProductGroupMultipleStringListCriteria pRODUCTTYPE4;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductType4Filter &&
    other.pRODUCTTYPE4 == pRODUCTTYPE4;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pRODUCTTYPE4.hashCode);

  @override
  String toString() => 'ProductType4Filter[pRODUCTTYPE4=$pRODUCTTYPE4]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'PRODUCT_TYPE_4'] = this.pRODUCTTYPE4;
    return json;
  }

  /// Returns a new [ProductType4Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductType4Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProductType4Filter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProductType4Filter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProductType4Filter(
        pRODUCTTYPE4: mapValueOfType<CatalogsProductGroupMultipleStringListCriteria>(json, r'PRODUCT_TYPE_4')!,
      );
    }
    return null;
  }

  static List<ProductType4Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductType4Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductType4Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductType4Filter> mapFromJson(dynamic json) {
    final map = <String, ProductType4Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductType4Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductType4Filter-objects as value to a dart map
  static Map<String, List<ProductType4Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductType4Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductType4Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'PRODUCT_TYPE_4',
  };
}

