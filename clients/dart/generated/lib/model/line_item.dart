//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LineItem {
  /// Returns a new [LineItem] instance.
  LineItem({
    this.productBrand,
    this.productCategory,
    this.productId,
    this.productName,
    this.productPrice,
    this.productQuantity,
    this.productVariant,
    this.productVariantId,
  });

  /// Product brand. For example, 'Parker'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? productBrand;

  /// Product category. For example, 'Shoes'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? productCategory;

  /// Product ID. For example, 1414.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? productId;

  /// Product name. For example, 'Parker Boots'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? productName;

  /// Product price. For example, '99.99'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? productPrice;

  /// Product quantity. For example, 2.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? productQuantity;

  /// Product variant. For example, 'Red'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? productVariant;

  /// Product variant ID. For example, '1414-34832'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? productVariantId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LineItem &&
    other.productBrand == productBrand &&
    other.productCategory == productCategory &&
    other.productId == productId &&
    other.productName == productName &&
    other.productPrice == productPrice &&
    other.productQuantity == productQuantity &&
    other.productVariant == productVariant &&
    other.productVariantId == productVariantId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (productBrand == null ? 0 : productBrand!.hashCode) +
    (productCategory == null ? 0 : productCategory!.hashCode) +
    (productId == null ? 0 : productId!.hashCode) +
    (productName == null ? 0 : productName!.hashCode) +
    (productPrice == null ? 0 : productPrice!.hashCode) +
    (productQuantity == null ? 0 : productQuantity!.hashCode) +
    (productVariant == null ? 0 : productVariant!.hashCode) +
    (productVariantId == null ? 0 : productVariantId!.hashCode);

  @override
  String toString() => 'LineItem[productBrand=$productBrand, productCategory=$productCategory, productId=$productId, productName=$productName, productPrice=$productPrice, productQuantity=$productQuantity, productVariant=$productVariant, productVariantId=$productVariantId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.productBrand != null) {
      json[r'product_brand'] = this.productBrand;
    } else {
      json[r'product_brand'] = null;
    }
    if (this.productCategory != null) {
      json[r'product_category'] = this.productCategory;
    } else {
      json[r'product_category'] = null;
    }
    if (this.productId != null) {
      json[r'product_id'] = this.productId;
    } else {
      json[r'product_id'] = null;
    }
    if (this.productName != null) {
      json[r'product_name'] = this.productName;
    } else {
      json[r'product_name'] = null;
    }
    if (this.productPrice != null) {
      json[r'product_price'] = this.productPrice;
    } else {
      json[r'product_price'] = null;
    }
    if (this.productQuantity != null) {
      json[r'product_quantity'] = this.productQuantity;
    } else {
      json[r'product_quantity'] = null;
    }
    if (this.productVariant != null) {
      json[r'product_variant'] = this.productVariant;
    } else {
      json[r'product_variant'] = null;
    }
    if (this.productVariantId != null) {
      json[r'product_variant_id'] = this.productVariantId;
    } else {
      json[r'product_variant_id'] = null;
    }
    return json;
  }

  /// Returns a new [LineItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LineItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LineItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LineItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LineItem(
        productBrand: mapValueOfType<String>(json, r'product_brand'),
        productCategory: mapValueOfType<String>(json, r'product_category'),
        productId: mapValueOfType<int>(json, r'product_id'),
        productName: mapValueOfType<String>(json, r'product_name'),
        productPrice: mapValueOfType<String>(json, r'product_price'),
        productQuantity: mapValueOfType<int>(json, r'product_quantity'),
        productVariant: mapValueOfType<String>(json, r'product_variant'),
        productVariantId: mapValueOfType<String>(json, r'product_variant_id'),
      );
    }
    return null;
  }

  static List<LineItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LineItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LineItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LineItem> mapFromJson(dynamic json) {
    final map = <String, LineItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LineItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LineItem-objects as value to a dart map
  static Map<String, List<LineItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LineItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LineItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

