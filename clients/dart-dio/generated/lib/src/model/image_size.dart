//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/image_details.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'image_size.g.dart';

/// ImageSize
///
/// Properties:
/// * [n1200x] 
/// * [n150x150] 
/// * [n400x300] 
/// * [n600x] 
@BuiltValue()
abstract class ImageSize implements Built<ImageSize, ImageSizeBuilder> {
  @BuiltValueField(wireName: r'1200x')
  ImageDetails? get n1200x;

  @BuiltValueField(wireName: r'150x150')
  ImageDetails? get n150x150;

  @BuiltValueField(wireName: r'400x300')
  ImageDetails? get n400x300;

  @BuiltValueField(wireName: r'600x')
  ImageDetails? get n600x;

  ImageSize._();

  factory ImageSize([void updates(ImageSizeBuilder b)]) = _$ImageSize;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ImageSizeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ImageSize> get serializer => _$ImageSizeSerializer();
}

class _$ImageSizeSerializer implements PrimitiveSerializer<ImageSize> {
  @override
  final Iterable<Type> types = const [ImageSize, _$ImageSize];

  @override
  final String wireName = r'ImageSize';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ImageSize object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.n1200x != null) {
      yield r'1200x';
      yield serializers.serialize(
        object.n1200x,
        specifiedType: const FullType(ImageDetails),
      );
    }
    if (object.n150x150 != null) {
      yield r'150x150';
      yield serializers.serialize(
        object.n150x150,
        specifiedType: const FullType(ImageDetails),
      );
    }
    if (object.n400x300 != null) {
      yield r'400x300';
      yield serializers.serialize(
        object.n400x300,
        specifiedType: const FullType(ImageDetails),
      );
    }
    if (object.n600x != null) {
      yield r'600x';
      yield serializers.serialize(
        object.n600x,
        specifiedType: const FullType(ImageDetails),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ImageSize object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ImageSizeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'1200x':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ImageDetails),
          ) as ImageDetails?;
          if (valueDes == null) continue;
          result.n1200x.replace(valueDes);
          break;
        case r'150x150':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ImageDetails),
          ) as ImageDetails?;
          if (valueDes == null) continue;
          result.n150x150.replace(valueDes);
          break;
        case r'400x300':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ImageDetails),
          ) as ImageDetails?;
          if (valueDes == null) continue;
          result.n400x300.replace(valueDes);
          break;
        case r'600x':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ImageDetails),
          ) as ImageDetails?;
          if (valueDes == null) continue;
          result.n600x.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ImageSize deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ImageSizeBuilder();
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

