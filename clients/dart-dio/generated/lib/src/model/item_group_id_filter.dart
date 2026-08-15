//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_group_id_filter.g.dart';

/// ItemGroupIdFilter
///
/// Properties:
/// * [ITEM_GROUP_ID] 
@BuiltValue()
abstract class ItemGroupIdFilter implements Built<ItemGroupIdFilter, ItemGroupIdFilterBuilder> {
  @BuiltValueField(wireName: r'ITEM_GROUP_ID')
  CatalogsProductGroupMultipleStringCriteria get ITEM_GROUP_ID;

  ItemGroupIdFilter._();

  factory ItemGroupIdFilter([void updates(ItemGroupIdFilterBuilder b)]) = _$ItemGroupIdFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemGroupIdFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemGroupIdFilter> get serializer => _$ItemGroupIdFilterSerializer();
}

class _$ItemGroupIdFilterSerializer implements PrimitiveSerializer<ItemGroupIdFilter> {
  @override
  final Iterable<Type> types = const [ItemGroupIdFilter, _$ItemGroupIdFilter];

  @override
  final String wireName = r'ItemGroupIdFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemGroupIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ITEM_GROUP_ID';
    yield serializers.serialize(
      object.ITEM_GROUP_ID,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemGroupIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemGroupIdFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ITEM_GROUP_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.ITEM_GROUP_ID = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemGroupIdFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemGroupIdFilterBuilder();
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

