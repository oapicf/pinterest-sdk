//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_summary.g.dart';

/// UserSummary
///
/// Properties:
/// * [type] - Always \"user\"
/// * [username] - Username
@BuiltValue()
abstract class UserSummary implements Built<UserSummary, UserSummaryBuilder> {
  /// Always \"user\"
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Username
  @BuiltValueField(wireName: r'username')
  String? get username;

  UserSummary._();

  factory UserSummary([void updates(UserSummaryBuilder b)]) = _$UserSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UserSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UserSummary> get serializer => _$UserSummarySerializer();
}

class _$UserSummarySerializer implements PrimitiveSerializer<UserSummary> {
  @override
  final Iterable<Type> types = const [UserSummary, _$UserSummary];

  @override
  final String wireName = r'UserSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UserSummary object, {
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
    UserSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UserSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  UserSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UserSummaryBuilder();
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

