//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/user_website.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_websites_get200_response.g.dart';

/// UserWebsitesGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class UserWebsitesGet200Response implements Built<UserWebsitesGet200Response, UserWebsitesGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<UserWebsite> get items;

  UserWebsitesGet200Response._();

  factory UserWebsitesGet200Response([void updates(UserWebsitesGet200ResponseBuilder b)]) = _$UserWebsitesGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserWebsitesGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserWebsitesGet200Response> get serializer => _$UserWebsitesGet200ResponseSerializer();
}

class _$UserWebsitesGet200ResponseSerializer implements PrimitiveSerializer<UserWebsitesGet200Response> {
  @override
  final Iterable<Type> types = const [UserWebsitesGet200Response, _$UserWebsitesGet200Response];

  @override
  final String wireName = r'UserWebsitesGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserWebsitesGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(UserWebsite)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UserWebsitesGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserWebsitesGet200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(UserWebsite)]),
          ) as BuiltList<UserWebsite>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UserWebsitesGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserWebsitesGet200ResponseBuilder();
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

