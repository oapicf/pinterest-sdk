//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CartingProduct {
  /// Returns a new [CartingProduct] instance.
  CartingProduct({
    required this.cartingProductId,
    this.displayPreferredRetailersOnly,
    this.displayProductPrice,
    this.preferredRetailers = const [],
    this.randomizePreferredRetailers,
  });

  /// the internal Pinterest carting product id (different from industry product id)
  String cartingProductId;

  /// Whether to display only the preferred retailers for the carting product
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? displayPreferredRetailersOnly;

  /// Whether to display the price for the carting product
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? displayProductPrice;

  /// A sorted array of preferred retailers for the carting product
  List<CartingRetailer> preferredRetailers;

  /// Whether to randomize preferred retailers for the carting product
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? randomizePreferredRetailers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CartingProduct &&
    other.cartingProductId == cartingProductId &&
    other.displayPreferredRetailersOnly == displayPreferredRetailersOnly &&
    other.displayProductPrice == displayProductPrice &&
    _deepEquality.equals(other.preferredRetailers, preferredRetailers) &&
    other.randomizePreferredRetailers == randomizePreferredRetailers;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cartingProductId.hashCode) +
    (displayPreferredRetailersOnly == null ? 0 : displayPreferredRetailersOnly!.hashCode) +
    (displayProductPrice == null ? 0 : displayProductPrice!.hashCode) +
    (preferredRetailers.hashCode) +
    (randomizePreferredRetailers == null ? 0 : randomizePreferredRetailers!.hashCode);

  @override
  String toString() => 'CartingProduct[cartingProductId=$cartingProductId, displayPreferredRetailersOnly=$displayPreferredRetailersOnly, displayProductPrice=$displayProductPrice, preferredRetailers=$preferredRetailers, randomizePreferredRetailers=$randomizePreferredRetailers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'carting_product_id'] = this.cartingProductId;
    if (this.displayPreferredRetailersOnly != null) {
      json[r'display_preferred_retailers_only'] = this.displayPreferredRetailersOnly;
    } else {
      json[r'display_preferred_retailers_only'] = null;
    }
    if (this.displayProductPrice != null) {
      json[r'display_product_price'] = this.displayProductPrice;
    } else {
      json[r'display_product_price'] = null;
    }
      json[r'preferred_retailers'] = this.preferredRetailers;
    if (this.randomizePreferredRetailers != null) {
      json[r'randomize_preferred_retailers'] = this.randomizePreferredRetailers;
    } else {
      json[r'randomize_preferred_retailers'] = null;
    }
    return json;
  }

  /// Returns a new [CartingProduct] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CartingProduct? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'carting_product_id'), 'Required key "CartingProduct[carting_product_id]" is missing from JSON.');
        assert(json[r'carting_product_id'] != null, 'Required key "CartingProduct[carting_product_id]" has a null value in JSON.');
        return true;
      }());

      return CartingProduct(
        cartingProductId: mapValueOfType<String>(json, r'carting_product_id')!,
        displayPreferredRetailersOnly: mapValueOfType<bool>(json, r'display_preferred_retailers_only'),
        displayProductPrice: mapValueOfType<bool>(json, r'display_product_price'),
        preferredRetailers: CartingRetailer.listFromJson(json[r'preferred_retailers']),
        randomizePreferredRetailers: mapValueOfType<bool>(json, r'randomize_preferred_retailers'),
      );
    }
    return null;
  }

  static List<CartingProduct> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CartingProduct>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CartingProduct.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CartingProduct> mapFromJson(dynamic json) {
    final map = <String, CartingProduct>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CartingProduct.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CartingProduct-objects as value to a dart map
  static Map<String, List<CartingProduct>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CartingProduct>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CartingProduct.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'carting_product_id',
  };
}

