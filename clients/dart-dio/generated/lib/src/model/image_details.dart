//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'image_details.g.dart';

/// ImageDetails
///
/// Properties:
/// * [height] 
/// * [url] 
/// * [width] 
@BuiltValue()
abstract class ImageDetails implements Built<ImageDetails, ImageDetailsBuilder> {
  @BuiltValueField(wireName: r'height')
  int? get height;

  @BuiltValueField(wireName: r'url')
  String get url;

  @BuiltValueField(wireName: r'width')
  int? get width;

  ImageDetails._();

  factory ImageDetails([void updates(ImageDetailsBuilder b)]) = _$ImageDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ImageDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ImageDetails> get serializer => _$ImageDetailsSerializer();
}

class _$ImageDetailsSerializer implements PrimitiveSerializer<ImageDetails> {
  @override
  final Iterable<Type> types = const [ImageDetails, _$ImageDetails];

  @override
  final String wireName = r'ImageDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ImageDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'height';
    yield object.height == null ? null : serializers.serialize(
      object.height,
      specifiedType: const FullType.nullable(int),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
    yield r'width';
    yield object.width == null ? null : serializers.serialize(
      object.width,
      specifiedType: const FullType.nullable(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ImageDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ImageDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'height':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.height = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        case r'width':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.width = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ImageDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ImageDetailsBuilder();
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

