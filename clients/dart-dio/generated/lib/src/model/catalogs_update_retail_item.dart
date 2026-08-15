//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/updatable_item_attributes.dart';
import 'package:openapi/src/model/update_mask_field_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_update_retail_item.g.dart';

/// An item to be updated
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [operation] 
/// * [updateMask] - The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
@BuiltValue()
abstract class CatalogsUpdateRetailItem implements Built<CatalogsUpdateRetailItem, CatalogsUpdateRetailItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  UpdatableItemAttributes get attributes;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'operation')
  CatalogsUpdateRetailItemOperationEnum get operation;
  // enum operationEnum {  UPDATE,  };

  /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  @BuiltValueField(wireName: r'update_mask')
  BuiltList<UpdateMaskFieldType>? get updateMask;

  CatalogsUpdateRetailItem._();

  factory CatalogsUpdateRetailItem([void updates(CatalogsUpdateRetailItemBuilder b)]) = _$CatalogsUpdateRetailItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsUpdateRetailItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpdateRetailItem> get serializer => _$CatalogsUpdateRetailItemSerializer();
}

class _$CatalogsUpdateRetailItemSerializer implements PrimitiveSerializer<CatalogsUpdateRetailItem> {
  @override
  final Iterable<Type> types = const [CatalogsUpdateRetailItem, _$CatalogsUpdateRetailItem];

  @override
  final String wireName = r'CatalogsUpdateRetailItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpdateRetailItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(UpdatableItemAttributes),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsUpdateRetailItemOperationEnum),
    );
    if (object.updateMask != null) {
      yield r'update_mask';
      yield serializers.serialize(
        object.updateMask,
        specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskFieldType)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpdateRetailItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpdateRetailItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(UpdatableItemAttributes),
          ) as UpdatableItemAttributes;
          result.attributes = valueDes;
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
            specifiedType: const FullType(CatalogsUpdateRetailItemOperationEnum),
          ) as CatalogsUpdateRetailItemOperationEnum;
          result.operation = valueDes;
          break;
        case r'update_mask':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskFieldType)]),
          ) as BuiltList<UpdateMaskFieldType>?;
          if (valueDes == null) continue;
          result.updateMask.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsUpdateRetailItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsUpdateRetailItemBuilder();
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

class CatalogsUpdateRetailItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const CatalogsUpdateRetailItemOperationEnum UPDATE = _$catalogsUpdateRetailItemOperationEnum_UPDATE;

  static Serializer<CatalogsUpdateRetailItemOperationEnum> get serializer => _$catalogsUpdateRetailItemOperationEnumSerializer;

  const CatalogsUpdateRetailItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsUpdateRetailItemOperationEnum> get values => _$catalogsUpdateRetailItemOperationEnumValues;
  static CatalogsUpdateRetailItemOperationEnum valueOf(String name) => _$catalogsUpdateRetailItemOperationEnumValueOf(name);
}

