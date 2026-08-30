//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_summary_status.g.dart';

class CampaignSummaryStatus extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const CampaignSummaryStatus RUNNING = _$RUNNING;
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const CampaignSummaryStatus PAUSED = _$PAUSED;
  @BuiltValueEnumConst(wireName: r'NOT_STARTED')
  static const CampaignSummaryStatus NOT_STARTED = _$NOT_STARTED;
  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const CampaignSummaryStatus COMPLETED = _$COMPLETED;
  @BuiltValueEnumConst(wireName: r'ADVERTISER_DISABLED')
  static const CampaignSummaryStatus ADVERTISER_DISABLED = _$ADVERTISER_DISABLED;
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const CampaignSummaryStatus ARCHIVED = _$ARCHIVED;
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const CampaignSummaryStatus DRAFT = _$DRAFT;
  @BuiltValueEnumConst(wireName: r'DELETED_DRAFT')
  static const CampaignSummaryStatus DELETED_DRAFT = _$DELETED_DRAFT;

  static Serializer<CampaignSummaryStatus> get serializer => _$campaignSummaryStatusSerializer;

  const CampaignSummaryStatus._(String name): super(name);

  static BuiltSet<CampaignSummaryStatus> get values => _$values;
  static CampaignSummaryStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignSummaryStatusMixin = Object with _$CampaignSummaryStatusMixin;

