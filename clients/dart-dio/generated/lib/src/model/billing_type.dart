//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_type.g.dart';

class BillingType extends EnumClass {

  /// Advertisers billing type
  @BuiltValueEnumConst(wireName: r'CREDIT_CARD')
  static const BillingType CREDIT_CARD = _$CREDIT_CARD;
  /// Advertisers billing type
  @BuiltValueEnumConst(wireName: r'INVOICE')
  static const BillingType INVOICE = _$INVOICE;
  /// Advertisers billing type
  @BuiltValueEnumConst(wireName: r'INTERNAL')
  static const BillingType INTERNAL = _$INTERNAL;
  /// Advertisers billing type
  @BuiltValueEnumConst(wireName: r'RECURRING')
  static const BillingType RECURRING = _$RECURRING;
  /// Advertisers billing type
  @BuiltValueEnumConst(wireName: r'PREPAID')
  static const BillingType PREPAID = _$PREPAID;

  static Serializer<BillingType> get serializer => _$billingTypeSerializer;

  const BillingType._(String name): super(name);

  static BuiltSet<BillingType> get values => _$values;
  static BillingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BillingTypeMixin = Object with _$BillingTypeMixin;

