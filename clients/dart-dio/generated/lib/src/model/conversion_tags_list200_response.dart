//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_tag.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tags_list200_response.g.dart';

/// ConversionTagsList200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class ConversionTagsList200Response implements Built<ConversionTagsList200Response, ConversionTagsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<ConversionTag> get items;

  ConversionTagsList200Response._();

  factory ConversionTagsList200Response([void updates(ConversionTagsList200ResponseBuilder b)]) = _$ConversionTagsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionTagsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTagsList200Response> get serializer => _$ConversionTagsList200ResponseSerializer();
}

class _$ConversionTagsList200ResponseSerializer implements PrimitiveSerializer<ConversionTagsList200Response> {
  @override
  final Iterable<Type> types = const [ConversionTagsList200Response, _$ConversionTagsList200Response];

  @override
  final String wireName = r'ConversionTagsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTagsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(ConversionTag)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionTagsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagsList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ConversionTag)]),
          ) as BuiltList<ConversionTag>;
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
  ConversionTagsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionTagsList200ResponseBuilder();
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

