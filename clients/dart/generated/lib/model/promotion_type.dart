//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.
enum PromotionType {
  VARIABLE._(r'VARIABLE'),
  SITEWIDE._(r'SITEWIDE'),
  CHECKOUT._(r'CHECKOUT'),
  SAVE_X_ON_Y._(r'SAVE_X_ON_Y'),
  BUY_X_GET_Y._(r'BUY_X_GET_Y'),
  SPEND_X_SAVE_Y._(r'SPEND_X_SAVE_Y'),
  FREE_SHIPPING._(r'FREE_SHIPPING'),
  FREE_SHIPPING_MINIMUM._(r'FREE_SHIPPING_MINIMUM'),
  FREE_SHIPPING_WITH_DISCOUNT._(r'FREE_SHIPPING_WITH_DISCOUNT'),
  SITEWIDE_IN_STORES._(r'SITEWIDE_IN_STORES'),
  EXTRA_PERCENT_OFF._(r'EXTRA_PERCENT_OFF'),
  GIFT_WITH_PURCHASE._(r'GIFT_WITH_PURCHASE'),
  GIFT_WITH_PURCHASE_MINIMUM._(r'GIFT_WITH_PURCHASE_MINIMUM'),
  FIXED._(r'FIXED'),
  PERCENT_OFF_CLEARANCE._(r'PERCENT_OFF_CLEARANCE'),
  X_OFF_Y._(r'X_OFF_Y'),
  GIFT_WITH_FIRST_PURCHASE._(r'GIFT_WITH_FIRST_PURCHASE'),
  BUY_X_GET_ONE_FREE._(r'BUY_X_GET_ONE_FREE'),
  CASH_BACK._(r'CASH_BACK'),
  POINTS_ON_ALL_PURCHASES._(r'POINTS_ON_ALL_PURCHASES'),
  BONUS._(r'BONUS'),
  POINTS_WITH_PURCHASE._(r'POINTS_WITH_PURCHASE'),
  CUSTOM._(r'CUSTOM'),
  ;

  /// Instantiate a new enum with the provided value.
  const PromotionType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PromotionType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PromotionType? fromJson(dynamic value) => PromotionTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PromotionType]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(PromotionType data) => data._value;

  /// Returns the instance of [PromotionType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PromotionType? decode(dynamic data, {bool allowNull = true}) {
    if (data is PromotionType) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static PromotionTypeTypeTransformer? _instance;
}

