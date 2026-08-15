//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_attributes_all_of_main_image.g.dart';

/// The main hotel image
///
/// Properties:
/// * [link] - <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
/// * [tag] - Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
@BuiltValue()
abstract class CatalogsHotelAttributesAllOfMainImage implements Built<CatalogsHotelAttributesAllOfMainImage, CatalogsHotelAttributesAllOfMainImageBuilder> {
  /// <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
  @BuiltValueField(wireName: r'link')
  String? get link;

  /// Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
  @BuiltValueField(wireName: r'tag')
  BuiltList<String>? get tag;

  CatalogsHotelAttributesAllOfMainImage._();

  factory CatalogsHotelAttributesAllOfMainImage([void updates(CatalogsHotelAttributesAllOfMainImageBuilder b)]) = _$CatalogsHotelAttributesAllOfMainImage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelAttributesAllOfMainImageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelAttributesAllOfMainImage> get serializer => _$CatalogsHotelAttributesAllOfMainImageSerializer();
}

class _$CatalogsHotelAttributesAllOfMainImageSerializer implements PrimitiveSerializer<CatalogsHotelAttributesAllOfMainImage> {
  @override
  final Iterable<Type> types = const [CatalogsHotelAttributesAllOfMainImage, _$CatalogsHotelAttributesAllOfMainImage];

  @override
  final String wireName = r'CatalogsHotelAttributesAllOfMainImage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelAttributesAllOfMainImage object, {
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
    CatalogsHotelAttributesAllOfMainImage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelAttributesAllOfMainImageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  CatalogsHotelAttributesAllOfMainImage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelAttributesAllOfMainImageBuilder();
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

