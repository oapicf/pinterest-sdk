//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_response.dart';
import 'package:openapi/src/model/exception.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_array_response_element.g.dart';

/// AdArrayResponseElement
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class AdArrayResponseElement implements Built<AdArrayResponseElement, AdArrayResponseElementBuilder> {
  @BuiltValueField(wireName: r'data')
  AdResponse? get data;

  @BuiltValueField(wireName: r'exceptions')
  Exception? get exceptions;

  AdArrayResponseElement._();

  factory AdArrayResponseElement([void updates(AdArrayResponseElementBuilder b)]) = _$AdArrayResponseElement;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdArrayResponseElementBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdArrayResponseElement> get serializer => _$AdArrayResponseElementSerializer();
}

class _$AdArrayResponseElementSerializer implements PrimitiveSerializer<AdArrayResponseElement> {
  @override
  final Iterable<Type> types = const [AdArrayResponseElement, _$AdArrayResponseElement];

  @override
  final String wireName = r'AdArrayResponseElement';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdArrayResponseElement object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(AdResponse),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(Exception),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdArrayResponseElement object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdArrayResponseElementBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdResponse),
          ) as AdResponse;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Exception),
          ) as Exception;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdArrayResponseElement deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdArrayResponseElementBuilder();
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

