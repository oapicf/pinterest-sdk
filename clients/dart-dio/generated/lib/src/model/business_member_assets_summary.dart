//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/asset_id_with_permissions.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_member_assets_summary.g.dart';

/// Ad accounts and profiles the business member/partner has access to.
///
/// Properties:
/// * [adAccounts] - List of ad account IDs and respective permission levels.
/// * [profiles] - List of profile IDs and respective permission levels.
@BuiltValue()
abstract class BusinessMemberAssetsSummary implements Built<BusinessMemberAssetsSummary, BusinessMemberAssetsSummaryBuilder> {
  /// List of ad account IDs and respective permission levels.
  @BuiltValueField(wireName: r'ad_accounts')
  BuiltList<AssetIdWithPermissions>? get adAccounts;

  /// List of profile IDs and respective permission levels.
  @BuiltValueField(wireName: r'profiles')
  BuiltList<AssetIdWithPermissions>? get profiles;

  BusinessMemberAssetsSummary._();

  factory BusinessMemberAssetsSummary([void updates(BusinessMemberAssetsSummaryBuilder b)]) = _$BusinessMemberAssetsSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessMemberAssetsSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessMemberAssetsSummary> get serializer => _$BusinessMemberAssetsSummarySerializer();
}

class _$BusinessMemberAssetsSummarySerializer implements PrimitiveSerializer<BusinessMemberAssetsSummary> {
  @override
  final Iterable<Type> types = const [BusinessMemberAssetsSummary, _$BusinessMemberAssetsSummary];

  @override
  final String wireName = r'BusinessMemberAssetsSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessMemberAssetsSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccounts != null) {
      yield r'ad_accounts';
      yield serializers.serialize(
        object.adAccounts,
        specifiedType: const FullType(BuiltList, [FullType(AssetIdWithPermissions)]),
      );
    }
    if (object.profiles != null) {
      yield r'profiles';
      yield serializers.serialize(
        object.profiles,
        specifiedType: const FullType(BuiltList, [FullType(AssetIdWithPermissions)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessMemberAssetsSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessMemberAssetsSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_accounts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AssetIdWithPermissions)]),
          ) as BuiltList<AssetIdWithPermissions>?;
          if (valueDes == null) continue;
          result.adAccounts.replace(valueDes);
          break;
        case r'profiles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AssetIdWithPermissions)]),
          ) as BuiltList<AssetIdWithPermissions>?;
          if (valueDes == null) continue;
          result.profiles.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessMemberAssetsSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessMemberAssetsSummaryBuilder();
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

