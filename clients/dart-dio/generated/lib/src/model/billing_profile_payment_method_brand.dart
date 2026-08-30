//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_profile_payment_method_brand.g.dart';

class BillingProfilePaymentMethodBrand extends EnumClass {

  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const BillingProfilePaymentMethodBrand UNKNOWN = _$UNKNOWN;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'VISA')
  static const BillingProfilePaymentMethodBrand VISA = _$VISA;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'MASTERCARD')
  static const BillingProfilePaymentMethodBrand MASTERCARD = _$MASTERCARD;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'AMERICAN_EXPRESS')
  static const BillingProfilePaymentMethodBrand AMERICAN_EXPRESS = _$AMERICAN_EXPRESS;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'DISCOVER')
  static const BillingProfilePaymentMethodBrand DISCOVER = _$DISCOVER;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'SOFORT')
  static const BillingProfilePaymentMethodBrand SOFORT = _$SOFORT;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'DINERS_CLUB')
  static const BillingProfilePaymentMethodBrand DINERS_CLUB = _$DINERS_CLUB;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'ELO')
  static const BillingProfilePaymentMethodBrand ELO = _$ELO;
  /// Brand of the payment method.
  @BuiltValueEnumConst(wireName: r'CARTE_BANCAIRE')
  static const BillingProfilePaymentMethodBrand CARTE_BANCAIRE = _$CARTE_BANCAIRE;

  static Serializer<BillingProfilePaymentMethodBrand> get serializer => _$billingProfilePaymentMethodBrandSerializer;

  const BillingProfilePaymentMethodBrand._(String name): super(name);

  static BuiltSet<BillingProfilePaymentMethodBrand> get values => _$values;
  static BillingProfilePaymentMethodBrand valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BillingProfilePaymentMethodBrandMixin = Object with _$BillingProfilePaymentMethodBrandMixin;

