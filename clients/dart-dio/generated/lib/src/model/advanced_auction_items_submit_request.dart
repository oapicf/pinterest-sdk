//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/advanced_auction_items_submit_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items_submit_request.g.dart';

/// Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to all items
/// * [items] - Array of item bid option operations
@BuiltValue()
abstract class AdvancedAuctionItemsSubmitRequest implements Built<AdvancedAuctionItemsSubmitRequest, AdvancedAuctionItemsSubmitRequestBuilder> {
  /// Catalog id pertaining to all items
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  /// Array of item bid option operations
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvancedAuctionItemsSubmitRecord> get items;

  AdvancedAuctionItemsSubmitRequest._();

  factory AdvancedAuctionItemsSubmitRequest([void updates(AdvancedAuctionItemsSubmitRequestBuilder b)]) = _$AdvancedAuctionItemsSubmitRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsSubmitRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsSubmitRequest> get serializer => _$AdvancedAuctionItemsSubmitRequestSerializer();
}

class _$AdvancedAuctionItemsSubmitRequestSerializer implements PrimitiveSerializer<AdvancedAuctionItemsSubmitRequest> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsSubmitRequest, _$AdvancedAuctionItemsSubmitRequest];

  @override
  final String wireName = r'AdvancedAuctionItemsSubmitRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsSubmitRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_id';
    yield serializers.serialize(
      object.catalogId,
      specifiedType: const FullType(String),
    );
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionItemsSubmitRecord)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItemsSubmitRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsSubmitRequestBuilder result,
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
  AdvancedAuctionItemsSubmitRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsSubmitRequestBuilder();
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

