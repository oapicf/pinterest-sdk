//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_media.g.dart';

/// BoardMedia
///
/// Properties:
/// * [imageCoverUrl] - Board cover image
/// * [pinThumbnailUrls] - Board pin thumbnail urls.
@BuiltValue()
abstract class BoardMedia implements Built<BoardMedia, BoardMediaBuilder> {
  /// Board cover image
  @BuiltValueField(wireName: r'image_cover_url')
  String? get imageCoverUrl;

  /// Board pin thumbnail urls.
  @BuiltValueField(wireName: r'pin_thumbnail_urls')
  BuiltList<String>? get pinThumbnailUrls;

  BoardMedia._();

  factory BoardMedia([void updates(BoardMediaBuilder b)]) = _$BoardMedia;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardMediaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardMedia> get serializer => _$BoardMediaSerializer();
}

class _$BoardMediaSerializer implements PrimitiveSerializer<BoardMedia> {
  @override
  final Iterable<Type> types = const [BoardMedia, _$BoardMedia];

  @override
  final String wireName = r'BoardMedia';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardMedia object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.imageCoverUrl != null) {
      yield r'image_cover_url';
      yield serializers.serialize(
        object.imageCoverUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.pinThumbnailUrls != null) {
      yield r'pin_thumbnail_urls';
      yield serializers.serialize(
        object.pinThumbnailUrls,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardMedia object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardMediaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'image_cover_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.imageCoverUrl = valueDes;
          break;
        case r'pin_thumbnail_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.pinThumbnailUrls.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BoardMedia deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardMediaBuilder();
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

