//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'item_attributes_request_all_of_image_link.g.dart';

/// <p><= 2000 characters</p> <p>The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
@BuiltValue()
abstract class ItemAttributesRequestAllOfImageLink implements Built<ItemAttributesRequestAllOfImageLink, ItemAttributesRequestAllOfImageLinkBuilder> {
  /// One Of [BuiltList<String>], [String]
  OneOf get oneOf;

  ItemAttributesRequestAllOfImageLink._();

  factory ItemAttributesRequestAllOfImageLink([void updates(ItemAttributesRequestAllOfImageLinkBuilder b)]) = _$ItemAttributesRequestAllOfImageLink;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemAttributesRequestAllOfImageLinkBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemAttributesRequestAllOfImageLink> get serializer => _$ItemAttributesRequestAllOfImageLinkSerializer();
}

class _$ItemAttributesRequestAllOfImageLinkSerializer implements PrimitiveSerializer<ItemAttributesRequestAllOfImageLink> {
  @override
  final Iterable<Type> types = const [ItemAttributesRequestAllOfImageLink, _$ItemAttributesRequestAllOfImageLink];

  @override
  final String wireName = r'ItemAttributesRequestAllOfImageLink';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemAttributesRequestAllOfImageLink object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemAttributesRequestAllOfImageLink object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ItemAttributesRequestAllOfImageLink deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemAttributesRequestAllOfImageLinkBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType(BuiltList, [FullType(String)]), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

