//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_delete_retail_item.g.dart';

/// An item to be deleted
///
/// Properties:
/// * [itemId] - The catalog item id in the merchant namespace
/// * [lastUpdatedTime] - The millisecond timestamp when the item was lastly modified by the merchant.
/// * [operation] 
@BuiltValue()
abstract class CatalogsDeleteRetailItem implements Built<CatalogsDeleteRetailItem, CatalogsDeleteRetailItemBuilder> {
  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The millisecond timestamp when the item was lastly modified by the merchant.
  @BuiltValueField(wireName: r'last_updated_time')
  int? get lastUpdatedTime;

  @BuiltValueField(wireName: r'operation')
  CatalogsDeleteRetailItemOperationEnum get operation;
  // enum operationEnum {  DELETE,  };

  CatalogsDeleteRetailItem._();

  factory CatalogsDeleteRetailItem([void updates(CatalogsDeleteRetailItemBuilder b)]) = _$CatalogsDeleteRetailItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsDeleteRetailItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsDeleteRetailItem> get serializer => _$CatalogsDeleteRetailItemSerializer();
}

class _$CatalogsDeleteRetailItemSerializer implements PrimitiveSerializer<CatalogsDeleteRetailItem> {
  @override
  final Iterable<Type> types = const [CatalogsDeleteRetailItem, _$CatalogsDeleteRetailItem];

  @override
  final String wireName = r'CatalogsDeleteRetailItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsDeleteRetailItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    if (object.lastUpdatedTime != null) {
      yield r'last_updated_time';
      yield serializers.serialize(
        object.lastUpdatedTime,
        specifiedType: const FullType(int),
      );
    }
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsDeleteRetailItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsDeleteRetailItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsDeleteRetailItemBuilder result,
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
        case r'last_updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lastUpdatedTime = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsDeleteRetailItemOperationEnum),
          ) as CatalogsDeleteRetailItemOperationEnum;
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
  CatalogsDeleteRetailItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsDeleteRetailItemBuilder();
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

class CatalogsDeleteRetailItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsDeleteRetailItemOperationEnum DELETE = _$catalogsDeleteRetailItemOperationEnum_DELETE;

  static Serializer<CatalogsDeleteRetailItemOperationEnum> get serializer => _$catalogsDeleteRetailItemOperationEnumSerializer;

  const CatalogsDeleteRetailItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsDeleteRetailItemOperationEnum> get values => _$catalogsDeleteRetailItemOperationEnumValues;
  static CatalogsDeleteRetailItemOperationEnum valueOf(String name) => _$catalogsDeleteRetailItemOperationEnumValueOf(name);
}

