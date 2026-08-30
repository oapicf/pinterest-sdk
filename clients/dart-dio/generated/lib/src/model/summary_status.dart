//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'summary_status.g.dart';

class SummaryStatus extends EnumClass {

  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const SummaryStatus RUNNING = _$RUNNING;
  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const SummaryStatus PAUSED = _$PAUSED;
  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'NOT_STARTED')
  static const SummaryStatus NOT_STARTED = _$NOT_STARTED;
  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const SummaryStatus COMPLETED = _$COMPLETED;
  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'ADVERTISER_DISABLED')
  static const SummaryStatus ADVERTISER_DISABLED = _$ADVERTISER_DISABLED;
  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const SummaryStatus ARCHIVED = _$ARCHIVED;
  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const SummaryStatus DRAFT = _$DRAFT;
  /// Summary status for campaign
  @BuiltValueEnumConst(wireName: r'DELETED_DRAFT')
  static const SummaryStatus DELETED_DRAFT = _$DELETED_DRAFT;

  static Serializer<SummaryStatus> get serializer => _$summaryStatusSerializer;

  const SummaryStatus._(String name): super(name);

  static BuiltSet<SummaryStatus> get values => _$values;
  static SummaryStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class SummaryStatusMixin = Object with _$SummaryStatusMixin;

