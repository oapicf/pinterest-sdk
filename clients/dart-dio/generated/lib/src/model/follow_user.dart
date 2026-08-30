//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'follow_user.g.dart';

/// FollowUser
///
/// Properties:
/// * [type] - Always 'user'
/// * [username] - Username
@BuiltValue()
abstract class FollowUser implements Built<FollowUser, FollowUserBuilder> {
  /// Always 'user'
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Username
  @BuiltValueField(wireName: r'username')
  String? get username;

  FollowUser._();

  factory FollowUser([void updates(FollowUserBuilder b)]) = _$FollowUser;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FollowUserBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FollowUser> get serializer => _$FollowUserSerializer();
}

class _$FollowUserSerializer implements PrimitiveSerializer<FollowUser> {
  @override
  final Iterable<Type> types = const [FollowUser, _$FollowUser];

  @override
  final String wireName = r'FollowUser';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FollowUser object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
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
    FollowUser object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FollowUserBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
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
  FollowUser deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FollowUserBuilder();
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

