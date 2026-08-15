//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'base_invite_data_response_invite_data.g.dart';

/// Metadata for the invite/request.
///
/// Properties:
/// * [inviteExpiration] - The date and time when the invite/request will expire. Returned in milliseconds.
/// * [inviteStatus] - The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
/// * [inviteType] - The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
/// * [lastUpdatedTime] - The date and time the invite/request was last updated. Returned in milliseconds.
/// * [sentAt] - The date and time the invite/request was sent/created. Returned in milliseconds.
@BuiltValue()
abstract class BaseInviteDataResponseInviteData implements Built<BaseInviteDataResponseInviteData, BaseInviteDataResponseInviteDataBuilder> {
  /// The date and time when the invite/request will expire. Returned in milliseconds.
  @BuiltValueField(wireName: r'invite_expiration')
  int? get inviteExpiration;

  /// The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
  @BuiltValueField(wireName: r'invite_status')
  String? get inviteStatus;

  /// The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
  @BuiltValueField(wireName: r'invite_type')
  String? get inviteType;

  /// The date and time the invite/request was last updated. Returned in milliseconds.
  @BuiltValueField(wireName: r'last_updated_time')
  int? get lastUpdatedTime;

  /// The date and time the invite/request was sent/created. Returned in milliseconds.
  @BuiltValueField(wireName: r'sent_at')
  int? get sentAt;

  BaseInviteDataResponseInviteData._();

  factory BaseInviteDataResponseInviteData([void updates(BaseInviteDataResponseInviteDataBuilder b)]) = _$BaseInviteDataResponseInviteData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BaseInviteDataResponseInviteDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BaseInviteDataResponseInviteData> get serializer => _$BaseInviteDataResponseInviteDataSerializer();
}

class _$BaseInviteDataResponseInviteDataSerializer implements PrimitiveSerializer<BaseInviteDataResponseInviteData> {
  @override
  final Iterable<Type> types = const [BaseInviteDataResponseInviteData, _$BaseInviteDataResponseInviteData];

  @override
  final String wireName = r'BaseInviteDataResponseInviteData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BaseInviteDataResponseInviteData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.inviteExpiration != null) {
      yield r'invite_expiration';
      yield serializers.serialize(
        object.inviteExpiration,
        specifiedType: const FullType(int),
      );
    }
    if (object.inviteStatus != null) {
      yield r'invite_status';
      yield serializers.serialize(
        object.inviteStatus,
        specifiedType: const FullType(String),
      );
    }
    if (object.inviteType != null) {
      yield r'invite_type';
      yield serializers.serialize(
        object.inviteType,
        specifiedType: const FullType(String),
      );
    }
    if (object.lastUpdatedTime != null) {
      yield r'last_updated_time';
      yield serializers.serialize(
        object.lastUpdatedTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.sentAt != null) {
      yield r'sent_at';
      yield serializers.serialize(
        object.sentAt,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BaseInviteDataResponseInviteData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BaseInviteDataResponseInviteDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'invite_expiration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.inviteExpiration = valueDes;
          break;
        case r'invite_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inviteStatus = valueDes;
          break;
        case r'invite_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.inviteType = valueDes;
          break;
        case r'last_updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lastUpdatedTime = valueDes;
          break;
        case r'sent_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.sentAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BaseInviteDataResponseInviteData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BaseInviteDataResponseInviteDataBuilder();
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

