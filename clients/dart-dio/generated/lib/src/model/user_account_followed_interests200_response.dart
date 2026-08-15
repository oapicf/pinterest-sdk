//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/interest.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_account_followed_interests200_response.g.dart';

/// UserAccountFollowedInterests200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class UserAccountFollowedInterests200Response implements Paginated, Built<UserAccountFollowedInterests200Response, UserAccountFollowedInterests200ResponseBuilder> {
  UserAccountFollowedInterests200Response._();

  factory UserAccountFollowedInterests200Response([void updates(UserAccountFollowedInterests200ResponseBuilder b)]) = _$UserAccountFollowedInterests200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserAccountFollowedInterests200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserAccountFollowedInterests200Response> get serializer => _$UserAccountFollowedInterests200ResponseSerializer();
}

class _$UserAccountFollowedInterests200ResponseSerializer implements PrimitiveSerializer<UserAccountFollowedInterests200Response> {
  @override
  final Iterable<Type> types = const [UserAccountFollowedInterests200Response, _$UserAccountFollowedInterests200Response];

  @override
  final String wireName = r'UserAccountFollowedInterests200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserAccountFollowedInterests200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    UserAccountFollowedInterests200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserAccountFollowedInterests200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
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
  UserAccountFollowedInterests200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserAccountFollowedInterests200ResponseBuilder();
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

