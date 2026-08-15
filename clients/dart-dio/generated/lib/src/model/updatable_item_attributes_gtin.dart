//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'updatable_item_attributes_gtin.g.dart';

/// The unique universal product identifier.
@BuiltValue()
abstract class UpdatableItemAttributesGtin implements Built<UpdatableItemAttributesGtin, UpdatableItemAttributesGtinBuilder> {
  /// One Of [String], [int]
  OneOf get oneOf;

  UpdatableItemAttributesGtin._();

  factory UpdatableItemAttributesGtin([void updates(UpdatableItemAttributesGtinBuilder b)]) = _$UpdatableItemAttributesGtin;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdatableItemAttributesGtinBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdatableItemAttributesGtin> get serializer => _$UpdatableItemAttributesGtinSerializer();
}

class _$UpdatableItemAttributesGtinSerializer implements PrimitiveSerializer<UpdatableItemAttributesGtin> {
  @override
  final Iterable<Type> types = const [UpdatableItemAttributesGtin, _$UpdatableItemAttributesGtin];

  @override
  final String wireName = r'UpdatableItemAttributesGtin';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdatableItemAttributesGtin object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdatableItemAttributesGtin object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  UpdatableItemAttributesGtin deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdatableItemAttributesGtinBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType.nullable(String), FullType(int), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

