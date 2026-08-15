//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_item_error_response.g.dart';

/// Object describing a hotel item error
///
/// Properties:
/// * [catalogType] 
/// * [errors] - Array with the errors for the item id requested
/// * [hotelId] - The catalog hotel id in the merchant namespace
@BuiltValue()
abstract class CatalogsHotelItemErrorResponse implements Built<CatalogsHotelItemErrorResponse, CatalogsHotelItemErrorResponseBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// Array with the errors for the item id requested
  @BuiltValueField(wireName: r'errors')
  BuiltList<ItemValidationEvent> get errors;

  /// The catalog hotel id in the merchant namespace
  @BuiltValueField(wireName: r'hotel_id')
  String? get hotelId;

  CatalogsHotelItemErrorResponse._();

  factory CatalogsHotelItemErrorResponse([void updates(CatalogsHotelItemErrorResponseBuilder b)]) = _$CatalogsHotelItemErrorResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelItemErrorResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelItemErrorResponse> get serializer => _$CatalogsHotelItemErrorResponseSerializer();
}

class _$CatalogsHotelItemErrorResponseSerializer implements PrimitiveSerializer<CatalogsHotelItemErrorResponse> {
  @override
  final Iterable<Type> types = const [CatalogsHotelItemErrorResponse, _$CatalogsHotelItemErrorResponse];

  @override
  final String wireName = r'CatalogsHotelItemErrorResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelItemErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    yield r'errors';
    yield serializers.serialize(
      object.errors,
      specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
    );
    if (object.hotelId != null) {
      yield r'hotel_id';
      yield serializers.serialize(
        object.hotelId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelItemErrorResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelItemErrorResponseBuilder result,
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
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
          ) as BuiltList<ItemValidationEvent>;
          result.errors.replace(valueDes);
          break;
        case r'hotel_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.hotelId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelItemErrorResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelItemErrorResponseBuilder();
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

