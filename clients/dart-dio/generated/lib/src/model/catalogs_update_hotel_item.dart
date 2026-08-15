//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_updatable_hotel_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_update_hotel_item.g.dart';

/// Object describing an hotel item batch record
///
/// Properties:
/// * [attributes] 
/// * [hotelId] - The catalog hotel item id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsUpdateHotelItem implements Built<CatalogsUpdateHotelItem, CatalogsUpdateHotelItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsUpdatableHotelAttributes get attributes;

  /// The catalog hotel item id in the merchant namespace
  @BuiltValueField(wireName: r'hotel_id')
  String get hotelId;

  @BuiltValueField(wireName: r'operation')
  CatalogsUpdateHotelItemOperationEnum get operation;
  // enum operationEnum {  UPDATE,  };

  CatalogsUpdateHotelItem._();

  factory CatalogsUpdateHotelItem([void updates(CatalogsUpdateHotelItemBuilder b)]) = _$CatalogsUpdateHotelItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsUpdateHotelItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpdateHotelItem> get serializer => _$CatalogsUpdateHotelItemSerializer();
}

class _$CatalogsUpdateHotelItemSerializer implements PrimitiveSerializer<CatalogsUpdateHotelItem> {
  @override
  final Iterable<Type> types = const [CatalogsUpdateHotelItem, _$CatalogsUpdateHotelItem];

  @override
  final String wireName = r'CatalogsUpdateHotelItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpdateHotelItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(CatalogsUpdatableHotelAttributes),
    );
    yield r'hotel_id';
    yield serializers.serialize(
      object.hotelId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsUpdateHotelItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpdateHotelItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpdateHotelItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsUpdatableHotelAttributes),
          ) as CatalogsUpdatableHotelAttributes;
          result.attributes = valueDes;
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
            specifiedType: const FullType(CatalogsUpdateHotelItemOperationEnum),
          ) as CatalogsUpdateHotelItemOperationEnum;
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
  CatalogsUpdateHotelItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsUpdateHotelItemBuilder();
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

class CatalogsUpdateHotelItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const CatalogsUpdateHotelItemOperationEnum UPDATE = _$catalogsUpdateHotelItemOperationEnum_UPDATE;

  static Serializer<CatalogsUpdateHotelItemOperationEnum> get serializer => _$catalogsUpdateHotelItemOperationEnumSerializer;

  const CatalogsUpdateHotelItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsUpdateHotelItemOperationEnum> get values => _$catalogsUpdateHotelItemOperationEnumValues;
  static CatalogsUpdateHotelItemOperationEnum valueOf(String name) => _$catalogsUpdateHotelItemOperationEnumValueOf(name);
}

