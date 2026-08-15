//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/user_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_following_get200_response.g.dart';

/// UserFollowingGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] - Users
@BuiltValue()
abstract class UserFollowingGet200Response implements Paginated, Built<UserFollowingGet200Response, UserFollowingGet200ResponseBuilder> {
  UserFollowingGet200Response._();

  factory UserFollowingGet200Response([void updates(UserFollowingGet200ResponseBuilder b)]) = _$UserFollowingGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserFollowingGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserFollowingGet200Response> get serializer => _$UserFollowingGet200ResponseSerializer();
}

class _$UserFollowingGet200ResponseSerializer implements PrimitiveSerializer<UserFollowingGet200Response> {
  @override
  final Iterable<Type> types = const [UserFollowingGet200Response, _$UserFollowingGet200Response];

  @override
  final String wireName = r'UserFollowingGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserFollowingGet200Response object, {
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
    UserFollowingGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserFollowingGet200ResponseBuilder result,
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
  UserFollowingGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserFollowingGet200ResponseBuilder();
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

