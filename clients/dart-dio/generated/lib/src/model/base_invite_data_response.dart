//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_access_user_summary.dart';
import 'package:openapi/src/model/invite_data_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'base_invite_data_response.g.dart';

/// Common invite/request data returned by the business access endpoints.
///
/// Properties:
/// * [id] - Unique identifier of the invite/request.
/// * [inviteData] 
/// * [isReceivedInvite] - Indicates whether the invite/request was received.
/// * [user] - Metadata for the member/partner that was sent the invite/request.
@BuiltValue()
abstract class BaseInviteDataResponse implements Built<BaseInviteDataResponse, BaseInviteDataResponseBuilder> {
  /// Unique identifier of the invite/request.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'invite_data')
  InviteDataResponse? get inviteData;

  /// Indicates whether the invite/request was received.
  @BuiltValueField(wireName: r'is_received_invite')
  bool? get isReceivedInvite;

  /// Metadata for the member/partner that was sent the invite/request.
  @BuiltValueField(wireName: r'user')
  BusinessAccessUserSummary? get user;

  BaseInviteDataResponse._();

  factory BaseInviteDataResponse([void updates(BaseInviteDataResponseBuilder b)]) = _$BaseInviteDataResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BaseInviteDataResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BaseInviteDataResponse> get serializer => _$BaseInviteDataResponseSerializer();
}

class _$BaseInviteDataResponseSerializer implements PrimitiveSerializer<BaseInviteDataResponse> {
  @override
  final Iterable<Type> types = const [BaseInviteDataResponse, _$BaseInviteDataResponse];

  @override
  final String wireName = r'BaseInviteDataResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BaseInviteDataResponse object, {
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
        specifiedType: const FullType(BusinessAccessUserSummary),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BaseInviteDataResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BaseInviteDataResponseBuilder result,
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
            specifiedType: const FullType.nullable(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary?;
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
  BaseInviteDataResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BaseInviteDataResponseBuilder();
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

