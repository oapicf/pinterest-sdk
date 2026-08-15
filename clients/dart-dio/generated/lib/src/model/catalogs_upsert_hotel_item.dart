//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_upsert_hotel_item.g.dart';

/// A hotel item to be upserted.
///
/// Properties:
/// * [attributes] 
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsUpsertHotelItem implements Built<CatalogsUpsertHotelItem, CatalogsUpsertHotelItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsHotelAttributes get attributes;

  /// The catalog hotel id in the merchant namespace
  @BuiltValueField(wireName: r'hotel_id')
  String get hotelId;

  @BuiltValueField(wireName: r'operation')
  CatalogsUpsertHotelItemOperationEnum get operation;
  // enum operationEnum {  UPSERT,  };

  CatalogsUpsertHotelItem._();

  factory CatalogsUpsertHotelItem([void updates(CatalogsUpsertHotelItemBuilder b)]) = _$CatalogsUpsertHotelItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsUpsertHotelItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpsertHotelItem> get serializer => _$CatalogsUpsertHotelItemSerializer();
}

class _$CatalogsUpsertHotelItemSerializer implements PrimitiveSerializer<CatalogsUpsertHotelItem> {
  @override
  final Iterable<Type> types = const [CatalogsUpsertHotelItem, _$CatalogsUpsertHotelItem];

  @override
  final String wireName = r'CatalogsUpsertHotelItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpsertHotelItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(CatalogsHotelAttributes),
    );
    yield r'hotel_id';
    yield serializers.serialize(
      object.hotelId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsUpsertHotelItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpsertHotelItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpsertHotelItemBuilder result,
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
        case r'hotel_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.hotelId = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsUpsertHotelItemOperationEnum),
          ) as CatalogsUpsertHotelItemOperationEnum;
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
  CatalogsUpsertHotelItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsUpsertHotelItemBuilder();
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

class CatalogsUpsertHotelItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPSERT')
  static const CatalogsUpsertHotelItemOperationEnum UPSERT = _$catalogsUpsertHotelItemOperationEnum_UPSERT;

  static Serializer<CatalogsUpsertHotelItemOperationEnum> get serializer => _$catalogsUpsertHotelItemOperationEnumSerializer;

  const CatalogsUpsertHotelItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsUpsertHotelItemOperationEnum> get values => _$catalogsUpsertHotelItemOperationEnumValues;
  static CatalogsUpsertHotelItemOperationEnum valueOf(String name) => _$catalogsUpsertHotelItemOperationEnumValueOf(name);
}

