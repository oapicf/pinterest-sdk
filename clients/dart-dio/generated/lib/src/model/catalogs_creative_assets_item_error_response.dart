//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_item_error_response.g.dart';

/// Object describing a creative assets item error
///
/// Properties:
/// * [catalogType] 
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [errors] - Array with the errors for the item id requested
@BuiltValue()
abstract class CatalogsCreativeAssetsItemErrorResponse implements Built<CatalogsCreativeAssetsItemErrorResponse, CatalogsCreativeAssetsItemErrorResponseBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// The catalog creative assets id in the merchant namespace
  @BuiltValueField(wireName: r'creative_assets_id')
  String? get creativeAssetsId;

  /// Array with the errors for the item id requested
  @BuiltValueField(wireName: r'errors')
  BuiltList<ItemValidationEvent> get errors;

  CatalogsCreativeAssetsItemErrorResponse._();

  factory CatalogsCreativeAssetsItemErrorResponse([void updates(CatalogsCreativeAssetsItemErrorResponseBuilder b)]) = _$CatalogsCreativeAssetsItemErrorResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsItemErrorResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsItemErrorResponse> get serializer => _$CatalogsCreativeAssetsItemErrorResponseSerializer();
}

class _$CatalogsCreativeAssetsItemErrorResponseSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsItemErrorResponse> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsItemErrorResponse, _$CatalogsCreativeAssetsItemErrorResponse];

  @override
  final String wireName = r'CatalogsCreativeAssetsItemErrorResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsItemErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    if (object.creativeAssetsId != null) {
      yield r'creative_assets_id';
      yield serializers.serialize(
        object.creativeAssetsId,
        specifiedType: const FullType(String),
      );
    }
    yield r'errors';
    yield serializers.serialize(
      object.errors,
      specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsItemErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsItemErrorResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsType),
          ) as CatalogsType;
          result.catalogType = valueDes;
          break;
        case r'creative_assets_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.creativeAssetsId = valueDes;
          break;
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
          ) as BuiltList<ItemValidationEvent>;
          result.errors.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsItemErrorResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsItemErrorResponseBuilder();
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

