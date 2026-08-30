//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ineligible_product_tag_reason.g.dart';

class IneligibleProductTagReason extends EnumClass {

  /// Reason why a product pin is ineligible for tagging.
  @BuiltValueEnumConst(wireName: r'PIN_MISSING')
  static const IneligibleProductTagReason PIN_MISSING = _$PIN_MISSING;
  /// Reason why a product pin is ineligible for tagging.
  @BuiltValueEnumConst(wireName: r'PIN_IS_PRIVATE')
  static const IneligibleProductTagReason PIN_IS_PRIVATE = _$PIN_IS_PRIVATE;
  /// Reason why a product pin is ineligible for tagging.
  @BuiltValueEnumConst(wireName: r'PRODUCT_METADATA_MISSING')
  static const IneligibleProductTagReason PRODUCT_METADATA_MISSING = _$PRODUCT_METADATA_MISSING;
  /// Reason why a product pin is ineligible for tagging.
  @BuiltValueEnumConst(wireName: r'PIN_NOT_FROM_VERIFIED_DOMAIN')
  static const IneligibleProductTagReason PIN_NOT_FROM_VERIFIED_DOMAIN = _$PIN_NOT_FROM_VERIFIED_DOMAIN;
  /// Reason why a product pin is ineligible for tagging.
  @BuiltValueEnumConst(wireName: r'PIN_NOT_FROM_SAME_USER_AS_HERO_PIN')
  static const IneligibleProductTagReason PIN_NOT_FROM_SAME_USER_AS_HERO_PIN = _$PIN_NOT_FROM_SAME_USER_AS_HERO_PIN;

  static Serializer<IneligibleProductTagReason> get serializer => _$ineligibleProductTagReasonSerializer;

  const IneligibleProductTagReason._(String name): super(name);

  static BuiltSet<IneligibleProductTagReason> get values => _$values;
  static IneligibleProductTagReason valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class IneligibleProductTagReasonMixin = Object with _$IneligibleProductTagReasonMixin;

