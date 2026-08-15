//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_invite_data_response_invite_data.dart';
import 'package:openapi/src/model/base_invite_data_response.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_business_role_binding.g.dart';

/// InviteBusinessRoleBinding
///
/// Properties:
/// * [id] - Unique identifier of the invite/request.
/// * [inviteData] 
/// * [isReceivedInvite] - Indicates whether the invite/request was received.
/// * [user] - Metadata for the user that updated the invite/request.
/// * [createdByBusinessId] - Unique identifier for the business that created the invite/request.
/// * [createdByUserId] - Unique identifier for the user that created the invite/request.
@BuiltValue()
abstract class InviteBusinessRoleBinding implements BaseInviteDataResponse, Built<InviteBusinessRoleBinding, InviteBusinessRoleBindingBuilder> {
  /// Unique identifier for the business that created the invite/request.
  @BuiltValueField(wireName: r'created_by_business_id')
  String? get createdByBusinessId;

  /// Unique identifier for the user that created the invite/request.
  @BuiltValueField(wireName: r'created_by_user_id')
  String? get createdByUserId;

  InviteBusinessRoleBinding._();

  factory InviteBusinessRoleBinding([void updates(InviteBusinessRoleBindingBuilder b)]) = _$InviteBusinessRoleBinding;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteBusinessRoleBindingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteBusinessRoleBinding> get serializer => _$InviteBusinessRoleBindingSerializer();
}

class _$InviteBusinessRoleBindingSerializer implements PrimitiveSerializer<InviteBusinessRoleBinding> {
  @override
  final Iterable<Type> types = const [InviteBusinessRoleBinding, _$InviteBusinessRoleBinding];

  @override
  final String wireName = r'InviteBusinessRoleBinding';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteBusinessRoleBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.createdByBusinessId != null) {
      yield r'created_by_business_id';
      yield serializers.serialize(
        object.createdByBusinessId,
        specifiedType: const FullType(String),
      );
    }
    if (object.createdByUserId != null) {
      yield r'created_by_user_id';
      yield serializers.serialize(
        object.createdByUserId,
        specifiedType: const FullType(String),
      );
    }
    if (object.isReceivedInvite != null) {
      yield r'is_received_invite';
      yield serializers.serialize(
        object.isReceivedInvite,
        specifiedType: const FullType(bool),
      );
    }
    if (object.inviteData != null) {
      yield r'invite_data';
      yield serializers.serialize(
        object.inviteData,
        specifiedType: const FullType(BaseInviteDataResponseInviteData),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
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
    InviteBusinessRoleBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteBusinessRoleBindingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'created_by_business_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.createdByBusinessId = valueDes;
          break;
        case r'created_by_user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.createdByUserId = valueDes;
          break;
        case r'is_received_invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isReceivedInvite = valueDes;
          break;
        case r'invite_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BaseInviteDataResponseInviteData),
          ) as BaseInviteDataResponseInviteData;
          result.inviteData.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary;
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
  InviteBusinessRoleBinding deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteBusinessRoleBindingBuilder();
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

