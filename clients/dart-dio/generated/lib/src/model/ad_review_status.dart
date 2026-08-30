//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_review_status.g.dart';

class AdReviewStatus extends EnumClass {

  /// Ad review status
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const AdReviewStatus OTHER = _$OTHER;
  /// Ad review status
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const AdReviewStatus PENDING = _$PENDING;
  /// Ad review status
  @BuiltValueEnumConst(wireName: r'REJECTED')
  static const AdReviewStatus REJECTED = _$REJECTED;
  /// Ad review status
  @BuiltValueEnumConst(wireName: r'APPROVED')
  static const AdReviewStatus APPROVED = _$APPROVED;

  static Serializer<AdReviewStatus> get serializer => _$adReviewStatusSerializer;

  const AdReviewStatus._(String name): super(name);

  static BuiltSet<AdReviewStatus> get values => _$values;
  static AdReviewStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdReviewStatusMixin = Object with _$AdReviewStatusMixin;

