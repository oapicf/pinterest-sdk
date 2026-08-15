//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductType0Filter {
  /// Returns a new [ProductType0Filter] instance.
  ProductType0Filter({
    required this.pRODUCTTYPE0,
  });

  CatalogsProductGroupMultipleStringListCriteria pRODUCTTYPE0;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductType0Filter &&
    other.pRODUCTTYPE0 == pRODUCTTYPE0;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pRODUCTTYPE0.hashCode);

  @override
  String toString() => 'ProductType0Filter[pRODUCTTYPE0=$pRODUCTTYPE0]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'PRODUCT_TYPE_0'] = this.pRODUCTTYPE0;
    return json;
  }

  /// Returns a new [ProductType0Filter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductType0Filter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProductType0Filter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProductType0Filter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProductType0Filter(
        pRODUCTTYPE0: mapValueOfType<CatalogsProductGroupMultipleStringListCriteria>(json, r'PRODUCT_TYPE_0')!,
      );
    }
    return null;
  }

  static List<ProductType0Filter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductType0Filter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductType0Filter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductType0Filter> mapFromJson(dynamic json) {
    final map = <String, ProductType0Filter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductType0Filter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductType0Filter-objects as value to a dart map
  static Map<String, List<ProductType0Filter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductType0Filter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductType0Filter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'PRODUCT_TYPE_0',
  };
}

