//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductTagsBulkAddRequest {
  /// Returns a new [ProductTagsBulkAddRequest] instance.
  ProductTagsBulkAddRequest({
    this.productTags = const [],
  });

  /// List of product tags to add. Maximum 24 items allowed.
  List<ProductTagItem> productTags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductTagsBulkAddRequest &&
    _deepEquality.equals(other.productTags, productTags);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (productTags.hashCode);

  @override
  String toString() => 'ProductTagsBulkAddRequest[productTags=$productTags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'product_tags'] = this.productTags;
    return json;
  }

  /// Returns a new [ProductTagsBulkAddRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductTagsBulkAddRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'product_tags'), 'Required key "ProductTagsBulkAddRequest[product_tags]" is missing from JSON.');
        assert(json[r'product_tags'] != null, 'Required key "ProductTagsBulkAddRequest[product_tags]" has a null value in JSON.');
        return true;
      }());

      return ProductTagsBulkAddRequest(
        productTags: ProductTagItem.listFromJson(json[r'product_tags']),
      );
    }
    return null;
  }

  static List<ProductTagsBulkAddRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductTagsBulkAddRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductTagsBulkAddRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductTagsBulkAddRequest> mapFromJson(dynamic json) {
    final map = <String, ProductTagsBulkAddRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductTagsBulkAddRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductTagsBulkAddRequest-objects as value to a dart map
  static Map<String, List<ProductTagsBulkAddRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductTagsBulkAddRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductTagsBulkAddRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'product_tags',
  };
}

