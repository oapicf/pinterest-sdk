//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_attributes_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_upsert_retail_item.g.dart';

/// An item to be upserted
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsUpsertRetailItem implements Built<CatalogsUpsertRetailItem, CatalogsUpsertRetailItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  ItemAttributesRequest get attributes;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'operation')
  CatalogsUpsertRetailItemOperationEnum get operation;
  // enum operationEnum {  UPSERT,  };

  CatalogsUpsertRetailItem._();

  factory CatalogsUpsertRetailItem([void updates(CatalogsUpsertRetailItemBuilder b)]) = _$CatalogsUpsertRetailItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsUpsertRetailItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpsertRetailItem> get serializer => _$CatalogsUpsertRetailItemSerializer();
}

class _$CatalogsUpsertRetailItemSerializer implements PrimitiveSerializer<CatalogsUpsertRetailItem> {
  @override
  final Iterable<Type> types = const [CatalogsUpsertRetailItem, _$CatalogsUpsertRetailItem];

  @override
  final String wireName = r'CatalogsUpsertRetailItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpsertRetailItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(ItemAttributesRequest),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsUpsertRetailItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpsertRetailItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpsertRetailItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemAttributesRequest),
          ) as ItemAttributesRequest;
          result.attributes.replace(valueDes);
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsUpsertRetailItemOperationEnum),
          ) as CatalogsUpsertRetailItemOperationEnum;
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
  CatalogsUpsertRetailItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsUpsertRetailItemBuilder();
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

class CatalogsUpsertRetailItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPSERT')
  static const CatalogsUpsertRetailItemOperationEnum UPSERT = _$catalogsUpsertRetailItemOperationEnum_UPSERT;

  static Serializer<CatalogsUpsertRetailItemOperationEnum> get serializer => _$catalogsUpsertRetailItemOperationEnumSerializer;

  const CatalogsUpsertRetailItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsUpsertRetailItemOperationEnum> get values => _$catalogsUpsertRetailItemOperationEnumValues;
  static CatalogsUpsertRetailItemOperationEnum valueOf(String name) => _$catalogsUpsertRetailItemOperationEnumValueOf(name);
}

