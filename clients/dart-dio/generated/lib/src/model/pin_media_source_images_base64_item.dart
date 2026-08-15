//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/content_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_images_base64_item.g.dart';

/// PinMediaSourceImagesBase64Item
///
/// Properties:
/// * [contentType] 
/// * [data] 
/// * [description] 
/// * [link] 
/// * [title] 
@BuiltValue()
abstract class PinMediaSourceImagesBase64Item implements Built<PinMediaSourceImagesBase64Item, PinMediaSourceImagesBase64ItemBuilder> {
  @BuiltValueField(wireName: r'content_type')
  ContentType get contentType;
  // enum contentTypeEnum {  image/jpeg,  image/png,  };

  @BuiltValueField(wireName: r'data')
  String get data;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'link')
  String? get link;

  @BuiltValueField(wireName: r'title')
  String? get title;

  PinMediaSourceImagesBase64Item._();

  factory PinMediaSourceImagesBase64Item([void updates(PinMediaSourceImagesBase64ItemBuilder b)]) = _$PinMediaSourceImagesBase64Item;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceImagesBase64ItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourceImagesBase64Item> get serializer => _$PinMediaSourceImagesBase64ItemSerializer();
}

class _$PinMediaSourceImagesBase64ItemSerializer implements PrimitiveSerializer<PinMediaSourceImagesBase64Item> {
  @override
  final Iterable<Type> types = const [PinMediaSourceImagesBase64Item, _$PinMediaSourceImagesBase64Item];

  @override
  final String wireName = r'PinMediaSourceImagesBase64Item';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourceImagesBase64Item object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'content_type';
    yield serializers.serialize(
      object.contentType,
      specifiedType: const FullType(ContentType),
    );
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(String),
    );
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourceImagesBase64Item object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourceImagesBase64ItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ContentType),
          ) as ContentType;
          result.contentType = valueDes;
          break;
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.data = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.link = valueDes;
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
  PinMediaSourceImagesBase64Item deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceImagesBase64ItemBuilder();
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

