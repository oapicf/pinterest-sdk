//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/image_size.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'image_metadata.g.dart';

/// ImageMetadata
///
/// Properties:
/// * [description] 
/// * [images] 
/// * [itemType] 
/// * [link] 
/// * [title] 
@BuiltValue()
abstract class ImageMetadata implements Built<ImageMetadata, ImageMetadataBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'images')
  ImageSize? get images;

  @BuiltValueField(wireName: r'item_type')
  String? get itemType;

  @BuiltValueField(wireName: r'link')
  String? get link;

  @BuiltValueField(wireName: r'title')
  String? get title;

  ImageMetadata._();

  factory ImageMetadata([void updates(ImageMetadataBuilder b)]) = _$ImageMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ImageMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ImageMetadata> get serializer => _$ImageMetadataSerializer();
}

class _$ImageMetadataSerializer implements PrimitiveSerializer<ImageMetadata> {
  @override
  final Iterable<Type> types = const [ImageMetadata, _$ImageMetadata];

  @override
  final String wireName = r'ImageMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ImageMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.images != null) {
      yield r'images';
      yield serializers.serialize(
        object.images,
        specifiedType: const FullType(ImageSize),
      );
    }
    if (object.itemType != null) {
      yield r'item_type';
      yield serializers.serialize(
        object.itemType,
        specifiedType: const FullType(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ImageMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ImageMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'images':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ImageSize),
          ) as ImageSize;
          result.images.replace(valueDes);
          break;
        case r'item_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemType = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  ImageMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ImageMetadataBuilder();
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

