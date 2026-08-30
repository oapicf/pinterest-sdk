//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_shopping_preview_creative_type.g.dart';

class AdShoppingPreviewCreativeType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SHOPPING')
  static const AdShoppingPreviewCreativeType SHOPPING = _$SHOPPING;
  @BuiltValueEnumConst(wireName: r'COLLECTION')
  static const AdShoppingPreviewCreativeType COLLECTION = _$COLLECTION;
  @BuiltValueEnumConst(wireName: r'CAROUSEL')
  static const AdShoppingPreviewCreativeType CAROUSEL = _$CAROUSEL;
  @BuiltValueEnumConst(wireName: r'MAX_WIDTH_COLLECTION')
  static const AdShoppingPreviewCreativeType MAX_WIDTH_COLLECTION = _$MAX_WIDTH_COLLECTION;

  static Serializer<AdShoppingPreviewCreativeType> get serializer => _$adShoppingPreviewCreativeTypeSerializer;

  const AdShoppingPreviewCreativeType._(String name): super(name);

  static BuiltSet<AdShoppingPreviewCreativeType> get values => _$values;
  static AdShoppingPreviewCreativeType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdShoppingPreviewCreativeTypeMixin = Object with _$AdShoppingPreviewCreativeTypeMixin;

