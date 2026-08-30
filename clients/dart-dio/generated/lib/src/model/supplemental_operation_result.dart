//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/supplemental_item_processing_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/local_inventory_operation_result.dart';
import 'package:openapi/src/model/supplemental_item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'supplemental_operation_result.g.dart';

/// Result of a supplemental item operation, discriminated by supplemental_type
///
/// Properties:
/// * [errors] - Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
/// * [itemId] - Catalog item id in the merchant namespace
/// * [status] - Status of the item processing record
/// * [storeCode] - Store code for the local inventory item
/// * [supplementalType] 
/// * [warnings] - Array with the validation warnings for the item processing record
@BuiltValue()
abstract class SupplementalOperationResult implements LocalInventoryOperationResult, Built<SupplementalOperationResult, SupplementalOperationResultBuilder> {
  SupplementalOperationResult._();

  factory SupplementalOperationResult([void updates(SupplementalOperationResultBuilder b)]) = _$SupplementalOperationResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SupplementalOperationResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SupplementalOperationResult> get serializer => _$SupplementalOperationResultSerializer();
}

class _$SupplementalOperationResultSerializer implements PrimitiveSerializer<SupplementalOperationResult> {
  @override
  final Iterable<Type> types = const [SupplementalOperationResult, _$SupplementalOperationResult];

  @override
  final String wireName = r'SupplementalOperationResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SupplementalOperationResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'supplemental_type';
    yield serializers.serialize(
      object.supplementalType,
      specifiedType: const FullType(LocalInventoryOperationResultSupplementalTypeEnum),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    if (object.warnings != null) {
      yield r'warnings';
      yield serializers.serialize(
        object.warnings,
        specifiedType: const FullType(BuiltList, [FullType(SupplementalItemValidationEvent)]),
      );
    }
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(SupplementalItemValidationEvent)]),
      );
    }
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(SupplementalItemProcessingStatus),
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
    SupplementalOperationResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SupplementalOperationResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'supplemental_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LocalInventoryOperationResultSupplementalTypeEnum),
          ) as LocalInventoryOperationResultSupplementalTypeEnum;
          result.supplementalType = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'warnings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(SupplementalItemValidationEvent)]),
          ) as BuiltList<SupplementalItemValidationEvent>?;
          if (valueDes == null) continue;
          result.warnings.replace(valueDes);
          break;
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(SupplementalItemValidationEvent)]),
          ) as BuiltList<SupplementalItemValidationEvent>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(SupplementalItemProcessingStatus),
          ) as SupplementalItemProcessingStatus;
          result.status = valueDes;
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
  SupplementalOperationResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SupplementalOperationResultBuilder();
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

class SupplementalOperationResultSupplementalTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'LOCAL_INVENTORY')
  static const SupplementalOperationResultSupplementalTypeEnum LOCAL_INVENTORY = _$supplementalOperationResultSupplementalTypeEnum_LOCAL_INVENTORY;

  static Serializer<SupplementalOperationResultSupplementalTypeEnum> get serializer => _$supplementalOperationResultSupplementalTypeEnumSerializer;

  const SupplementalOperationResultSupplementalTypeEnum._(String name): super(name);

  static BuiltSet<SupplementalOperationResultSupplementalTypeEnum> get values => _$supplementalOperationResultSupplementalTypeEnumValues;
  static SupplementalOperationResultSupplementalTypeEnum valueOf(String name) => _$supplementalOperationResultSupplementalTypeEnumValueOf(name);
}

