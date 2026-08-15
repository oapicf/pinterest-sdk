//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_filter_column.g.dart';

class AdsAnalyticsFilterColumn extends EnumClass {

  /// Reporting columns for sync reporting data filter
  @BuiltValueEnumConst(wireName: r'SPEND_IN_DOLLAR')
  static const AdsAnalyticsFilterColumn SPEND_IN_DOLLAR = _$SPEND_IN_DOLLAR;
  /// Reporting columns for sync reporting data filter
  @BuiltValueEnumConst(wireName: r'TOTAL_IMPRESSION')
  static const AdsAnalyticsFilterColumn TOTAL_IMPRESSION = _$TOTAL_IMPRESSION;

  static Serializer<AdsAnalyticsFilterColumn> get serializer => _$adsAnalyticsFilterColumnSerializer;

  const AdsAnalyticsFilterColumn._(String name): super(name);

  static BuiltSet<AdsAnalyticsFilterColumn> get values => _$values;
  static AdsAnalyticsFilterColumn valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdsAnalyticsFilterColumnMixin = Object with _$AdsAnalyticsFilterColumnMixin;

