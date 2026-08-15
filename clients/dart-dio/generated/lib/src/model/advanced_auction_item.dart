//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/advanced_auction_key.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/advanced_auction_bid_options.dart';
import 'package:openapi/src/model/language.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_item.g.dart';

/// AdvancedAuctionItem
///
/// Properties:
/// * [country] 
/// * [itemId] - The catalog retail item id in the merchant namespace
/// * [language] 
/// * [bidOptions] 
@BuiltValue(instantiable: false)
abstract class AdvancedAuctionItem implements AdvancedAuctionKey {
  @BuiltValueField(wireName: r'bid_options')
  AdvancedAuctionBidOptions get bidOptions;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionItem> get serializer => _$AdvancedAuctionItemSerializer();
}

class _$AdvancedAuctionItemSerializer implements PrimitiveSerializer<AdvancedAuctionItem> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionItem];

  @override
  final String wireName = r'AdvancedAuctionItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionItem object, {
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
    yield r'bid_options';
    yield serializers.serialize(
      object.bidOptions,
      specifiedType: const FullType(AdvancedAuctionBidOptions),
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
    AdvancedAuctionItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  AdvancedAuctionItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($AdvancedAuctionItem)) as $AdvancedAuctionItem;
  }
}

/// a concrete implementation of [AdvancedAuctionItem], since [AdvancedAuctionItem] is not instantiable
@BuiltValue(instantiable: true)
abstract class $AdvancedAuctionItem implements AdvancedAuctionItem, Built<$AdvancedAuctionItem, $AdvancedAuctionItemBuilder> {
  $AdvancedAuctionItem._();

  factory $AdvancedAuctionItem([void Function($AdvancedAuctionItemBuilder)? updates]) = _$$AdvancedAuctionItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($AdvancedAuctionItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$AdvancedAuctionItem> get serializer => _$$AdvancedAuctionItemSerializer();
}

class _$$AdvancedAuctionItemSerializer implements PrimitiveSerializer<$AdvancedAuctionItem> {
  @override
  final Iterable<Type> types = const [$AdvancedAuctionItem, _$$AdvancedAuctionItem];

  @override
  final String wireName = r'$AdvancedAuctionItem';

  @override
  Object serialize(
    Serializers serializers,
    $AdvancedAuctionItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(AdvancedAuctionItem))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionItemBuilder result,
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
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdvancedAuctionBidOptions),
          ) as AdvancedAuctionBidOptions;
          result.bidOptions.replace(valueDes);
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
  $AdvancedAuctionItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $AdvancedAuctionItemBuilder();
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

