//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/retail_local_inventory_item_attributes_optional.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_update_operation.g.dart';

/// Update operation for local inventory item
///
/// Properties:
/// * [attributes] 
/// * [itemId] - Catalog item id in the merchant namespace
/// * [operation] 
/// * [storeCode] - Store code for the local inventory item
@BuiltValue()
abstract class LocalInventoryUpdateOperation implements Built<LocalInventoryUpdateOperation, LocalInventoryUpdateOperationBuilder> {
  @BuiltValueField(wireName: r'attributes')
  RetailLocalInventoryItemAttributesOptional get attributes;

  /// Catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'operation')
  LocalInventoryUpdateOperationOperationEnum get operation;
  // enum operationEnum {  UPDATE,  };

  /// Store code for the local inventory item
  @BuiltValueField(wireName: r'store_code')
  String get storeCode;

  LocalInventoryUpdateOperation._();

  factory LocalInventoryUpdateOperation([void updates(LocalInventoryUpdateOperationBuilder b)]) = _$LocalInventoryUpdateOperation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryUpdateOperationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryUpdateOperation> get serializer => _$LocalInventoryUpdateOperationSerializer();
}

class _$LocalInventoryUpdateOperationSerializer implements PrimitiveSerializer<LocalInventoryUpdateOperation> {
  @override
  final Iterable<Type> types = const [LocalInventoryUpdateOperation, _$LocalInventoryUpdateOperation];

  @override
  final String wireName = r'LocalInventoryUpdateOperation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryUpdateOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(RetailLocalInventoryItemAttributesOptional),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(LocalInventoryUpdateOperationOperationEnum),
    );
    yield r'store_code';
    yield serializers.serialize(
      object.storeCode,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalInventoryUpdateOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryUpdateOperationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RetailLocalInventoryItemAttributesOptional),
          ) as RetailLocalInventoryItemAttributesOptional;
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
            specifiedType: const FullType(LocalInventoryUpdateOperationOperationEnum),
          ) as LocalInventoryUpdateOperationOperationEnum;
          result.operation = valueDes;
          break;
        case r'store_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.storeCode = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocalInventoryUpdateOperation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryUpdateOperationBuilder();
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

class LocalInventoryUpdateOperationOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const LocalInventoryUpdateOperationOperationEnum UPDATE = _$localInventoryUpdateOperationOperationEnum_UPDATE;

  static Serializer<LocalInventoryUpdateOperationOperationEnum> get serializer => _$localInventoryUpdateOperationOperationEnumSerializer;

  const LocalInventoryUpdateOperationOperationEnum._(String name): super(name);

  static BuiltSet<LocalInventoryUpdateOperationOperationEnum> get values => _$localInventoryUpdateOperationOperationEnumValues;
  static LocalInventoryUpdateOperationOperationEnum valueOf(String name) => _$localInventoryUpdateOperationOperationEnumValueOf(name);
}

