//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_summary_status.g.dart';

class ProductGroupSummaryStatus extends EnumClass {

  /// Summary status for product group
  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const ProductGroupSummaryStatus RUNNING = _$RUNNING;
  /// Summary status for product group
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const ProductGroupSummaryStatus PAUSED = _$PAUSED;
  /// Summary status for product group
  @BuiltValueEnumConst(wireName: r'EXCLUDED')
  static const ProductGroupSummaryStatus EXCLUDED = _$EXCLUDED;
  /// Summary status for product group
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const ProductGroupSummaryStatus ARCHIVED = _$ARCHIVED;

  static Serializer<ProductGroupSummaryStatus> get serializer => _$productGroupSummaryStatusSerializer;

  const ProductGroupSummaryStatus._(String name): super(name);

  static BuiltSet<ProductGroupSummaryStatus> get values => _$values;
  static ProductGroupSummaryStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ProductGroupSummaryStatusMixin = Object with _$ProductGroupSummaryStatusMixin;

