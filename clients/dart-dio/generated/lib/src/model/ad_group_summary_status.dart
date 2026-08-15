//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_summary_status.g.dart';

class AdGroupSummaryStatus extends EnumClass {

  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const AdGroupSummaryStatus RUNNING = _$RUNNING;
  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const AdGroupSummaryStatus PAUSED = _$PAUSED;
  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'NOT_STARTED')
  static const AdGroupSummaryStatus NOT_STARTED = _$NOT_STARTED;
  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const AdGroupSummaryStatus COMPLETED = _$COMPLETED;
  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'ADVERTISER_DISABLED')
  static const AdGroupSummaryStatus ADVERTISER_DISABLED = _$ADVERTISER_DISABLED;
  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const AdGroupSummaryStatus ARCHIVED = _$ARCHIVED;
  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const AdGroupSummaryStatus DRAFT = _$DRAFT;
  /// Summary status for ad group
  @BuiltValueEnumConst(wireName: r'DELETED_DRAFT')
  static const AdGroupSummaryStatus DELETED_DRAFT = _$DELETED_DRAFT;

  static Serializer<AdGroupSummaryStatus> get serializer => _$adGroupSummaryStatusSerializer;

  const AdGroupSummaryStatus._(String name): super(name);

  static BuiltSet<AdGroupSummaryStatus> get values => _$values;
  static AdGroupSummaryStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdGroupSummaryStatusMixin = Object with _$AdGroupSummaryStatusMixin;

