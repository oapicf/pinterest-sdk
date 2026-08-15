//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_media_source_images_url_item.g.dart';

/// PinMediaSourceImagesURLItem
///
/// Properties:
/// * [description] 
/// * [link] 
/// * [title] 
/// * [url] 
@BuiltValue()
abstract class PinMediaSourceImagesURLItem implements Built<PinMediaSourceImagesURLItem, PinMediaSourceImagesURLItemBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'link')
  String? get link;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'url')
  String get url;

  PinMediaSourceImagesURLItem._();

  factory PinMediaSourceImagesURLItem([void updates(PinMediaSourceImagesURLItemBuilder b)]) = _$PinMediaSourceImagesURLItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinMediaSourceImagesURLItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinMediaSourceImagesURLItem> get serializer => _$PinMediaSourceImagesURLItemSerializer();
}

class _$PinMediaSourceImagesURLItemSerializer implements PrimitiveSerializer<PinMediaSourceImagesURLItem> {
  @override
  final Iterable<Type> types = const [PinMediaSourceImagesURLItem, _$PinMediaSourceImagesURLItem];

  @override
  final String wireName = r'PinMediaSourceImagesURLItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinMediaSourceImagesURLItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinMediaSourceImagesURLItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinMediaSourceImagesURLItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinMediaSourceImagesURLItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinMediaSourceImagesURLItemBuilder();
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

