//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_partner_assets_result.g.dart';

/// The terminated asset access.
///
/// Properties:
/// * [assetId] - Unique identifier of a business asset.
/// * [assetType] - Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
/// * [isSharedPartner] - If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
/// * [partnerId] - Unique identifier of a business partner.
/// * [permissions] - Permission levels member or partner has on an asset.
@BuiltValue()
abstract class DeletePartnerAssetsResult implements Built<DeletePartnerAssetsResult, DeletePartnerAssetsResultBuilder> {
  /// Unique identifier of a business asset.
  @BuiltValueField(wireName: r'asset_id')
  String? get assetId;

  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueField(wireName: r'asset_type')
  String? get assetType;

  /// If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
  @BuiltValueField(wireName: r'is_shared_partner')
  bool? get isSharedPartner;

  /// Unique identifier of a business partner.
  @BuiltValueField(wireName: r'partner_id')
  String? get partnerId;

  /// Permission levels member or partner has on an asset.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<String>? get permissions;

  DeletePartnerAssetsResult._();

  factory DeletePartnerAssetsResult([void updates(DeletePartnerAssetsResultBuilder b)]) = _$DeletePartnerAssetsResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletePartnerAssetsResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletePartnerAssetsResult> get serializer => _$DeletePartnerAssetsResultSerializer();
}

class _$DeletePartnerAssetsResultSerializer implements PrimitiveSerializer<DeletePartnerAssetsResult> {
  @override
  final Iterable<Type> types = const [DeletePartnerAssetsResult, _$DeletePartnerAssetsResult];

  @override
  final String wireName = r'DeletePartnerAssetsResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletePartnerAssetsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.assetId != null) {
      yield r'asset_id';
      yield serializers.serialize(
        object.assetId,
        specifiedType: const FullType(String),
      );
    }
    if (object.assetType != null) {
      yield r'asset_type';
      yield serializers.serialize(
        object.assetType,
        specifiedType: const FullType(String),
      );
    }
    if (object.isSharedPartner != null) {
      yield r'is_shared_partner';
      yield serializers.serialize(
        object.isSharedPartner,
        specifiedType: const FullType(bool),
      );
    }
    if (object.partnerId != null) {
      yield r'partner_id';
      yield serializers.serialize(
        object.partnerId,
        specifiedType: const FullType(String),
      );
    }
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeletePartnerAssetsResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletePartnerAssetsResultBuilder result,
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
        case r'asset_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.assetType = valueDes;
          break;
        case r'is_shared_partner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isSharedPartner = valueDes;
          break;
        case r'partner_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerId = valueDes;
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.permissions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeletePartnerAssetsResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletePartnerAssetsResultBuilder();
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

