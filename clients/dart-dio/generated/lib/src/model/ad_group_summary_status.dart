//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_summary_status.g.dart';

/// Summary status for ad group
class AdGroupSummaryStatus extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const AdGroupSummaryStatus RUNNING = _$RUNNING;
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const AdGroupSummaryStatus PAUSED = _$PAUSED;
  @BuiltValueEnumConst(wireName: r'NOT_STARTED')
  static const AdGroupSummaryStatus NOT_STARTED = _$NOT_STARTED;
  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const AdGroupSummaryStatus COMPLETED = _$COMPLETED;
  @BuiltValueEnumConst(wireName: r'ADVERTISER_DISABLED')
  static const AdGroupSummaryStatus ADVERTISER_DISABLED = _$ADVERTISER_DISABLED;
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const AdGroupSummaryStatus ARCHIVED = _$ARCHIVED;
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const AdGroupSummaryStatus DRAFT = _$DRAFT;
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

