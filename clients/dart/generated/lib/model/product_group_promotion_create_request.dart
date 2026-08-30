//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductGroupPromotionCreateRequest {
  /// Returns a new [ProductGroupPromotionCreateRequest] instance.
  ProductGroupPromotionCreateRequest({
    required this.adGroupId,
    this.productGroupPromotion = const [],
  });

  /// ID of the Ad Group the Product Group Promotion belongs to.
  String adGroupId;

  List<ProductGroupPromotion> productGroupPromotion;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductGroupPromotionCreateRequest &&
    other.adGroupId == adGroupId &&
    _deepEquality.equals(other.productGroupPromotion, productGroupPromotion);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupId.hashCode) +
    (productGroupPromotion.hashCode);

  @override
  String toString() => 'ProductGroupPromotionCreateRequest[adGroupId=$adGroupId, productGroupPromotion=$productGroupPromotion]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_group_id'] = this.adGroupId;
      json[r'product_group_promotion'] = this.productGroupPromotion;
    return json;
  }

  /// Returns a new [ProductGroupPromotionCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductGroupPromotionCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_group_id'), 'Required key "ProductGroupPromotionCreateRequest[ad_group_id]" is missing from JSON.');
        assert(json[r'ad_group_id'] != null, 'Required key "ProductGroupPromotionCreateRequest[ad_group_id]" has a null value in JSON.');
        assert(json.containsKey(r'product_group_promotion'), 'Required key "ProductGroupPromotionCreateRequest[product_group_promotion]" is missing from JSON.');
        assert(json[r'product_group_promotion'] != null, 'Required key "ProductGroupPromotionCreateRequest[product_group_promotion]" has a null value in JSON.');
        return true;
      }());

      return ProductGroupPromotionCreateRequest(
        adGroupId: mapValueOfType<String>(json, r'ad_group_id')!,
        productGroupPromotion: ProductGroupPromotion.listFromJson(json[r'product_group_promotion']),
      );
    }
    return null;
  }

  static List<ProductGroupPromotionCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupPromotionCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupPromotionCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductGroupPromotionCreateRequest> mapFromJson(dynamic json) {
    final map = <String, ProductGroupPromotionCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductGroupPromotionCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductGroupPromotionCreateRequest-objects as value to a dart map
  static Map<String, List<ProductGroupPromotionCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductGroupPromotionCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductGroupPromotionCreateRequest.listFromJson(entry.value, growable: growable,);
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

