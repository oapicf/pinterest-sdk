//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/media.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media_list200_response.g.dart';

/// MediaList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class MediaList200Response implements Built<MediaList200Response, MediaList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<Media> get items;

  MediaList200Response._();

  factory MediaList200Response([void updates(MediaList200ResponseBuilder b)]) = _$MediaList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MediaList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MediaList200Response> get serializer => _$MediaList200ResponseSerializer();
}

class _$MediaList200ResponseSerializer implements PrimitiveSerializer<MediaList200Response> {
  @override
  final Iterable<Type> types = const [MediaList200Response, _$MediaList200Response];

  @override
  final String wireName = r'MediaList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MediaList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(Media)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MediaList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MediaList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(Media)]),
          ) as BuiltList<Media>;
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
  MediaList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MediaList200ResponseBuilder();
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

