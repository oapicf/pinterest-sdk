//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ad_array_response_element.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_array_response.g.dart';

/// AdArrayResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdArrayResponse implements Built<AdArrayResponse, AdArrayResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdArrayResponseElement>? get items;

  AdArrayResponse._();

  factory AdArrayResponse([void updates(AdArrayResponseBuilder b)]) = _$AdArrayResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdArrayResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdArrayResponse> get serializer => _$AdArrayResponseSerializer();
}

class _$AdArrayResponseSerializer implements PrimitiveSerializer<AdArrayResponse> {
  @override
  final Iterable<Type> types = const [AdArrayResponse, _$AdArrayResponse];

  @override
  final String wireName = r'AdArrayResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(AdArrayResponseElement)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdArrayResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdArrayResponseElement)]),
          ) as BuiltList<AdArrayResponseElement>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdArrayResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdArrayResponseBuilder();
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

