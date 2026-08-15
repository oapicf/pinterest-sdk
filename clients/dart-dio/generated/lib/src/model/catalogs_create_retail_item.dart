//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_attributes_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_create_retail_item.g.dart';

/// An item to be created
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsCreateRetailItem implements Built<CatalogsCreateRetailItem, CatalogsCreateRetailItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  ItemAttributesRequest get attributes;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  @BuiltValueField(wireName: r'operation')
  CatalogsCreateRetailItemOperationEnum get operation;
  // enum operationEnum {  CREATE,  };

  CatalogsCreateRetailItem._();

  factory CatalogsCreateRetailItem([void updates(CatalogsCreateRetailItemBuilder b)]) = _$CatalogsCreateRetailItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreateRetailItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreateRetailItem> get serializer => _$CatalogsCreateRetailItemSerializer();
}

class _$CatalogsCreateRetailItemSerializer implements PrimitiveSerializer<CatalogsCreateRetailItem> {
  @override
  final Iterable<Type> types = const [CatalogsCreateRetailItem, _$CatalogsCreateRetailItem];

  @override
  final String wireName = r'CatalogsCreateRetailItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreateRetailItem object, {
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
      specifiedType: const FullType(CatalogsCreateRetailItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreateRetailItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreateRetailItemBuilder result,
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
            specifiedType: const FullType(CatalogsCreateRetailItemOperationEnum),
          ) as CatalogsCreateRetailItemOperationEnum;
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
  CatalogsCreateRetailItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreateRetailItemBuilder();
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

class CatalogsCreateRetailItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATE')
  static const CatalogsCreateRetailItemOperationEnum CREATE = _$catalogsCreateRetailItemOperationEnum_CREATE;

  static Serializer<CatalogsCreateRetailItemOperationEnum> get serializer => _$catalogsCreateRetailItemOperationEnumSerializer;

  const CatalogsCreateRetailItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsCreateRetailItemOperationEnum> get values => _$catalogsCreateRetailItemOperationEnumValues;
  static CatalogsCreateRetailItemOperationEnum valueOf(String name) => _$catalogsCreateRetailItemOperationEnumValueOf(name);
}

