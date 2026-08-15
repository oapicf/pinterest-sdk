//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/advanced_auction_items_get_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items_get_request.g.dart';

/// Request object used to get bid options values for a batch of retail catalog items
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the retail item
/// * [items] - A list of retail catalog items to fetch bid options for
@BuiltValue()
abstract class AdvancedAuctionItemsGetRequest implements Built<AdvancedAuctionItemsGetRequest, AdvancedAuctionItemsGetRequestBuilder> {
  /// Catalog id pertaining to the retail item
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  /// A list of retail catalog items to fetch bid options for
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvancedAuctionItemsGetRecord> get items;

  AdvancedAuctionItemsGetRequest._();

  factory AdvancedAuctionItemsGetRequest([void updates(AdvancedAuctionItemsGetRequestBuilder b)]) = _$AdvancedAuctionItemsGetRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsGetRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsGetRequest> get serializer => _$AdvancedAuctionItemsGetRequestSerializer();
}

class _$AdvancedAuctionItemsGetRequestSerializer implements PrimitiveSerializer<AdvancedAuctionItemsGetRequest> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsGetRequest, _$AdvancedAuctionItemsGetRequest];

  @override
  final String wireName = r'AdvancedAuctionItemsGetRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsGetRequest object, {
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
      specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionItemsGetRecord)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItemsGetRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsGetRequestBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(AdvancedAuctionItemsGetRecord)]),
          ) as BuiltList<AdvancedAuctionItemsGetRecord>;
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
  AdvancedAuctionItemsGetRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsGetRequestBuilder();
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

