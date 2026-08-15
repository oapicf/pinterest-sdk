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
class UpdateMaskFieldType {
  /// Instantiate a new enum with the provided [value].
  const UpdateMaskFieldType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const adLink = UpdateMaskFieldType._(r'ad_link');
  static const adult = UpdateMaskFieldType._(r'adult');
  static const ageGroup = UpdateMaskFieldType._(r'age_group');
  static const availability = UpdateMaskFieldType._(r'availability');
  static const averageReviewRating = UpdateMaskFieldType._(r'average_review_rating');
  static const brand = UpdateMaskFieldType._(r'brand');
  static const checkoutEnabled = UpdateMaskFieldType._(r'checkout_enabled');
  static const color = UpdateMaskFieldType._(r'color');
  static const condition = UpdateMaskFieldType._(r'condition');
  static const customLabel0 = UpdateMaskFieldType._(r'custom_label_0');
  static const customLabel1 = UpdateMaskFieldType._(r'custom_label_1');
  static const customLabel2 = UpdateMaskFieldType._(r'custom_label_2');
  static const customLabel3 = UpdateMaskFieldType._(r'custom_label_3');
  static const customLabel4 = UpdateMaskFieldType._(r'custom_label_4');
  static const customNumber0 = UpdateMaskFieldType._(r'custom_number_0');
  static const customNumber1 = UpdateMaskFieldType._(r'custom_number_1');
  static const customNumber2 = UpdateMaskFieldType._(r'custom_number_2');
  static const customNumber3 = UpdateMaskFieldType._(r'custom_number_3');
  static const customNumber4 = UpdateMaskFieldType._(r'custom_number_4');
  static const description = UpdateMaskFieldType._(r'description');
  static const freeShippingLabel = UpdateMaskFieldType._(r'free_shipping_label');
  static const freeShippingLimit = UpdateMaskFieldType._(r'free_shipping_limit');
  static const gender = UpdateMaskFieldType._(r'gender');
  static const googleProductCategory = UpdateMaskFieldType._(r'google_product_category');
  static const gtin = UpdateMaskFieldType._(r'gtin');
  static const itemGroupId = UpdateMaskFieldType._(r'item_group_id');
  static const lastUpdatedTime = UpdateMaskFieldType._(r'last_updated_time');
  static const link = UpdateMaskFieldType._(r'link');
  static const material = UpdateMaskFieldType._(r'material');
  static const minAdPrice = UpdateMaskFieldType._(r'min_ad_price');
  static const mpn = UpdateMaskFieldType._(r'mpn');
  static const numberOfRatings = UpdateMaskFieldType._(r'number_of_ratings');
  static const numberOfReviews = UpdateMaskFieldType._(r'number_of_reviews');
  static const pattern = UpdateMaskFieldType._(r'pattern');
  static const price = UpdateMaskFieldType._(r'price');
  static const productType = UpdateMaskFieldType._(r'product_type');
  static const salePrice = UpdateMaskFieldType._(r'sale_price');
  static const shipping = UpdateMaskFieldType._(r'shipping');
  static const shippingHeight = UpdateMaskFieldType._(r'shipping_height');
  static const shippingWeight = UpdateMaskFieldType._(r'shipping_weight');
  static const shippingWidth = UpdateMaskFieldType._(r'shipping_width');
  static const size = UpdateMaskFieldType._(r'size');
  static const sizeSystem = UpdateMaskFieldType._(r'size_system');
  static const sizeType = UpdateMaskFieldType._(r'size_type');
  static const tax = UpdateMaskFieldType._(r'tax');
  static const title = UpdateMaskFieldType._(r'title');
  static const variantNames = UpdateMaskFieldType._(r'variant_names');
  static const variantValues = UpdateMaskFieldType._(r'variant_values');
  static const promotionId = UpdateMaskFieldType._(r'promotion_id');

  /// List of all possible values in this [enum][UpdateMaskFieldType].
  static const values = <UpdateMaskFieldType>[
    adLink,
    adult,
    ageGroup,
    availability,
    averageReviewRating,
    brand,
    checkoutEnabled,
    color,
    condition,
    customLabel0,
    customLabel1,
    customLabel2,
    customLabel3,
    customLabel4,
    customNumber0,
    customNumber1,
    customNumber2,
    customNumber3,
    customNumber4,
    description,
    freeShippingLabel,
    freeShippingLimit,
    gender,
    googleProductCategory,
    gtin,
    itemGroupId,
    lastUpdatedTime,
    link,
    material,
    minAdPrice,
    mpn,
    numberOfRatings,
    numberOfReviews,
    pattern,
    price,
    productType,
    salePrice,
    shipping,
    shippingHeight,
    shippingWeight,
    shippingWidth,
    size,
    sizeSystem,
    sizeType,
    tax,
    title,
    variantNames,
    variantValues,
    promotionId,
  ];

  static UpdateMaskFieldType? fromJson(dynamic value) => UpdateMaskFieldTypeTypeTransformer().decode(value);

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

  String encode(UpdateMaskFieldType data) => data.value;

  /// Decodes a [dynamic value][data] to a UpdateMaskFieldType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UpdateMaskFieldType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [UpdateMaskFieldTypeTypeTransformer] instance.
  static UpdateMaskFieldTypeTypeTransformer? _instance;
}

