//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_pin_preview_creative_type.g.dart';

class AdPinPreviewCreativeType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SHOPPING')
  static const AdPinPreviewCreativeType SHOPPING = _$SHOPPING;
  @BuiltValueEnumConst(wireName: r'COLLECTION')
  static const AdPinPreviewCreativeType COLLECTION = _$COLLECTION;
  @BuiltValueEnumConst(wireName: r'MAX_VIDEO')
  static const AdPinPreviewCreativeType MAX_VIDEO = _$MAX_VIDEO;
  @BuiltValueEnumConst(wireName: r'MAX_WIDTH_VIDEO_COLLECTION')
  static const AdPinPreviewCreativeType MAX_WIDTH_VIDEO_COLLECTION = _$MAX_WIDTH_VIDEO_COLLECTION;
  @BuiltValueEnumConst(wireName: r'MAX_WIDTH_REGULAR_COLLECTION')
  static const AdPinPreviewCreativeType MAX_WIDTH_REGULAR_COLLECTION = _$MAX_WIDTH_REGULAR_COLLECTION;

  static Serializer<AdPinPreviewCreativeType> get serializer => _$adPinPreviewCreativeTypeSerializer;

  const AdPinPreviewCreativeType._(String name): super(name);

  static BuiltSet<AdPinPreviewCreativeType> get values => _$values;
  static AdPinPreviewCreativeType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdPinPreviewCreativeTypeMixin = Object with _$AdPinPreviewCreativeTypeMixin;

