//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_attributes.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_item_response.g.dart';

/// Object describing a hotel record
///
/// Properties:
/// * [attributes] 
/// * [catalogType] 
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [pins] - The pins mapped to the item
@BuiltValue()
abstract class CatalogsHotelItemResponse implements Built<CatalogsHotelItemResponse, CatalogsHotelItemResponseBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsHotelAttributes? get attributes;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// The catalog hotel id in the merchant namespace
  @BuiltValueField(wireName: r'hotel_id')
  String? get hotelId;

  /// The pins mapped to the item
  @BuiltValueField(wireName: r'pins')
  BuiltList<Pin>? get pins;

  CatalogsHotelItemResponse._();

  factory CatalogsHotelItemResponse([void updates(CatalogsHotelItemResponseBuilder b)]) = _$CatalogsHotelItemResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelItemResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelItemResponse> get serializer => _$CatalogsHotelItemResponseSerializer();
}

class _$CatalogsHotelItemResponseSerializer implements PrimitiveSerializer<CatalogsHotelItemResponse> {
  @override
  final Iterable<Type> types = const [CatalogsHotelItemResponse, _$CatalogsHotelItemResponse];

  @override
  final String wireName = r'CatalogsHotelItemResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributes != null) {
      yield r'attributes';
      yield serializers.serialize(
        object.attributes,
        specifiedType: const FullType(CatalogsHotelAttributes),
      );
    }
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    if (object.hotelId != null) {
      yield r'hotel_id';
      yield serializers.serialize(
        object.hotelId,
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
    CatalogsHotelItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelItemResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelAttributes),
          ) as CatalogsHotelAttributes;
          result.attributes.replace(valueDes);
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsType),
          ) as CatalogsType;
          result.catalogType = valueDes;
          break;
        case r'hotel_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.hotelId = valueDes;
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
  CatalogsHotelItemResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelItemResponseBuilder();
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

