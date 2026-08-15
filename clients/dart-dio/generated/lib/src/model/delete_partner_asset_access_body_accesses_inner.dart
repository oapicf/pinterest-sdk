//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_partner_asset_access_body_accesses_inner.g.dart';

/// DeletePartnerAssetAccessBodyAccessesInner
///
/// Properties:
/// * [assetId] - Unique identifier of the business asset.
/// * [partnerId] - Unique identifier of a business partner to update asset access to.
/// * [partnerType] - If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
@BuiltValue()
abstract class DeletePartnerAssetAccessBodyAccessesInner implements Built<DeletePartnerAssetAccessBodyAccessesInner, DeletePartnerAssetAccessBodyAccessesInnerBuilder> {
  /// Unique identifier of the business asset.
  @BuiltValueField(wireName: r'asset_id')
  String get assetId;

  /// Unique identifier of a business partner to update asset access to.
  @BuiltValueField(wireName: r'partner_id')
  String get partnerId;

  /// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  @BuiltValueField(wireName: r'partner_type')
  DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum? get partnerType;
  // enum partnerTypeEnum {  INTERNAL,  EXTERNAL,  };

  DeletePartnerAssetAccessBodyAccessesInner._();

  factory DeletePartnerAssetAccessBodyAccessesInner([void updates(DeletePartnerAssetAccessBodyAccessesInnerBuilder b)]) = _$DeletePartnerAssetAccessBodyAccessesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletePartnerAssetAccessBodyAccessesInnerBuilder b) => b
      ..partnerType = DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum.valueOf('INTERNAL');

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletePartnerAssetAccessBodyAccessesInner> get serializer => _$DeletePartnerAssetAccessBodyAccessesInnerSerializer();
}

class _$DeletePartnerAssetAccessBodyAccessesInnerSerializer implements PrimitiveSerializer<DeletePartnerAssetAccessBodyAccessesInner> {
  @override
  final Iterable<Type> types = const [DeletePartnerAssetAccessBodyAccessesInner, _$DeletePartnerAssetAccessBodyAccessesInner];

  @override
  final String wireName = r'DeletePartnerAssetAccessBodyAccessesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletePartnerAssetAccessBodyAccessesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_id';
    yield serializers.serialize(
      object.assetId,
      specifiedType: const FullType(String),
    );
    yield r'partner_id';
    yield serializers.serialize(
      object.partnerId,
      specifiedType: const FullType(String),
    );
    if (object.partnerType != null) {
      yield r'partner_type';
      yield serializers.serialize(
        object.partnerType,
        specifiedType: const FullType(DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeletePartnerAssetAccessBodyAccessesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletePartnerAssetAccessBodyAccessesInnerBuilder result,
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
        case r'partner_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerId = valueDes;
          break;
        case r'partner_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum),
          ) as DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum;
          result.partnerType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeletePartnerAssetAccessBodyAccessesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletePartnerAssetAccessBodyAccessesInnerBuilder();
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

class DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum extends EnumClass {

  /// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  @BuiltValueEnumConst(wireName: r'INTERNAL')
  static const DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum INTERNAL = _$deletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum_INTERNAL;
  /// If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  @BuiltValueEnumConst(wireName: r'EXTERNAL')
  static const DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum EXTERNAL = _$deletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum_EXTERNAL;

  static Serializer<DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum> get serializer => _$deletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumSerializer;

  const DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum._(String name): super(name);

  static BuiltSet<DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum> get values => _$deletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumValues;
  static DeletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnum valueOf(String name) => _$deletePartnerAssetAccessBodyAccessesInnerPartnerTypeEnumValueOf(name);
}

