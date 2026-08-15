//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_items.g.dart';

/// Response object of catalogs items
///
/// Properties:
/// * [items] - Array with catalogs items
@BuiltValue()
abstract class CatalogsItems implements Built<CatalogsItems, CatalogsItemsBuilder> {
  /// Array with catalogs items
  @BuiltValueField(wireName: r'items')
  BuiltList<ItemResponse>? get items;

  CatalogsItems._();

  factory CatalogsItems([void updates(CatalogsItemsBuilder b)]) = _$CatalogsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItems> get serializer => _$CatalogsItemsSerializer();
}

class _$CatalogsItemsSerializer implements PrimitiveSerializer<CatalogsItems> {
  @override
  final Iterable<Type> types = const [CatalogsItems, _$CatalogsItems];

  @override
  final String wireName = r'CatalogsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(ItemResponse)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemResponse)]),
          ) as BuiltList<ItemResponse>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemsBuilder();
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

