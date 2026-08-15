//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_delete_hotel_item.g.dart';

/// A hotel item to be deleted
///
/// Properties:
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsDeleteHotelItem implements Built<CatalogsDeleteHotelItem, CatalogsDeleteHotelItemBuilder> {
  /// The catalog hotel id in the merchant namespace
  @BuiltValueField(wireName: r'hotel_id')
  String get hotelId;

  @BuiltValueField(wireName: r'operation')
  CatalogsDeleteHotelItemOperationEnum get operation;
  // enum operationEnum {  DELETE,  };

  CatalogsDeleteHotelItem._();

  factory CatalogsDeleteHotelItem([void updates(CatalogsDeleteHotelItemBuilder b)]) = _$CatalogsDeleteHotelItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsDeleteHotelItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsDeleteHotelItem> get serializer => _$CatalogsDeleteHotelItemSerializer();
}

class _$CatalogsDeleteHotelItemSerializer implements PrimitiveSerializer<CatalogsDeleteHotelItem> {
  @override
  final Iterable<Type> types = const [CatalogsDeleteHotelItem, _$CatalogsDeleteHotelItem];

  @override
  final String wireName = r'CatalogsDeleteHotelItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsDeleteHotelItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'hotel_id';
    yield serializers.serialize(
      object.hotelId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsDeleteHotelItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsDeleteHotelItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsDeleteHotelItemBuilder result,
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
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsDeleteHotelItemOperationEnum),
          ) as CatalogsDeleteHotelItemOperationEnum;
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
  CatalogsDeleteHotelItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsDeleteHotelItemBuilder();
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

class CatalogsDeleteHotelItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsDeleteHotelItemOperationEnum DELETE = _$catalogsDeleteHotelItemOperationEnum_DELETE;

  static Serializer<CatalogsDeleteHotelItemOperationEnum> get serializer => _$catalogsDeleteHotelItemOperationEnumSerializer;

  const CatalogsDeleteHotelItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsDeleteHotelItemOperationEnum> get values => _$catalogsDeleteHotelItemOperationEnumValues;
  static CatalogsDeleteHotelItemOperationEnum valueOf(String name) => _$catalogsDeleteHotelItemOperationEnumValueOf(name);
}

