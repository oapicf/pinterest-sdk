//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pins_list200_response.g.dart';

/// PinsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class PinsList200Response implements Built<PinsList200Response, PinsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<Pin> get items;

  PinsList200Response._();

  factory PinsList200Response([void updates(PinsList200ResponseBuilder b)]) = _$PinsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinsList200Response> get serializer => _$PinsList200ResponseSerializer();
}

class _$PinsList200ResponseSerializer implements PrimitiveSerializer<PinsList200Response> {
  @override
  final Iterable<Type> types = const [PinsList200Response, _$PinsList200Response];

  @override
  final String wireName = r'PinsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(Pin)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinsList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Pin)]),
          ) as BuiltList<Pin>;
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
  PinsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinsList200ResponseBuilder();
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

