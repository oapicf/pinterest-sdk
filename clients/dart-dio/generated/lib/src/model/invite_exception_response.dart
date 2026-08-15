//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_exception_response.g.dart';

/// An exception object if there is an error performing the action. Will only be provided if there is an error.
///
/// Properties:
/// * [code] - Error code associated with the error in performing the action on the invite/request.
/// * [inviteOrRequestId] - Unique identifier of the invite/request.
/// * [message] - Error message associated with the error in performing the action on the invite/request.
/// * [usersOrPartnerIds] - A list of users' usernames or emails OR a list of partner ids that caused the error.
@BuiltValue()
abstract class InviteExceptionResponse implements Built<InviteExceptionResponse, InviteExceptionResponseBuilder> {
  /// Error code associated with the error in performing the action on the invite/request.
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// Unique identifier of the invite/request.
  @BuiltValueField(wireName: r'invite_or_request_id')
  String? get inviteOrRequestId;

  /// Error message associated with the error in performing the action on the invite/request.
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// A list of users' usernames or emails OR a list of partner ids that caused the error.
  @BuiltValueField(wireName: r'users_or_partner_ids')
  BuiltList<String>? get usersOrPartnerIds;

  InviteExceptionResponse._();

  factory InviteExceptionResponse([void updates(InviteExceptionResponseBuilder b)]) = _$InviteExceptionResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteExceptionResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteExceptionResponse> get serializer => _$InviteExceptionResponseSerializer();
}

class _$InviteExceptionResponseSerializer implements PrimitiveSerializer<InviteExceptionResponse> {
  @override
  final Iterable<Type> types = const [InviteExceptionResponse, _$InviteExceptionResponse];

  @override
  final String wireName = r'InviteExceptionResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteExceptionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    if (object.inviteOrRequestId != null) {
      yield r'invite_or_request_id';
      yield serializers.serialize(
        object.inviteOrRequestId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    if (object.usersOrPartnerIds != null) {
      yield r'users_or_partner_ids';
      yield serializers.serialize(
        object.usersOrPartnerIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteExceptionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteExceptionResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'invite_or_request_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.inviteOrRequestId = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'users_or_partner_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.usersOrPartnerIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InviteExceptionResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteExceptionResponseBuilder();
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

