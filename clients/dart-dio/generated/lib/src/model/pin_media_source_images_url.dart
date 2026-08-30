//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin_media_source_images_url_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_images_url.g.dart';

/// Multiple URL-based images media source
///
/// Properties:
/// * [index] 
/// * [items] - Array with image objects.
/// * [sourceType] - The source type of the media.
@BuiltValue()
abstract class PinMediaSourceImagesURL implements Built<PinMediaSourceImagesURL, PinMediaSourceImagesURLBuilder> {
  @BuiltValueField(wireName: r'index')
  int? get index;

  /// Array with image objects.
  @BuiltValueField(wireName: r'items')
  BuiltList<PinMediaSourceImagesURLItem> get items;

  /// The source type of the media.
  @BuiltValueField(wireName: r'source_type')
  PinMediaSourceImagesURLSourceTypeEnum get sourceType;
  // enum sourceTypeEnum {  multiple_image_urls,  };

  PinMediaSourceImagesURL._();

  factory PinMediaSourceImagesURL([void updates(PinMediaSourceImagesURLBuilder b)]) = _$PinMediaSourceImagesURL;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceImagesURLBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourceImagesURL> get serializer => _$PinMediaSourceImagesURLSerializer();
}

class _$PinMediaSourceImagesURLSerializer implements PrimitiveSerializer<PinMediaSourceImagesURL> {
  @override
  final Iterable<Type> types = const [PinMediaSourceImagesURL, _$PinMediaSourceImagesURL];

  @override
  final String wireName = r'PinMediaSourceImagesURL';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourceImagesURL object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.index != null) {
      yield r'index';
      yield serializers.serialize(
        object.index,
        specifiedType: const FullType(int),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(PinMediaSourceImagesURLItem)]),
    );
    yield r'source_type';
    yield serializers.serialize(
      object.sourceType,
      specifiedType: const FullType(PinMediaSourceImagesURLSourceTypeEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourceImagesURL object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourceImagesURLBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.index = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PinMediaSourceImagesURLItem)]),
          ) as BuiltList<PinMediaSourceImagesURLItem>;
          result.items.replace(valueDes);
          break;
        case r'source_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaSourceImagesURLSourceTypeEnum),
          ) as PinMediaSourceImagesURLSourceTypeEnum;
          result.sourceType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinMediaSourceImagesURL deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceImagesURLBuilder();
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

class PinMediaSourceImagesURLSourceTypeEnum extends EnumClass {

  /// The source type of the media.
  @BuiltValueEnumConst(wireName: r'multiple_image_urls')
  static const PinMediaSourceImagesURLSourceTypeEnum multipleImageUrls = _$pinMediaSourceImagesURLSourceTypeEnum_multipleImageUrls;

  static Serializer<PinMediaSourceImagesURLSourceTypeEnum> get serializer => _$pinMediaSourceImagesURLSourceTypeEnumSerializer;

  const PinMediaSourceImagesURLSourceTypeEnum._(String name): super(name);

  static BuiltSet<PinMediaSourceImagesURLSourceTypeEnum> get values => _$pinMediaSourceImagesURLSourceTypeEnumValues;
  static PinMediaSourceImagesURLSourceTypeEnum valueOf(String name) => _$pinMediaSourceImagesURLSourceTypeEnumValueOf(name);
}

