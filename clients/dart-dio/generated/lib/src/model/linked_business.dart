//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'linked_business.g.dart';

/// LinkedBusiness
///
/// Properties:
/// * [imageLargeUrl] - image_large_url
/// * [imageMediumUrl] - image_medium_url
/// * [imageSmallUrl] - image_small_url
/// * [imageXlargeUrl] - image_xlarge_url
/// * [username] - Username
@BuiltValue()
abstract class LinkedBusiness implements Built<LinkedBusiness, LinkedBusinessBuilder> {
  /// image_large_url
  @BuiltValueField(wireName: r'image_large_url')
  String? get imageLargeUrl;

  /// image_medium_url
  @BuiltValueField(wireName: r'image_medium_url')
  String? get imageMediumUrl;

  /// image_small_url
  @BuiltValueField(wireName: r'image_small_url')
  String? get imageSmallUrl;

  /// image_xlarge_url
  @BuiltValueField(wireName: r'image_xlarge_url')
  String? get imageXlargeUrl;

  /// Username
  @BuiltValueField(wireName: r'username')
  String? get username;

  LinkedBusiness._();

  factory LinkedBusiness([void updates(LinkedBusinessBuilder b)]) = _$LinkedBusiness;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LinkedBusinessBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LinkedBusiness> get serializer => _$LinkedBusinessSerializer();
}

class _$LinkedBusinessSerializer implements PrimitiveSerializer<LinkedBusiness> {
  @override
  final Iterable<Type> types = const [LinkedBusiness, _$LinkedBusiness];

  @override
  final String wireName = r'LinkedBusiness';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LinkedBusiness object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.imageLargeUrl != null) {
      yield r'image_large_url';
      yield serializers.serialize(
        object.imageLargeUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.imageMediumUrl != null) {
      yield r'image_medium_url';
      yield serializers.serialize(
        object.imageMediumUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.imageSmallUrl != null) {
      yield r'image_small_url';
      yield serializers.serialize(
        object.imageSmallUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.imageXlargeUrl != null) {
      yield r'image_xlarge_url';
      yield serializers.serialize(
        object.imageXlargeUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LinkedBusiness object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LinkedBusinessBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'image_large_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.imageLargeUrl = valueDes;
          break;
        case r'image_medium_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.imageMediumUrl = valueDes;
          break;
        case r'image_small_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.imageSmallUrl = valueDes;
          break;
        case r'image_xlarge_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.imageXlargeUrl = valueDes;
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.username = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LinkedBusiness deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LinkedBusinessBuilder();
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

