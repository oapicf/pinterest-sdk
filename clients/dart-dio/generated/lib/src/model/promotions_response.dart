//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/promotion_array_element.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotions_response.g.dart';

/// PromotionsResponse
///
/// Properties:
/// * [promotions] 
@BuiltValue()
abstract class PromotionsResponse implements Built<PromotionsResponse, PromotionsResponseBuilder> {
  @BuiltValueField(wireName: r'promotions')
  BuiltList<PromotionArrayElement>? get promotions;

  PromotionsResponse._();

  factory PromotionsResponse([void updates(PromotionsResponseBuilder b)]) = _$PromotionsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PromotionsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PromotionsResponse> get serializer => _$PromotionsResponseSerializer();
}

class _$PromotionsResponseSerializer implements PrimitiveSerializer<PromotionsResponse> {
  @override
  final Iterable<Type> types = const [PromotionsResponse, _$PromotionsResponse];

  @override
  final String wireName = r'PromotionsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PromotionsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.promotions != null) {
      yield r'promotions';
      yield serializers.serialize(
        object.promotions,
        specifiedType: const FullType(BuiltList, [FullType(PromotionArrayElement)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PromotionsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PromotionsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'promotions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(PromotionArrayElement)]),
          ) as BuiltList<PromotionArrayElement>?;
          if (valueDes == null) continue;
          result.promotions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PromotionsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PromotionsResponseBuilder();
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

