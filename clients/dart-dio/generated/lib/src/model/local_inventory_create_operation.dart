//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/retail_local_inventory_item_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_create_operation.g.dart';

/// Create operation for local inventory item
///
/// Properties:
/// * [attributes] 
/// * [itemId] - Catalog item id in the merchant namespace
/// * [operation] 
/// * [storeCode] - Store code for the local inventory item
@BuiltValue()
abstract class LocalInventoryCreateOperation implements Built<LocalInventoryCreateOperation, LocalInventoryCreateOperationBuilder> {
  @BuiltValueField(wireName: r'attributes')
  RetailLocalInventoryItemAttributes get attributes;

  /// Catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'operation')
  LocalInventoryCreateOperationOperationEnum get operation;
  // enum operationEnum {  CREATE,  };

  /// Store code for the local inventory item
  @BuiltValueField(wireName: r'store_code')
  String get storeCode;

  LocalInventoryCreateOperation._();

  factory LocalInventoryCreateOperation([void updates(LocalInventoryCreateOperationBuilder b)]) = _$LocalInventoryCreateOperation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryCreateOperationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryCreateOperation> get serializer => _$LocalInventoryCreateOperationSerializer();
}

class _$LocalInventoryCreateOperationSerializer implements PrimitiveSerializer<LocalInventoryCreateOperation> {
  @override
  final Iterable<Type> types = const [LocalInventoryCreateOperation, _$LocalInventoryCreateOperation];

  @override
  final String wireName = r'LocalInventoryCreateOperation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryCreateOperation object, {
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
      specifiedType: const FullType(LocalInventoryCreateOperationOperationEnum),
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
    LocalInventoryCreateOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryCreateOperationBuilder result,
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
            specifiedType: const FullType(LocalInventoryCreateOperationOperationEnum),
          ) as LocalInventoryCreateOperationOperationEnum;
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
  LocalInventoryCreateOperation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryCreateOperationBuilder();
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

class LocalInventoryCreateOperationOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATE')
  static const LocalInventoryCreateOperationOperationEnum CREATE = _$localInventoryCreateOperationOperationEnum_CREATE;

  static Serializer<LocalInventoryCreateOperationOperationEnum> get serializer => _$localInventoryCreateOperationOperationEnumSerializer;

  const LocalInventoryCreateOperationOperationEnum._(String name): super(name);

  static BuiltSet<LocalInventoryCreateOperationOperationEnum> get values => _$localInventoryCreateOperationOperationEnumValues;
  static LocalInventoryCreateOperationOperationEnum valueOf(String name) => _$localInventoryCreateOperationOperationEnumValueOf(name);
}

