//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_create_hotel_item.g.dart';

/// A hotel item to be created.
///
/// Properties:
/// * [attributes] 
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsCreateHotelItem implements Built<CatalogsCreateHotelItem, CatalogsCreateHotelItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsHotelAttributes get attributes;

  /// The catalog hotel id in the merchant namespace
  @BuiltValueField(wireName: r'hotel_id')
  String get hotelId;

  @BuiltValueField(wireName: r'operation')
  CatalogsCreateHotelItemOperationEnum get operation;
  // enum operationEnum {  CREATE,  };

  CatalogsCreateHotelItem._();

  factory CatalogsCreateHotelItem([void updates(CatalogsCreateHotelItemBuilder b)]) = _$CatalogsCreateHotelItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreateHotelItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreateHotelItem> get serializer => _$CatalogsCreateHotelItemSerializer();
}

class _$CatalogsCreateHotelItemSerializer implements PrimitiveSerializer<CatalogsCreateHotelItem> {
  @override
  final Iterable<Type> types = const [CatalogsCreateHotelItem, _$CatalogsCreateHotelItem];

  @override
  final String wireName = r'CatalogsCreateHotelItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreateHotelItem object, {
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
      specifiedType: const FullType(CatalogsCreateHotelItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreateHotelItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreateHotelItemBuilder result,
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
            specifiedType: const FullType(CatalogsCreateHotelItemOperationEnum),
          ) as CatalogsCreateHotelItemOperationEnum;
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
  CatalogsCreateHotelItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreateHotelItemBuilder();
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

class CatalogsCreateHotelItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATE')
  static const CatalogsCreateHotelItemOperationEnum CREATE = _$catalogsCreateHotelItemOperationEnum_CREATE;

  static Serializer<CatalogsCreateHotelItemOperationEnum> get serializer => _$catalogsCreateHotelItemOperationEnumSerializer;

  const CatalogsCreateHotelItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsCreateHotelItemOperationEnum> get values => _$catalogsCreateHotelItemOperationEnumValues;
  static CatalogsCreateHotelItemOperationEnum valueOf(String name) => _$catalogsCreateHotelItemOperationEnumValueOf(name);
}

