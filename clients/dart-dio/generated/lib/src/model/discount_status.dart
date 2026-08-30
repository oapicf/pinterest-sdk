//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'discount_status.g.dart';

class DiscountStatus extends EnumClass {

  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const DiscountStatus OTHER = _$OTHER;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const DiscountStatus ACTIVE = _$ACTIVE;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const DiscountStatus PAUSED = _$PAUSED;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'SCHEDULED')
  static const DiscountStatus SCHEDULED = _$SCHEDULED;
  /// Discount status based on the current time and start and end time of discount
  @BuiltValueEnumConst(wireName: r'EXPIRED')
  static const DiscountStatus EXPIRED = _$EXPIRED;

  static Serializer<DiscountStatus> get serializer => _$discountStatusSerializer;

  const DiscountStatus._(String name): super(name);

  static BuiltSet<DiscountStatus> get values => _$values;
  static DiscountStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class DiscountStatusMixin = Object with _$DiscountStatusMixin;

