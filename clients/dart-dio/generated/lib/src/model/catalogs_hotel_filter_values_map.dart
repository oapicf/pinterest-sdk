//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_filter_values_map.g.dart';

/// A map of filter attributes to their available values.
///
/// Properties:
/// * [brand] 
/// * [customLabel0] 
/// * [customLabel1] 
/// * [customLabel2] 
/// * [customLabel3] 
/// * [customLabel4] 
@BuiltValue()
abstract class CatalogsHotelFilterValuesMap implements Built<CatalogsHotelFilterValuesMap, CatalogsHotelFilterValuesMapBuilder> {
  @BuiltValueField(wireName: r'brand')
  BuiltList<String>? get brand;

  @BuiltValueField(wireName: r'custom_label_0')
  BuiltList<String>? get customLabel0;

  @BuiltValueField(wireName: r'custom_label_1')
  BuiltList<String>? get customLabel1;

  @BuiltValueField(wireName: r'custom_label_2')
  BuiltList<String>? get customLabel2;

  @BuiltValueField(wireName: r'custom_label_3')
  BuiltList<String>? get customLabel3;

  @BuiltValueField(wireName: r'custom_label_4')
  BuiltList<String>? get customLabel4;

  CatalogsHotelFilterValuesMap._();

  factory CatalogsHotelFilterValuesMap([void updates(CatalogsHotelFilterValuesMapBuilder b)]) = _$CatalogsHotelFilterValuesMap;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelFilterValuesMapBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelFilterValuesMap> get serializer => _$CatalogsHotelFilterValuesMapSerializer();
}

class _$CatalogsHotelFilterValuesMapSerializer implements PrimitiveSerializer<CatalogsHotelFilterValuesMap> {
  @override
  final Iterable<Type> types = const [CatalogsHotelFilterValuesMap, _$CatalogsHotelFilterValuesMap];

  @override
  final String wireName = r'CatalogsHotelFilterValuesMap';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelFilterValuesMap object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.brand != null) {
      yield r'brand';
      yield serializers.serialize(
        object.brand,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel0 != null) {
      yield r'custom_label_0';
      yield serializers.serialize(
        object.customLabel0,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel1 != null) {
      yield r'custom_label_1';
      yield serializers.serialize(
        object.customLabel1,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel2 != null) {
      yield r'custom_label_2';
      yield serializers.serialize(
        object.customLabel2,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel3 != null) {
      yield r'custom_label_3';
      yield serializers.serialize(
        object.customLabel3,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.customLabel4 != null) {
      yield r'custom_label_4';
      yield serializers.serialize(
        object.customLabel4,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelFilterValuesMap object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelFilterValuesMapBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.brand.replace(valueDes);
          break;
        case r'custom_label_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel0.replace(valueDes);
          break;
        case r'custom_label_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel1.replace(valueDes);
          break;
        case r'custom_label_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel2.replace(valueDes);
          break;
        case r'custom_label_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel3.replace(valueDes);
          break;
        case r'custom_label_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customLabel4.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelFilterValuesMap deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelFilterValuesMapBuilder();
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

