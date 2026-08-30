//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductGroupPromotionsCreate {
  /// Returns a new [ProductGroupPromotionsCreate] instance.
  ProductGroupPromotionsCreate({
    required this.adGroupId,
    this.productGroupPromotion = const [],
  });

  /// ID of the ad group the product group promotion belongs to.
  String adGroupId;

  /// List of product group promotions to create or update.
  List<ProductGroupPromotion> productGroupPromotion;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductGroupPromotionsCreate &&
    other.adGroupId == adGroupId &&
    _deepEquality.equals(other.productGroupPromotion, productGroupPromotion);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupId.hashCode) +
    (productGroupPromotion.hashCode);

  @override
  String toString() => 'ProductGroupPromotionsCreate[adGroupId=$adGroupId, productGroupPromotion=$productGroupPromotion]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_group_id'] = this.adGroupId;
      json[r'product_group_promotion'] = this.productGroupPromotion;
    return json;
  }

  /// Returns a new [ProductGroupPromotionsCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductGroupPromotionsCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_group_id'), 'Required key "ProductGroupPromotionsCreate[ad_group_id]" is missing from JSON.');
        assert(json[r'ad_group_id'] != null, 'Required key "ProductGroupPromotionsCreate[ad_group_id]" has a null value in JSON.');
        assert(json.containsKey(r'product_group_promotion'), 'Required key "ProductGroupPromotionsCreate[product_group_promotion]" is missing from JSON.');
        assert(json[r'product_group_promotion'] != null, 'Required key "ProductGroupPromotionsCreate[product_group_promotion]" has a null value in JSON.');
        return true;
      }());

      return ProductGroupPromotionsCreate(
        adGroupId: mapValueOfType<String>(json, r'ad_group_id')!,
        productGroupPromotion: ProductGroupPromotion.listFromJson(json[r'product_group_promotion']),
      );
    }
    return null;
  }

  static List<ProductGroupPromotionsCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupPromotionsCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupPromotionsCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductGroupPromotionsCreate> mapFromJson(dynamic json) {
    final map = <String, ProductGroupPromotionsCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductGroupPromotionsCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductGroupPromotionsCreate-objects as value to a dart map
  static Map<String, List<ProductGroupPromotionsCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductGroupPromotionsCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductGroupPromotionsCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_group_id',
    'product_group_promotion',
  };
}

