//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_strategy_type.g.dart';

class BidStrategyType extends EnumClass {

  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'AUTOMATIC_BID')
  static const BidStrategyType AUTOMATIC_BID = _$AUTOMATIC_BID;
  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'MAX_BID')
  static const BidStrategyType MAX_BID = _$MAX_BID;
  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'TARGET_AVG')
  static const BidStrategyType TARGET_AVG = _$TARGET_AVG;

  static Serializer<BidStrategyType> get serializer => _$bidStrategyTypeSerializer;

  const BidStrategyType._(String name): super(name);

  static BuiltSet<BidStrategyType> get values => _$values;
  static BidStrategyType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BidStrategyTypeMixin = Object with _$BidStrategyTypeMixin;

