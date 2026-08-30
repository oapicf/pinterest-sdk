//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_credit_discount_type.g.dart';

class AdsCreditDiscountType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'COUPON')
  static const AdsCreditDiscountType COUPON = _$COUPON;
  @BuiltValueEnumConst(wireName: r'CREDIT')
  static const AdsCreditDiscountType CREDIT = _$CREDIT;
  @BuiltValueEnumConst(wireName: r'COUPON_APPLIED')
  static const AdsCreditDiscountType COUPON_APPLIED = _$COUPON_APPLIED;
  @BuiltValueEnumConst(wireName: r'CREDIT_APPLIED')
  static const AdsCreditDiscountType CREDIT_APPLIED = _$CREDIT_APPLIED;
  @BuiltValueEnumConst(wireName: r'MARKETING_OFFER_CREDIT')
  static const AdsCreditDiscountType MARKETING_OFFER_CREDIT = _$MARKETING_OFFER_CREDIT;
  @BuiltValueEnumConst(wireName: r'MARKETING_OFFER_CREDIT_APPLIED')
  static const AdsCreditDiscountType MARKETING_OFFER_CREDIT_APPLIED = _$MARKETING_OFFER_CREDIT_APPLIED;
  @BuiltValueEnumConst(wireName: r'GOODWILL_CREDIT')
  static const AdsCreditDiscountType GOODWILL_CREDIT = _$GOODWILL_CREDIT;
  @BuiltValueEnumConst(wireName: r'GOODWILL_CREDIT_APPLIED')
  static const AdsCreditDiscountType GOODWILL_CREDIT_APPLIED = _$GOODWILL_CREDIT_APPLIED;
  @BuiltValueEnumConst(wireName: r'INTERNAL_CREDIT')
  static const AdsCreditDiscountType INTERNAL_CREDIT = _$INTERNAL_CREDIT;
  @BuiltValueEnumConst(wireName: r'INTERNAL_CREDIT_APPLIED')
  static const AdsCreditDiscountType INTERNAL_CREDIT_APPLIED = _$INTERNAL_CREDIT_APPLIED;
  @BuiltValueEnumConst(wireName: r'PREPAID_CREDIT')
  static const AdsCreditDiscountType PREPAID_CREDIT = _$PREPAID_CREDIT;
  @BuiltValueEnumConst(wireName: r'PREPAID_CREDIT_APPLIED')
  static const AdsCreditDiscountType PREPAID_CREDIT_APPLIED = _$PREPAID_CREDIT_APPLIED;
  @BuiltValueEnumConst(wireName: r'SALES_INCENTIVE_CREDIT')
  static const AdsCreditDiscountType SALES_INCENTIVE_CREDIT = _$SALES_INCENTIVE_CREDIT;
  @BuiltValueEnumConst(wireName: r'SALES_INCENTIVE_CREDIT_APPLIED')
  static const AdsCreditDiscountType SALES_INCENTIVE_CREDIT_APPLIED = _$SALES_INCENTIVE_CREDIT_APPLIED;
  @BuiltValueEnumConst(wireName: r'CREDIT_EXPIRED')
  static const AdsCreditDiscountType CREDIT_EXPIRED = _$CREDIT_EXPIRED;
  @BuiltValueEnumConst(wireName: r'FUTURE_CREDIT')
  static const AdsCreditDiscountType FUTURE_CREDIT = _$FUTURE_CREDIT;
  @BuiltValueEnumConst(wireName: r'REFERRAL_CREDIT')
  static const AdsCreditDiscountType REFERRAL_CREDIT = _$REFERRAL_CREDIT;
  @BuiltValueEnumConst(wireName: r'INVOICE_SALES_INCENTIVE_CREDIT')
  static const AdsCreditDiscountType INVOICE_SALES_INCENTIVE_CREDIT = _$INVOICE_SALES_INCENTIVE_CREDIT;
  @BuiltValueEnumConst(wireName: r'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED')
  static const AdsCreditDiscountType INVOICE_SALES_INCENTIVE_CREDIT_APPLIED = _$INVOICE_SALES_INCENTIVE_CREDIT_APPLIED;
  @BuiltValueEnumConst(wireName: r'PREPAID_CREDIT_REFUND')
  static const AdsCreditDiscountType PREPAID_CREDIT_REFUND = _$PREPAID_CREDIT_REFUND;

  static Serializer<AdsCreditDiscountType> get serializer => _$adsCreditDiscountTypeSerializer;

  const AdsCreditDiscountType._(String name): super(name);

  static BuiltSet<AdsCreditDiscountType> get values => _$values;
  static AdsCreditDiscountType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdsCreditDiscountTypeMixin = Object with _$AdsCreditDiscountTypeMixin;

