//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_item_error_response.g.dart';

/// Object describing a retail item error
///
/// Properties:
/// * [catalogType] 
/// * [errors] - Array with the errors for the item id requested
/// * [itemId] - The catalog item id in the merchant namespace
/// * [itemResponseKind] - Discriminator literal identifying this leaf inside an `ItemResponse` payload.
@BuiltValue()
abstract class CatalogsRetailItemErrorResponse implements Built<CatalogsRetailItemErrorResponse, CatalogsRetailItemErrorResponseBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailItemErrorResponseCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  /// Array with the errors for the item id requested
  @BuiltValueField(wireName: r'errors')
  BuiltList<ItemValidationEvent> get errors;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  @BuiltValueField(wireName: r'item_response_kind')
  CatalogsRetailItemErrorResponseItemResponseKindEnum get itemResponseKind;
  // enum itemResponseKindEnum {  retail_item_error,  };

  CatalogsRetailItemErrorResponse._();

  factory CatalogsRetailItemErrorResponse([void updates(CatalogsRetailItemErrorResponseBuilder b)]) = _$CatalogsRetailItemErrorResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailItemErrorResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailItemErrorResponse> get serializer => _$CatalogsRetailItemErrorResponseSerializer();
}

class _$CatalogsRetailItemErrorResponseSerializer implements PrimitiveSerializer<CatalogsRetailItemErrorResponse> {
  @override
  final Iterable<Type> types = const [CatalogsRetailItemErrorResponse, _$CatalogsRetailItemErrorResponse];

  @override
  final String wireName = r'CatalogsRetailItemErrorResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailItemErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsRetailItemErrorResponseCatalogTypeEnum),
    );
    yield r'errors';
    yield serializers.serialize(
      object.errors,
      specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
    );
    if (object.itemId != null) {
      yield r'item_id';
      yield serializers.serialize(
        object.itemId,
        specifiedType: const FullType(String),
      );
    }
    yield r'item_response_kind';
    yield serializers.serialize(
      object.itemResponseKind,
      specifiedType: const FullType(CatalogsRetailItemErrorResponseItemResponseKindEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailItemErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailItemErrorResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailItemErrorResponseCatalogTypeEnum),
          ) as CatalogsRetailItemErrorResponseCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
          ) as BuiltList<ItemValidationEvent>;
          result.errors.replace(valueDes);
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemId = valueDes;
          break;
        case r'item_response_kind':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailItemErrorResponseItemResponseKindEnum),
          ) as CatalogsRetailItemErrorResponseItemResponseKindEnum;
          result.itemResponseKind = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailItemErrorResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailItemErrorResponseBuilder();
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

class CatalogsRetailItemErrorResponseCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailItemErrorResponseCatalogTypeEnum RETAIL = _$catalogsRetailItemErrorResponseCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailItemErrorResponseCatalogTypeEnum> get serializer => _$catalogsRetailItemErrorResponseCatalogTypeEnumSerializer;

  const CatalogsRetailItemErrorResponseCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailItemErrorResponseCatalogTypeEnum> get values => _$catalogsRetailItemErrorResponseCatalogTypeEnumValues;
  static CatalogsRetailItemErrorResponseCatalogTypeEnum valueOf(String name) => _$catalogsRetailItemErrorResponseCatalogTypeEnumValueOf(name);
}

class CatalogsRetailItemErrorResponseItemResponseKindEnum extends EnumClass {

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  @BuiltValueEnumConst(wireName: r'retail_item_error')
  static const CatalogsRetailItemErrorResponseItemResponseKindEnum retailItemError = _$catalogsRetailItemErrorResponseItemResponseKindEnum_retailItemError;

  static Serializer<CatalogsRetailItemErrorResponseItemResponseKindEnum> get serializer => _$catalogsRetailItemErrorResponseItemResponseKindEnumSerializer;

  const CatalogsRetailItemErrorResponseItemResponseKindEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailItemErrorResponseItemResponseKindEnum> get values => _$catalogsRetailItemErrorResponseItemResponseKindEnumValues;
  static CatalogsRetailItemErrorResponseItemResponseKindEnum valueOf(String name) => _$catalogsRetailItemErrorResponseItemResponseKindEnumValueOf(name);
}

