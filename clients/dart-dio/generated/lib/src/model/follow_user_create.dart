//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'follow_user_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [autoFollow] -   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
@BuiltValue()
abstract class FollowUserCreate implements Built<FollowUserCreate, FollowUserCreateBuilder> {
  ///   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
  @BuiltValueField(wireName: r'auto_follow')
  bool? get autoFollow;

  FollowUserCreate._();

  factory FollowUserCreate([void updates(FollowUserCreateBuilder b)]) = _$FollowUserCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FollowUserCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FollowUserCreate> get serializer => _$FollowUserCreateSerializer();
}

class _$FollowUserCreateSerializer implements PrimitiveSerializer<FollowUserCreate> {
  @override
  final Iterable<Type> types = const [FollowUserCreate, _$FollowUserCreate];

  @override
  final String wireName = r'FollowUserCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FollowUserCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.autoFollow != null) {
      yield r'auto_follow';
      yield serializers.serialize(
        object.autoFollow,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FollowUserCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FollowUserCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auto_follow':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.autoFollow = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FollowUserCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FollowUserCreateBuilder();
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

