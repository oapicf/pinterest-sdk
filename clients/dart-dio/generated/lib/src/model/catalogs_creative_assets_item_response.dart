//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_attributes.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_item_response.g.dart';

/// Object describing a hotel record
///
/// Properties:
/// * [attributes] 
/// * [catalogType] 
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [pins] - The pins mapped to the item
@BuiltValue()
abstract class CatalogsCreativeAssetsItemResponse implements Built<CatalogsCreativeAssetsItemResponse, CatalogsCreativeAssetsItemResponseBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsCreativeAssetsAttributes? get attributes;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// The catalog creative assets id in the merchant namespace
  @BuiltValueField(wireName: r'creative_assets_id')
  String? get creativeAssetsId;

  /// The pins mapped to the item
  @BuiltValueField(wireName: r'pins')
  BuiltList<Pin>? get pins;

  CatalogsCreativeAssetsItemResponse._();

  factory CatalogsCreativeAssetsItemResponse([void updates(CatalogsCreativeAssetsItemResponseBuilder b)]) = _$CatalogsCreativeAssetsItemResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsItemResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsItemResponse> get serializer => _$CatalogsCreativeAssetsItemResponseSerializer();
}

class _$CatalogsCreativeAssetsItemResponseSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsItemResponse> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsItemResponse, _$CatalogsCreativeAssetsItemResponse];

  @override
  final String wireName = r'CatalogsCreativeAssetsItemResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributes != null) {
      yield r'attributes';
      yield serializers.serialize(
        object.attributes,
        specifiedType: const FullType(CatalogsCreativeAssetsAttributes),
      );
    }
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
    CatalogsCreativeAssetsItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsItemResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsAttributes),
          ) as CatalogsCreativeAssetsAttributes;
          result.attributes.replace(valueDes);
          break;
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
  CatalogsCreativeAssetsItemResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsItemResponseBuilder();
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

