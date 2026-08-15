//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_product_group_filter_keys.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'any_of.g.dart';

/// AnyOf
///
/// Properties:
/// * [anyOf] 
@BuiltValue()
abstract class AnyOf implements Built<AnyOf, AnyOfBuilder> {
  @BuiltValueField(wireName: r'any_of')
  BuiltList<CatalogsProductGroupFilterKeys> get anyOf;

  AnyOf._();

  factory AnyOf([void updates(AnyOfBuilder b)]) = _$AnyOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AnyOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AnyOf> get serializer => _$AnyOfSerializer();
}

class _$AnyOfSerializer implements PrimitiveSerializer<AnyOf> {
  @override
  final Iterable<Type> types = const [AnyOf, _$AnyOf];

  @override
  final String wireName = r'AnyOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'any_of';
    yield serializers.serialize(
      object.anyOf,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AnyOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AnyOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'any_of':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsProductGroupFilterKeys)]),
          ) as BuiltList<CatalogsProductGroupFilterKeys>;
          result.anyOf.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AnyOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AnyOfBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

