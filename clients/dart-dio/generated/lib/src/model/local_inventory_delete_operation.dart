//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_delete_operation.g.dart';

/// Delete operation for local inventory item
///
/// Properties:
/// * [itemId] - Catalog item id in the merchant namespace
/// * [operation] 
/// * [storeCode] - Store code for the local inventory item
@BuiltValue()
abstract class LocalInventoryDeleteOperation implements Built<LocalInventoryDeleteOperation, LocalInventoryDeleteOperationBuilder> {
  /// Catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'operation')
  LocalInventoryDeleteOperationOperationEnum get operation;
  // enum operationEnum {  DELETE,  };

  /// Store code for the local inventory item
  @BuiltValueField(wireName: r'store_code')
  String get storeCode;

  LocalInventoryDeleteOperation._();

  factory LocalInventoryDeleteOperation([void updates(LocalInventoryDeleteOperationBuilder b)]) = _$LocalInventoryDeleteOperation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryDeleteOperationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryDeleteOperation> get serializer => _$LocalInventoryDeleteOperationSerializer();
}

class _$LocalInventoryDeleteOperationSerializer implements PrimitiveSerializer<LocalInventoryDeleteOperation> {
  @override
  final Iterable<Type> types = const [LocalInventoryDeleteOperation, _$LocalInventoryDeleteOperation];

  @override
  final String wireName = r'LocalInventoryDeleteOperation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryDeleteOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(LocalInventoryDeleteOperationOperationEnum),
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
    LocalInventoryDeleteOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryDeleteOperationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
            specifiedType: const FullType(LocalInventoryDeleteOperationOperationEnum),
          ) as LocalInventoryDeleteOperationOperationEnum;
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
  LocalInventoryDeleteOperation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryDeleteOperationBuilder();
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

class LocalInventoryDeleteOperationOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const LocalInventoryDeleteOperationOperationEnum DELETE = _$localInventoryDeleteOperationOperationEnum_DELETE;

  static Serializer<LocalInventoryDeleteOperationOperationEnum> get serializer => _$localInventoryDeleteOperationOperationEnumSerializer;

  const LocalInventoryDeleteOperationOperationEnum._(String name): super(name);

  static BuiltSet<LocalInventoryDeleteOperationOperationEnum> get values => _$localInventoryDeleteOperationOperationEnumValues;
  static LocalInventoryDeleteOperationOperationEnum valueOf(String name) => _$localInventoryDeleteOperationOperationEnumValueOf(name);
}

