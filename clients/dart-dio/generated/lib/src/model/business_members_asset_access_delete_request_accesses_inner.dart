//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_members_asset_access_delete_request_accesses_inner.g.dart';

/// BusinessMembersAssetAccessDeleteRequestAccessesInner
///
/// Properties:
/// * [assetId] - Id of the asset on which to remove member permissions.
/// * [memberId] - Unique identifier of the member on which to perform the asset permission removal
@BuiltValue()
abstract class BusinessMembersAssetAccessDeleteRequestAccessesInner implements Built<BusinessMembersAssetAccessDeleteRequestAccessesInner, BusinessMembersAssetAccessDeleteRequestAccessesInnerBuilder> {
  /// Id of the asset on which to remove member permissions.
  @BuiltValueField(wireName: r'asset_id')
  String get assetId;

  /// Unique identifier of the member on which to perform the asset permission removal
  @BuiltValueField(wireName: r'member_id')
  String get memberId;

  BusinessMembersAssetAccessDeleteRequestAccessesInner._();

  factory BusinessMembersAssetAccessDeleteRequestAccessesInner([void updates(BusinessMembersAssetAccessDeleteRequestAccessesInnerBuilder b)]) = _$BusinessMembersAssetAccessDeleteRequestAccessesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessMembersAssetAccessDeleteRequestAccessesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessMembersAssetAccessDeleteRequestAccessesInner> get serializer => _$BusinessMembersAssetAccessDeleteRequestAccessesInnerSerializer();
}

class _$BusinessMembersAssetAccessDeleteRequestAccessesInnerSerializer implements PrimitiveSerializer<BusinessMembersAssetAccessDeleteRequestAccessesInner> {
  @override
  final Iterable<Type> types = const [BusinessMembersAssetAccessDeleteRequestAccessesInner, _$BusinessMembersAssetAccessDeleteRequestAccessesInner];

  @override
  final String wireName = r'BusinessMembersAssetAccessDeleteRequestAccessesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessMembersAssetAccessDeleteRequestAccessesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_id';
    yield serializers.serialize(
      object.assetId,
      specifiedType: const FullType(String),
    );
    yield r'member_id';
    yield serializers.serialize(
      object.memberId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessMembersAssetAccessDeleteRequestAccessesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessMembersAssetAccessDeleteRequestAccessesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetId = valueDes;
          break;
        case r'member_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.memberId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessMembersAssetAccessDeleteRequestAccessesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessMembersAssetAccessDeleteRequestAccessesInnerBuilder();
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

