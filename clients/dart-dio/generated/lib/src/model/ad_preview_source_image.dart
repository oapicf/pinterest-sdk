//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_preview_source_image.g.dart';

/// Ad preview source from an image URL.
///
/// Properties:
/// * [imageUrl] - Image URL.
/// * [promotionId] - Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
/// * [title] - Title displayed below ad.
@BuiltValue()
abstract class AdPreviewSourceImage implements Built<AdPreviewSourceImage, AdPreviewSourceImageBuilder> {
  /// Image URL.
  @BuiltValueField(wireName: r'image_url')
  String get imageUrl;

  /// Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  @BuiltValueField(wireName: r'promotion_id')
  String? get promotionId;

  /// Title displayed below ad.
  @BuiltValueField(wireName: r'title')
  String get title;

  AdPreviewSourceImage._();

  factory AdPreviewSourceImage([void updates(AdPreviewSourceImageBuilder b)]) = _$AdPreviewSourceImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPreviewSourceImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPreviewSourceImage> get serializer => _$AdPreviewSourceImageSerializer();
}

class _$AdPreviewSourceImageSerializer implements PrimitiveSerializer<AdPreviewSourceImage> {
  @override
  final Iterable<Type> types = const [AdPreviewSourceImage, _$AdPreviewSourceImage];

  @override
  final String wireName = r'AdPreviewSourceImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPreviewSourceImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'image_url';
    yield serializers.serialize(
      object.imageUrl,
      specifiedType: const FullType(String),
    );
    if (object.promotionId != null) {
      yield r'promotion_id';
      yield serializers.serialize(
        object.promotionId,
        specifiedType: const FullType(String),
      );
    }
    yield r'title';
    yield serializers.serialize(
      object.title,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPreviewSourceImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPreviewSourceImageBuilder result,
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
        case r'promotion_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.promotionId = valueDes;
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
  AdPreviewSourceImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPreviewSourceImageBuilder();
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

