//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/business_access_user_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_group_binding.g.dart';

/// AssetGroupBinding
///
/// Properties:
/// * [adAccountsIds] - A list of ad account IDs under the asset group
/// * [assetGroupDescription] - Asset group description
/// * [assetGroupName] - Asset Group name
/// * [assetGroupTypes] - Asset group types
/// * [catalogsIds] - A list of catalog IDs under asset group
/// * [createdBy] - The data of the user that created the asset group.
/// * [createdTime] - The creation time of the asset group
/// * [id] - Asset Group ID.
/// * [owner] - The data of the business that owns the asset group.
/// * [profilesIds] - A list of profile IDs under asset group
/// * [updatedTime] - The last update time of the asset group
@BuiltValue()
abstract class AssetGroupBinding implements Built<AssetGroupBinding, AssetGroupBindingBuilder> {
  /// A list of ad account IDs under the asset group
  @BuiltValueField(wireName: r'ad_accounts_ids')
  BuiltList<String>? get adAccountsIds;

  /// Asset group description
  @BuiltValueField(wireName: r'asset_group_description')
  String? get assetGroupDescription;

  /// Asset Group name
  @BuiltValueField(wireName: r'asset_group_name')
  String? get assetGroupName;

  /// Asset group types
  @BuiltValueField(wireName: r'asset_group_types')
  BuiltList<String>? get assetGroupTypes;

  /// A list of catalog IDs under asset group
  @BuiltValueField(wireName: r'catalogs_ids')
  BuiltList<String>? get catalogsIds;

  /// The data of the user that created the asset group.
  @BuiltValueField(wireName: r'created_by')
  BusinessAccessUserSummary? get createdBy;

  /// The creation time of the asset group
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Asset Group ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// The data of the business that owns the asset group.
  @BuiltValueField(wireName: r'owner')
  BusinessAccessUserSummary? get owner;

  /// A list of profile IDs under asset group
  @BuiltValueField(wireName: r'profiles_ids')
  BuiltList<String>? get profilesIds;

  /// The last update time of the asset group
  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  AssetGroupBinding._();

  factory AssetGroupBinding([void updates(AssetGroupBindingBuilder b)]) = _$AssetGroupBinding;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AssetGroupBindingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AssetGroupBinding> get serializer => _$AssetGroupBindingSerializer();
}

class _$AssetGroupBindingSerializer implements PrimitiveSerializer<AssetGroupBinding> {
  @override
  final Iterable<Type> types = const [AssetGroupBinding, _$AssetGroupBinding];

  @override
  final String wireName = r'AssetGroupBinding';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AssetGroupBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountsIds != null) {
      yield r'ad_accounts_ids';
      yield serializers.serialize(
        object.adAccountsIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.assetGroupDescription != null) {
      yield r'asset_group_description';
      yield serializers.serialize(
        object.assetGroupDescription,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.assetGroupName != null) {
      yield r'asset_group_name';
      yield serializers.serialize(
        object.assetGroupName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.assetGroupTypes != null) {
      yield r'asset_group_types';
      yield serializers.serialize(
        object.assetGroupTypes,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.catalogsIds != null) {
      yield r'catalogs_ids';
      yield serializers.serialize(
        object.catalogsIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.createdBy != null) {
      yield r'created_by';
      yield serializers.serialize(
        object.createdBy,
        specifiedType: const FullType.nullable(BusinessAccessUserSummary),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.owner != null) {
      yield r'owner';
      yield serializers.serialize(
        object.owner,
        specifiedType: const FullType.nullable(BusinessAccessUserSummary),
      );
    }
    if (object.profilesIds != null) {
      yield r'profiles_ids';
      yield serializers.serialize(
        object.profilesIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AssetGroupBinding object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AssetGroupBindingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_accounts_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adAccountsIds.replace(valueDes);
          break;
        case r'asset_group_description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assetGroupDescription = valueDes;
          break;
        case r'asset_group_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.assetGroupName = valueDes;
          break;
        case r'asset_group_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.assetGroupTypes.replace(valueDes);
          break;
        case r'catalogs_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.catalogsIds.replace(valueDes);
          break;
        case r'created_by':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary?;
          if (valueDes == null) continue;
          result.createdBy.replace(valueDes);
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessAccessUserSummary),
          ) as BusinessAccessUserSummary?;
          if (valueDes == null) continue;
          result.owner.replace(valueDes);
          break;
        case r'profiles_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.profilesIds.replace(valueDes);
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.updatedTime = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AssetGroupBinding deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AssetGroupBindingBuilder();
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

