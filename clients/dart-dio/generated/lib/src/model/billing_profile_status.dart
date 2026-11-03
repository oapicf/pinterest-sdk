//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_profile_status.g.dart';

/// Billing profile status
class BillingProfileStatus extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UNSPECIFIED')
  static const BillingProfileStatus UNSPECIFIED = _$UNSPECIFIED;
  @BuiltValueEnumConst(wireName: r'VALID')
  static const BillingProfileStatus VALID = _$VALID;
  @BuiltValueEnumConst(wireName: r'INVALID')
  static const BillingProfileStatus INVALID = _$INVALID;
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const BillingProfileStatus PENDING = _$PENDING;
  @BuiltValueEnumConst(wireName: r'DELETED')
  static const BillingProfileStatus DELETED = _$DELETED;
  @BuiltValueEnumConst(wireName: r'SECONDARY')
  static const BillingProfileStatus SECONDARY = _$SECONDARY;
  @BuiltValueEnumConst(wireName: r'PENDING_SECONDARY')
  static const BillingProfileStatus PENDING_SECONDARY = _$PENDING_SECONDARY;

  static Serializer<BillingProfileStatus> get serializer => _$billingProfileStatusSerializer;

  const BillingProfileStatus._(String name): super(name);

  static BuiltSet<BillingProfileStatus> get values => _$values;
  static BillingProfileStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BillingProfileStatusMixin = Object with _$BillingProfileStatusMixin;

