//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Determines the displayed promotion text along with what parameters (if any) are needed to complete the template. This list is not finalized, and will be updated as new types are supported.
class PromotionType {
  /// Instantiate a new enum with the provided [value].
  const PromotionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const VARIABLE = PromotionType._(r'VARIABLE');
  static const SITEWIDE = PromotionType._(r'SITEWIDE');
  static const CHECKOUT = PromotionType._(r'CHECKOUT');
  static const SAVE_X_ON_Y = PromotionType._(r'SAVE_X_ON_Y');
  static const BUY_X_GET_Y = PromotionType._(r'BUY_X_GET_Y');
  static const SPEND_X_SAVE_Y = PromotionType._(r'SPEND_X_SAVE_Y');
  static const FREE_SHIPPING = PromotionType._(r'FREE_SHIPPING');
  static const FREE_SHIPPING_MINIMUM = PromotionType._(r'FREE_SHIPPING_MINIMUM');
  static const FREE_SHIPPING_WITH_DISCOUNT = PromotionType._(r'FREE_SHIPPING_WITH_DISCOUNT');
  static const SITEWIDE_IN_STORES = PromotionType._(r'SITEWIDE_IN_STORES');
  static const EXTRA_PERCENT_OFF = PromotionType._(r'EXTRA_PERCENT_OFF');
  static const GIFT_WITH_PURCHASE = PromotionType._(r'GIFT_WITH_PURCHASE');
  static const GIFT_WITH_PURCHASE_MINIMUM = PromotionType._(r'GIFT_WITH_PURCHASE_MINIMUM');
  static const FIXED = PromotionType._(r'FIXED');
  static const PERCENT_OFF_CLEARANCE = PromotionType._(r'PERCENT_OFF_CLEARANCE');
  static const X_OFF_Y = PromotionType._(r'X_OFF_Y');
  static const GIFT_WITH_FIRST_PURCHASE = PromotionType._(r'GIFT_WITH_FIRST_PURCHASE');
  static const BUY_X_GET_ONE_FREE = PromotionType._(r'BUY_X_GET_ONE_FREE');
  static const CASH_BACK = PromotionType._(r'CASH_BACK');
  static const POINTS_ON_ALL_PURCHASES = PromotionType._(r'POINTS_ON_ALL_PURCHASES');
  static const BONUS = PromotionType._(r'BONUS');
  static const POINTS_WITH_PURCHASE = PromotionType._(r'POINTS_WITH_PURCHASE');
  static const CUSTOM = PromotionType._(r'CUSTOM');

  /// List of all possible values in this [enum][PromotionType].
  static const values = <PromotionType>[
    VARIABLE,
    SITEWIDE,
    CHECKOUT,
    SAVE_X_ON_Y,
    BUY_X_GET_Y,
    SPEND_X_SAVE_Y,
    FREE_SHIPPING,
    FREE_SHIPPING_MINIMUM,
    FREE_SHIPPING_WITH_DISCOUNT,
    SITEWIDE_IN_STORES,
    EXTRA_PERCENT_OFF,
    GIFT_WITH_PURCHASE,
    GIFT_WITH_PURCHASE_MINIMUM,
    FIXED,
    PERCENT_OFF_CLEARANCE,
    X_OFF_Y,
    GIFT_WITH_FIRST_PURCHASE,
    BUY_X_GET_ONE_FREE,
    CASH_BACK,
    POINTS_ON_ALL_PURCHASES,
    BONUS,
    POINTS_WITH_PURCHASE,
    CUSTOM,
  ];

  static PromotionType? fromJson(dynamic value) => PromotionTypeTypeTransformer().decode(value);

  static List<PromotionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PromotionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PromotionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PromotionType] to String,
/// and [decode] dynamic data back to [PromotionType].
class PromotionTypeTypeTransformer {
  factory PromotionTypeTypeTransformer() => _instance ??= const PromotionTypeTypeTransformer._();

  const PromotionTypeTypeTransformer._();

  String encode(PromotionType data) => data.value;

  /// Decodes a [dynamic value][data] to a PromotionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromotionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'VARIABLE': return PromotionType.VARIABLE;
        case r'SITEWIDE': return PromotionType.SITEWIDE;
        case r'CHECKOUT': return PromotionType.CHECKOUT;
        case r'SAVE_X_ON_Y': return PromotionType.SAVE_X_ON_Y;
        case r'BUY_X_GET_Y': return PromotionType.BUY_X_GET_Y;
        case r'SPEND_X_SAVE_Y': return PromotionType.SPEND_X_SAVE_Y;
        case r'FREE_SHIPPING': return PromotionType.FREE_SHIPPING;
        case r'FREE_SHIPPING_MINIMUM': return PromotionType.FREE_SHIPPING_MINIMUM;
        case r'FREE_SHIPPING_WITH_DISCOUNT': return PromotionType.FREE_SHIPPING_WITH_DISCOUNT;
        case r'SITEWIDE_IN_STORES': return PromotionType.SITEWIDE_IN_STORES;
        case r'EXTRA_PERCENT_OFF': return PromotionType.EXTRA_PERCENT_OFF;
        case r'GIFT_WITH_PURCHASE': return PromotionType.GIFT_WITH_PURCHASE;
        case r'GIFT_WITH_PURCHASE_MINIMUM': return PromotionType.GIFT_WITH_PURCHASE_MINIMUM;
        case r'FIXED': return PromotionType.FIXED;
        case r'PERCENT_OFF_CLEARANCE': return PromotionType.PERCENT_OFF_CLEARANCE;
        case r'X_OFF_Y': return PromotionType.X_OFF_Y;
        case r'GIFT_WITH_FIRST_PURCHASE': return PromotionType.GIFT_WITH_FIRST_PURCHASE;
        case r'BUY_X_GET_ONE_FREE': return PromotionType.BUY_X_GET_ONE_FREE;
        case r'CASH_BACK': return PromotionType.CASH_BACK;
        case r'POINTS_ON_ALL_PURCHASES': return PromotionType.POINTS_ON_ALL_PURCHASES;
        case r'BONUS': return PromotionType.BONUS;
        case r'POINTS_WITH_PURCHASE': return PromotionType.POINTS_WITH_PURCHASE;
        case r'CUSTOM': return PromotionType.CUSTOM;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PromotionTypeTypeTransformer] instance.
  static PromotionTypeTypeTransformer? _instance;
}

