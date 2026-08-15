//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/exception.dart';
import 'package:openapi/src/model/ad_group_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_array_response_element.g.dart';

/// AdGroupArrayResponseElement
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class AdGroupArrayResponseElement implements Built<AdGroupArrayResponseElement, AdGroupArrayResponseElementBuilder> {
  @BuiltValueField(wireName: r'data')
  AdGroupResponse? get data;

  @BuiltValueField(wireName: r'exceptions')
  BuiltList<Exception>? get exceptions;

  AdGroupArrayResponseElement._();

  factory AdGroupArrayResponseElement([void updates(AdGroupArrayResponseElementBuilder b)]) = _$AdGroupArrayResponseElement;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupArrayResponseElementBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupArrayResponseElement> get serializer => _$AdGroupArrayResponseElementSerializer();
}

class _$AdGroupArrayResponseElementSerializer implements PrimitiveSerializer<AdGroupArrayResponseElement> {
  @override
  final Iterable<Type> types = const [AdGroupArrayResponseElement, _$AdGroupArrayResponseElement];

  @override
  final String wireName = r'AdGroupArrayResponseElement';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupArrayResponseElement object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(AdGroupResponse),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(Exception)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupArrayResponseElement object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupArrayResponseElementBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdGroupResponse),
          ) as AdGroupResponse;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Exception)]),
          ) as BuiltList<Exception>;
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
  AdGroupArrayResponseElement deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupArrayResponseElementBuilder();
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

