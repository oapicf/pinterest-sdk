//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/retail_local_inventory_item_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_upsert_operation.g.dart';

/// Upsert operation for local inventory item
///
/// Properties:
/// * [attributes] 
/// * [itemId] - Catalog item id in the merchant namespace
/// * [operation] 
/// * [storeCode] - Store code for the local inventory item
@BuiltValue()
abstract class LocalInventoryUpsertOperation implements Built<LocalInventoryUpsertOperation, LocalInventoryUpsertOperationBuilder> {
  @BuiltValueField(wireName: r'attributes')
  RetailLocalInventoryItemAttributes get attributes;

  /// Catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'operation')
  LocalInventoryUpsertOperationOperationEnum get operation;
  // enum operationEnum {  UPSERT,  };

  /// Store code for the local inventory item
  @BuiltValueField(wireName: r'store_code')
  String get storeCode;

  LocalInventoryUpsertOperation._();

  factory LocalInventoryUpsertOperation([void updates(LocalInventoryUpsertOperationBuilder b)]) = _$LocalInventoryUpsertOperation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryUpsertOperationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryUpsertOperation> get serializer => _$LocalInventoryUpsertOperationSerializer();
}

class _$LocalInventoryUpsertOperationSerializer implements PrimitiveSerializer<LocalInventoryUpsertOperation> {
  @override
  final Iterable<Type> types = const [LocalInventoryUpsertOperation, _$LocalInventoryUpsertOperation];

  @override
  final String wireName = r'LocalInventoryUpsertOperation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryUpsertOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(RetailLocalInventoryItemAttributes),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(LocalInventoryUpsertOperationOperationEnum),
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
    LocalInventoryUpsertOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryUpsertOperationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RetailLocalInventoryItemAttributes),
          ) as RetailLocalInventoryItemAttributes;
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
            specifiedType: const FullType(LocalInventoryUpsertOperationOperationEnum),
          ) as LocalInventoryUpsertOperationOperationEnum;
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
  LocalInventoryUpsertOperation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryUpsertOperationBuilder();
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

class LocalInventoryUpsertOperationOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPSERT')
  static const LocalInventoryUpsertOperationOperationEnum UPSERT = _$localInventoryUpsertOperationOperationEnum_UPSERT;

  static Serializer<LocalInventoryUpsertOperationOperationEnum> get serializer => _$localInventoryUpsertOperationOperationEnumSerializer;

  const LocalInventoryUpsertOperationOperationEnum._(String name): super(name);

  static BuiltSet<LocalInventoryUpsertOperationOperationEnum> get values => _$localInventoryUpsertOperationOperationEnumValues;
  static LocalInventoryUpsertOperationOperationEnum valueOf(String name) => _$localInventoryUpsertOperationOperationEnumValueOf(name);
}

