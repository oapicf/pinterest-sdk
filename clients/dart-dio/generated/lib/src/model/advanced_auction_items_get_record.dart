//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/advanced_auction_key.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/language.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_items_get_record.g.dart';

/// Object uniquely identifying a retail catalog item
///
/// Properties:
/// * [country] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
@BuiltValue()
abstract class AdvancedAuctionItemsGetRecord implements AdvancedAuctionKey, Built<AdvancedAuctionItemsGetRecord, AdvancedAuctionItemsGetRecordBuilder> {
  AdvancedAuctionItemsGetRecord._();

  factory AdvancedAuctionItemsGetRecord([void updates(AdvancedAuctionItemsGetRecordBuilder b)]) = _$AdvancedAuctionItemsGetRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionItemsGetRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItemsGetRecord> get serializer => _$AdvancedAuctionItemsGetRecordSerializer();
}

class _$AdvancedAuctionItemsGetRecordSerializer implements PrimitiveSerializer<AdvancedAuctionItemsGetRecord> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItemsGetRecord, _$AdvancedAuctionItemsGetRecord];

  @override
  final String wireName = r'AdvancedAuctionItemsGetRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItemsGetRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'country';
    yield serializers.serialize(
      object.country,
      specifiedType: const FullType(Country),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(Language),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionItemsGetRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemsGetRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Country),
          ) as Country;
          result.country = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Language),
          ) as Language;
          result.language = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvancedAuctionItemsGetRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionItemsGetRecordBuilder();
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

