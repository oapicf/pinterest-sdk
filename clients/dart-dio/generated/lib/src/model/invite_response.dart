//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_invite_data_response_invite_data.dart';
import 'package:openapi/src/model/invite_assets_summary.dart';
import 'package:openapi/src/model/base_invite_data_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/business_access_user_summary.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invite_response.g.dart';

/// InviteResponse
///
/// Properties:
/// * [id] - Unique identifier of the invite/request.
/// * [inviteData] 
/// * [isReceivedInvite] - Indicates whether the invite/request was received.
/// * [user] - Metadata for the member/partner that was sent the invite/request.
/// * [assetsSummary] 
/// * [businessRoles] - The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
/// * [createdByBusiness] - Metadata for the business that created the invite/request.
/// * [createdByUser] - Metadata for the user that created the invite/request.
/// * [createdTime] - The time the invite/request was created. Returned in milliseconds.
@BuiltValue()
abstract class InviteResponse implements BaseInviteDataResponse, Built<InviteResponse, InviteResponseBuilder> {
  @BuiltValueField(wireName: r'assets_summary')
  InviteAssetsSummary? get assetsSummary;

  /// Metadata for the user that created the invite/request.
  @BuiltValueField(wireName: r'created_by_user')
  JsonObject? get createdByUser;

  /// The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  @BuiltValueField(wireName: r'business_roles')
  BuiltList<String>? get businessRoles;

  /// The time the invite/request was created. Returned in milliseconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Metadata for the business that created the invite/request.
  @BuiltValueField(wireName: r'created_by_business')
  JsonObject? get createdByBusiness;

  InviteResponse._();

  factory InviteResponse([void updates(InviteResponseBuilder b)]) = _$InviteResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InviteResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InviteResponse> get serializer => _$InviteResponseSerializer();
}

class _$InviteResponseSerializer implements PrimitiveSerializer<InviteResponse> {
  @override
  final Iterable<Type> types = const [InviteResponse, _$InviteResponse];

  @override
  final String wireName = r'InviteResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InviteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isReceivedInvite != null) {
      yield r'is_received_invite';
      yield serializers.serialize(
        object.isReceivedInvite,
        specifiedType: const FullType(bool),
      );
    }
    if (object.assetsSummary != null) {
      yield r'assets_summary';
      yield serializers.serialize(
        object.assetsSummary,
        specifiedType: const FullType.nullable(InviteAssetsSummary),
      );
    }
    if (object.inviteData != null) {
      yield r'invite_data';
      yield serializers.serialize(
        object.inviteData,
        specifiedType: const FullType(BaseInviteDataResponseInviteData),
      );
    }
    if (object.createdByUser != null) {
      yield r'created_by_user';
      yield serializers.serialize(
        object.createdByUser,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
    if (object.businessRoles != null) {
      yield r'business_roles';
      yield serializers.serialize(
        object.businessRoles,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
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
    if (object.createdByBusiness != null) {
      yield r'created_by_business';
      yield serializers.serialize(
        object.createdByBusiness,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    InviteResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InviteResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_received_invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isReceivedInvite = valueDes;
          break;
        case r'assets_summary':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(InviteAssetsSummary),
          ) as InviteAssetsSummary?;
          if (valueDes == null) continue;
          result.assetsSummary.replace(valueDes);
          break;
        case r'invite_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BaseInviteDataResponseInviteData),
          ) as BaseInviteDataResponseInviteData;
          result.inviteData.replace(valueDes);
          break;
        case r'created_by_user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.createdByUser = valueDes;
          break;
        case r'business_roles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.businessRoles.replace(valueDes);
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdTime = valueDes;
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
        case r'created_by_business':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.createdByBusiness = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InviteResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InviteResponseBuilder();
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

