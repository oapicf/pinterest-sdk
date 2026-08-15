//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_tag.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_list_response.g.dart';

/// ConversionTagListResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class ConversionTagListResponse implements Built<ConversionTagListResponse, ConversionTagListResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<ConversionTag>? get items;

  ConversionTagListResponse._();

  factory ConversionTagListResponse([void updates(ConversionTagListResponseBuilder b)]) = _$ConversionTagListResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionTagListResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTagListResponse> get serializer => _$ConversionTagListResponseSerializer();
}

class _$ConversionTagListResponseSerializer implements PrimitiveSerializer<ConversionTagListResponse> {
  @override
  final Iterable<Type> types = const [ConversionTagListResponse, _$ConversionTagListResponse];

  @override
  final String wireName = r'ConversionTagListResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTagListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(ConversionTag)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionTagListResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagListResponseBuilder result,
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
  ConversionTagListResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionTagListResponseBuilder();
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

