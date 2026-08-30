//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_id_filter.g.dart';

/// ItemIdFilter
///
/// Properties:
/// * [ITEM_ID] 
@BuiltValue()
abstract class ItemIdFilter implements Built<ItemIdFilter, ItemIdFilterBuilder> {
  @BuiltValueField(wireName: r'ITEM_ID')
  CatalogsProductGroupMultipleStringCriteria get ITEM_ID;

  ItemIdFilter._();

  factory ItemIdFilter([void updates(ItemIdFilterBuilder b)]) = _$ItemIdFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemIdFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemIdFilter> get serializer => _$ItemIdFilterSerializer();
}

class _$ItemIdFilterSerializer implements PrimitiveSerializer<ItemIdFilter> {
  @override
  final Iterable<Type> types = const [ItemIdFilter, _$ItemIdFilter];

  @override
  final String wireName = r'ItemIdFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ITEM_ID';
    yield serializers.serialize(
      object.ITEM_ID,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemIdFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ITEM_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.ITEM_ID.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemIdFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemIdFilterBuilder();
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

