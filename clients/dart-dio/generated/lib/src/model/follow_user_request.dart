//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'follow_user_request.g.dart';

/// FollowUserRequest
///
/// Properties:
/// * [autoFollow] - Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
@BuiltValue()
abstract class FollowUserRequest implements Built<FollowUserRequest, FollowUserRequestBuilder> {
  /// Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
  @BuiltValueField(wireName: r'auto_follow')
  bool? get autoFollow;

  FollowUserRequest._();

  factory FollowUserRequest([void updates(FollowUserRequestBuilder b)]) = _$FollowUserRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FollowUserRequestBuilder b) => b
      ..autoFollow = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<FollowUserRequest> get serializer => _$FollowUserRequestSerializer();
}

class _$FollowUserRequestSerializer implements PrimitiveSerializer<FollowUserRequest> {
  @override
  final Iterable<Type> types = const [FollowUserRequest, _$FollowUserRequest];

  @override
  final String wireName = r'FollowUserRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FollowUserRequest object, {
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
    FollowUserRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FollowUserRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auto_follow':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
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
  FollowUserRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FollowUserRequestBuilder();
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

