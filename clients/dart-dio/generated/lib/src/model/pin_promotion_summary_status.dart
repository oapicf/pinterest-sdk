//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_promotion_summary_status.g.dart';

class PinPromotionSummaryStatus extends EnumClass {

  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'APPROVED')
  static const PinPromotionSummaryStatus APPROVED = _$APPROVED;
  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const PinPromotionSummaryStatus PAUSED = _$PAUSED;
  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const PinPromotionSummaryStatus PENDING = _$PENDING;
  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'REJECTED')
  static const PinPromotionSummaryStatus REJECTED = _$REJECTED;
  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'ADVERTISER_DISABLED')
  static const PinPromotionSummaryStatus ADVERTISER_DISABLED = _$ADVERTISER_DISABLED;
  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const PinPromotionSummaryStatus ARCHIVED = _$ARCHIVED;
  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const PinPromotionSummaryStatus DRAFT = _$DRAFT;
  /// Summary status for pin promotions
  @BuiltValueEnumConst(wireName: r'DELETED_DRAFT')
  static const PinPromotionSummaryStatus DELETED_DRAFT = _$DELETED_DRAFT;

  static Serializer<PinPromotionSummaryStatus> get serializer => _$pinPromotionSummaryStatusSerializer;

  const PinPromotionSummaryStatus._(String name): super(name);

  static BuiltSet<PinPromotionSummaryStatus> get values => _$values;
  static PinPromotionSummaryStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PinPromotionSummaryStatusMixin = Object with _$PinPromotionSummaryStatusMixin;

