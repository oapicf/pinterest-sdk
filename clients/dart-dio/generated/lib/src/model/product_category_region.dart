//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_category_region.g.dart';

class ProductCategoryRegion extends EnumClass {

  @BuiltValueEnumConst(wireName: r'US')
  static const ProductCategoryRegion US = _$US;
  @BuiltValueEnumConst(wireName: r'GB+IE')
  static const ProductCategoryRegion gBPlusIE = _$gBPlusIE;
  @BuiltValueEnumConst(wireName: r'CA')
  static const ProductCategoryRegion CA = _$CA;

  static Serializer<ProductCategoryRegion> get serializer => _$productCategoryRegionSerializer;

  const ProductCategoryRegion._(String name): super(name);

  static BuiltSet<ProductCategoryRegion> get values => _$values;
  static ProductCategoryRegion valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ProductCategoryRegionMixin = Object with _$ProductCategoryRegionMixin;

