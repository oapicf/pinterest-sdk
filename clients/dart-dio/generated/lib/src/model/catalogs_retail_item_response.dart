//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/item_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_item_response.g.dart';

/// Object describing a retail item record
///
/// Properties:
/// * [attributes] 
/// * [catalogType] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [pins] - The pins mapped to the item
@BuiltValue()
abstract class CatalogsRetailItemResponse implements Built<CatalogsRetailItemResponse, CatalogsRetailItemResponseBuilder> {
  @BuiltValueField(wireName: r'attributes')
  ItemAttributes? get attributes;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// The catalog retail item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  /// The pins mapped to the item
  @BuiltValueField(wireName: r'pins')
  BuiltList<Pin>? get pins;

  CatalogsRetailItemResponse._();

  factory CatalogsRetailItemResponse([void updates(CatalogsRetailItemResponseBuilder b)]) = _$CatalogsRetailItemResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailItemResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailItemResponse> get serializer => _$CatalogsRetailItemResponseSerializer();
}

class _$CatalogsRetailItemResponseSerializer implements PrimitiveSerializer<CatalogsRetailItemResponse> {
  @override
  final Iterable<Type> types = const [CatalogsRetailItemResponse, _$CatalogsRetailItemResponse];

  @override
  final String wireName = r'CatalogsRetailItemResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributes != null) {
      yield r'attributes';
      yield serializers.serialize(
        object.attributes,
        specifiedType: const FullType(ItemAttributes),
      );
    }
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    if (object.itemId != null) {
      yield r'item_id';
      yield serializers.serialize(
        object.itemId,
        specifiedType: const FullType(String),
      );
    }
    if (object.pins != null) {
      yield r'pins';
      yield serializers.serialize(
        object.pins,
        specifiedType: const FullType.nullable(BuiltList, [FullType(Pin)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailItemResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemAttributes),
          ) as ItemAttributes;
          result.attributes.replace(valueDes);
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsType),
          ) as CatalogsType;
          result.catalogType = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'pins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Pin)]),
          ) as BuiltList<Pin>?;
          if (valueDes == null) continue;
          result.pins.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailItemResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailItemResponseBuilder();
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

