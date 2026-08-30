//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotion_application_level.g.dart';

class PromotionApplicationLevel extends EnumClass {

  /// Specify if the promotion is applied at ad group or item level.
  @BuiltValueEnumConst(wireName: r'NONE')
  static const PromotionApplicationLevel NONE = _$NONE;
  /// Specify if the promotion is applied at ad group or item level.
  @BuiltValueEnumConst(wireName: r'ITEM')
  static const PromotionApplicationLevel ITEM = _$ITEM;
  /// Specify if the promotion is applied at ad group or item level.
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const PromotionApplicationLevel AD_GROUP = _$AD_GROUP;

  static Serializer<PromotionApplicationLevel> get serializer => _$promotionApplicationLevelSerializer;

  const PromotionApplicationLevel._(String name): super(name);

  static BuiltSet<PromotionApplicationLevel> get values => _$values;
  static PromotionApplicationLevel valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PromotionApplicationLevelMixin = Object with _$PromotionApplicationLevelMixin;

