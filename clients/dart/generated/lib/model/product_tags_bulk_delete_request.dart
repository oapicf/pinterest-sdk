//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductTagsBulkDeleteRequest {
  /// Returns a new [ProductTagsBulkDeleteRequest] instance.
  ProductTagsBulkDeleteRequest({
    this.productTags = const [],
  });

  /// List of product tags to delete.
  List<ProductTagItem> productTags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductTagsBulkDeleteRequest &&
    _deepEquality.equals(other.productTags, productTags);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (productTags.hashCode);

  @override
  String toString() => 'ProductTagsBulkDeleteRequest[productTags=$productTags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'product_tags'] = this.productTags;
    return json;
  }

  /// Returns a new [ProductTagsBulkDeleteRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductTagsBulkDeleteRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'product_tags'), 'Required key "ProductTagsBulkDeleteRequest[product_tags]" is missing from JSON.');
        assert(json[r'product_tags'] != null, 'Required key "ProductTagsBulkDeleteRequest[product_tags]" has a null value in JSON.');
        return true;
      }());

      return ProductTagsBulkDeleteRequest(
        productTags: ProductTagItem.listFromJson(json[r'product_tags']),
      );
    }
    return null;
  }

  static List<ProductTagsBulkDeleteRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductTagsBulkDeleteRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductTagsBulkDeleteRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductTagsBulkDeleteRequest> mapFromJson(dynamic json) {
    final map = <String, ProductTagsBulkDeleteRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductTagsBulkDeleteRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductTagsBulkDeleteRequest-objects as value to a dart map
  static Map<String, List<ProductTagsBulkDeleteRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductTagsBulkDeleteRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductTagsBulkDeleteRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'product_tags',
  };
}

