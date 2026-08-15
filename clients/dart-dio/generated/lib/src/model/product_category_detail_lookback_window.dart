//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_category_detail_lookback_window.g.dart';

class ProductCategoryDetailLookbackWindow extends EnumClass {

  @BuiltValueEnumConst(wireName: r'90')
  static const ProductCategoryDetailLookbackWindow n90 = _$n90;
  @BuiltValueEnumConst(wireName: r'180')
  static const ProductCategoryDetailLookbackWindow n180 = _$n180;
  @BuiltValueEnumConst(wireName: r'365')
  static const ProductCategoryDetailLookbackWindow n365 = _$n365;
  @BuiltValueEnumConst(wireName: r'730')
  static const ProductCategoryDetailLookbackWindow n730 = _$n730;

  static Serializer<ProductCategoryDetailLookbackWindow> get serializer => _$productCategoryDetailLookbackWindowSerializer;

  const ProductCategoryDetailLookbackWindow._(String name): super(name);

  static BuiltSet<ProductCategoryDetailLookbackWindow> get values => _$values;
  static ProductCategoryDetailLookbackWindow valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ProductCategoryDetailLookbackWindowMixin = Object with _$ProductCategoryDetailLookbackWindowMixin;

