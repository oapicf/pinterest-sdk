//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/app_type_multipliers.dart';
import 'package:openapi/src/model/placement_multipliers.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_bid_options.g.dart';

/// Object describing a retail catalog item's bid options (bid price and bid multipliers).
///
/// Properties:
/// * [appTypeMultipliers] 
/// * [bidInMicroCurrency] - Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
/// * [placementMultipliers] 
@BuiltValue()
abstract class AdvancedAuctionBidOptions implements Built<AdvancedAuctionBidOptions, AdvancedAuctionBidOptionsBuilder> {
  @BuiltValueField(wireName: r'app_type_multipliers')
  AppTypeMultipliers? get appTypeMultipliers;

  /// Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
  @BuiltValueField(wireName: r'bid_in_micro_currency')
  int? get bidInMicroCurrency;

  @BuiltValueField(wireName: r'placement_multipliers')
  PlacementMultipliers? get placementMultipliers;

  AdvancedAuctionBidOptions._();

  factory AdvancedAuctionBidOptions([void updates(AdvancedAuctionBidOptionsBuilder b)]) = _$AdvancedAuctionBidOptions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionBidOptionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionBidOptions> get serializer => _$AdvancedAuctionBidOptionsSerializer();
}

class _$AdvancedAuctionBidOptionsSerializer implements PrimitiveSerializer<AdvancedAuctionBidOptions> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionBidOptions, _$AdvancedAuctionBidOptions];

  @override
  final String wireName = r'AdvancedAuctionBidOptions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionBidOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.appTypeMultipliers != null) {
      yield r'app_type_multipliers';
      yield serializers.serialize(
        object.appTypeMultipliers,
        specifiedType: const FullType.nullable(AppTypeMultipliers),
      );
    }
    if (object.bidInMicroCurrency != null) {
      yield r'bid_in_micro_currency';
      yield serializers.serialize(
        object.bidInMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.placementMultipliers != null) {
      yield r'placement_multipliers';
      yield serializers.serialize(
        object.placementMultipliers,
        specifiedType: const FullType.nullable(PlacementMultipliers),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionBidOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionBidOptionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'app_type_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AppTypeMultipliers),
          ) as AppTypeMultipliers?;
          if (valueDes == null) continue;
          result.appTypeMultipliers = valueDes;
          break;
        case r'bid_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.bidInMicroCurrency = valueDes;
          break;
        case r'placement_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PlacementMultipliers),
          ) as PlacementMultipliers?;
          if (valueDes == null) continue;
          result.placementMultipliers = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvancedAuctionBidOptions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionBidOptionsBuilder();
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

