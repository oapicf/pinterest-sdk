//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum AdsCreditDiscountType {
  COUPON._(r'COUPON'),
  CREDIT._(r'CREDIT'),
  COUPON_APPLIED._(r'COUPON_APPLIED'),
  CREDIT_APPLIED._(r'CREDIT_APPLIED'),
  MARKETING_OFFER_CREDIT._(r'MARKETING_OFFER_CREDIT'),
  MARKETING_OFFER_CREDIT_APPLIED._(r'MARKETING_OFFER_CREDIT_APPLIED'),
  GOODWILL_CREDIT._(r'GOODWILL_CREDIT'),
  GOODWILL_CREDIT_APPLIED._(r'GOODWILL_CREDIT_APPLIED'),
  INTERNAL_CREDIT._(r'INTERNAL_CREDIT'),
  INTERNAL_CREDIT_APPLIED._(r'INTERNAL_CREDIT_APPLIED'),
  PREPAID_CREDIT._(r'PREPAID_CREDIT'),
  PREPAID_CREDIT_APPLIED._(r'PREPAID_CREDIT_APPLIED'),
  SALES_INCENTIVE_CREDIT._(r'SALES_INCENTIVE_CREDIT'),
  SALES_INCENTIVE_CREDIT_APPLIED._(r'SALES_INCENTIVE_CREDIT_APPLIED'),
  CREDIT_EXPIRED._(r'CREDIT_EXPIRED'),
  FUTURE_CREDIT._(r'FUTURE_CREDIT'),
  REFERRAL_CREDIT._(r'REFERRAL_CREDIT'),
  INVOICE_SALES_INCENTIVE_CREDIT._(r'INVOICE_SALES_INCENTIVE_CREDIT'),
  INVOICE_SALES_INCENTIVE_CREDIT_APPLIED._(r'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED'),
  PREPAID_CREDIT_REFUND._(r'PREPAID_CREDIT_REFUND'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdsCreditDiscountType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdsCreditDiscountType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdsCreditDiscountType? fromJson(dynamic value) => AdsCreditDiscountTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdsCreditDiscountType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdsCreditDiscountType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsCreditDiscountType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsCreditDiscountType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsCreditDiscountType] to String,
/// and [decode] dynamic data back to [AdsCreditDiscountType].
class AdsCreditDiscountTypeTypeTransformer {
  factory AdsCreditDiscountTypeTypeTransformer() => _instance ??= const AdsCreditDiscountTypeTypeTransformer._();

  const AdsCreditDiscountTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdsCreditDiscountType data) => data._value;

  /// Returns the instance of [AdsCreditDiscountType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsCreditDiscountType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdsCreditDiscountType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'COUPON': return AdsCreditDiscountType.COUPON;
        case r'CREDIT': return AdsCreditDiscountType.CREDIT;
        case r'COUPON_APPLIED': return AdsCreditDiscountType.COUPON_APPLIED;
        case r'CREDIT_APPLIED': return AdsCreditDiscountType.CREDIT_APPLIED;
        case r'MARKETING_OFFER_CREDIT': return AdsCreditDiscountType.MARKETING_OFFER_CREDIT;
        case r'MARKETING_OFFER_CREDIT_APPLIED': return AdsCreditDiscountType.MARKETING_OFFER_CREDIT_APPLIED;
        case r'GOODWILL_CREDIT': return AdsCreditDiscountType.GOODWILL_CREDIT;
        case r'GOODWILL_CREDIT_APPLIED': return AdsCreditDiscountType.GOODWILL_CREDIT_APPLIED;
        case r'INTERNAL_CREDIT': return AdsCreditDiscountType.INTERNAL_CREDIT;
        case r'INTERNAL_CREDIT_APPLIED': return AdsCreditDiscountType.INTERNAL_CREDIT_APPLIED;
        case r'PREPAID_CREDIT': return AdsCreditDiscountType.PREPAID_CREDIT;
        case r'PREPAID_CREDIT_APPLIED': return AdsCreditDiscountType.PREPAID_CREDIT_APPLIED;
        case r'SALES_INCENTIVE_CREDIT': return AdsCreditDiscountType.SALES_INCENTIVE_CREDIT;
        case r'SALES_INCENTIVE_CREDIT_APPLIED': return AdsCreditDiscountType.SALES_INCENTIVE_CREDIT_APPLIED;
        case r'CREDIT_EXPIRED': return AdsCreditDiscountType.CREDIT_EXPIRED;
        case r'FUTURE_CREDIT': return AdsCreditDiscountType.FUTURE_CREDIT;
        case r'REFERRAL_CREDIT': return AdsCreditDiscountType.REFERRAL_CREDIT;
        case r'INVOICE_SALES_INCENTIVE_CREDIT': return AdsCreditDiscountType.INVOICE_SALES_INCENTIVE_CREDIT;
        case r'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED': return AdsCreditDiscountType.INVOICE_SALES_INCENTIVE_CREDIT_APPLIED;
        case r'PREPAID_CREDIT_REFUND': return AdsCreditDiscountType.PREPAID_CREDIT_REFUND;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdsCreditDiscountTypeTypeTransformer? _instance;
}

