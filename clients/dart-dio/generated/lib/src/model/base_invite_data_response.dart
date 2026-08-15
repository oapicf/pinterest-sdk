//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/base_invite_data_response_invite_data.dart';
import 'package:openapi/src/model/business_access_user_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'base_invite_data_response.g.dart';

/// BaseInviteDataResponse
///
/// Properties:
/// * [id] - Unique identifier of the invite/request.
/// * [inviteData] 
/// * [isReceivedInvite] - Indicates whether the invite/request was received.
/// * [user] - Metadata for the member/partner that was sent the invite/request.
@BuiltValue(instantiable: false)
abstract class BaseInviteDataResponse  {
  /// Unique identifier of the invite/request.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'invite_data')
  BaseInviteDataResponseInviteData? get inviteData;

  /// Indicates whether the invite/request was received.
  @BuiltValueField(wireName: r'is_received_invite')
  bool? get isReceivedInvite;

  /// Metadata for the member/partner that was sent the invite/request.
  @BuiltValueField(wireName: r'user')
  BusinessAccessUserSummary? get user;

  @BuiltValueSerializer(custom: true)
  static Serializer<BaseInviteDataResponse> get serializer => _$BaseInviteDataResponseSerializer();
}

class _$BaseInviteDataResponseSerializer implements PrimitiveSerializer<BaseInviteDataResponse> {
  @override
  final Iterable<Type> types = const [BaseInviteDataResponse];

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
        specifiedType: const FullType(BaseInviteDataResponseInviteData),
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

  @override
  BaseInviteDataResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($BaseInviteDataResponse)) as $BaseInviteDataResponse;
  }
}

/// a concrete implementation of [BaseInviteDataResponse], since [BaseInviteDataResponse] is not instantiable
@BuiltValue(instantiable: true)
abstract class $BaseInviteDataResponse implements BaseInviteDataResponse, Built<$BaseInviteDataResponse, $BaseInviteDataResponseBuilder> {
  $BaseInviteDataResponse._();

  factory $BaseInviteDataResponse([void Function($BaseInviteDataResponseBuilder)? updates]) = _$$BaseInviteDataResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($BaseInviteDataResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$BaseInviteDataResponse> get serializer => _$$BaseInviteDataResponseSerializer();
}

class _$$BaseInviteDataResponseSerializer implements PrimitiveSerializer<$BaseInviteDataResponse> {
  @override
  final Iterable<Type> types = const [$BaseInviteDataResponse, _$$BaseInviteDataResponse];

  @override
  final String wireName = r'$BaseInviteDataResponse';

  @override
  Object serialize(
    Serializers serializers,
    $BaseInviteDataResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(BaseInviteDataResponse))!;
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
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'invite_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BaseInviteDataResponseInviteData),
          ) as BaseInviteDataResponseInviteData;
          result.inviteData.replace(valueDes);
          break;
        case r'is_received_invite':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isReceivedInvite = valueDes;
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
  $BaseInviteDataResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $BaseInviteDataResponseBuilder();
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

