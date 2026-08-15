//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/catalogs_feed_processing_result.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'feed_processing_results_list200_response.g.dart';

/// FeedProcessingResultsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class FeedProcessingResultsList200Response implements Paginated, Built<FeedProcessingResultsList200Response, FeedProcessingResultsList200ResponseBuilder> {
  FeedProcessingResultsList200Response._();

  factory FeedProcessingResultsList200Response([void updates(FeedProcessingResultsList200ResponseBuilder b)]) = _$FeedProcessingResultsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FeedProcessingResultsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FeedProcessingResultsList200Response> get serializer => _$FeedProcessingResultsList200ResponseSerializer();
}

class _$FeedProcessingResultsList200ResponseSerializer implements PrimitiveSerializer<FeedProcessingResultsList200Response> {
  @override
  final Iterable<Type> types = const [FeedProcessingResultsList200Response, _$FeedProcessingResultsList200Response];

  @override
  final String wireName = r'FeedProcessingResultsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FeedProcessingResultsList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    FeedProcessingResultsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FeedProcessingResultsList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
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
  FeedProcessingResultsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FeedProcessingResultsList200ResponseBuilder();
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

