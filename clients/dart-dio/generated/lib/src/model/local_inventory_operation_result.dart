//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/supplemental_item_processing_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/supplemental_item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'local_inventory_operation_result.g.dart';

/// Result model for local inventory operation
///
/// Properties:
/// * [errors] - Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
/// * [itemId] - Catalog item id in the merchant namespace
/// * [status] - Status of the item processing record
/// * [storeCode] - Store code for the local inventory item
/// * [supplementalType] 
/// * [warnings] - Array with the validation warnings for the item processing record
@BuiltValue(instantiable: false)
abstract class LocalInventoryOperationResult  {
  /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  @BuiltValueField(wireName: r'errors')
  BuiltList<SupplementalItemValidationEvent>? get errors;

  /// Catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// Status of the item processing record
  @BuiltValueField(wireName: r'status')
  SupplementalItemProcessingStatus get status;
  // enum statusEnum {  SUCCESS,  FAILURE,  PROCESSING,  };

  /// Store code for the local inventory item
  @BuiltValueField(wireName: r'store_code')
  String get storeCode;

  @BuiltValueField(wireName: r'supplemental_type')
  LocalInventoryOperationResultSupplementalTypeEnum get supplementalType;
  // enum supplementalTypeEnum {  LOCAL_INVENTORY,  };

  /// Array with the validation warnings for the item processing record
  @BuiltValueField(wireName: r'warnings')
  BuiltList<SupplementalItemValidationEvent>? get warnings;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocalInventoryOperationResult> get serializer => _$LocalInventoryOperationResultSerializer();
}

class _$LocalInventoryOperationResultSerializer implements PrimitiveSerializer<LocalInventoryOperationResult> {
  @override
  final Iterable<Type> types = const [LocalInventoryOperationResult];

  @override
  final String wireName = r'LocalInventoryOperationResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocalInventoryOperationResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(SupplementalItemValidationEvent)]),
      );
    }
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
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
    yield r'supplemental_type';
    yield serializers.serialize(
      object.supplementalType,
      specifiedType: const FullType(LocalInventoryOperationResultSupplementalTypeEnum),
    );
    if (object.warnings != null) {
      yield r'warnings';
      yield serializers.serialize(
        object.warnings,
        specifiedType: const FullType(BuiltList, [FullType(SupplementalItemValidationEvent)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LocalInventoryOperationResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  LocalInventoryOperationResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($LocalInventoryOperationResult)) as $LocalInventoryOperationResult;
  }
}

/// a concrete implementation of [LocalInventoryOperationResult], since [LocalInventoryOperationResult] is not instantiable
@BuiltValue(instantiable: true)
abstract class $LocalInventoryOperationResult implements LocalInventoryOperationResult, Built<$LocalInventoryOperationResult, $LocalInventoryOperationResultBuilder> {
  $LocalInventoryOperationResult._();

  factory $LocalInventoryOperationResult([void Function($LocalInventoryOperationResultBuilder)? updates]) = _$$LocalInventoryOperationResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($LocalInventoryOperationResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$LocalInventoryOperationResult> get serializer => _$$LocalInventoryOperationResultSerializer();
}

class _$$LocalInventoryOperationResultSerializer implements PrimitiveSerializer<$LocalInventoryOperationResult> {
  @override
  final Iterable<Type> types = const [$LocalInventoryOperationResult, _$$LocalInventoryOperationResult];

  @override
  final String wireName = r'$LocalInventoryOperationResult';

  @override
  Object serialize(
    Serializers serializers,
    $LocalInventoryOperationResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(LocalInventoryOperationResult))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocalInventoryOperationResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(SupplementalItemValidationEvent)]),
          ) as BuiltList<SupplementalItemValidationEvent>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
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
        case r'supplemental_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LocalInventoryOperationResultSupplementalTypeEnum),
          ) as LocalInventoryOperationResultSupplementalTypeEnum;
          result.supplementalType = valueDes;
          break;
        case r'warnings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(SupplementalItemValidationEvent)]),
          ) as BuiltList<SupplementalItemValidationEvent>?;
          if (valueDes == null) continue;
          result.warnings.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $LocalInventoryOperationResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $LocalInventoryOperationResultBuilder();
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

class LocalInventoryOperationResultSupplementalTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'LOCAL_INVENTORY')
  static const LocalInventoryOperationResultSupplementalTypeEnum LOCAL_INVENTORY = _$localInventoryOperationResultSupplementalTypeEnum_LOCAL_INVENTORY;

  static Serializer<LocalInventoryOperationResultSupplementalTypeEnum> get serializer => _$localInventoryOperationResultSupplementalTypeEnumSerializer;

  const LocalInventoryOperationResultSupplementalTypeEnum._(String name): super(name);

  static BuiltSet<LocalInventoryOperationResultSupplementalTypeEnum> get values => _$localInventoryOperationResultSupplementalTypeEnumValues;
  static LocalInventoryOperationResultSupplementalTypeEnum valueOf(String name) => _$localInventoryOperationResultSupplementalTypeEnumValueOf(name);
}

