//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/retail_local_inventory_item_attributes.dart';
import 'package:openapi/src/model/local_inventory_create_operation.dart';
import 'package:openapi/src/model/local_inventory_delete_operation.dart';
import 'package:openapi/src/model/local_inventory_update_operation.dart';
import 'package:openapi/src/model/local_inventory_upsert_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'local_inventory_operation.g.dart';

/// LocalInventoryOperation
///
/// Properties:
/// * [attributes] 
/// * [itemId] - Catalog item id in the merchant namespace
/// * [operation] 
/// * [storeCode] - Store code for the local inventory item
@BuiltValue()
abstract class LocalInventoryOperation implements Built<LocalInventoryOperation, LocalInventoryOperationBuilder> {
  /// One Of [LocalInventoryCreateOperation], [LocalInventoryDeleteOperation], [LocalInventoryUpdateOperation], [LocalInventoryUpsertOperation]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'operation';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATE': LocalInventoryCreateOperation,
    r'DELETE': LocalInventoryDeleteOperation,
    r'UPDATE': LocalInventoryUpdateOperation,
    r'UPSERT': LocalInventoryUpsertOperation,
  };

  LocalInventoryOperation._();

  factory LocalInventoryOperation([void updates(LocalInventoryOperationBuilder b)]) = _$LocalInventoryOperation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocalInventoryOperationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryOperation> get serializer => _$LocalInventoryOperationSerializer();
}

extension LocalInventoryOperationDiscriminatorExt on LocalInventoryOperation {
    String? get discriminatorValue {
        if (this is LocalInventoryCreateOperation) {
            return r'CREATE';
        }
        if (this is LocalInventoryDeleteOperation) {
            return r'DELETE';
        }
        if (this is LocalInventoryUpdateOperation) {
            return r'UPDATE';
        }
        if (this is LocalInventoryUpsertOperation) {
            return r'UPSERT';
        }
        return null;
    }
}
extension LocalInventoryOperationBuilderDiscriminatorExt on LocalInventoryOperationBuilder {
    String? get discriminatorValue {
        if (this is LocalInventoryCreateOperationBuilder) {
            return r'CREATE';
        }
        if (this is LocalInventoryDeleteOperationBuilder) {
            return r'DELETE';
        }
        if (this is LocalInventoryUpdateOperationBuilder) {
            return r'UPDATE';
        }
        if (this is LocalInventoryUpsertOperationBuilder) {
            return r'UPSERT';
        }
        return null;
    }
}

class _$LocalInventoryOperationSerializer implements PrimitiveSerializer<LocalInventoryOperation> {
  @override
  final Iterable<Type> types = const [LocalInventoryOperation, _$LocalInventoryOperation];

  @override
  final String wireName = r'LocalInventoryOperation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalInventoryOperation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  LocalInventoryOperation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocalInventoryOperationBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(LocalInventoryOperation.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [LocalInventoryCreateOperation, LocalInventoryDeleteOperation, LocalInventoryUpdateOperation, LocalInventoryUpsertOperation, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(LocalInventoryCreateOperation),
        ) as LocalInventoryCreateOperation;
        oneOfType = LocalInventoryCreateOperation;
        break;
      case r'DELETE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(LocalInventoryDeleteOperation),
        ) as LocalInventoryDeleteOperation;
        oneOfType = LocalInventoryDeleteOperation;
        break;
      case r'UPDATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(LocalInventoryUpdateOperation),
        ) as LocalInventoryUpdateOperation;
        oneOfType = LocalInventoryUpdateOperation;
        break;
      case r'UPSERT':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(LocalInventoryUpsertOperation),
        ) as LocalInventoryUpsertOperation;
        oneOfType = LocalInventoryUpsertOperation;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class LocalInventoryOperationOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const LocalInventoryOperationOperationEnum DELETE = _$localInventoryOperationOperationEnum_DELETE;

  static Serializer<LocalInventoryOperationOperationEnum> get serializer => _$localInventoryOperationOperationEnumSerializer;

  const LocalInventoryOperationOperationEnum._(String name): super(name);

  static BuiltSet<LocalInventoryOperationOperationEnum> get values => _$localInventoryOperationOperationEnumValues;
  static LocalInventoryOperationOperationEnum valueOf(String name) => _$localInventoryOperationOperationEnumValueOf(name);
}

