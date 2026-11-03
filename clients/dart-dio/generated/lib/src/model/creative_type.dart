//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'creative_type.g.dart';

/// Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
class CreativeType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'REGULAR')
  static const CreativeType REGULAR = _$REGULAR;
  @BuiltValueEnumConst(wireName: r'VIDEO')
  static const CreativeType VIDEO = _$VIDEO;
  @BuiltValueEnumConst(wireName: r'SHOPPING')
  static const CreativeType SHOPPING = _$SHOPPING;
  @BuiltValueEnumConst(wireName: r'CAROUSEL')
  static const CreativeType CAROUSEL = _$CAROUSEL;
  @BuiltValueEnumConst(wireName: r'MAX_VIDEO')
  static const CreativeType MAX_VIDEO = _$MAX_VIDEO;
  @BuiltValueEnumConst(wireName: r'SHOP_THE_PIN')
  static const CreativeType SHOP_THE_PIN = _$SHOP_THE_PIN;
  @BuiltValueEnumConst(wireName: r'COLLECTION')
  static const CreativeType COLLECTION = _$COLLECTION;
  @BuiltValueEnumConst(wireName: r'IDEA')
  static const CreativeType IDEA = _$IDEA;
  @BuiltValueEnumConst(wireName: r'SHOWCASE')
  static const CreativeType SHOWCASE = _$SHOWCASE;
  @BuiltValueEnumConst(wireName: r'QUIZ')
  static const CreativeType QUIZ = _$QUIZ;
  @BuiltValueEnumConst(wireName: r'COLLAGE')
  static const CreativeType COLLAGE = _$COLLAGE;
  @BuiltValueEnumConst(wireName: r'MAX_WIDTH_REGULAR_COLLECTION')
  static const CreativeType MAX_WIDTH_REGULAR_COLLECTION = _$MAX_WIDTH_REGULAR_COLLECTION;
  @BuiltValueEnumConst(wireName: r'MAX_WIDTH_VIDEO_COLLECTION')
  static const CreativeType MAX_WIDTH_VIDEO_COLLECTION = _$MAX_WIDTH_VIDEO_COLLECTION;
  @BuiltValueEnumConst(wireName: r'APP')
  static const CreativeType APP = _$APP;

  static Serializer<CreativeType> get serializer => _$creativeTypeSerializer;

  const CreativeType._(String name): super(name);

  static BuiltSet<CreativeType> get values => _$values;
  static CreativeType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CreativeTypeMixin = Object with _$CreativeTypeMixin;

