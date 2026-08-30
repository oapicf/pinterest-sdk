//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_deletion_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_deletion_request_list200_response.g.dart';

/// ConversionDeletionRequestList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class ConversionDeletionRequestList200Response implements Built<ConversionDeletionRequestList200Response, ConversionDeletionRequestList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<ConversionDeletionRequest> get items;

  ConversionDeletionRequestList200Response._();

  factory ConversionDeletionRequestList200Response([void updates(ConversionDeletionRequestList200ResponseBuilder b)]) = _$ConversionDeletionRequestList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionDeletionRequestList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionDeletionRequestList200Response> get serializer => _$ConversionDeletionRequestList200ResponseSerializer();
}

class _$ConversionDeletionRequestList200ResponseSerializer implements PrimitiveSerializer<ConversionDeletionRequestList200Response> {
  @override
  final Iterable<Type> types = const [ConversionDeletionRequestList200Response, _$ConversionDeletionRequestList200Response];

  @override
  final String wireName = r'ConversionDeletionRequestList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionDeletionRequestList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(ConversionDeletionRequest)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionDeletionRequestList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionDeletionRequestList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(ConversionDeletionRequest)]),
          ) as BuiltList<ConversionDeletionRequest>;
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
  ConversionDeletionRequestList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionDeletionRequestList200ResponseBuilder();
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

