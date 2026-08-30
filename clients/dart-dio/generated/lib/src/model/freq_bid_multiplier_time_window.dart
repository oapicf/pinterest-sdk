//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'freq_bid_multiplier_time_window.g.dart';

class FreqBidMultiplierTimeWindow extends EnumClass {

  /// The time window for frequency bid multipliers.
  @BuiltValueEnumConst(wireName: r'WEEK')
  static const FreqBidMultiplierTimeWindow WEEK = _$WEEK;
  /// The time window for frequency bid multipliers.
  @BuiltValueEnumConst(wireName: r'MONTH')
  static const FreqBidMultiplierTimeWindow MONTH = _$MONTH;

  static Serializer<FreqBidMultiplierTimeWindow> get serializer => _$freqBidMultiplierTimeWindowSerializer;

  const FreqBidMultiplierTimeWindow._(String name): super(name);

  static BuiltSet<FreqBidMultiplierTimeWindow> get values => _$values;
  static FreqBidMultiplierTimeWindow valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class FreqBidMultiplierTimeWindowMixin = Object with _$FreqBidMultiplierTimeWindowMixin;

