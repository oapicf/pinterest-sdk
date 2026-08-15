//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_attributes.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_upsert_creative_assets_item.g.dart';

/// A creative assets item to be upserted.
///
/// Properties:
/// * [attributes] 
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsUpsertCreativeAssetsItem implements Built<CatalogsUpsertCreativeAssetsItem, CatalogsUpsertCreativeAssetsItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsCreativeAssetsAttributes get attributes;

  /// The catalog creative assets id in the merchant namespace
  @BuiltValueField(wireName: r'creative_assets_id')
  String get creativeAssetsId;

  @BuiltValueField(wireName: r'operation')
  CatalogsUpsertCreativeAssetsItemOperationEnum get operation;
  // enum operationEnum {  UPSERT,  };

  CatalogsUpsertCreativeAssetsItem._();

  factory CatalogsUpsertCreativeAssetsItem([void updates(CatalogsUpsertCreativeAssetsItemBuilder b)]) = _$CatalogsUpsertCreativeAssetsItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsUpsertCreativeAssetsItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpsertCreativeAssetsItem> get serializer => _$CatalogsUpsertCreativeAssetsItemSerializer();
}

class _$CatalogsUpsertCreativeAssetsItemSerializer implements PrimitiveSerializer<CatalogsUpsertCreativeAssetsItem> {
  @override
  final Iterable<Type> types = const [CatalogsUpsertCreativeAssetsItem, _$CatalogsUpsertCreativeAssetsItem];

  @override
  final String wireName = r'CatalogsUpsertCreativeAssetsItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpsertCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(CatalogsCreativeAssetsAttributes),
    );
    yield r'creative_assets_id';
    yield serializers.serialize(
      object.creativeAssetsId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsUpsertCreativeAssetsItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpsertCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpsertCreativeAssetsItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsAttributes),
          ) as CatalogsCreativeAssetsAttributes;
          result.attributes.replace(valueDes);
          break;
        case r'creative_assets_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.creativeAssetsId = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsUpsertCreativeAssetsItemOperationEnum),
          ) as CatalogsUpsertCreativeAssetsItemOperationEnum;
          result.operation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsUpsertCreativeAssetsItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsUpsertCreativeAssetsItemBuilder();
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

class CatalogsUpsertCreativeAssetsItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPSERT')
  static const CatalogsUpsertCreativeAssetsItemOperationEnum UPSERT = _$catalogsUpsertCreativeAssetsItemOperationEnum_UPSERT;

  static Serializer<CatalogsUpsertCreativeAssetsItemOperationEnum> get serializer => _$catalogsUpsertCreativeAssetsItemOperationEnumSerializer;

  const CatalogsUpsertCreativeAssetsItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsUpsertCreativeAssetsItemOperationEnum> get values => _$catalogsUpsertCreativeAssetsItemOperationEnumValues;
  static CatalogsUpsertCreativeAssetsItemOperationEnum valueOf(String name) => _$catalogsUpsertCreativeAssetsItemOperationEnumValueOf(name);
}

