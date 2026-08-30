//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'item_attributes_request_image_link.g.dart';

/// <= 2000 characters The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.
@BuiltValue()
abstract class ItemAttributesRequestImageLink implements Built<ItemAttributesRequestImageLink, ItemAttributesRequestImageLinkBuilder> {
  /// One Of [BuiltList<String>], [String]
  OneOf get oneOf;

  ItemAttributesRequestImageLink._();

  factory ItemAttributesRequestImageLink([void updates(ItemAttributesRequestImageLinkBuilder b)]) = _$ItemAttributesRequestImageLink;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemAttributesRequestImageLinkBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemAttributesRequestImageLink> get serializer => _$ItemAttributesRequestImageLinkSerializer();
}

class _$ItemAttributesRequestImageLinkSerializer implements PrimitiveSerializer<ItemAttributesRequestImageLink> {
  @override
  final Iterable<Type> types = const [ItemAttributesRequestImageLink, _$ItemAttributesRequestImageLink];

  @override
  final String wireName = r'ItemAttributesRequestImageLink';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemAttributesRequestImageLink object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemAttributesRequestImageLink object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ItemAttributesRequestImageLink deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemAttributesRequestImageLinkBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(String)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

