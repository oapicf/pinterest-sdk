//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_categories_engagement_type.g.dart';

class ProductCategoriesEngagementType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ENGAGEMENT')
  static const ProductCategoriesEngagementType ENGAGEMENT = _$ENGAGEMENT;
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const ProductCategoriesEngagementType OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const ProductCategoriesEngagementType SAVE = _$SAVE;

  static Serializer<ProductCategoriesEngagementType> get serializer => _$productCategoriesEngagementTypeSerializer;

  const ProductCategoriesEngagementType._(String name): super(name);

  static BuiltSet<ProductCategoriesEngagementType> get values => _$values;
  static ProductCategoriesEngagementType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ProductCategoriesEngagementTypeMixin = Object with _$ProductCategoriesEngagementTypeMixin;

