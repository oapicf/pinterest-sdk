//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/promotion_response.dart';
import 'package:openapi/src/model/exception.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotion_array_element.g.dart';

/// PromotionArrayElement
///
/// Properties:
/// * [data] 
/// * [exception] 
@BuiltValue()
abstract class PromotionArrayElement implements Built<PromotionArrayElement, PromotionArrayElementBuilder> {
  @BuiltValueField(wireName: r'data')
  PromotionResponse? get data;

  @BuiltValueField(wireName: r'exception')
  Exception? get exception;

  PromotionArrayElement._();

  factory PromotionArrayElement([void updates(PromotionArrayElementBuilder b)]) = _$PromotionArrayElement;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PromotionArrayElementBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PromotionArrayElement> get serializer => _$PromotionArrayElementSerializer();
}

class _$PromotionArrayElementSerializer implements PrimitiveSerializer<PromotionArrayElement> {
  @override
  final Iterable<Type> types = const [PromotionArrayElement, _$PromotionArrayElement];

  @override
  final String wireName = r'PromotionArrayElement';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PromotionArrayElement object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(PromotionResponse),
      );
    }
    if (object.exception != null) {
      yield r'exception';
      yield serializers.serialize(
        object.exception,
        specifiedType: const FullType(Exception),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PromotionArrayElement object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PromotionArrayElementBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PromotionResponse),
          ) as PromotionResponse;
          result.data.replace(valueDes);
          break;
        case r'exception':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Exception),
          ) as Exception;
          result.exception.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PromotionArrayElement deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PromotionArrayElementBuilder();
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

