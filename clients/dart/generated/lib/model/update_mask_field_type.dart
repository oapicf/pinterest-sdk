//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The field types supported by the update mask
enum UpdateMaskFieldType {
  adLink._(r'ad_link'),
  adult._(r'adult'),
  ageGroup._(r'age_group'),
  availability._(r'availability'),
  averageReviewRating._(r'average_review_rating'),
  brand._(r'brand'),
  checkoutEnabled._(r'checkout_enabled'),
  color._(r'color'),
  condition._(r'condition'),
  customLabel0._(r'custom_label_0'),
  customLabel1._(r'custom_label_1'),
  customLabel2._(r'custom_label_2'),
  customLabel3._(r'custom_label_3'),
  customLabel4._(r'custom_label_4'),
  customNumber0._(r'custom_number_0'),
  customNumber1._(r'custom_number_1'),
  customNumber2._(r'custom_number_2'),
  customNumber3._(r'custom_number_3'),
  customNumber4._(r'custom_number_4'),
  description._(r'description'),
  freeShippingLabel._(r'free_shipping_label'),
  freeShippingLimit._(r'free_shipping_limit'),
  gender._(r'gender'),
  googleProductCategory._(r'google_product_category'),
  gtin._(r'gtin'),
  itemGroupId._(r'item_group_id'),
  lastUpdatedTime._(r'last_updated_time'),
  link._(r'link'),
  material._(r'material'),
  minAdPrice._(r'min_ad_price'),
  mpn._(r'mpn'),
  numberOfRatings._(r'number_of_ratings'),
  numberOfReviews._(r'number_of_reviews'),
  pattern._(r'pattern'),
  price._(r'price'),
  productType._(r'product_type'),
  salePrice._(r'sale_price'),
  shipping._(r'shipping'),
  shippingHeight._(r'shipping_height'),
  shippingWeight._(r'shipping_weight'),
  shippingWidth._(r'shipping_width'),
  size._(r'size'),
  sizeSystem._(r'size_system'),
  sizeType._(r'size_type'),
  tax._(r'tax'),
  title._(r'title'),
  variantNames._(r'variant_names'),
  variantValues._(r'variant_values'),
  promotionId._(r'promotion_id'),
  ;

  /// Instantiate a new enum with the provided value.
  const UpdateMaskFieldType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UpdateMaskFieldType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UpdateMaskFieldType? fromJson(dynamic value) => UpdateMaskFieldTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UpdateMaskFieldType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<UpdateMaskFieldType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateMaskFieldType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateMaskFieldType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UpdateMaskFieldType] to String,
/// and [decode] dynamic data back to [UpdateMaskFieldType].
class UpdateMaskFieldTypeTypeTransformer {
  factory UpdateMaskFieldTypeTypeTransformer() => _instance ??= const UpdateMaskFieldTypeTypeTransformer._();

  const UpdateMaskFieldTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(UpdateMaskFieldType data) => data._value;

  /// Returns the instance of [UpdateMaskFieldType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UpdateMaskFieldType? decode(dynamic data, {bool allowNull = true}) {
    if (data is UpdateMaskFieldType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ad_link': return UpdateMaskFieldType.adLink;
        case r'adult': return UpdateMaskFieldType.adult;
        case r'age_group': return UpdateMaskFieldType.ageGroup;
        case r'availability': return UpdateMaskFieldType.availability;
        case r'average_review_rating': return UpdateMaskFieldType.averageReviewRating;
        case r'brand': return UpdateMaskFieldType.brand;
        case r'checkout_enabled': return UpdateMaskFieldType.checkoutEnabled;
        case r'color': return UpdateMaskFieldType.color;
        case r'condition': return UpdateMaskFieldType.condition;
        case r'custom_label_0': return UpdateMaskFieldType.customLabel0;
        case r'custom_label_1': return UpdateMaskFieldType.customLabel1;
        case r'custom_label_2': return UpdateMaskFieldType.customLabel2;
        case r'custom_label_3': return UpdateMaskFieldType.customLabel3;
        case r'custom_label_4': return UpdateMaskFieldType.customLabel4;
        case r'custom_number_0': return UpdateMaskFieldType.customNumber0;
        case r'custom_number_1': return UpdateMaskFieldType.customNumber1;
        case r'custom_number_2': return UpdateMaskFieldType.customNumber2;
        case r'custom_number_3': return UpdateMaskFieldType.customNumber3;
        case r'custom_number_4': return UpdateMaskFieldType.customNumber4;
        case r'description': return UpdateMaskFieldType.description;
        case r'free_shipping_label': return UpdateMaskFieldType.freeShippingLabel;
        case r'free_shipping_limit': return UpdateMaskFieldType.freeShippingLimit;
        case r'gender': return UpdateMaskFieldType.gender;
        case r'google_product_category': return UpdateMaskFieldType.googleProductCategory;
        case r'gtin': return UpdateMaskFieldType.gtin;
        case r'item_group_id': return UpdateMaskFieldType.itemGroupId;
        case r'last_updated_time': return UpdateMaskFieldType.lastUpdatedTime;
        case r'link': return UpdateMaskFieldType.link;
        case r'material': return UpdateMaskFieldType.material;
        case r'min_ad_price': return UpdateMaskFieldType.minAdPrice;
        case r'mpn': return UpdateMaskFieldType.mpn;
        case r'number_of_ratings': return UpdateMaskFieldType.numberOfRatings;
        case r'number_of_reviews': return UpdateMaskFieldType.numberOfReviews;
        case r'pattern': return UpdateMaskFieldType.pattern;
        case r'price': return UpdateMaskFieldType.price;
        case r'product_type': return UpdateMaskFieldType.productType;
        case r'sale_price': return UpdateMaskFieldType.salePrice;
        case r'shipping': return UpdateMaskFieldType.shipping;
        case r'shipping_height': return UpdateMaskFieldType.shippingHeight;
        case r'shipping_weight': return UpdateMaskFieldType.shippingWeight;
        case r'shipping_width': return UpdateMaskFieldType.shippingWidth;
        case r'size': return UpdateMaskFieldType.size;
        case r'size_system': return UpdateMaskFieldType.sizeSystem;
        case r'size_type': return UpdateMaskFieldType.sizeType;
        case r'tax': return UpdateMaskFieldType.tax;
        case r'title': return UpdateMaskFieldType.title;
        case r'variant_names': return UpdateMaskFieldType.variantNames;
        case r'variant_values': return UpdateMaskFieldType.variantValues;
        case r'promotion_id': return UpdateMaskFieldType.promotionId;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static UpdateMaskFieldTypeTypeTransformer? _instance;
}

