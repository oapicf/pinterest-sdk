//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/business_members_asset_access_delete_request_accesses_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_members_asset_access_delete_request.g.dart';

/// BusinessMembersAssetAccessDeleteRequest
///
/// Properties:
/// * [accesses] - List of members asset access to be deleted
@BuiltValue()
abstract class BusinessMembersAssetAccessDeleteRequest implements Built<BusinessMembersAssetAccessDeleteRequest, BusinessMembersAssetAccessDeleteRequestBuilder> {
  /// List of members asset access to be deleted
  @BuiltValueField(wireName: r'accesses')
  BuiltList<BusinessMembersAssetAccessDeleteRequestAccessesInner> get accesses;

  BusinessMembersAssetAccessDeleteRequest._();

  factory BusinessMembersAssetAccessDeleteRequest([void updates(BusinessMembersAssetAccessDeleteRequestBuilder b)]) = _$BusinessMembersAssetAccessDeleteRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessMembersAssetAccessDeleteRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessMembersAssetAccessDeleteRequest> get serializer => _$BusinessMembersAssetAccessDeleteRequestSerializer();
}

class _$BusinessMembersAssetAccessDeleteRequestSerializer implements PrimitiveSerializer<BusinessMembersAssetAccessDeleteRequest> {
  @override
  final Iterable<Type> types = const [BusinessMembersAssetAccessDeleteRequest, _$BusinessMembersAssetAccessDeleteRequest];

  @override
  final String wireName = r'BusinessMembersAssetAccessDeleteRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessMembersAssetAccessDeleteRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'accesses';
    yield serializers.serialize(
      object.accesses,
      specifiedType: const FullType(BuiltList, [FullType(BusinessMembersAssetAccessDeleteRequestAccessesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessMembersAssetAccessDeleteRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessMembersAssetAccessDeleteRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'accesses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BusinessMembersAssetAccessDeleteRequestAccessesInner)]),
          ) as BuiltList<BusinessMembersAssetAccessDeleteRequestAccessesInner>;
          result.accesses.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessMembersAssetAccessDeleteRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessMembersAssetAccessDeleteRequestBuilder();
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

