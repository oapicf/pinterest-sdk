//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/advanced_auction_items_submit_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_processed_items.g.dart';

/// Response object containing the results of an operation on an item bid option
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to all items
/// * [items] - Array of advanced auction processed items
@BuiltValue()
abstract class AdvancedAuctionProcessedItems implements Built<AdvancedAuctionProcessedItems, AdvancedAuctionProcessedItemsBuilder> {
  /// Catalog id pertaining to all items
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  /// Array of advanced auction processed items
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvancedAuctionItemsSubmitRecord>? get items;

  AdvancedAuctionProcessedItems._();

  factory AdvancedAuctionProcessedItems([void updates(AdvancedAuctionProcessedItemsBuilder b)]) = _$AdvancedAuctionProcessedItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionProcessedItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionProcessedItems> get serializer => _$AdvancedAuctionProcessedItemsSerializer();
}

class _$AdvancedAuctionProcessedItemsSerializer implements PrimitiveSerializer<AdvancedAuctionProcessedItems> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionProcessedItems, _$AdvancedAuctionProcessedItems];

  @override
  final String wireName = r'AdvancedAuctionProcessedItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionProcessedItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogId != null) {
      yield r'catalog_id';
      yield serializers.serialize(
        object.catalogId,
        specifiedType: const FullType(String),
      );
    }
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionItemsSubmitRecord)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionProcessedItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionProcessedItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.catalogId = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionItemsSubmitRecord)]),
          ) as BuiltList<AdvancedAuctionItemsSubmitRecord>;
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
  AdvancedAuctionProcessedItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionProcessedItemsBuilder();
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

