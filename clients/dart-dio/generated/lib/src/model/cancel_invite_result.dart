//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/cancel_invite_result_user.dart';
import 'package:openapi/src/model/invite_data_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'cancel_invite_result.g.dart';

/// CancelInviteResult
///
/// Properties:
/// * [id] 
/// * [inviteData] 
/// * [isReceivedInvite] 
/// * [user] 
@BuiltValue()
abstract class CancelInviteResult implements Built<CancelInviteResult, CancelInviteResultBuilder> {
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'invite_data')
  InviteDataResponse? get inviteData;

  @BuiltValueField(wireName: r'is_received_invite')
  bool? get isReceivedInvite;

  @BuiltValueField(wireName: r'user')
  CancelInviteResultUser? get user;

  CancelInviteResult._();

  factory CancelInviteResult([void updates(CancelInviteResultBuilder b)]) = _$CancelInviteResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CancelInviteResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CancelInviteResult> get serializer => _$CancelInviteResultSerializer();
}

class _$CancelInviteResultSerializer implements PrimitiveSerializer<CancelInviteResult> {
  @override
  final Iterable<Type> types = const [CancelInviteResult, _$CancelInviteResult];

  @override
  final String wireName = r'CancelInviteResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CancelInviteResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.inviteData != null) {
      yield r'invite_data';
      yield serializers.serialize(
        object.inviteData,
        specifiedType: const FullType(InviteDataResponse),
      );
    }
    if (object.isReceivedInvite != null) {
      yield r'is_received_invite';
      yield serializers.serialize(
        object.isReceivedInvite,
        specifiedType: const FullType(bool),
      );
    }
    if (object.user != null) {
      yield r'user';
      yield serializers.serialize(
        object.user,
        specifiedType: const FullType(CancelInviteResultUser),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CancelInviteResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CancelInviteResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'invite_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(InviteDataResponse),
          ) as InviteDataResponse?;
          if (valueDes == null) continue;
          result.inviteData.replace(valueDes);
          break;
        case r'is_received_invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isReceivedInvite = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CancelInviteResultUser),
          ) as CancelInviteResultUser?;
          if (valueDes == null) continue;
          result.user.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CancelInviteResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CancelInviteResultBuilder();
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

