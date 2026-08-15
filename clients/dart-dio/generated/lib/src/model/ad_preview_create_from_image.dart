//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_preview_create_from_image.g.dart';

/// AdPreviewCreateFromImage
///
/// Properties:
/// * [imageUrl] - Image URL.
/// * [title] - Title displayed below ad.
@BuiltValue()
abstract class AdPreviewCreateFromImage implements Built<AdPreviewCreateFromImage, AdPreviewCreateFromImageBuilder> {
  /// Image URL.
  @BuiltValueField(wireName: r'image_url')
  String get imageUrl;

  /// Title displayed below ad.
  @BuiltValueField(wireName: r'title')
  String get title;

  AdPreviewCreateFromImage._();

  factory AdPreviewCreateFromImage([void updates(AdPreviewCreateFromImageBuilder b)]) = _$AdPreviewCreateFromImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPreviewCreateFromImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPreviewCreateFromImage> get serializer => _$AdPreviewCreateFromImageSerializer();
}

class _$AdPreviewCreateFromImageSerializer implements PrimitiveSerializer<AdPreviewCreateFromImage> {
  @override
  final Iterable<Type> types = const [AdPreviewCreateFromImage, _$AdPreviewCreateFromImage];

  @override
  final String wireName = r'AdPreviewCreateFromImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPreviewCreateFromImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'image_url';
    yield serializers.serialize(
      object.imageUrl,
      specifiedType: const FullType(String),
    );
    yield r'title';
    yield serializers.serialize(
      object.title,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPreviewCreateFromImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPreviewCreateFromImageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.imageUrl = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.title = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdPreviewCreateFromImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPreviewCreateFromImageBuilder();
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

