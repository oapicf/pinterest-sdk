//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'vertical_product_category.g.dart';

class VerticalProductCategory extends EnumClass {

  /// List of verticals for product categories.
  @BuiltValueEnumConst(wireName: r'FASHION')
  static const VerticalProductCategory FASHION = _$FASHION;
  /// List of verticals for product categories.
  @BuiltValueEnumConst(wireName: r'HOME_DECOR')
  static const VerticalProductCategory HOME_DECOR = _$HOME_DECOR;
  /// List of verticals for product categories.
  @BuiltValueEnumConst(wireName: r'BEAUTY')
  static const VerticalProductCategory BEAUTY = _$BEAUTY;

  static Serializer<VerticalProductCategory> get serializer => _$verticalProductCategorySerializer;

  const VerticalProductCategory._(String name): super(name);

  static BuiltSet<VerticalProductCategory> get values => _$values;
  static VerticalProductCategory valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class VerticalProductCategoryMixin = Object with _$VerticalProductCategoryMixin;

