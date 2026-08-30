//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/advanced_auction_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items.g.dart';

/// Response object containing item bid options
///
/// Properties:
/// * [catalogId] - Response object of item bid options
/// * [items] - Array with item bid options
@BuiltValue()
abstract class AdvancedAuctionItems implements Built<AdvancedAuctionItems, AdvancedAuctionItemsBuilder> {
  /// Response object of item bid options
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  /// Array with item bid options
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvancedAuctionItem>? get items;

  AdvancedAuctionItems._();

  factory AdvancedAuctionItems([void updates(AdvancedAuctionItemsBuilder b)]) = _$AdvancedAuctionItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItems> get serializer => _$AdvancedAuctionItemsSerializer();
}

class _$AdvancedAuctionItemsSerializer implements PrimitiveSerializer<AdvancedAuctionItems> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItems, _$AdvancedAuctionItems];

  @override
  final String wireName = r'AdvancedAuctionItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItems object, {
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
        specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.catalogId = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdvancedAuctionItem)]),
          ) as BuiltList<AdvancedAuctionItem>?;
          if (valueDes == null) continue;
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
  AdvancedAuctionItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsBuilder();
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

