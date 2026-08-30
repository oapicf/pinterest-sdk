//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/business_membership_member.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_business_memberships_response.g.dart';

/// UpdateBusinessMembershipsResponse
///
/// Properties:
/// * [items] - List of members with updated business access role.
@BuiltValue()
abstract class UpdateBusinessMembershipsResponse implements Built<UpdateBusinessMembershipsResponse, UpdateBusinessMembershipsResponseBuilder> {
  /// List of members with updated business access role.
  @BuiltValueField(wireName: r'items')
  BuiltList<BusinessMembershipMember>? get items;

  UpdateBusinessMembershipsResponse._();

  factory UpdateBusinessMembershipsResponse([void updates(UpdateBusinessMembershipsResponseBuilder b)]) = _$UpdateBusinessMembershipsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdateBusinessMembershipsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdateBusinessMembershipsResponse> get serializer => _$UpdateBusinessMembershipsResponseSerializer();
}

class _$UpdateBusinessMembershipsResponseSerializer implements PrimitiveSerializer<UpdateBusinessMembershipsResponse> {
  @override
  final Iterable<Type> types = const [UpdateBusinessMembershipsResponse, _$UpdateBusinessMembershipsResponse];

  @override
  final String wireName = r'UpdateBusinessMembershipsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdateBusinessMembershipsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(BusinessMembershipMember)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdateBusinessMembershipsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdateBusinessMembershipsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(BusinessMembershipMember)]),
          ) as BuiltList<BusinessMembershipMember>?;
          if (valueDes == null) continue;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdateBusinessMembershipsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdateBusinessMembershipsResponseBuilder();
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

