//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_main_image.g.dart';

/// The main hotel image
///
/// Properties:
/// * [link] - <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
/// * [tag] - Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
@BuiltValue()
abstract class CatalogsHotelMainImage implements Built<CatalogsHotelMainImage, CatalogsHotelMainImageBuilder> {
  /// <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
  @BuiltValueField(wireName: r'link')
  String? get link;

  /// Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
  @BuiltValueField(wireName: r'tag')
  BuiltList<String>? get tag;

  CatalogsHotelMainImage._();

  factory CatalogsHotelMainImage([void updates(CatalogsHotelMainImageBuilder b)]) = _$CatalogsHotelMainImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelMainImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelMainImage> get serializer => _$CatalogsHotelMainImageSerializer();
}

class _$CatalogsHotelMainImageSerializer implements PrimitiveSerializer<CatalogsHotelMainImage> {
  @override
  final Iterable<Type> types = const [CatalogsHotelMainImage, _$CatalogsHotelMainImage];

  @override
  final String wireName = r'CatalogsHotelMainImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelMainImage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType(String),
      );
    }
    if (object.tag != null) {
      yield r'tag';
      yield serializers.serialize(
        object.tag,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelMainImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelMainImageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        case r'tag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.tag.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelMainImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelMainImageBuilder();
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

