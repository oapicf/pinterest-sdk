//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_profile_card_type.g.dart';

/// Type of the credit card.
class BillingProfileCardType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const BillingProfileCardType UNKNOWN = _$UNKNOWN;
  @BuiltValueEnumConst(wireName: r'VISA')
  static const BillingProfileCardType VISA = _$VISA;
  @BuiltValueEnumConst(wireName: r'MASTERCARD')
  static const BillingProfileCardType MASTERCARD = _$MASTERCARD;
  @BuiltValueEnumConst(wireName: r'AMERICAN_EXPRESS')
  static const BillingProfileCardType AMERICAN_EXPRESS = _$AMERICAN_EXPRESS;
  @BuiltValueEnumConst(wireName: r'DISCOVER')
  static const BillingProfileCardType DISCOVER = _$DISCOVER;
  @BuiltValueEnumConst(wireName: r'ELO')
  static const BillingProfileCardType ELO = _$ELO;

  static Serializer<BillingProfileCardType> get serializer => _$billingProfileCardTypeSerializer;

  const BillingProfileCardType._(String name): super(name);

  static BuiltSet<BillingProfileCardType> get values => _$values;
  static BillingProfileCardType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BillingProfileCardTypeMixin = Object with _$BillingProfileCardTypeMixin;

