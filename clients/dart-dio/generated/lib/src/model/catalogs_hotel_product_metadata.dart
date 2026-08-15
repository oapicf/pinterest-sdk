//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_product_metadata.g.dart';

/// Hotel product metadata entity
///
/// Properties:
/// * [hotelId] - The user-created unique ID that represents the hotel item.
@BuiltValue()
abstract class CatalogsHotelProductMetadata implements Built<CatalogsHotelProductMetadata, CatalogsHotelProductMetadataBuilder> {
  /// The user-created unique ID that represents the hotel item.
  @BuiltValueField(wireName: r'hotel_id')
  String get hotelId;

  CatalogsHotelProductMetadata._();

  factory CatalogsHotelProductMetadata([void updates(CatalogsHotelProductMetadataBuilder b)]) = _$CatalogsHotelProductMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelProductMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelProductMetadata> get serializer => _$CatalogsHotelProductMetadataSerializer();
}

class _$CatalogsHotelProductMetadataSerializer implements PrimitiveSerializer<CatalogsHotelProductMetadata> {
  @override
  final Iterable<Type> types = const [CatalogsHotelProductMetadata, _$CatalogsHotelProductMetadata];

  @override
  final String wireName = r'CatalogsHotelProductMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelProductMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'hotel_id';
    yield serializers.serialize(
      object.hotelId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelProductMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelProductMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  CatalogsHotelProductMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelProductMetadataBuilder();
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

